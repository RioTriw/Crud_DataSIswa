/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RioTriw
 */
public class FormSiswa extends javax.swing.JFrame {

    private Connection koneksi;

    public FormSiswa() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtsemester = new javax.swing.JTextField();
        cbjurusan = new javax.swing.JComboBox<>();
        bsimpan = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rblaki = new javax.swing.JRadioButton();
        rbperempuan = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsiswa = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel.setBackground(new java.awt.Color(255, 255, 255,120));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("FORM DATA SISWA");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("NIS");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Kelas");

        cbjurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----- PILIH JURUSAN ANDA -----", "RPL", "TKJ", "TJA" }));

        bsimpan.setBackground(new java.awt.Color(255, 255, 255));
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bbatal.setBackground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bhapus.setBackground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bubah.setBackground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bkeluar.setBackground(new java.awt.Color(255, 255, 255));
        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");

        buttonGroup1.add(rblaki);
        rblaki.setText("Laki - Laki");

        buttonGroup1.add(rbperempuan);
        rbperempuan.setText("Perempuan");

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(rblaki)
                                .addGap(18, 18, 18)
                                .addComponent(rbperempuan))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpanelLayout.createSequentialGroup()
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 33, Short.MAX_VALUE)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsemester, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(214, 214, 214))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelLayout.createSequentialGroup()
                                .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rblaki)
                    .addComponent(rbperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsimpan)
                    .addComponent(bbatal)
                    .addComponent(bubah)
                    .addComponent(bhapus)
                    .addComponent(bkeluar))
                .addGap(245, 245, 245))
        );

        getContentPane().add(Jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 590, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,140));

        tblsiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsiswa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 570, 150));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/LibraryBook.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        txtnim.setText("");
        txtnama.setText("");
        cbjurusan.setSelectedIndex(-0);
        txtsemester.setText("");
        txtnim.requestFocus();
    }//GEN-LAST:event_bbatalActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        String nis = txtnim.getText();
        String nama = txtnama.getText();
        String jeniskelamin = null;
        if (rblaki.isSelected()) {
            jeniskelamin = "Laki-Laki";
        } else if (rbperempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }
        String jurusan = (String) cbjurusan.getSelectedItem();
        String kelas = txtsemester.getText();

        if (txtnim.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Mohon Masukan Data Untuk Di Input", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                java.sql.Statement stat = koneksi.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM tabelsiswa WHERE nis ='" + txtnim.getText() + "'");
                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "NIS Sudah Ada", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
                    txtnim.requestFocus();
                } else {
                    String sql = "INSERT INTO tabelsiswa VALUES('" + nis + "'"
                            + ",'" + nama + "'"
                            + ",'" + jeniskelamin + "'"
                            + ",'" + jurusan + "'"
                            + ",'" + kelas + "')";
                    stat.executeUpdate(sql);
                    txtnim.setText("");
                    txtnama.setText("");
                    cbjurusan.setSelectedIndex(-0);
                    txtsemester.setText("");
                    txtnim.requestFocus();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    TampilData();
                }
                stat.close();
            } catch (Exception exc) {
                System.err.println("Terjadi Kesalahan :" + exc);
            }
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "DELETE FROM tabelsiswa WHERE nis='" + txtnim.getText().trim() + "'";
            try {
                Statement stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                stat.close();
                txtnim.setText("");
                txtnama.setText("");
                cbjurusan.setSelectedIndex(-0);
                txtsemester.setText("");
                txtnim.requestFocus();
                TampilData();
            } catch (SQLException exc) {
                System.err.println(sql);
                System.err.println("Error : " + exc);
            }
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
        String jeniskelamin = null;
        if (rblaki.isSelected()) {
            jeniskelamin = "Laki-Laki";
        } else if (rbperempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }
        String sql = "update tabelsiswa set nama='" + txtnama.getText()
                + "',jenis_kelamin='" + jeniskelamin
                + "',jurusan='" + cbjurusan.getSelectedItem()
                + "',kelas='" + txtsemester.getText()
                + "'where nis='" + txtnim.getText().trim() + "'";
        if (txtnim.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong!", "Ubah Data", JOptionPane.WARNING_MESSAGE);
            txtnim.requestFocus();
        } else {
            try {
                Statement stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
                stat.close();
                txtnim.requestFocus();
                TampilData();
            } catch (Exception exc) {
                System.err.println("Error :" + exc);
            }
          }
        }
    }//GEN-LAST:event_bubahActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Terima Kasih Atas Perhatiannya", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_bkeluarActionPerformed

    private void tblsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsiswaMouseClicked
        int baris = tblsiswa.getSelectedRow();
        if (baris != -1) {
            txtnim.setText(tblsiswa.getValueAt(baris, 0).toString());
            txtnama.setText(tblsiswa.getValueAt(baris, 1).toString());
            if ("Laki-Laki".equals(tblsiswa.getValueAt(baris, 2).toString())) {
                rblaki.setSelected(true);
            } else {
                rbperempuan.setSelected(true);
            }
        }
        cbjurusan.setSelectedItem(tblsiswa.getValueAt(baris, 3).toString());
        txtsemester.setText(tblsiswa.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tblsiswaMouseClicked

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
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null, "Selamat Datang");
                new FormSiswa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbjurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rblaki;
    private javax.swing.JRadioButton rbperempuan;
    private javax.swing.JTable tblsiswa;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txtsemester;
    // End of variables declaration//GEN-END:variables

    private void TampilData() {
        //membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("Nama");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Jurusan");
        model.addColumn("Kelas");
        tblsiswa.setModel(model);

        //menampilkan data database kedalam tabel
        try {
            java.sql.Statement stat = koneksi.createStatement();
            ResultSet data = stat.executeQuery("SELECT * FROM tabelsiswa");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("nis"),
                    data.getString("nama"),
                    data.getString("jenis_kelamin"),
                    data.getString("jurusan"),
                    data.getString("kelas")
                });
                tblsiswa.setModel(model);
            }
        } catch (Exception e) {
            System.err.println("Terjadi Kesalahan :" + e);
        }
    }

    private void KoneksiDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
        }
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/datasiswa", "root", "");
            System.out.println("Koneksi Database Berhasil");
        } catch (SQLException se) {
            System.out.println("Koneksi Database Gagal :" + se);
        } catch (Exception e) {
        }
    }
}
