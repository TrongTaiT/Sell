/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.UI;

import com.Sell.DAO.CuaHangDAO;
import com.Sell.DAO.HoaDonBanHang_Dao;
import com.Sell.DAO.ThongKeDAO;
import com.Sell.Helper.DateHelper;
import com.Sell.entity.CuaHang;
import com.Sell.entity.HoaDonBanHang;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLTHONGKE_TEST extends javax.swing.JFrame {

    /**
     * Creates new form QLTHONGKE_TEST
     */
    public QLTHONGKE_TEST() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlistcuahang = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldoanhthu = new javax.swing.JTable();
        cbonam = new javax.swing.JComboBox<>();
        cbothang = new javax.swing.JComboBox<>();
        lbltieude = new javax.swing.JLabel();
        lbltong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlistcuahang.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlistcuahang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistcuahangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlistcuahang);

        tbldoanhthu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbldoanhthu);

        cbonam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbonam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonamActionPerformed(evt);
            }
        });

        cbothang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbothang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbothangActionPerformed(evt);
            }
        });

        lbltieude.setText("jLabel1");

        lbltong.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltieude, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lbltong, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltieude))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 71, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbltong)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbothangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbothangActionPerformed
        // TODO add your handling code here:
        fillToTable();
    }//GEN-LAST:event_cbothangActionPerformed

    private void jlistcuahangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistcuahangMouseClicked
        // TODO add your handling code here:
        fillToTable();
    }//GEN-LAST:event_jlistcuahangMouseClicked

    private void cbonamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonamActionPerformed
        // TODO add your handling code here:
        nam = (String) cbonam.getSelectedItem();
        nam = nam.substring(5);
        fillToTable();
    }//GEN-LAST:event_cbonamActionPerformed

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
            java.util.logging.Logger.getLogger(QLTHONGKE_TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLTHONGKE_TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLTHONGKE_TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLTHONGKE_TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLTHONGKE_TEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbonam;
    private javax.swing.JComboBox<String> cbothang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlistcuahang;
    private javax.swing.JLabel lbltieude;
    private javax.swing.JLabel lbltong;
    private javax.swing.JTable tbldoanhthu;
    // End of variables declaration//GEN-END:variables
    ThongKeDAO thongkedao = new ThongKeDAO();
    CuaHangDAO chdao = new CuaHangDAO();
    HoaDonBanHang_Dao BanHang_Dao = new HoaDonBanHang_Dao();
    String nam = "";
    double tong = 0;

    void init() {

        fillToJlist();
        fillToComBoboxthang();
        fillToComBoBoxNam();
        fillToTable();
    }

    void fillToJlist() {
        DefaultListModel listModel = new DefaultListModel();
        jlistcuahang.removeAll();
        List<CuaHang> listch = chdao.selectAll();
        listModel.addElement("Tất cả");
        for (CuaHang ch : listch) {
            listModel.addElement(ch.getMaCH());
        }
        jlistcuahang.setModel(listModel);
    }

    void fillToComBoboxthang() {
        DefaultComboBoxModel cbomodel = new DefaultComboBoxModel();
        cbothang.removeAll();
        cbomodel.addElement(" Tất cả Tháng ");
        for (int i = 1; i < 13; i++) {
            cbomodel.addElement("Tháng " + i);
        }
        cbothang.setModel(cbomodel);
    }

    void fillToComBoBoxNam() {
        DefaultComboBoxModel cbomodel = new DefaultComboBoxModel();
        cbonam.removeAll();
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyy");
        String format = simpleDateFormat.format(date);
        int nam = Integer.parseInt(format);
        cbomodel.addElement(" Tất cả năm ");
        for (int i = 2020; i <= nam; i++) {
            cbomodel.addElement("Năm " + i);
        }
        cbonam.setModel(cbomodel);
    }

    void fillToTable() {
        //  String[] header = {"Tổng tiền", "Mã cửa hàng"};
        tong = 0;
        DefaultTableModel model = (DefaultTableModel) tbldoanhthu.getModel();
        model.setRowCount(0);
        String thang = null;
        String thang1;
        String nam1;
        if (cbothang.getSelectedIndex() == 0) {
            thang = "";
            thang1 = " Tất cả tháng";
        } else if (cbothang.getSelectedIndex() == 1 || cbothang.getSelectedIndex() == 2) {
            thang = "0" + String.valueOf(cbothang.getSelectedIndex());
            thang1 = "Tháng " + cbothang.getSelectedIndex();
        } else {
            thang = String.valueOf(cbothang.getSelectedIndex());
            thang1 = "Tháng " + cbothang.getSelectedIndex();
        }
        //lấy năm chọn trên combobox
        if (cbonam.getSelectedIndex() == 0) {
            nam = "";
            nam1 = "Tất cả năm";
        } else {
            nam = (String) cbonam.getSelectedItem();
            nam = nam.substring(4);

            nam1 = (String) cbonam.getSelectedItem();
        }
        //lấy cửa hàng chọn trên jlist
        String mach = jlistcuahang.getSelectedValue();
        if (jlistcuahang.getSelectedIndex() == 0) {
            mach = "";
        }

        List<Object[]> listdoanhthu = thongkedao.getDoanhThu(thang, nam, mach);
        for (Object[] row : listdoanhthu) {

            model.addRow(new Object[]{row[0], row[1]});
        }
        //set thanh tieu de
        lbltieude.setText("Tổng doanh thu " + mach + " " + nam1 + " " + thang1);

        //set tính tổng
        tinhTong();
        lbltong.setText("Tổng doanh thu " + mach + "" + thang1 + " " + nam1 + " là " + tong);
    }

    void tinhTong() {
        for (int i = 0; i < tbldoanhthu.getRowCount(); i++) {
            tong = tong + (double) tbldoanhthu.getValueAt(i, 1);
        }

    }
}
