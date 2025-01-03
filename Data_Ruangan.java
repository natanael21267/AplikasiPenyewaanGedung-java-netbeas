/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipenyewaangedung;

import java.sql.Connection;
import config.Koneksi;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Data_Ruangan extends javax.swing.JFrame {

    /**
     * Creates new form Data_Ruangan
     */
    
    private final Connection conn;
    public Data_Ruangan() {
        initComponents();
        
        conn = Koneksi.getConnection();
        nonAktifButton();
        
        placeHolder(Kode, "Kode");
        placeHolder(NamaRuangan, "Nama Ruangan");
        placeHolder(Lokasi, "Lokasi");
        placeHolder(Luas, "Luas");
        placeHolder(Kapasitas, "Kapasitas");
        placeHolder(HargaSewa, "Harga Sewa");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Kode = new javax.swing.JTextField();
        NamaRuangan = new javax.swing.JTextField();
        Lokasi = new javax.swing.JTextField();
        Luas = new javax.swing.JTextField();
        Kapasitas = new javax.swing.JTextField();
        HargaSewa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Catatan = new javax.swing.JTextArea();
        Save = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DATA RUANGAN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Kode Ruangan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama Ruangan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Lokasi");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Luas");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Kapasitas");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Harga Sewa");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Catatan");

        Kode.setName(""); // NOI18N
        Kode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KodeMouseClicked(evt);
            }
        });
        Kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KodeActionPerformed(evt);
            }
        });

        Catatan.setColumns(20);
        Catatan.setRows(5);
        jScrollPane1.setViewportView(Catatan);

        Save.setText("SAVE");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });

        Edit.setText("EDIT");
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Ruangan", "Lokasi", "Luas", "Kapasitas", "Harga Sewa", "Catatan"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(NamaRuangan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lokasi, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Luas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Kapasitas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HargaSewa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Save)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Edit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Delete))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Kode))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(296, 296, 296))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NamaRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Luas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Kapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(HargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Edit)
                    .addComponent(Delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KodeActionPerformed

    private void KodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KodeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_KodeMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SaveMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        // TODO add your handling code here:
        String kode_ruangan = Kode.getText();
        String nama_ruangan = NamaRuangan.getText();
        String lokasi = Lokasi.getText();
        String luas = Luas.getText();
        String kapasitas = Kapasitas.getText();
        String harga = HargaSewa.getText();
        String catatan = Catatan.getText();
        
        try {
            String sql = "UPDATE ruangan SET Kode=?, Nama_ruangan=?, Lokasi=?, Luas=?, Kapasitas=?, Harga_sewa=?, Catatan=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, kode_ruangan);
            stmt.setString(2, nama_ruangan);
            stmt.setString(3, lokasi);
            stmt.setString(4, luas);
            stmt.setString(5, kapasitas);
            stmt.setString(6, harga);
            stmt.setString(7, catatan);
            
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan"+ex);
        }
    }//GEN-LAST:event_EditMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan diedit!");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Hapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        try {
                String sql = "DELETE FROM ruangan WHERE Kode=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                String kode_ruangan = Kode.getText();
                stmt.setString(1, kode_ruangan);
                
                int rowDelete = stmt.executeUpdate();
                if (rowDelete > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                }
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus"+ex);
        }
        resetForm();
        nonAktifButton();
    }//GEN-LAST:event_DeleteMouseClicked

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow != -1) {
            String kode_ruangan = tblData.getValueAt(selectedRow, 1).toString();
            String nama_ruangan = tblData.getValueAt(selectedRow, 2).toString();
            String lokasi = tblData.getValueAt(selectedRow, 3).toString();
            String luas = tblData.getValueAt(selectedRow, 4).toString();
            String kapasitas = tblData.getValueAt(selectedRow, 5).toString();
            String harga_sewa = tblData.getValueAt(selectedRow, 6).toString();
            String catatan = tblData.getValueAt(selectedRow, 7).toString();
            
            Kode.setText(kode_ruangan);
            NamaRuangan.setText(nama_ruangan);
            Lokasi.setText(lokasi);
            Luas.setText(luas);
            Kapasitas.setText(kapasitas);
            HargaSewa.setText(harga_sewa);
            Catatan.setText(catatan);
        }
        Save.setEnabled(false);
        Edit.setEnabled(true);
        Delete.setEnabled(true);
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(Data_Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Ruangan().setVisible(true);
            }
        });
    }
    
    void placeHolder(javax.swing.JTextField textField, String placeholder){
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);
        textField.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
            
        });
    }
    
    private void resetForm() {
        Kode.setText("");
        NamaRuangan.setText("");
        Lokasi.setText("");
        Luas.setText("");
        Kapasitas.setText("");
        HargaSewa.setText("");
        Catatan.setText("");
    }
    
    private void nonAktifButton() {
        Save.setEnabled(true);
        Edit.setEnabled(false);
        Delete.setEnabled(false);
    }
    
//    private void getData() {
//        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
//        model.setRowCount(0);
//        
//        try {
//            String sql = "SELECT * FROM ruangan";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            
//            while (rs.next()) {
//                int id = rs.getInt("Kode");
//                String kode_ruangan = rs.getString("Kode");
//                String nama_ruangan = rs.getString("Nama_ruangan");
//                String lokasi     = rs.getString("Lokasi");
//                String luas     = rs.getString("Luas");
//                String kapasitas      = rs.getString("Kapasitas");
//                String harga_sewa = rs.getString("Harga_sewa");
//                String catatan = rs.getString("Catatan");
//                
//                Object[] rowData = {Kode, NamaRuangan, Lokasi, Luas, Kapasitas, HargaSewa, Catatan};
//                model.addRow(rowData);
//            }
//            rs.close();
//            stmt.close();
//        } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "Gagal Get Data"+ex);
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Catatan;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField HargaSewa;
    private javax.swing.JTextField Kapasitas;
    private javax.swing.JTextField Kode;
    private javax.swing.JTextField Lokasi;
    private javax.swing.JTextField Luas;
    private javax.swing.JTextField NamaRuangan;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}

