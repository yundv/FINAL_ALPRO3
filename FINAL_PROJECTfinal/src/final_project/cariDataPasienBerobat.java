/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MY-COMPUTER
 */

//Ini inheritance
public class cariDataPasienBerobat extends cariPasien {
        public Object[][] getDataPasienBerobat() {
        String user = "root";
        String pwd = ""; //ini pwnya apa ya tadi?
        String host = "localhost";
        String db = "basisDataCoba"; //ini nama database di mysqlnya nanti
        String urlValue = "";
        Object[][] berobat = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue = "jdbc:mysql://" + host + "/"
                    + db + "?user=" + user
                    + "&password=" + pwd;
            Connection conn
                    = DriverManager.getConnection(urlValue);
            //////////////////////////////////////////////////////////////////////
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT dataPasien.rekamMedis, dataPasien.namaLengkap, dataPasien.tinggibdn, dataPasien.berat, dataPasien.operasi, dataPasien.sakit, dataPasienBerobat.tanggal, dataPasienBerobat.keluhan, dataPasienBerobat.hasil, dataPasienBerobat.gunaObat, dataPasienBerobat.riwayatSakit FROM dataPasien, dataPasienBerobat WHERE dataPasien.rekamMedis = dataPasienBerobat.rekamMedis");
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();

            berobat = new Object[rowCount][11];
            int no = -1;

            while (rs.next()) {
                no = no + 1;
                berobat[no][0] = rs.getString("dataPasien.rekamMedis");
                berobat[no][1] = rs.getString("dataPasien.namaLengkap");
                berobat[no][2] = rs.getString("dataPasien.tinggibdn");
                berobat[no][3] = rs.getString("dataPasien.berat");
                berobat[no][4] = rs.getString("dataPasien.operasi");
                berobat[no][5] = rs.getString("dataPasien.sakit");
                berobat[no][6] = rs.getString("dataPasienBerobat.tanggal");
                berobat[no][7] = rs.getString("dataPasienBerobat.keluhan");
                berobat[no][8] = rs.getString("dataPasienBerobat.hasil");
                berobat[no][9] = rs.getString("dataPasienBerobat.gunaObat");
                berobat[no][10] = rs.getString("dataPasienBerobat.riwayatSakit");
////////////////////////////////////////////////////////////////////////////////
                System.out.println("koneksi sukses");
            }
            st.close();
            conn.close();
            ////////////////////////////////////////////////////////////////////////////////
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        } catch (SQLException e) {
            System.out.println("koneksi gagal "
                    + e.toString());
        }

        return berobat;
    }
        //ini konsep override
        @Override
        public Object[][] getPasien() {
        String user = "root";
        String pwd = ""; //ini pwnya apa ya tadi?
        String host = "localhost";
        String db = "basisDataCoba"; //ini nama database di mysqlnya nanti
        String urlValue = "";
        Object[][] pasien1 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue = "jdbc:mysql://" + host + "/"
                    + db + "?user=" + user
                    + "&password=" + pwd;
            Connection conn
                    = DriverManager.getConnection(urlValue);
            //////////////////////////////////////////////////////////////////////
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "Select * from dataPasien");
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();

            pasien1 = new Object[rowCount][15];
            int no = -1;

            while (rs.next()) {
                no = no + 1;
                pasien1[no][0] = rs.getString("rekamMedis");
                pasien1[no][1] = rs.getString("namaLengkap");
                pasien1[no][2] = rs.getString("kelamin");
                pasien1[no][3] = rs.getString("NIK");
                pasien1[no][4] = rs.getString("TTL");
                pasien1[no][5] = rs.getString("Goldar");
                pasien1[no][6] = rs.getString("telp");
                pasien1[no][7] = rs.getString("hp");
                pasien1[no][8] = rs.getString("alamat");
                pasien1[no][9] = rs.getString("kawin");
                pasien1[no][10] = rs.getString("tinggibdn");
                pasien1[no][11] = rs.getString("berat");
                pasien1[no][12] = rs.getString("operasi");
                pasien1[no][13] = rs.getString("sakit");
                pasien1[no][14] = rs.getString("jenis");
                ////////////////////////////////////////////////////////////////////////////////
                System.out.println("koneksi sukses");
            }
            st.close();
            conn.close();
            ////////////////////////////////////////////////////////////////////////////////
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        } catch (SQLException e) {
            System.out.println("koneksi gagal "
                    + e.toString());
        }

        return pasien1;
    }
}
