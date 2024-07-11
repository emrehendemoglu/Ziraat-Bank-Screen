/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ailemziraat;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author HENDEMOGLU
 */
public class Ödeme extends javax.swing.JFrame {

    public Ödeme() {
        initComponents();

        try {
            Con = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book_table?user=root&password=fsmvu");
        } catch (Exception e) {
            System.out.println(e);
        }
        fetchAndUpdateTeklifNo();
    }

    private int teklifNo = 100000001;
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    private void saveTeklifNoToDatabase(int teklifNo) {
        try {
            String query = "INSERT INTO book_table.odeme (teklifno) VALUES (" + teklifNo + ")";
            St.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchAndUpdateTeklifNo() {
        try {
            String query = "SELECT MAX(teklifno) AS max_teklifno FROM book_table.odeme";
            Rs = St.executeQuery(query);
            if (Rs.next()) {
                teklifNo = Rs.getInt("max_teklifno") + 1;
            } else {
                teklifNo = 10000001;
            }
            teklif_no_textfield.setText(String.valueOf(teklifNo));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        genel_bilgiler_lable = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        brut_prim_label = new javax.swing.JLabel();
        teklif_no_label = new javax.swing.JLabel();
        Brut_prim_textfield = new javax.swing.JTextField();
        teklif_no_textfield = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        teklif_buton = new javax.swing.JButton();
        policelestir_btn = new javax.swing.JButton();
        geri_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        sigorta_ettiren_text1 = new javax.swing.JTextField();
        musteri_ad_text = new javax.swing.JTextField();
        ıban_textfiled = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        genel_bilgiler_lable.setBackground(new java.awt.Color(153, 153, 153));
        genel_bilgiler_lable.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        genel_bilgiler_lable.setText("Ödeme");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(genel_bilgiler_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(genel_bilgiler_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        jLabel1.setText("Hesaptan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(878, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        brut_prim_label.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        brut_prim_label.setText("Brüt Prim : ");

        teklif_no_label.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        teklif_no_label.setText("Teklif No : ");

        Brut_prim_textfield.setText(" ");

        teklif_no_textfield.setText(" ");

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        teklif_buton.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        teklif_buton.setText("Teklif Kaydet");
        teklif_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teklif_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(teklif_buton)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(teklif_buton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        policelestir_btn.setBackground(new java.awt.Color(51, 153, 255));
        policelestir_btn.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        policelestir_btn.setForeground(new java.awt.Color(255, 255, 255));
        policelestir_btn.setText("Poliçelestir");
        policelestir_btn.setActionCommand("Policelestir");
        policelestir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policelestir_btnActionPerformed(evt);
            }
        });

        geri_btn.setBackground(new java.awt.Color(51, 153, 255));
        geri_btn.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        geri_btn.setForeground(new java.awt.Color(255, 255, 255));
        geri_btn.setText("Geri");
        geri_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_btnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        sigorta_ettiren_text1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        sigorta_ettiren_text1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hesap", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        sigorta_ettiren_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigorta_ettiren_text1ActionPerformed(evt);
            }
        });
        sigorta_ettiren_text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sigorta_ettiren_text1KeyPressed(evt);
            }
        });

        musteri_ad_text.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        musteri_ad_text.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müsterinin Adı Soyadı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        musteri_ad_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_ad_textActionPerformed(evt);
            }
        });

        ıban_textfiled.setBorder(javax.swing.BorderFactory.createTitledBorder("IBAN"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ıban_textfiled)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sigorta_ettiren_text1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(musteri_ad_text, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sigorta_ettiren_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteri_ad_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(ıban_textfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Yeni Teklif");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brut_prim_label, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teklif_no_label))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teklif_no_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Brut_prim_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(geri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(policelestir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Brut_prim_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brut_prim_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(teklif_no_label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teklif_no_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(geri_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(policelestir_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigorta_ettiren_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigorta_ettiren_text1ActionPerformed


    }//GEN-LAST:event_sigorta_ettiren_text1ActionPerformed

    private void musteri_ad_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_ad_textActionPerformed

    }//GEN-LAST:event_musteri_ad_textActionPerformed

    private void policelestir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policelestir_btnActionPerformed

    }//GEN-LAST:event_policelestir_btnActionPerformed

    private void sigorta_ettiren_text1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sigorta_ettiren_text1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String hesapno = sigorta_ettiren_text1.getText();
            try {
                St = Con.createStatement();
                String query = "SELECT * FROM book_table.risk_bilgileri WHERE hesapno = '" + hesapno + "'";
                Rs = St.executeQuery(query);
                if (Rs.next()) {
                    String adi = Rs.getString("adi");
                    String ibanno = Rs.getString("ibanno");
                    musteri_ad_text.setText(adi);
                    ıban_textfiled.setText(ibanno);
                } else {
                    JOptionPane.showMessageDialog(this, "Kayıt bulunamadı", "Hata", JOptionPane.ERROR_MESSAGE);
                    musteri_ad_text.setText("");
                    ıban_textfiled.setText("");
                }
                Rs.close();
                St.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Bir hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_sigorta_ettiren_text1KeyPressed

    private void teklif_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teklif_butonActionPerformed
        try {

            Statement St = Con.createStatement();
            ResultSet rs = St.executeQuery("SELECT MAX(teklifno) AS max_teklifno FROM book_table.odeme");
            int teklifNo = 100000000;

            if (rs.next()) {
                teklifNo = rs.getInt("max_teklifno") + 1;
            }

            Random rand = new Random();
            int teklif = rand.nextInt(9001) + 1000;
            Brut_prim_textfield.setText(String.valueOf(teklif));
            teklif_no_textfield.setText(String.valueOf(teklifNo));

            String sigortaEttirenNo = sigorta_ettiren_text1.getText();
            int primTutar = Integer.parseInt(Brut_prim_textfield.getText());

            String query = "INSERT INTO book_table.odeme (teklifno, bamkamusteri_no, primtutar) VALUES (" + teklifNo + ", '" + sigortaEttirenNo + "', " + primTutar + ")";
            St.executeUpdate(query);

            teklif_buton.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_teklif_butonActionPerformed

    private void geri_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_btnActionPerformed
        Risk_bilgiler risk_bilgilerframe = new Risk_bilgiler();
        risk_bilgilerframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_geri_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GenelBilgiler genel_bilgilerframe = new GenelBilgiler();
        genel_bilgilerframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ödeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ödeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ödeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ödeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ödeme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brut_prim_textfield;
    private javax.swing.JLabel brut_prim_label;
    private javax.swing.JLabel genel_bilgiler_lable;
    private javax.swing.JButton geri_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField musteri_ad_text;
    private javax.swing.JButton policelestir_btn;
    private javax.swing.JTextField sigorta_ettiren_text1;
    private javax.swing.JButton teklif_buton;
    private javax.swing.JLabel teklif_no_label;
    private javax.swing.JTextField teklif_no_textfield;
    private javax.swing.JTextField ıban_textfiled;
    // End of variables declaration//GEN-END:variables
}
