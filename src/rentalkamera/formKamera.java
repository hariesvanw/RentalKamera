/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalkamera;

import javax.swing.JOptionPane; // membuat pesan dialog
import java.sql.*; // untuk menampilkan data dara perintah query
/**
 *
 * @author USER
 */
public class formKamera extends javax.swing.JFrame {
    
String judulKolom[]={"Kode Kamera","Merk","Tahun","Asal","Stok"};
String sqlKamera="SELECT*FROM kamera";
int lebarKolom[]={100,300,100,60,200,60};

    /**
     * Creates new form formKamera
     */
    public formKamera() {
        initComponents();
        this.setLocationRelativeTo(null); // untuk memposisikan form ditengah layar
new ConfigDB().tampilTabel(judulKolom, sqlKamera, JTableformKamera);
new ConfigDB().aturLebarKolom(JTableformKamera, lebarKolom);
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
        txtKodeKamera = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtAsal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableformKamera = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Kamera");

        jLabel2.setText("Merk");

        jLabel3.setText("Tahun");

        jLabel4.setText("Asal");

        txtMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMerkActionPerformed(evt);
            }
        });

        jLabel5.setText("Stok");

        jButton1.setText("simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JTableformKamera.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableformKamera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableformKameraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableformKamera);

        jButton4.setText("clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCari)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtKodeKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4))))))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKodeKamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
if (
(txtKodeKamera.getText().isEmpty()) && (txtMerk.getText().isEmpty()) &&
(txtAsal.getText().isEmpty()) && (txtTahun.getText().isEmpty()) &&
        (txtStok.getText().isEmpty())
)
{
JOptionPane.showMessageDialog(null,"Silahkan Pilih Data dulu untuk proses Ubah");
JTableformKamera.requestFocus();
} else
{
String SQL="UPDATE kamera SET merk='"+txtMerk.getText()+"', tahun='"+txtTahun.getText()+"', asal='"+txtAsal.getText()+"', stok='"+txtStok.getText()+"' WHERE KodeKamera='"+txtKodeKamera.getText()+"'";
new ConfigDB().ubahData(SQL);
new ConfigDB().tampilTabel(judulKolom, sqlKamera, JTableformKamera);
new ConfigDB().aturLebarKolom(JTableformKamera, lebarKolom);
}
} catch (Exception e)
{
System.out.print(e.toString());
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    try {
    if (txtKodeKamera.getText().isEmpty()){
    JOptionPane.showMessageDialog(null,"Kode kamera belum diisi");
    txtKodeKamera.requestFocus();
} else
    if (txtMerk.getText().isEmpty()){
    JOptionPane.showMessageDialog(null,"Merk kamera belum diisi");
    txtMerk.requestFocus();
} else
    if (txtAsal.getText().isEmpty()){
    JOptionPane.showMessageDialog(null,"Asal negara kamera belum diisi");
    txtAsal.requestFocus();
}else
    if (txtStok.getText().isEmpty()){
    JOptionPane.showMessageDialog(null,"Stok kamera belum diisi");
    txtStok.requestFocus();
}else
    if (new ConfigDB().duplikasiData("kamera","KodeKamera",txtKodeKamera.getText())==true){
    JOptionPane.showMessageDialog(null,"Kode Kamera sudah terdaftar");
    Statement st = new ConfigDB().koneksi.createStatement();
    ResultSet rs = st.executeQuery("SELECT*FROM kamera WHERE KodeKamera='"+txtKodeKamera.getText()+"'");
    if (rs.next()){
    txtMerk.setText(rs.getString("merk"));
txtTahun.setText(rs.getString("Tahun"));
txtAsal.setText(rs.getString("Asal"));
txtStok.setText(rs.getString("Stok"));
}
}else{
    String SQL="INSERT INTO kamera VALUES ('"+txtKodeKamera.getText()+"','"+txtMerk.getText()+"','"+txtTahun.getText()+"','"+txtAsal.getText()+"','"+txtStok.getText()+"')";
    new ConfigDB().simpanData(SQL);
    new ConfigDB().tampilTabel(judulKolom, sqlKamera, JTableformKamera);
    new ConfigDB().aturLebarKolom(JTableformKamera, lebarKolom);
}
} catch (Exception e) {
    System.out.println("Simpan gagal \n"+e);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
if (
(txtKodeKamera.getText().isEmpty()) && (txtMerk.getText().isEmpty()) &&
(txtAsal.getText().isEmpty()) && (txtTahun.getText().isEmpty()) &&
(txtStok.getText().isEmpty())
        )
{
JOptionPane.showMessageDialog(null,"Silahkan Pilih Data dulu untuk proses Hapus");
JTableformKamera.requestFocus();
} else
{
String SQL="DELETE FROM kamera WHERE KodeKamera='"+txtKodeKamera.getText()+"'";
new ConfigDB().hapusData(SQL);
new ConfigDB().tampilTabel(judulKolom, sqlKamera, JTableformKamera);
new ConfigDB().aturLebarKolom(JTableformKamera, lebarKolom);
}
} catch (Exception e)
{
System.out.print(e.toString());
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtKodeKamera.setText(null);
        txtMerk.setText(null);
        txtAsal.setText(null);
        txtStok.setText(null);
        txtTahun.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new ConfigDB().tampilTabel(judulKolom, sqlKamera, JTableformKamera);
new ConfigDB().aturLebarKolom(JTableformKamera, lebarKolom);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void JTableformKameraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableformKameraMouseClicked
        // TODO add your handling code here:
        try {
int baris = JTableformKamera.getSelectedRow();
txtKodeKamera.setText(String.valueOf(JTableformKamera.getValueAt(baris,0)));
txtMerk.setText(String.valueOf(JTableformKamera.getValueAt(baris,1)));
txtTahun.setText(String.valueOf(JTableformKamera.getValueAt(baris,3)));
txtAsal.setText(String.valueOf(JTableformKamera.getValueAt(baris,4)));
txtStok.setText(String.valueOf(JTableformKamera.getValueAt(baris,5)));
} catch (Exception e) {
    System.out.print(e.toString());
}
    }//GEN-LAST:event_JTableformKameraMouseClicked

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        // TODO add your handling code here:
        try {
String SQL="SELECT*FROM kamera WHERE merk like '%"+txtCari.getText()+"%'";
new ConfigDB().cariData(judulKolom, SQL, JTableformKamera);
} catch (Exception e) {
System.out.print(e.toString());
}
    }//GEN-LAST:event_txtCariKeyPressed

    private void txtMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMerkActionPerformed

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
            java.util.logging.Logger.getLogger(formKamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formKamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formKamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKamera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableformKamera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAsal;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKodeKamera;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
