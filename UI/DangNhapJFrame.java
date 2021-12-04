/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.UI;

import AppPackage.AnimationClass;
import com.Sell.DAO.NhanVien_Dao;
import com.Sell.Helper.Auth;
import com.Sell.Helper.DesignHelper;
import com.Sell.Helper.FrameDragListener;
import com.Sell.entity.NhanVien;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class DangNhapJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public DangNhapJFrame() {
        setUndecorated(true);
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        initComponents();
        init();
        chayDongHo();
        this.setLocationRelativeTo(null);
        txtan.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTong = new RoundedPanel(0, new Color(51,51,51));
        jPanel2 = new javax.swing.JPanel();
        lblhinhentrai = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        txtTaiKhoan = new javax.swing.JTextField();
        txtmatKhau = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        lblQuenMk = new javax.swing.JLabel();
        lblshowpass = new javax.swing.JLabel();
        txtan = new javax.swing.JLabel();
        lblKetThuc = new javax.swing.JLabel();
        lblThuLai = new javax.swing.JLabel();
        lblthongBao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTong.setOpaque(false);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        lblhinhentrai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sell/icons/hinhnentrai.png"))); // NOI18N
        lblhinhentrai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhinhentraiMouseClicked(evt);
            }
        });
        jPanel2.add(lblhinhentrai);

        pnl1.setOpaque(false);

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        txtTaiKhoan.setBackground(new java.awt.Color(240, 240, 240));
        txtTaiKhoan.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        txtTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 51, 255)));
        txtTaiKhoan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTaiKhoanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTaiKhoanFocusLost(evt);
            }
        });

        txtmatKhau.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtmatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtmatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 51, 255)));
        txtmatKhau.setOpaque(false);
        txtmatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmatKhauFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmatKhauFocusLost(evt);
            }
        });
        txtmatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmatKhauKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rosewood Std Regular", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sell/icons/skoottachnenmautin1.png"))); // NOI18N
        jLabel1.setText("skoot");

        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sell/icons/anime7_2.png"))); // NOI18N

        btnDangNhap.setBackground(new java.awt.Color(153, 51, 255));
        btnDangNhap.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.setOpaque(false);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        lblQuenMk.setFont(new java.awt.Font("Segoe UI Semilight", 3, 14)); // NOI18N
        lblQuenMk.setForeground(new java.awt.Color(255, 255, 255));
        lblQuenMk.setText("Quên mật khẩu ?");
        lblQuenMk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuenMkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuenMkMouseExited(evt);
            }
        });

        lblshowpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblshowpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sell/icons/noshowpass.png"))); // NOI18N
        lblshowpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshowpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshowpassMouseClicked(evt);
            }
        });

        lblKetThuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sell/icons/close_1.png"))); // NOI18N
        lblKetThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKetThucMouseClicked(evt);
            }
        });

        lblThuLai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblThuLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sell/icons/minus.png"))); // NOI18N
        lblThuLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThuLaiMouseClicked(evt);
            }
        });

        lblthongBao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblthongBao.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlTongLayout = new javax.swing.GroupLayout(pnlTong);
        pnlTong.setLayout(pnlTongLayout);
        pnlTongLayout.setHorizontalGroup(
            pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTongLayout.createSequentialGroup()
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTongLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTongLayout.createSequentialGroup()
                                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtan)
                                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                    .addComponent(lblthongBao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblshowpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlTongLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(0, 21, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlTongLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lblQuenMk, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongLayout.createSequentialGroup()
                                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongLayout.createSequentialGroup()
                                .addComponent(lblThuLai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTongLayout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 444, Short.MAX_VALUE)))
        );
        pnlTongLayout.setVerticalGroup(
            pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTongLayout.createSequentialGroup()
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(pnlTongLayout.createSequentialGroup()
                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTongLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTongLayout.createSequentialGroup()
                        .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblThuLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblshowpass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblthongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuenMk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtan)
                .addGap(23, 23, 23))
            .addGroup(pnlTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblhinhentraiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhinhentraiMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_lblhinhentraiMouseClicked

    private void txtTaiKhoanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaiKhoanFocusGained
        // TODO add your handling code here:
        if(txtTaiKhoan.getText().equals("Mã nhân viên")){
            txtTaiKhoan.setText("");
            DesignHelper.deletePlaceHolderTextField(txtTaiKhoan);
            txtTaiKhoan.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtTaiKhoanFocusGained

    private void txtTaiKhoanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaiKhoanFocusLost
        // TODO add your handling code here:
        if(txtTaiKhoan.getText().trim().length() == 0){
            txtTaiKhoan.setText("Mã nhân viên");
            DesignHelper.addPlaceHolderTextField(txtTaiKhoan);
        }
    }//GEN-LAST:event_txtTaiKhoanFocusLost

    private void txtmatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmatKhauFocusGained
        // TODO add your handling code here:
        if(txtmatKhau.getText().equals("Mật khẩu")){
            txtmatKhau.setText("");
            txtmatKhau.setEchoChar('\u25cf');
            DesignHelper.deletePlaceHolderTextField(txtmatKhau);
            txtmatKhau.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_txtmatKhauFocusGained

    private void txtmatKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmatKhauFocusLost
        // TODO add your handling code here:
        if(txtmatKhau.getText().trim().length() == 0){
            txtmatKhau.setText("Mật khẩu");
            txtmatKhau.setEchoChar('\u0000');
            DesignHelper.addPlaceHolderTextField(txtmatKhau);
        }
    }//GEN-LAST:event_txtmatKhauFocusLost

    private void lblshowpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblshowpassMouseClicked
        // TODO add your handling code here:

        if (showPass) {
            ImageIcon iconPass = new ImageIcon(getClass().getClassLoader().getResource("com//Sell//icons//noshowpass.png"));
            lblshowpass.setIcon(iconPass);
            showPass = false;

            if (!txtmatKhau.getText().equalsIgnoreCase("Mật khẩu")) {
                txtmatKhau.setEchoChar('\u25cf');
            }
        } else {
            ImageIcon iconPass = new ImageIcon(getClass().getClassLoader().getResource("com//Sell//icons//showpass.png"));
            lblshowpass.setIcon(iconPass);
            txtmatKhau.setEchoChar((char) 0);
            showPass = true;

        }
    }//GEN-LAST:event_lblshowpassMouseClicked

    private void lblKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKetThucMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblKetThucMouseClicked

    private void lblThuLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThuLaiMouseClicked
        // TODO add your handling code here:
        // cho nhỏ lại
        this.setState(DangNhapJFrame.ICONIFIED);
    }//GEN-LAST:event_lblThuLaiMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        dangNhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lblQuenMkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMkMouseClicked
        // TODO add your handling code here:
        new QuenMatKhauJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_lblQuenMkMouseClicked

    private void lblQuenMkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMkMouseEntered
        // TODO add your handling code here:
        lblQuenMk.setForeground(new Color(0,204,51));
        lblQuenMk.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblQuenMkMouseEntered

    private void lblQuenMkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMkMouseExited
        // TODO add your handling code here:
        lblQuenMk.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lblQuenMkMouseExited

    private void txtmatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatKhauKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
             dangNhap();
         }
    }//GEN-LAST:event_txtmatKhauKeyPressed

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
                if ("Nimus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblKetThuc;
    private javax.swing.JLabel lblQuenMk;
    private javax.swing.JLabel lblThuLai;
    private javax.swing.JLabel lblhinhentrai;
    private javax.swing.JLabel lblshowpass;
    private javax.swing.JLabel lblthongBao;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnlTong;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JLabel txtan;
    private javax.swing.JPasswordField txtmatKhau;
    // End of variables declaration//GEN-END:variables
int a = 0;

    //lam tron panel
    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
            graphics.setColor(getForeground());
        }

    }
    boolean showPass = true;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    AnimationClass anim = new AnimationClass();

    void chayDongHo() {
        ClockThread thread = new ClockThread();
        thread.start();
        new Timer(8000, new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
                ClockThread thread = new ClockThread();
                thread.start();
                //System.out.println("1");
            }

        }).start();

        // ImageIcon icon = new ImageIcon("C://Users//Admin//OneDrive//Du_An_Mau//testduan1//src//icon//1.jpg");
        //lbl5.setIcon(icon);
    }

    public class ClockThread extends Thread {

        @Override
        public void run() {

            try {

                //quatrai
                quaTrai(lbl1);
                diXuong(lbl2);
                quaPhai(lbl3);
                diLen(lbl4);
                Thread.sleep(2000);

                diXuong(lbl1);
                quaPhai(lbl2);
                diLen(lbl3);
                quaTrai(lbl4);
                Thread.sleep(2000);

                quaPhai(lbl1);
                diLen(lbl2);
                quaTrai(lbl3);
                diXuong(lbl4);
                Thread.sleep(2000);

                diLen(lbl1);
                quaTrai(lbl2);
                diXuong(lbl3);
                quaPhai(lbl4);
                Thread.sleep(2000);

            } catch (InterruptedException ex) {

            }
        }
    }

    void quaTrai(JLabel lbl) {
        anim.jLabelXLeft(lbl.getX(), 110, 8, 1, lbl);
    }

    void diXuong(JLabel lbl) {
        anim.jLabelYDown(lbl.getY(), 320, 8, 1, lbl);
    }

    void quaPhai(JLabel lbl) {
        anim.jLabelXRight(lbl.getX(), 220, 8, 1, lbl);
    }

    NhanVien_Dao dao = new NhanVien_Dao();

    void diLen(JLabel lbl) {
        anim.jLabelYUp(lbl.getY(), 170, 8, 1, lbl);
    }

    void openMain() {
        EventQueue.invokeLater(() -> {
            new FrameDragListener(new MainJFrame());
        });
    }

    void dangNhap() {
        if (!validates()) {
            return;
        }
        String manv = txtTaiKhoan.getText();
        NhanVien nhanVien = dao.selectById(manv);

        Auth.user = nhanVien;
        openMain();
        this.dispose();

    }

    boolean validates() {

        String taiKhoan = txtTaiKhoan.getText();
        String matKhau = new String(txtmatKhau.getPassword());
        NhanVien nhanVien = dao.selectById(taiKhoan);
        String tb = "";
        if (taiKhoan.length() == 0) {
            tb = " Vui lòng nhập tài khoản ";

        } else if (nhanVien == null) {
            tb = " Sai tên đăng nhập";

        } else if (txtmatKhau.getText().length() == 0) {
            tb = " Vui Lòng nhập mật khẩu";

        } else if (!matKhau.equals(nhanVien.getMatKhau())) {
            tb = " Sai mật khẩu";

        }

        if (tb.length() > 0) {
            lblthongBao.setText(tb);
            return false;
        }
        return true;

    }
    
    void setText(){
        txtTaiKhoan.setText("Mã nhân viên");
        txtmatKhau.setText("Mật khẩu");
        txtmatKhau.setEchoChar('\u0000');
        this.styleHolder();
    }
    
    void styleHolder(){
        DesignHelper.addPlaceHolderTextField(txtTaiKhoan);
        DesignHelper.addPlaceHolderTextField(txtmatKhau);
    }

    void init() {
        this.setText();
        //add hinh anh de di chuyen
        //add qua trai
        lbl1 = new JLabel("", JLabel.CENTER);
        lbl1.setBackground(Color.red);
        lbl1.setOpaque(true);
        lbl1.setBounds(220, 170, 70, 70);
        ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("com//Sell//icons//phuc2.png"));
        lbl1.setIcon(icon1);
        pnl1.add(lbl1);
        //add xuongduoi
        lbl2 = new JLabel("", JLabel.CENTER);
        lbl2.setBackground(Color.black);
        lbl2.setOpaque(true);
        lbl2.setBounds(110, 170, 70, 70);
        ImageIcon icon2 = new ImageIcon(getClass().getClassLoader().getResource("com//Sell//icons//trieu1.png"));
        lbl2.setIcon(icon2);
        pnl1.add(lbl2);
        //add qua phai
        lbl3 = new JLabel("", JLabel.CENTER);
        lbl3.setBackground(Color.pink);
        lbl3.setOpaque(true);
        lbl3.setBounds(110, 320, 70, 70);
        ImageIcon icon3 = new ImageIcon(getClass().getClassLoader().getResource("com//Sell//icons//tai1.png"));
        lbl3.setIcon(icon3);
        pnl1.add(lbl3);
        //add len tren
        lbl4 = new JLabel("", JLabel.CENTER);
        lbl4.setBackground(Color.green);
        lbl4.setOpaque(true);
        lbl4.setBounds(220, 320, 70, 70);
        ImageIcon icon4 = new ImageIcon(getClass().getClassLoader().getResource("com//Sell//icons//chinh1.png"));
        lbl4.setIcon(icon4);
        pnl1.add(lbl4);

        //chinh sua textfield
        txtTaiKhoan.setBackground(getBackground());
        txtmatKhau.setBackground(getBackground());

        //add nhac nho mat khau
//        txtmatKhau.setText("   Vui lòng nhập mật khẩu");
//        txtmatKhau.setFont(new Font("Segoe UI Light", 2, 15));
//        txtmatKhau.setEchoChar((char) 0);

        //add nhac nho tai khoan
//        txtTaiKhoan.setText("   Vui lòng nhập tài khoản");
//        txtTaiKhoan.setFont(new Font("Segoe UI Light", 2, 15));
        //set icon show pass
        if (showPass) {
            ImageIcon iconPass = new ImageIcon(getClass().getClassLoader().getResource("com//Sell//icons//noshowpass.png"));
            lblshowpass.setIcon(iconPass);
            showPass = false;
            // set an mat khau
            if (!txtmatKhau.getText().equalsIgnoreCase("Mật khẩu")) {
                txtmatKhau.setEchoChar('*');
            }
        }
    }
}
