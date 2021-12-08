/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.UI;

import com.Sell.DAO.NhanVien_Dao;
import com.Sell.Helper.Auth;
import com.Sell.Helper.DesignHelper;
import com.Sell.Helper.MsgBox;
import java.awt.Cursor;
import javax.swing.JComponent;

/**
 *
 * @author NguyenTruongChinh
 */
public class DoiMatKhauJDialog extends java.awt.Dialog {

    /**
     * Creates new form DoiMatKhauJDialog
     */
    public DoiMatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_passwordNow = new javax.swing.JPasswordField();
        txt_passwordNew = new javax.swing.JPasswordField();
        txt_confirmpassword = new javax.swing.JPasswordField();
        btn_confirm = new com.k33ptoo.components.KButton();
        btn_cancel = new com.k33ptoo.components.KButton();

        setMinimumSize(new java.awt.Dimension(350, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 400));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 255, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(350, 400));
        kGradientPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kGradientPanel1FocusGained(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐỔI MẬT KHẨU");

        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userFocusLost(evt);
            }
        });

        txt_passwordNow.setEchoChar('\u0000');
        txt_passwordNow.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordNowFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordNowFocusLost(evt);
            }
        });

        txt_passwordNew.setEchoChar('\u0000');
        txt_passwordNew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordNewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordNewFocusLost(evt);
            }
        });

        txt_confirmpassword.setEchoChar('\u0000');
        txt_confirmpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_confirmpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_confirmpasswordFocusLost(evt);
            }
        });

        btn_confirm.setBorder(null);
        btn_confirm.setText("XÁC NHẬN");
        btn_confirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_confirm.setkBorderRadius(50);
        btn_confirm.setkEndColor(new java.awt.Color(153, 255, 0));
        btn_confirm.setkHoverEndColor(new java.awt.Color(183, 250, 83));
        btn_confirm.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_confirm.setkHoverStartColor(new java.awt.Color(115, 172, 80));
        btn_confirm.setkStartColor(new java.awt.Color(81, 132, 49));
        btn_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        btn_cancel.setBorder(null);
        btn_cancel.setText("HỦY");
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setkBorderRadius(50);
        btn_cancel.setkEndColor(new java.awt.Color(240, 115, 115));
        btn_cancel.setkHoverEndColor(new java.awt.Color(246, 167, 167));
        btn_cancel.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_cancel.setkHoverStartColor(new java.awt.Color(245, 103, 103));
        btn_cancel.setkStartColor(new java.awt.Color(237, 57, 57));
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelMouseExited(evt);
            }
        });
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(txt_passwordNow)
                                .addComponent(txt_passwordNew)
                                .addComponent(txt_confirmpassword)))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_passwordNow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_passwordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        // TODO add your handling code here:
        if(txt_user.getText().equals(" Mã nhân viên")){
            txt_user.setText("");
            txt_user.requestFocus();
            DesignHelper.deletePlaceHolderTextField(txt_user);
        }
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusLost
        // TODO add your handling code here:
        if(txt_user.getText().length() == 0){
            txt_user.setText(" Mã nhân viên");
            DesignHelper.addPlaceHolderTextField(txt_user);
        }
    }//GEN-LAST:event_txt_userFocusLost

    private void txt_passwordNowFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordNowFocusGained
        // TODO add your handling code here:
        if(txt_passwordNow.getText().equals(" Mật khẩu hiện tại")){
            txt_passwordNow.setText("");
            txt_passwordNow.setEchoChar('\u25cf');
            DesignHelper.deletePlaceHolderTextField(txt_passwordNow);
        }
    }//GEN-LAST:event_txt_passwordNowFocusGained

    private void txt_passwordNowFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordNowFocusLost
        // TODO add your handling code here:
        if(txt_passwordNow.getText().length() == 0){
            txt_passwordNow.setText(" Mật khẩu hiện tại");
            txt_passwordNow.setEchoChar('\u0000');
            DesignHelper.addPlaceHolderTextField(txt_passwordNow);
        }
    }//GEN-LAST:event_txt_passwordNowFocusLost

    private void txt_passwordNewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordNewFocusGained
        // TODO add your handling code here:
        if(txt_passwordNew.getText().equals(" Mật khẩu mới")){
            txt_passwordNew.setText("");
            txt_passwordNew.setEchoChar('\u25cf');
            DesignHelper.deletePlaceHolderTextField(txt_passwordNew);
        }
    }//GEN-LAST:event_txt_passwordNewFocusGained

    private void txt_passwordNewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordNewFocusLost
        // TODO add your handling code here:
        if(txt_passwordNew.getText().length() == 0){
            txt_passwordNew.setText(" Mật khẩu mới");
            txt_passwordNew.setEchoChar('\u0000');
            DesignHelper.addPlaceHolderTextField(txt_passwordNew);
        }
    }//GEN-LAST:event_txt_passwordNewFocusLost

    private void txt_confirmpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirmpasswordFocusGained
        // TODO add your handling code here:
        if(txt_confirmpassword.getText().equals(" Xác nhận mật khẩu")){
            txt_confirmpassword.setText("");
            txt_confirmpassword.setEchoChar('\u25cf');
            DesignHelper.deletePlaceHolderTextField(txt_confirmpassword);
        }
    }//GEN-LAST:event_txt_confirmpasswordFocusGained

    private void txt_confirmpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_confirmpasswordFocusLost
        // TODO add your handling code here:
        if(txt_confirmpassword.getText().length() == 0){
            txt_confirmpassword.setText(" Xác nhận mật khẩu");
            txt_confirmpassword.setEchoChar('\u0000');
            DesignHelper.addPlaceHolderTextField(txt_confirmpassword);
        }
    }//GEN-LAST:event_txt_confirmpasswordFocusLost

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        // TODO add your handling code here:
        this.changePass();
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        this.exit();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained
        
    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        JComponent component = (JComponent) evt.getSource();
        component.requestFocusInWindow();
    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void btn_cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseExited
        // TODO add your handling code here:
        JComponent component = (JComponent) evt.getSource();
        component.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_cancelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhauJDialog dialog = new DoiMatKhauJDialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_cancel;
    private com.k33ptoo.components.KButton btn_confirm;
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txt_confirmpassword;
    private javax.swing.JPasswordField txt_passwordNew;
    private javax.swing.JPasswordField txt_passwordNow;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    void init(){
        this.setLocationRelativeTo(null);
        this.setSize(400, 450);
        this.setText();
    }
    
    void setText(){
        DesignHelper.addPlaceHolderTextField(txt_user, " Mã nhân viên");
        DesignHelper.addPlaceHolderTextField(txt_passwordNow, " Mật khẩu hiện tại");
        DesignHelper.addPlaceHolderTextField(txt_passwordNew, " Mật khẩu mới");
        DesignHelper.addPlaceHolderTextField(txt_confirmpassword, " Xác nhận mật khẩu");
    }
    
    NhanVien_Dao dao = new NhanVien_Dao();
    
    void changePass(){
        String maNV = txt_user.getText().trim();
        String password = new String(txt_passwordNow.getPassword());
        String passwordNew = new String(txt_passwordNew.getPassword());
        String confirmPassword = new String(txt_confirmpassword.getPassword());
        
        if(!maNV.equalsIgnoreCase(Auth.user.getMaNV().trim())){
            MsgBox.alert(this, "Sai tên đăng nhập!");
        }
        else if(!password.equals(Auth.user.getMatKhau())){
            MsgBox.alert(this, "Sai mật khẩu!");
        }
        else if(!passwordNew.equals(confirmPassword)){
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        }
        else{
            Auth.user.setMatKhau(passwordNew);
            dao.update(Auth.user);
            MsgBox.alert(this, "Đổi mật khẩu thành công!");
        }
    }
    
    void exit(){
        if(MsgBox.confirm(this, "Bạn có muốn thoát không?")){
            this.dispose();
        }
    }
}