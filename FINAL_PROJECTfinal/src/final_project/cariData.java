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
public class cariData{

      public Object[][] getData() {
        String user = "root";
        String pwd = ""; //ini pwnya apa ya tadi?
        String host = "localhost";
        String db = "basisDataCoba"; //ini nama database di mysqlnya nanti
        String urlValue = "";
        Object[][] data1 = null;
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
                    "Select * from dataObat");
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();

            data1 = new Object[rowCount][10];
            int no = -1;

            while (rs.next()) {
                no = no + 1;
                data1[no][0] = rs.getString("kodeObat");
                data1[no][1] = rs.getString("noBatch");
                data1[no][2] = rs.getString("kodeBarcode");
                data1[no][3] = rs.getString("namaObat");
                data1[no][4] = rs.getString("satuan");
                data1[no][5] = rs.getString("kategori");
                data1[no][6] = rs.getString("lokasi");
                data1[no][7] = rs.getString("jenisObat");
                data1[no][8] = rs.getString("stok");
                data1[no][9] = rs.getString("kadaluarsa");
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

        return data1;
    }
  
}
