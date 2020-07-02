package View;

import Model.RincianTiket;

import controller.TransaksiPembayaran;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form pembayaran
     */
    private final TransaksiPembayaran  transaksi;
    
    public pembayaran() throws SQLException {
        initComponents();
        this.transaksi = new TransaksiPembayaran();
        this.ShowTablePembayaran();
        this.ShowTextArea();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonCETAK = new javax.swing.JButton();
        tfidpembeli = new javax.swing.JTextField();
        tfIdtiket = new javax.swing.JTextField();
        tfjmlTiket = new javax.swing.JTextField();
        tfHrgatotal = new javax.swing.JTextField();
        tftglPembayaran = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePembayaran = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaStruk = new javax.swing.JTextArea();
        jButtonINSERT = new javax.swing.JButton();
        jButtonDELETE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIDpembayaran = new javax.swing.JTextField();
        jButtonEXIT = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TRANSAKSI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pembayaran");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID Pembeli");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ID Tiket");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah Tiket");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Harga Total");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Tanggal Pembayaran");

        jButtonCETAK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCETAK.setText("CETAK");
        jButtonCETAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCETAKActionPerformed(evt);
            }
        });

        tfHrgatotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHrgatotalActionPerformed(evt);
            }
        });

        jTablePembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePembayaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePembayaran);

        jTextAreaStruk.setColumns(20);
        jTextAreaStruk.setRows(5);
        jScrollPane2.setViewportView(jTextAreaStruk);

        jButtonINSERT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonINSERT.setText("INSERT");
        jButtonINSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSERTActionPerformed(evt);
            }
        });

        jButtonDELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDELETE.setText("DELETE");
        jButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELETEActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ID PEMBAYARAN");

        jButtonEXIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEXIT.setText("EXIT");
        jButtonEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonEXIT)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonINSERT)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButtonDELETE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCETAK)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(tftglPembayaran))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHrgatotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfjmlTiket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfIdtiket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfidpembeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldIDpembayaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldIDpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfidpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfIdtiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfjmlTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfHrgatotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(tftglPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonINSERT)
                            .addComponent(jButtonDELETE)
                            .addComponent(jButtonCETAK))
                        .addGap(51, 51, 51)
                        .addComponent(jButtonEXIT)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void ShowTablePembayaran() throws SQLException {
     DefaultTableModel dtmpembayaran = new DefaultTableModel(new String[]
        {"Id Pembayaran","Id Pembeli","Id Tiket","Jumlah Tiket","Harga Total","Tanggal Pembayaran"},0);
        dtmpembayaran.setRowCount(0); 
        
        for(RincianTiket dp : this.transaksi.getDataPembayaran()){
            dtmpembayaran.addRow(new String[]{dp.getId_pembayaran().toString(), dp.getId_pembeli().toString(), dp.getId_tiket().toString(), 
            dp.getJumlah_tiket().toString(), dp.getHarga_total().toString(), dp.getTgl_pembayaran().toString()});
        }

        this.jTablePembayaran.setModel(dtmpembayaran);
 }
 
 
    private void ShowTextArea() {
       
    }


  
    private void jButtonINSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSERTActionPerformed
        // TODO add your handling code here:
        RincianTiket pembayaran = new RincianTiket();
        
        try {
            pembayaran.setId_pembayaran(Integer.parseInt(this.jTextFieldIDpembayaran.getText()));
            pembayaran.setId_pembeli(Integer.parseInt(this.tfidpembeli.getText()));
            pembayaran.setId_tiket(Integer.parseInt(this.tfIdtiket.getText()));
            pembayaran.setJumlah_tiket(Integer.parseInt(this.tfjmlTiket.getText()));
            pembayaran.setHarga_total(Integer.parseInt(this.tfHrgatotal.getText()));
            pembayaran.setTgl_pembayaran(new SimpleDateFormat("dd/mm/yyyy").parse(this.tftglPembayaran.getText()));
          
            this.transaksi.getDataPembayaran();
            this.transaksi.insertPembayaran(pembayaran);
            this.ShowTablePembayaran();
        } catch (SQLException | ParseException  err) {
            System.out.println(err);
        }   
    }//GEN-LAST:event_jButtonINSERTActionPerformed

    private void jButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELETEActionPerformed
        // TODO add your handling code here:
         try {
            RincianTiket pembayaran = new RincianTiket();
            
            this.jTablePembayaran.getSelectedRow();
            pembayaran.setId_pembayaran(Integer.parseInt(jTablePembayaran.getValueAt(jTablePembayaran.getSelectedRow(), 0).toString()));
            
            this.transaksi.DeletePembayaran(pembayaran);
            this.ShowTablePembayaran();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButtonDELETEActionPerformed

    private void tfHrgatotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHrgatotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHrgatotalActionPerformed

    private void jButtonEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXITActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonEXITActionPerformed

    private void jTablePembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePembayaranMouseClicked
        // TODO add your handling code here:
        
         int baris = jTablePembayaran.getSelectedRow();
        this.jTextFieldIDpembayaran.setText(jTablePembayaran.getValueAt(baris, 0).toString());
        this.tfidpembeli.setText(jTablePembayaran.getValueAt(baris, 1).toString());
        this.tfIdtiket.setText(jTablePembayaran.getValueAt(baris, 2).toString());
        this.tfjmlTiket.setText(jTablePembayaran.getValueAt(baris, 3).toString());
        this.tfHrgatotal.setText(jTablePembayaran.getValueAt(baris, 4).toString());
        this.tftglPembayaran.setText(jTablePembayaran.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_jTablePembayaranMouseClicked

    private void jButtonCETAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCETAKActionPerformed
        try {
           RincianTiket rin = this.transaksi.getDataPembayaran().get(this.jTablePembayaran.getSelectedRow());
           String teks=" "+"==================STADION KANJURUHAN=================="+"\n"
                   +"Kode bayar : "+rin.getId_pembayaran()+"\n"
                   +"Kode beli : "+rin.getId_pembeli()+"\n"
                   +"Kode Tiket : "+rin.getId_tiket()+"\n"
                   +"Jumlah Tiket : "+rin.getJumlah_tiket()+"\n"
                   +"Harga Total : "+rin.getHarga_total()+"\n"
                   +"Tanggal Bayar : "+rin.getTgl_pembayaran();
           this.jTextAreaStruk.setText(teks);
           
        } catch (SQLException ex) {
           System.out.print(ex);
        }
        
    }//GEN-LAST:event_jButtonCETAKActionPerformed

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
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pembayaran().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pembayaran.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCETAK;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JButton jButtonEXIT;
    private javax.swing.JButton jButtonINSERT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePembayaran;
    private javax.swing.JTextArea jTextAreaStruk;
    private javax.swing.JTextField jTextFieldIDpembayaran;
    private javax.swing.JTextField tfHrgatotal;
    private javax.swing.JTextField tfIdtiket;
    private javax.swing.JTextField tfidpembeli;
    private javax.swing.JTextField tfjmlTiket;
    private javax.swing.JTextField tftglPembayaran;
    // End of variables declaration//GEN-END:variables

   
}
