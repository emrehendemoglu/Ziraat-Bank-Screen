/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ailemziraat;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author HENDEMOGLU
 */
public class GenelBilgiler extends javax.swing.JFrame {

    public GenelBilgiler() {
        initComponents();
        setupKeyBindings();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book_table?user=root&password=fsmvu");
        } catch (Exception e) {
            System.out.println(e);
        }
        sigorta_kisi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                sigorta_ettiren_text2.setVisible(true);
                musteri_ad_text2.setVisible(true);
                sigorta_ettiren_text2.setEditable(true);
            }
        });

        sigorta_ettiren_text2.setEnabled(false);
        musteri_ad_text2.setEnabled(false);
        if (!sigorta_kisi_btn.isEnabled()) {
            sigorta_ettiren_text2.setEditable(false);
        }
    
    sigorta_ettiren_text1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_TAB) {
                    evt.consume();
                    musteri_ad_text.setText(sigorta_ettiren_text1.getText());
                    musteri_ad_text.requestFocus();
                }
            }
        });

        // sigorta_ettiren_text2 KeyAdapter ekleme
        sigorta_ettiren_text2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_TAB) {
                    evt.consume();
                    musteri_ad_text2.setText(sigorta_ettiren_text2.getText());
                    musteri_ad_text2.requestFocus();
                }
            }
        });
    }
      private void setupKeyBindings() {
       int condition = JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        InputMap inputMap = sigorta_ettiren_text1.getInputMap(condition);
        ActionMap actionMap = sigorta_ettiren_text1.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "focusNext");
        actionMap.put("focusNext", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musteri_ad_text.requestFocusInWindow();
            }
        });

      }
                

    @SuppressWarnings("unchecked")
    private void Reset() {
        sigorta_ettiren_text2.setText("");
        sigorta_ettiren_text1.setText("");
        musteri_ad_text.setText("");
        musteri_ad_text2.setText("");
        sigorta_kisi_btn.setSelected(false);

    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;


        

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        ürüntipi_panel = new javax.swing.JPanel();
        ürün_tipi_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        genel_bilgiler_lable = new javax.swing.JLabel();
        sigorta_ettiren_text2 = new javax.swing.JTextField();
        musteri_ad_text2 = new javax.swing.JTextField();
        devam_btn = new javax.swing.JButton();
        temize_btn = new javax.swing.JButton();
        sigorta_kisi_btn = new javax.swing.JRadioButton();
        sigorta_ettiren_text1 = new javax.swing.JTextField();
        musteri_ad_text = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setTitle("Genel Bilgiler");
        setIconImages(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        ürüntipi_panel.setBackground(new java.awt.Color(51, 153, 255));
        ürüntipi_panel.setForeground(new java.awt.Color(255, 255, 255));

        ürün_tipi_label.setBackground(new java.awt.Color(255, 255, 255));
        ürün_tipi_label.setFont(new java.awt.Font("Leelawadee UI", 3, 18)); // NOI18N
        ürün_tipi_label.setForeground(new java.awt.Color(255, 255, 255));
        ürün_tipi_label.setText("Ailem Ziraat Güvencesinde (AZG)");
        ürün_tipi_label.setToolTipText("");
        ürün_tipi_label.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "* Ürün Tipi ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout ürüntipi_panelLayout = new javax.swing.GroupLayout(ürüntipi_panel);
        ürüntipi_panel.setLayout(ürüntipi_panelLayout);
        ürüntipi_panelLayout.setHorizontalGroup(
            ürüntipi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ürüntipi_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ürün_tipi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ürüntipi_panelLayout.setVerticalGroup(
            ürüntipi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ürüntipi_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ürün_tipi_label)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        genel_bilgiler_lable.setBackground(new java.awt.Color(153, 153, 153));
        genel_bilgiler_lable.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        genel_bilgiler_lable.setText("Genel Bilgiler");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(genel_bilgiler_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(genel_bilgiler_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        sigorta_ettiren_text2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        sigorta_ettiren_text2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)), "* Sigorta Ettiren Müsteri ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        sigorta_ettiren_text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigorta_ettiren_text2ActionPerformed(evt);
            }
        });

        musteri_ad_text2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        musteri_ad_text2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14), new java.awt.Color(51, 153, 255)), "Müsteri Adı / Soyadı / Unvanı ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        musteri_ad_text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_ad_text2ActionPerformed(evt);
            }
        });

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

        sigorta_kisi_btn.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        sigorta_kisi_btn.setText("Sigortalı Farklı Bir Kisi");
        sigorta_kisi_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigorta_kisi_btnActionPerformed(evt);
            }
        });

        sigorta_ettiren_text1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        sigorta_ettiren_text1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)), "* Sigorta Ettiren Müsteri ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        sigorta_ettiren_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigorta_ettiren_text1ActionPerformed(evt);
            }
        });

        musteri_ad_text.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        musteri_ad_text.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)), "Müsteri Adı / Soyadı / Unvanı ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 2, 14))); // NOI18N
        musteri_ad_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_ad_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 921, Short.MAX_VALUE)
                .addComponent(temize_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(devam_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ürüntipi_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sigorta_ettiren_text1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(sigorta_ettiren_text2))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(musteri_ad_text, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                                    .addComponent(musteri_ad_text2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(sigorta_kisi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ürüntipi_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sigorta_ettiren_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(musteri_ad_text, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(sigorta_kisi_btn)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sigorta_ettiren_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(musteri_ad_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temize_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devam_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigorta_ettiren_text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigorta_ettiren_text2ActionPerformed
        String input2 = sigorta_ettiren_text2.getText().trim();

        if (input2.matches("\\d+")) {
            try {
                String mernisNo2 = input2;
                String bankaMusteriNo2 = input2;

                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book_table?user=root&password=fsmvu");

                Statement st2 = con.createStatement();
                ResultSet rs2 = st2.executeQuery("SELECT adi FROM genel_bilgiler WHERE mernis_no = '" + mernisNo2 + "'");
                if (rs2.next()) {
                    String musteriAd = rs2.getString("adi");
                    musteri_ad_text2.setText(musteriAd);
                }
                rs2.close();

                rs2 = st2.executeQuery("SELECT adi FROM genel_bilgiler WHERE bankamusteri_no = '" + bankaMusteriNo2 + "'");
                if (rs2.next()) {
                    String musteriAd = rs2.getString("adi");
                    musteri_ad_text2.setText(musteriAd);
                } else if (musteri_ad_text2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Müşteri bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                    musteri_ad_text2.setText("");
                }
                rs2.close();
                rs2.close();
                st2.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Veritabanı hatası.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen sadece sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
            sigorta_ettiren_text2.setText("");
        }

    }//GEN-LAST:event_sigorta_ettiren_text2ActionPerformed

    private void musteri_ad_text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_ad_text2ActionPerformed

        try {
            String sigortaEttiren = sigorta_ettiren_text2.getText();

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book_table?user=root&password=fsmvu");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT ad_soyad FROM genel_bilgiler WHERE bankamusteri_no = '" + sigortaEttiren + "'");

            if (rs.next()) {
                String musteriAd = rs.getString("adi");
                musteri_ad_text.setText(musteriAd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_musteri_ad_text2ActionPerformed

    private void devam_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devam_btnActionPerformed
        // TODO add your handling code here:
        String bankaMusteriNo = sigorta_ettiren_text1.getText();

        if (!bankaMusteriNo.isEmpty()) {
            if (!sigorta_kisi_btn.isSelected() || !sigorta_ettiren_text2.getText().isEmpty()) {
                Risk_bilgiler risk_bilgilerframe = new Risk_bilgiler();
                risk_bilgilerframe.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Boş yerleri doldurun veya seçimlerinizi kontrol edin.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Banka müşteri numarası boş olamaz.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_devam_btnActionPerformed

    private void temize_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temize_btnActionPerformed
        Reset();
    }//GEN-LAST:event_temize_btnActionPerformed

    private void sigorta_ettiren_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigorta_ettiren_text1ActionPerformed
        String input = sigorta_ettiren_text1.getText().trim();

        if (input.matches("\\d+")) {
            try {
                String mernisNo = input;
                String bankaMusteriNo = input;

                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book_table?user=root&password=fsmvu");

                Statement st1 = con.createStatement();
                Statement st2 = con.createStatement();

                ResultSet rs1 = st1.executeQuery("SELECT adi FROM genel_bilgiler WHERE mernis_no = '" + mernisNo + "'");
                if (rs1.next()) {
                    String musteriAd = rs1.getString("adi");
                    musteri_ad_text.setText(musteriAd);
                }
                rs1.close();

                ResultSet rs2 = st2.executeQuery("SELECT adi FROM genel_bilgiler WHERE bankamusteri_no = '" + bankaMusteriNo + "'");
                if (rs2.next()) {
                    String musteriAd = rs2.getString("adi");
                    musteri_ad_text.setText(musteriAd);
                } else if (musteri_ad_text.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Müşteri bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                    musteri_ad_text.setText("");
                }
                rs2.close();

                st1.close();
                st2.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Veritabanı hatası.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen sadece sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
            sigorta_ettiren_text1.setText("");
        }
    }//GEN-LAST:event_sigorta_ettiren_text1ActionPerformed

    private void musteri_ad_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_ad_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musteri_ad_textActionPerformed

    private void sigorta_kisi_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigorta_kisi_btnActionPerformed
        sigorta_ettiren_text2.setEnabled(sigorta_kisi_btn.isSelected());
        sigorta_ettiren_text2.setEditable(sigorta_kisi_btn.isSelected());
        musteri_ad_text2.setEnabled(sigorta_kisi_btn.isSelected());
        musteri_ad_text2.setEditable(sigorta_kisi_btn.isSelected());

        if (!sigorta_kisi_btn.isSelected()) {
            sigorta_ettiren_text2.setText("");
            musteri_ad_text2.setText("");
        }
    }//GEN-LAST:event_sigorta_kisi_btnActionPerformed

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
            java.util.logging.Logger.getLogger(GenelBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenelBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenelBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenelBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new GenelBilgiler().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton devam_btn;
    private javax.swing.JLabel genel_bilgiler_lable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField musteri_ad_text;
    private javax.swing.JTextField musteri_ad_text2;
    private javax.swing.JTextField sigorta_ettiren_text1;
    private javax.swing.JTextField sigorta_ettiren_text2;
    private javax.swing.JRadioButton sigorta_kisi_btn;
    private javax.swing.JButton temize_btn;
    private javax.swing.JLabel ürün_tipi_label;
    private javax.swing.JPanel ürüntipi_panel;
    // End of variables declaration//GEN-END:variables
}
