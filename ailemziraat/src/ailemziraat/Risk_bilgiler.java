/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ailemziraat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author HENDEMOGLU
 */
public class Risk_bilgiler extends javax.swing.JFrame {

    private Connection Con;

    public Risk_bilgiler() {
        initComponents();
        lehter_ad_cbox.setEnabled(false);
        try {

            Con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book_table?user=root&password=fsmvu");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Veritabanı bağlantısı kurulurken bir hata oluştu: " + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        genel_bilgiler_lable = new javax.swing.JLabel();
        devam_btn = new javax.swing.JButton();
        temize_btn = new javax.swing.JButton();
        geri_btn = new javax.swing.JButton();
        uyarı_label = new javax.swing.JLabel();
        uyarı2_label = new javax.swing.JLabel();
        hesap_no_text = new javax.swing.JTextField();
        meslek_cbox = new javax.swing.JComboBox<>();
        lehtar_cbox = new javax.swing.JComboBox<>();
        tazminat_bilgisi_cbox = new javax.swing.JComboBox<>();
        teminat_limiti_cbox = new javax.swing.JComboBox<>();
        lehter_ad_cbox = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UYARI\n");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setForeground(java.awt.Color.white);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        genel_bilgiler_lable.setBackground(new java.awt.Color(153, 153, 153));
        genel_bilgiler_lable.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        genel_bilgiler_lable.setText("Risk Bilgileri");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(genel_bilgiler_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(genel_bilgiler_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        devam_btn.setBackground(new java.awt.Color(51, 153, 255));
        devam_btn.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        devam_btn.setForeground(new java.awt.Color(255, 255, 255));
        devam_btn.setText("Devam");
        devam_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devam_btnActionPerformed(evt);
            }
        });

        temize_btn.setBackground(new java.awt.Color(51, 153, 255));
        temize_btn.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        temize_btn.setForeground(new java.awt.Color(255, 255, 255));
        temize_btn.setText("Temizle");
        temize_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temize_btnActionPerformed(evt);
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

        uyarı_label.setFont(new java.awt.Font("Leelawadee UI", 3, 14)); // NOI18N
        uyarı_label.setText("- Lütfen  \" * \"  isareti bulunan yerlerde seçim yapmayı unutmayınız.");

        uyarı2_label.setFont(new java.awt.Font("Leelawadee UI", 3, 14)); // NOI18N
        uyarı2_label.setText("- Lütfen \"Lehtar\" bölümünde \"Diger\" seçenegini seçtikten sonra \"Lehtar Adı Soyadı\" kısmını doldurayı unutmayınız.");

        hesap_no_text.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        hesap_no_text.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Hesap Numarası", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N

        meslek_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz.", "Doktor", "Mühendis", "Avukat", "Öğretmen", "Hemşire", "Polis", "Eczacı", "Psikolog" }));
        meslek_cbox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Meslek ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        meslek_cbox.setPreferredSize(new java.awt.Dimension(95, 50));

        lehtar_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz.", "Diğer", "Kanuni Varis" }));
        lehtar_cbox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Lehtar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        lehtar_cbox.setPreferredSize(new java.awt.Dimension(95, 50));
        lehtar_cbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lehtar_cboxİtemStateChanged(evt);
            }
        });

        tazminat_bilgisi_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz.", "Toplu", "Maaş" }));
        tazminat_bilgisi_cbox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Tazminat Bilgisi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N

        teminat_limiti_cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz.", "2000 TL", "2500 TL", "3000 TL", "3500 TL" }));
        teminat_limiti_cbox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Teminat Limiti", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N

        lehter_ad_cbox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Lehter Adı Soyadı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uyarı2_label)
                    .addComponent(uyarı_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(geri_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(temize_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(devam_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hesap_no_text, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lehtar_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meslek_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teminat_limiti_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tazminat_bilgisi_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lehter_ad_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tazminat_bilgisi_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hesap_no_text, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lehter_ad_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lehtar_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teminat_limiti_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meslek_cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(temize_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uyarı_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uyarı2_label))
                    .addComponent(devam_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(geri_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void devam_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devam_btnActionPerformed
        String meslek = meslek_cbox.getSelectedItem().toString();
        String teminatLimitiStr = teminat_limiti_cbox.getSelectedItem().toString();
        int teminatLimiti = 0;

        try {
            teminatLimiti = Integer.parseInt(teminatLimitiStr.replace(" TL", ""));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Geçersiz teminat limiti seçildi.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String lehtar = lehtar_cbox.getSelectedItem().toString();
        String lehtarAdiSoyadi = lehter_ad_cbox.getText().trim();
        String tazminatBilgisi = tazminat_bilgisi_cbox.getSelectedItem().toString();
        String bankaMusteriNo = hesap_no_text.getText().trim();

        if (meslek.equals("Seçiniz.")) {
            JOptionPane.showMessageDialog(this, "Lütfen meslek seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (lehtar.equals("Seçiniz.")) {
            JOptionPane.showMessageDialog(this, "Lütfen lehtar seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (lehtar.equals("Diğer") && lehtarAdiSoyadi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen lehtar adını girin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (teminatLimitiStr.equals("Seçiniz.")) {
            JOptionPane.showMessageDialog(this, "Lütfen geçerli bir teminat limiti seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (tazminatBilgisi.equals("Seçiniz.")) {
            JOptionPane.showMessageDialog(this, "Lütfen tazminat bilgisini seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (bankaMusteriNo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen banka müşteri numarasını girin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String query = "SELECT * FROM book_table.genel_bilgiler WHERE bankamusteri_no = ?";
        try (PreparedStatement pst = Con.prepareStatement(query)) {
            pst.setString(1, bankaMusteriNo);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String query2 = "INSERT INTO detaylı_bilgiler (Meslek, Lehtar, lehtar_ad, Tazminat_belg, teminat_lmt, bankamusteri_no) VALUES (?, ?, ?, ?, ?, ?)";

                try (PreparedStatement pst2 = Con.prepareStatement(query2)) {
                    pst2.setString(1, meslek);
                    pst2.setString(2, lehtar);

                    if (lehtar.equals("Diğer")) {
                        pst2.setString(3, lehtarAdiSoyadi);
                    } else {
                        pst2.setString(3, "-");
                    }

                    pst2.setString(4, tazminatBilgisi);
                    pst2.setInt(5, teminatLimiti);
                    pst2.setString(6, bankaMusteriNo);

                    int rowsAffected = pst2.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Risk bilgileri başarıyla kaydedildi.", "Başarılı", JOptionPane.INFORMATION_MESSAGE);

                        Ödeme odemeFrame = new Ödeme();
                        odemeFrame.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Risk bilgileri kaydedilirken bir hata oluştu.", "Hata", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "SQL hatası: " + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Yanlış müşteri numarası girdiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "SQL hatası: " + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_devam_btnActionPerformed

    private void temize_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temize_btnActionPerformed
        meslek_cbox.setSelectedIndex(0);
        lehtar_cbox.setSelectedItem("Seçiniz.");
        lehter_ad_cbox.setText("");
        tazminat_bilgisi_cbox.setSelectedIndex(0);
        teminat_limiti_cbox.setSelectedIndex(0);
    }//GEN-LAST:event_temize_btnActionPerformed

    private void lehtar_cboxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lehtar_cboxİtemStateChanged
        if (lehtar_cbox.getSelectedItem().equals("Kanuni Varis") || lehtar_cbox.getSelectedItem().equals("Seçiniz.")) {
            lehter_ad_cbox.setEnabled(false);
            lehter_ad_cbox.setText("");
        } else {
            lehter_ad_cbox.setEnabled(true);
        }
    }//GEN-LAST:event_lehtar_cboxİtemStateChanged

    private void geri_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_btnActionPerformed
        GenelBilgiler genel_bilgilerframe = new GenelBilgiler();
        genel_bilgilerframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_geri_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Risk_bilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Risk_bilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Risk_bilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Risk_bilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Risk_bilgiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton devam_btn;
    private javax.swing.JLabel genel_bilgiler_lable;
    private javax.swing.JButton geri_btn;
    private javax.swing.JTextField hesap_no_text;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> lehtar_cbox;
    private javax.swing.JTextField lehter_ad_cbox;
    private javax.swing.JComboBox<String> meslek_cbox;
    private javax.swing.JComboBox<String> tazminat_bilgisi_cbox;
    private javax.swing.JComboBox<String> teminat_limiti_cbox;
    private javax.swing.JButton temize_btn;
    private javax.swing.JLabel uyarı2_label;
    private javax.swing.JLabel uyarı_label;
    // End of variables declaration//GEN-END:variables
}
