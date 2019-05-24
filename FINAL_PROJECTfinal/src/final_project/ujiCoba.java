package final_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.*;
import javax.swing.JTable;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HMJS
 */

public class ujiCoba extends javax.swing.JFrame {

    private String user = "root";
    private String pwd = "";
    private String host = "localhost";
    private String db = "basisDataCoba";
    private String urlValue = "";
    private Connection Lconnection = null;


    public ujiCoba() {
        initComponents();
        tampilTabel();
        tampilTabelBerobat();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue = "jdbc:mysql://" + host + "/" + db + "?user=" + user + "&password=" + pwd;
            Lconnection = DriverManager.getConnection(urlValue);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan");
        } catch (SQLException e) {
            System.out.println("koneksi gagal:" + e.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        dataObat = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dataCariObat = new javax.swing.JTextField();
        buttonCariDataObat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        cariDataPasien = new javax.swing.JTextField();
        buttonCariDataPasien1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        ubahPasien = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        buttonCariUbahDataObat = new javax.swing.JButton();
        buttonHapusDataObat = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        kodeObat = new javax.swing.JTextField();
        noBatch = new javax.swing.JTextField();
        barcodeObat = new javax.swing.JTextField();
        namaObat = new javax.swing.JTextField();
        satuanObat = new javax.swing.JTextField();
        kategoriObat = new javax.swing.JTextField();
        lokasiObat = new javax.swing.JTextField();
        jenisObat = new javax.swing.JTextField();
        stokObat = new javax.swing.JTextField();
        kadaluarsaObat = new javax.swing.JTextField();
        buttonSimpanDataObat = new javax.swing.JButton();
        buttonUbahDataObat = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nomorRekamMedis = new javax.swing.JTextField();
        namaPasien = new javax.swing.JTextField();
        jenisKelamin = new javax.swing.JTextField();
        nik = new javax.swing.JTextField();
        tempatTanggalLahir = new javax.swing.JTextField();
        golonganDarah = new javax.swing.JTextField();
        telepon = new javax.swing.JTextField();
        handphone = new javax.swing.JTextField();
        alamatPasien = new javax.swing.JTextField();
        statusPerkawinan = new javax.swing.JTextField();
        tinggiBadan = new javax.swing.JTextField();
        beratBadan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        riwayatOperasi = new javax.swing.JTextField();
        riwayatSakit = new javax.swing.JTextField();
        jenisPasien = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        buttonCariPasienUbahData = new javax.swing.JButton();
        buttonHapusPasien = new javax.swing.JButton();
        buttonInputPasien = new javax.swing.JButton();
        buttonSimpanPasien = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        pasienBerobat = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        keluhan = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        hasilDiagnosa = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        penggunaanObat = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tambahanRiwayatPenyakit = new javax.swing.JTextArea();
        buttonSimpanPasienBerobat = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        tanggal = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        jTextField3.setText("jTextField2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setText("jPasswordField1");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 190, -1));

        username.setText("Username");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 190, -1));

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dataObat.addTab("Home", jPanel1);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dataCariObat.setText("Cari Obat");
        dataCariObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCariObatActionPerformed(evt);
            }
        });

        buttonCariDataObat.setText("Cari");

        jLabel1.setText(" Data Obat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dataCariObat, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCariDataObat, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 372, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCariDataObat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(dataCariObat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        dataObat.addTab("Medicine", jPanel2);

        cariDataPasien.setText("Cari Nama Pasien");

        buttonCariDataPasien1.setText("Cari");

        jLabel2.setText(" Data Pasien");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cariDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonCariDataPasien1)
                                .addGap(0, 390, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariDataPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCariDataPasien1))
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        dataObat.addTab("Pasien", jPanel3);

        buttonCariUbahDataObat.setText("Cari");
        buttonCariUbahDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariUbahDataObatActionPerformed(evt);
            }
        });

        buttonHapusDataObat.setBackground(new java.awt.Color(204, 0, 0));
        buttonHapusDataObat.setText("Hapus");
        buttonHapusDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusDataObatActionPerformed(evt);
            }
        });

        jLabel21.setText("Kode Obat");

        jLabel22.setText("No. Batch");

        jLabel23.setText("Kode Barcode");

        jLabel24.setText("Nama Obat");

        jLabel25.setText("Satuan");

        jLabel26.setText("Kategori");

        jLabel27.setText("Lokasi");

        jLabel28.setText("Jenis Obat");

        jLabel29.setText("Stok");

        jLabel30.setText("Tanggal Kadaluarsa");

        noBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBatchActionPerformed(evt);
            }
        });

        jenisObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisObatActionPerformed(evt);
            }
        });

        buttonSimpanDataObat.setText("Input Data");
        buttonSimpanDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanDataObatActionPerformed(evt);
            }
        });

        buttonUbahDataObat.setBackground(new java.awt.Color(0, 153, 51));
        buttonUbahDataObat.setText("Simpan");
        buttonUbahDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahDataObatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(barcodeObat, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel28))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(noBatch)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel27))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(kodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCariUbahDataObat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(satuanObat)
                                    .addComponent(namaObat))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kategoriObat)
                            .addComponent(lokasiObat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jenisObat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(stokObat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 209, Short.MAX_VALUE))
                            .addComponent(kadaluarsaObat)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonHapusDataObat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUbahDataObat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSimpanDataObat)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel26)
                    .addComponent(kodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategoriObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCariUbahDataObat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27)
                    .addComponent(lokasiObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel28)
                    .addComponent(barcodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel29)
                    .addComponent(namaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stokObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(satuanObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(kadaluarsaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHapusDataObat)
                    .addComponent(buttonSimpanDataObat)
                    .addComponent(buttonUbahDataObat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ubahPasien.addTab("Medicine", jPanel5);

        jLabel3.setText("No. RM");

        jLabel4.setText("Nama");

        jLabel5.setText("Jenis Kelamin");

        jLabel7.setText("Tempat, Tanggal Lahir");

        jLabel8.setText("Golongan Darah");

        jLabel9.setText("Telepon");

        jLabel10.setText("HP");

        jLabel11.setText("Status Perkawinan");

        jLabel12.setText("Alamat");

        jLabel13.setText("Tinggi Badan");

        jLabel14.setText("Riwayat Operasi");

        jLabel16.setText("Riwayat Sakit Lainnya");

        jLabel17.setText("Jenis Pasien");

        nomorRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorRekamMedisActionPerformed(evt);
            }
        });

        jenisKelamin.setText("L/P");

        statusPerkawinan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusPerkawinanActionPerformed(evt);
            }
        });

        jLabel15.setText("Berat Badan");

        jenisPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisPasienActionPerformed(evt);
            }
        });

        jLabel18.setText("Centimeter");

        jLabel19.setText("Kilogram");

        jLabel20.setText("NIK");

        buttonCariPasienUbahData.setText("Cari");
        buttonCariPasienUbahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariPasienUbahDataActionPerformed(evt);
            }
        });

        buttonHapusPasien.setBackground(new java.awt.Color(204, 0, 0));
        buttonHapusPasien.setText("Hapus");
        buttonHapusPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusPasienActionPerformed(evt);
            }
        });

        buttonInputPasien.setText("Input Data");
        buttonInputPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInputPasienActionPerformed(evt);
            }
        });

        buttonSimpanPasien.setBackground(new java.awt.Color(0, 204, 0));
        buttonSimpanPasien.setText("Simpan");
        buttonSimpanPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanPasienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(handphone)
                            .addComponent(telepon)
                            .addComponent(golonganDarah)
                            .addComponent(tempatTanggalLahir)
                            .addComponent(nik)
                            .addComponent(jenisKelamin)
                            .addComponent(namaPasien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(nomorRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCariPasienUbahData)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamatPasien)
                                    .addComponent(statusPerkawinan)
                                    .addComponent(riwayatOperasi)
                                    .addComponent(riwayatSakit)
                                    .addComponent(jenisPasien)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tinggiBadan, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                            .addComponent(beratBadan))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(buttonHapusPasien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSimpanPasien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonInputPasien))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane14)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addComponent(nomorRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCariPasienUbahData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(alamatPasien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusPerkawinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tinggiBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempatTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(beratBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(golonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(riwayatOperasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(riwayatSakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(handphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHapusPasien)
                    .addComponent(buttonInputPasien)
                    .addComponent(buttonSimpanPasien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        ubahPasien.addTab("Pasien", jPanel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahPasien)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubahPasien)
        );

        dataObat.addTab("Ubah Data", jPanel4);

        jLabel31.setText("Pilih Pasien");

        pasienBerobat.setText("No. RM");
        pasienBerobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasienBerobatActionPerformed(evt);
            }
        });

        jLabel33.setText("Keluhan");

        keluhan.setColumns(20);
        keluhan.setRows(5);
        jScrollPane3.setViewportView(keluhan);

        jLabel34.setText("Hasil Diagnosa");

        hasilDiagnosa.setColumns(20);
        hasilDiagnosa.setRows(5);
        jScrollPane5.setViewportView(hasilDiagnosa);

        jLabel35.setText("Penggunaan Obat");

        penggunaanObat.setColumns(20);
        penggunaanObat.setRows(5);
        jScrollPane9.setViewportView(penggunaanObat);

        jLabel36.setText("Tambahan Riwayat Penyakit");

        tambahanRiwayatPenyakit.setColumns(20);
        tambahanRiwayatPenyakit.setRows(5);
        jScrollPane10.setViewportView(tambahanRiwayatPenyakit);

        buttonSimpanPasienBerobat.setBackground(new java.awt.Color(0, 153, 0));
        buttonSimpanPasienBerobat.setText("Simpan");
        buttonSimpanPasienBerobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanPasienBerobatActionPerformed(evt);
            }
        });

        jLabel37.setText("Tanggal");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane15)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pasienBerobat, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(tanggal))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSimpanPasienBerobat))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSimpanPasienBerobat)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel36)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(pasienBerobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dataObat.addTab("Berobat", jPanel7);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        dataObat.addTab("Bantuan", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataObat)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dataObat, javax.swing.GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jenisPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisPasienActionPerformed

    private void statusPerkawinanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusPerkawinanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusPerkawinanActionPerformed

    private void jenisObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisObatActionPerformed

    private void noBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noBatchActionPerformed

    private void dataCariObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCariObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataCariObatActionPerformed

    private void buttonCariPasienUbahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariPasienUbahDataActionPerformed
        // TODO add your handling code here: AKDSJHAKSJD
        // TODO add your handling code here: CARI CARI CARI
        String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "basisDataCoba";
        String urlValue = "";
        tampilTabelBerobat();       
        try {
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery(
                    "Select * from dataPasien"
                    + " where rekamMedis='"
                    + nomorRekamMedis.getText() + "'");

            if (rs.next()) {

                namaPasien.setText(rs.getString("namaLengkap"));
                jenisKelamin.setText(rs.getString("kelamin"));
                nik.setText(rs.getString("NIK"));
                tempatTanggalLahir.setText(rs.getString("TTL"));
                golonganDarah.setText(rs.getString("Goldar"));
                telepon.setText(rs.getString("Telp"));
                handphone.setText(rs.getString("hp"));
                alamatPasien.setText(rs.getString("alamat"));
                statusPerkawinan.setText(rs.getString("kawin"));
                tinggiBadan.setText(rs.getString("TinggiBdn"));
                beratBadan.setText(rs.getString("berat"));
                riwayatOperasi.setText(rs.getString("operasi"));
                riwayatSakit.setText(rs.getString("sakit"));
                jenisPasien.setText(rs.getString("jenis"));
            } else {
                JOptionPane.showMessageDialog(this,
                        "User ID: Salah", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);

                nomorRekamMedis.setText("");
                namaPasien.setText("");
                jenisKelamin.setText("");
                nik.setText("");
                tempatTanggalLahir.setText("");
                kategoriObat.setText("");
                golonganDarah.setText("");
                telepon.setText("");
                handphone.setText("");
                alamatPasien.setText("");
                statusPerkawinan.setText("");
                tinggiBadan.setText("");
                beratBadan.setText("");
                riwayatSakit.setText("");
                jenisPasien.setText("");
                kodeObat.requestFocus();
            }
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_buttonCariPasienUbahDataActionPerformed

    private void buttonSimpanDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanDataObatActionPerformed
        String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "basisDataCoba";
        String urlValue = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue = "jdbc:mysql://" + host + "/" + db + "?user=" + user + "&password=" + pwd;
            Connection conn = DriverManager.getConnection(urlValue);

            PreparedStatement pStatement = null;
            String sql = "insert into dataObat "
                    + "(kodeObat, noBatch , kodeBarcode, namaObat, satuan, kategori, lokasi, jenisObat, stok, kadaluarsa)"
                    + "Values (?,?,?,?,?,?,?,?,?,?)";

            pStatement = conn.prepareStatement(sql);

            pStatement.setString(1, kodeObat.getText());
            pStatement.setString(2, noBatch.getText());
            pStatement.setString(3, barcodeObat.getText());
            pStatement.setString(4, namaObat.getText());
            pStatement.setString(5, satuanObat.getText());
            pStatement.setString(6, kategoriObat.getText());
            pStatement.setString(7, lokasiObat.getText());
            pStatement.setString(8, jenisObat.getText());
            pStatement.setString(9, stokObat.getText());
            pStatement.setString(10, kadaluarsaObat.getText());

            int intTambah = pStatement.executeUpdate();

            if (intTambah > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dimasukkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dimasukkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

            pStatement.close();
            // conn.close(); gak usah conn.close

            kodeObat.setText("");
            noBatch.setText("");
            barcodeObat.setText("");
            namaObat.setText("");
            satuanObat.setText("");
            kategoriObat.setText("");
            lokasiObat.setText("");
            jenisObat.setText("");
            stokObat.setText("");
            kadaluarsaObat.setText("");
            tampilTabel();
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
            JOptionPane.showMessageDialog(this,
                    "Data Gagal Dimasukkan", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());
            JOptionPane.showMessageDialog(this, "Data Tidak Lengkap", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonSimpanDataObatActionPerformed

    private void buttonInputPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInputPasienActionPerformed
        // TODO add your handling code here:
        //PASIEN
        String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "basisDataCoba";
        String urlValue = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue = "jdbc:mysql://" + host + "/" + db + "?user=" + user + "&password=" + pwd;
            Connection conn = DriverManager.getConnection(urlValue);

            PreparedStatement pStatement = null;
            String sql = "insert into dataPasien "
                    + "(rekamMedis, namaLengkap, kelamin, NIK, TTL, Goldar, Telp, hp, alamat, kawin, Tinggibdn, berat, operasi, sakit, jenis)"
                    + "Values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            pStatement = conn.prepareStatement(sql);

            pStatement.setString(1, nomorRekamMedis.getText());
            pStatement.setString(2, namaPasien.getText());
            pStatement.setString(3, jenisKelamin.getText());
            pStatement.setString(4, nik.getText());
            pStatement.setString(5, tempatTanggalLahir.getText());
            pStatement.setString(6, golonganDarah.getText());
            pStatement.setString(7, telepon.getText());
            pStatement.setString(8, handphone.getText());
            pStatement.setString(9, alamatPasien.getText());
            pStatement.setString(10, statusPerkawinan.getText());
            pStatement.setString(11, tinggiBadan.getText());
            pStatement.setString(12, beratBadan.getText());
            pStatement.setString(13, riwayatOperasi.getText());
            pStatement.setString(14, riwayatSakit.getText());
            pStatement.setString(15, jenisPasien.getText());

            int intTambah = pStatement.executeUpdate();

            if (intTambah > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dimasukkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dimasukkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

            pStatement.close();
            conn.close();

            nomorRekamMedis.setText("");
            namaPasien.setText("");
            jenisKelamin.setText("");
            nik.setText("");
            tempatTanggalLahir.setText("");
            kategoriObat.setText("");
            golonganDarah.setText("");
            telepon.setText("");
            handphone.setText("");
            alamatPasien.setText("");
            statusPerkawinan.setText("");
            tinggiBadan.setText("");
            beratBadan.setText("");
            riwayatSakit.setText("");
            jenisPasien.setText("");
            tampilTabel();
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
            JOptionPane.showMessageDialog(this, "Data Gagal Dimasukkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());
            JOptionPane.showMessageDialog(this, "koneksi gagal " + e.toString(), "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonInputPasienActionPerformed

    private void nomorRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorRekamMedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorRekamMedisActionPerformed

    private void pasienBerobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienBerobatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasienBerobatActionPerformed

    private void buttonSimpanPasienBerobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanPasienBerobatActionPerformed
        // TODO add your handling code here:
        //BEROBAT
        String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "basisDataCoba";
        String urlValue = "";
        tampilTabelBerobat();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            urlValue = "jdbc:mysql://" + host + "/"
                    + db + "?user=" + user
                    + "&password=" + pwd;
            Connection conn
                    = DriverManager.getConnection(urlValue);

            PreparedStatement pStatement = null;

            String sql = "insert into dataPasienBerobat "
                    + "(rekamMedis, tanggal, keluhan, hasil, gunaObat, riwayatSakit)"
                    + "Values (?,?,?,?,?,?)";

            pStatement = conn.prepareStatement(sql);

            pStatement.setString(1, pasienBerobat.getText());
            pStatement.setString(2, tanggal.getText());
            pStatement.setString(3, keluhan.getText());
            pStatement.setString(4, hasilDiagnosa.getText());
            pStatement.setString(5, penggunaanObat.getText());
            pStatement.setString(6, tambahanRiwayatPenyakit.getText());

            int intTambah = pStatement.executeUpdate();

            if (intTambah > 0) {
                JOptionPane.showMessageDialog(this,
                        "Data Berhasil Dimasukkan", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Data Gagal Dimasukkan", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            pStatement.close();
            conn.close();

            pasienBerobat.setText("");
            tanggal.setText("");
            keluhan.setText("");
            hasilDiagnosa.setText("");
            penggunaanObat.setText("");
            tambahanRiwayatPenyakit.setText("");

            tampilTabelBerobat();
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
            JOptionPane.showMessageDialog(this,
                    "Data Gagal Dimasukkan", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("koneksi gagal "
                    + e.toString());
            JOptionPane.showMessageDialog(this,
                    "Data Tidak Lengkap", "Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        tampilTabelBerobat();
    }//GEN-LAST:event_buttonSimpanPasienBerobatActionPerformed

    private void buttonUbahDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahDataObatActionPerformed
        // TODO add your handling code here:
        String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "basisDataCoba";
        String urlValue = "";
        tampilTabelBerobat();
        try {
            PreparedStatement pStatement = null;
            String sql = "update dataObat "
                    + "set noBatch=?, kodeBarcode=?, namaObat=?, satuan=?, kategori=?, "
                    + "lokasi=?, jenisObat=?, stok=?, kadaluarsa=? "
                    + "where kodeObat=? ";

            pStatement = Lconnection.prepareStatement(sql);

            pStatement.setString(1, noBatch.getText());
            pStatement.setString(2, barcodeObat.getText());
            pStatement.setString(3, namaObat.getText());
            pStatement.setString(4, satuanObat.getText());
            pStatement.setString(5, kategoriObat.getText());
            pStatement.setString(6, lokasiObat.getText());
            pStatement.setString(7, jenisObat.getText());
            pStatement.setString(8, stokObat.getText());
            pStatement.setString(9, kadaluarsaObat.getText());
            pStatement.setString(10, kodeObat.getText());

            int intTambah = pStatement.executeUpdate();

            if (intTambah > 0) {
                JOptionPane.showMessageDialog(this,
                        "Edit sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Edit gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            pStatement.close();

            kodeObat.setText("");
            noBatch.setText("");
            barcodeObat.setText("");
            namaObat.setText("");
            satuanObat.setText("");
            kategoriObat.setText("");
            lokasiObat.setText("");
            jenisObat.setText("");
            stokObat.setText("");
            kadaluarsaObat.setText("");
        } catch (SQLException e) {
            System.out.println("koneksi gagal HEHE"
                    + e.toString());
        }
    }//GEN-LAST:event_buttonUbahDataObatActionPerformed

    private void buttonCariUbahDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariUbahDataObatActionPerformed
        // TODO add your handling code here: CARI CARI CARI
        String user = "root";
        String pwd = "";
        String host = "localhost";
        String db = "basisDataCoba";
        String urlValue = "";
        tampilTabelBerobat();
        
        try {
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery(
                    "Select * from dataobat"
                    + " where kodeObat='"
                    + kodeObat.getText() + "'");

            if (rs.next()) {
                noBatch.setText(rs.getString("noBatch"));
                barcodeObat.setText(rs.getString("kodeBarcode"));
                namaObat.setText(rs.getString("namaObat"));
                satuanObat.setText(rs.getString("satuan"));
                kategoriObat.setText(rs.getString("kategori"));
                lokasiObat.setText(rs.getString("lokasi"));
                jenisObat.setText(rs.getString("jenisObat"));
                stokObat.setText(rs.getString("stok"));
                kadaluarsaObat.setText(rs.getString("kadaluarsa"));

            } else {
                JOptionPane.showMessageDialog(this,
                        "Data Obat Tidak Ada", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);

                kodeObat.setText("");
                noBatch.setText("");
                barcodeObat.setText("");
                namaObat.setText("");
                satuanObat.setText("");
                kategoriObat.setText("");
                lokasiObat.setText("");
                jenisObat.setText("");
                stokObat.setText("");
                kadaluarsaObat.setText("");
                kodeObat.requestFocus();
            }
        } catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_buttonCariUbahDataObatActionPerformed

    private void buttonSimpanPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanPasienActionPerformed
        // TODO add your handling code here:

        try {
            PreparedStatement pStatement = null;
            String sql = "update dataPasien "
                    + "set namaLengkap=?, kelamin=?, NIK=?, TTL=?, Goldar=?, "
                    + "Telp=?, hp=?, alamat=?, kawin=?, "
                    + "Tinggibdn=?, berat=?, operasi=?, sakit=?, jenis=? "
                    + "where rekamMedis=? ";

            pStatement = Lconnection.prepareStatement(sql);

            pStatement.setString(1, namaPasien.getText());
            pStatement.setString(2, jenisKelamin.getText());
            pStatement.setString(3, nik.getText());
            pStatement.setString(4, tempatTanggalLahir.getText());
            pStatement.setString(5, golonganDarah.getText());
            pStatement.setString(6, telepon.getText());
            pStatement.setString(7, handphone.getText());
            pStatement.setString(8, alamatPasien.getText());
            pStatement.setString(9, statusPerkawinan.getText());
            pStatement.setString(10, tinggiBadan.getText());
            pStatement.setString(11, beratBadan.getText());
            pStatement.setString(12, riwayatOperasi.getText());
            pStatement.setString(13, riwayatSakit.getText());
            pStatement.setString(14, jenisPasien.getText());
            pStatement.setString(15, nomorRekamMedis.getText());

            int intTambah = pStatement.executeUpdate();

            if (intTambah > 0) {
                JOptionPane.showMessageDialog(this,
                        "Edit sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Edit gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            pStatement.close();

            nomorRekamMedis.setText("");
            namaPasien.setText("");
            jenisKelamin.setText("");
            nik.setText("");
            tempatTanggalLahir.setText("");
            kategoriObat.setText("");
            golonganDarah.setText("");
            telepon.setText("");
            handphone.setText("");
            alamatPasien.setText("");
            statusPerkawinan.setText("");
            tinggiBadan.setText("");
            beratBadan.setText("");
            riwayatSakit.setText("");
            jenisPasien.setText("");
        } catch (SQLException e) {
            System.out.println("koneksi gagal HEHE"
                    + e.toString());
        }
        tampilTabel();
    }//GEN-LAST:event_buttonSimpanPasienActionPerformed

    private void buttonHapusDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusDataObatActionPerformed
        // TODO add your handling code here:

        try {
            PreparedStatement pStatement = null;
            String sql = "delete from dataObat "
                    + " where kodeObat=? ";
            pStatement = Lconnection.prepareStatement(sql);
            pStatement.setString(1, kodeObat.getText());
            int intTambah = pStatement.executeUpdate();
            if (intTambah > 0) {
                JOptionPane.showMessageDialog(this,
                        "Hapus data sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Hapus data gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            pStatement.close();
            tampilTabel();
        } catch (SQLException e) {
            System.out.println("koneksi gagal "
                    + e.toString());
        }
    }//GEN-LAST:event_buttonHapusDataObatActionPerformed

    private void buttonHapusPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusPasienActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pStatement = null;
            String sql = "delete from dataPasien "
                    + " where rekamMedis =? ";
            pStatement = Lconnection.prepareStatement(sql);
            pStatement.setString(1, nomorRekamMedis.getText());
            int intTambah = pStatement.executeUpdate();
            if (intTambah > 0) {
                JOptionPane.showMessageDialog(this,
                        "Hapus data sukses", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Hapus data gagal", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            pStatement.close();
            tampilTabel();
        } catch (SQLException e) {
            System.out.println("koneksi gagal "
                    + e.toString());
        }
    }//GEN-LAST:event_buttonHapusPasienActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost/basisdataCoba", "root", "");
            String admin = "select * from akses where Username = ? and Password = ?";
            PreparedStatement adm = konek.prepareStatement(admin);

            adm.setString(1, username.getText());
            adm.setString(2, new String(password.getPassword()));


            ResultSet rsadm = adm.executeQuery();

            if (rsadm.next()) {
                JOptionPane.showMessageDialog(null, "Welcome Admin " + username.getText(), "Login Successful", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password", "Unsuccessful Login", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                     
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        username.setText("");
        password.setText("");        
        
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ujiCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ujiCoba().setVisible(true);
            
            
        });

      
    }


 
    ////////////////////////////////////////////////////////////////////////////

    public void tampilTabel() {     
        cariData dataPasien = new cariData();
        dataPasien.getData();
        cariDataPasienBerobat d = new cariDataPasienBerobat();
        d.getDataPasienBerobat();
        d.getPasien();
        String[] columnNames = {"Kode Obat", "Nomor Batch", "Barcode", "Nama", "Satuan", "Kategori", "Lokasi", "Jenis", "Stok", "Kadaluarsa"};
        JTable table = new JTable(dataPasien.getData(), columnNames);
        jScrollPane12.setViewportView(table);

        String[] obatCari = {"Kode Obat", "Nomor Batch", "Barcode", "Nama", "Satuan", "Kategori", "Lokasi", "Jenis", "Stok", "Kadaluarsa"};
        JTable tableObatCari = new JTable(dataPasien.getData(), obatCari);
        jScrollPane11.setViewportView(tableObatCari);

        cariPasien Pasien = new cariPasien();
        Pasien.getPasien();
        String[] pasienNames = {"Nomor Rekam Medis", "Nama Lengkap", "Jenis Kelamin",
            "NIK", "Tempat, Tanggal Lahir", "Golongan Darah", "Telp", "Handphone", "Alamat",
            "Status Kawin", "Tinggi Badan", "Berat Badan", "Operasi", "Riwayat Penyait",
            "Jenis Pasien"};
        JTable tabelpasien = new JTable(d.getPasien(), pasienNames);
        jScrollPane13.setViewportView(tabelpasien);

        String[] pasienNamesCari = {"Nomor Rekam Medis", "Nama Lengkap", "Jenis Kelamin",
            "NIK", "Tempat, Tanggal Lahir", "Golongan Darah", "Telp", "Handphone", "Alamat",
            "Status Kawin", "Tinggi Badan", "Berat Badan", "Operasi", "Riwayat Penyait",
            "Jenis Pasien"};
        JTable tabelpasienCari = new JTable(d.getPasien(), pasienNamesCari);
        jScrollPane14.setViewportView(tabelpasienCari);
    }

    public void tampilTabelBerobat() {
        cariDataPasienBerobat DataPasienBerobat = new cariDataPasienBerobat();
        DataPasienBerobat.getDataPasienBerobat();
        String[] berobatNames = {"Rekam Medis", "Nama Lengkap", "Tinggi", "Berat", "Riwayat Operasi",
            "Riwayat Sakit Lainnya", "Tanggal", "Keluhan", "Hasil Diagnosa", "Penggunaan Obat"};
        JTable tabelBerobat = new JTable(DataPasienBerobat.getDataPasienBerobat(), berobatNames);
        jScrollPane15.setViewportView(tabelBerobat);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatPasien;
    private javax.swing.JTextField barcodeObat;
    private javax.swing.JTextField beratBadan;
    private javax.swing.JButton buttonCariDataObat;
    private javax.swing.JButton buttonCariDataPasien1;
    private javax.swing.JButton buttonCariPasienUbahData;
    private javax.swing.JButton buttonCariUbahDataObat;
    private javax.swing.JButton buttonHapusDataObat;
    private javax.swing.JButton buttonHapusPasien;
    private javax.swing.JButton buttonInputPasien;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSimpanDataObat;
    private javax.swing.JButton buttonSimpanPasien;
    private javax.swing.JButton buttonSimpanPasienBerobat;
    private javax.swing.JButton buttonUbahDataObat;
    private javax.swing.JTextField cariDataPasien;
    private javax.swing.JTextField dataCariObat;
    private javax.swing.JTabbedPane dataObat;
    private javax.swing.JTextField golonganDarah;
    private javax.swing.JTextField handphone;
    private javax.swing.JTextArea hasilDiagnosa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jenisKelamin;
    private javax.swing.JTextField jenisObat;
    private javax.swing.JTextField jenisPasien;
    private javax.swing.JTextField kadaluarsaObat;
    private javax.swing.JTextField kategoriObat;
    private javax.swing.JTextArea keluhan;
    private javax.swing.JTextField kodeObat;
    private javax.swing.JTextField lokasiObat;
    private javax.swing.JTextField namaObat;
    private javax.swing.JTextField namaPasien;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField noBatch;
    private javax.swing.JTextField nomorRekamMedis;
    private javax.swing.JTextField pasienBerobat;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextArea penggunaanObat;
    private javax.swing.JTextField riwayatOperasi;
    private javax.swing.JTextField riwayatSakit;
    private javax.swing.JTextField satuanObat;
    private javax.swing.JTextField statusPerkawinan;
    private javax.swing.JTextField stokObat;
    private javax.swing.JTextArea tambahanRiwayatPenyakit;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField tempatTanggalLahir;
    private javax.swing.JTextField tinggiBadan;
    private javax.swing.JTabbedPane ubahPasien;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
