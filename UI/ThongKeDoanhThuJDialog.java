/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.UI;

import com.Sell.DAO.CuaHangDAO;
import com.Sell.DAO.HoaDonBanHang_Dao;
import com.Sell.DAO.KhachHangDAO;
import com.Sell.DAO.ThongKeDAO;
import com.Sell.Helper.DateHelper;
import com.Sell.Helper.DesignHelper;
import com.Sell.entity.CuaHang;
import com.Sell.entity.KhachHang;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NguyenTruongChinh
 */
public class ThongKeDoanhThuJDialog extends java.awt.Dialog {

    /**
     * Creates new form ThongKeKhachHanga
     */
    public ThongKeDoanhThuJDialog(java.awt.Frame parent, boolean modal) {
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

        panelTitle = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        btnDong = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistcuahang = new javax.swing.JList<>();
        cbonam = new javax.swing.JComboBox<>();
        cbothang = new javax.swing.JComboBox<>();
        lbltieude = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldoanhthu = new javax.swing.JTable();
        lbltong = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        panelTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelTitle.setkBorderRadius(0);
        panelTitle.setkEndColor(new java.awt.Color(153, 255, 153));
        panelTitle.setkGradientFocus(1000);
        panelTitle.setkStartColor(new java.awt.Color(204, 255, 204));
        panelTitle.setPreferredSize(new java.awt.Dimension(1150, 50));
        panelTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTitlepanelSanPhamMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TRANG CHỦ/ THỐNG KÊ/ THỐNG KÊ DOANH THU");
        jLabel6.setPreferredSize(new java.awt.Dimension(210, 50));

        btnDong.setBackground(new java.awt.Color(255, 0, 0));
        btnDong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDong.setText("ĐÓNG");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 561, Short.MAX_VALUE)
                .addComponent(btnDong)
                .addContainerGap())
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addGroup(panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDong))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel6.getAccessibleContext().setAccessibleName("TRANG CHỦ/ THỐNG KÊ/ THỐNG KÊ KHÁCH HÀNG\n");

        add(panelTitle, java.awt.BorderLayout.NORTH);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

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

        cbonam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbonam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonamActionPerformed(evt);
            }
        });

        cbothang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbothang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbothangMouseClicked(evt);
            }
        });
        cbothang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbothangActionPerformed(evt);
            }
        });

        lbltieude.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltieude.setText("jLabel1");

        tbldoanhthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tbldoanhthu);

        lbltong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltong.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltong)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(lbltieude)))
                        .addGap(0, 339, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbothang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltieude))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltong)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void panelTitlepanelSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTitlepanelSanPhamMouseClicked

    }//GEN-LAST:event_panelTitlepanelSanPhamMouseClicked

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void jlistcuahangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistcuahangMouseClicked
        // TODO add your handling code here:
        this.fillToTable();
    }//GEN-LAST:event_jlistcuahangMouseClicked

    private void cbonamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonamActionPerformed
        // TODO add your handling code here:
        nam = (String) cbonam.getSelectedItem();
        nam = nam.substring(5);

        this.fillToTable();
    }//GEN-LAST:event_cbonamActionPerformed

    private void cbothangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbothangMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cbothangMouseClicked

    private void cbothangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbothangActionPerformed
        // TODO add your handling code here:
        this.fillToTable();

    }//GEN-LAST:event_cbothangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeDoanhThuJDialog dialog = new ThongKeDoanhThuJDialog(new java.awt.Frame(), true);
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
    private javax.swing.JButton btnDong;
    private javax.swing.JComboBox<String> cbonam;
    private javax.swing.JComboBox<String> cbothang;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlistcuahang;
    private javax.swing.JLabel lbltieude;
    private javax.swing.JLabel lbltong;
    private com.k33ptoo.components.KGradientPanel panelTitle;
    private javax.swing.JTable tbldoanhthu;
    // End of variables declaration//GEN-END:variables
      // End of variables declaration                   
    ThongKeDAO thongkedao = new ThongKeDAO();
    CuaHangDAO chdao = new CuaHangDAO();
    HoaDonBanHang_Dao BanHang_Dao = new HoaDonBanHang_Dao();
    String nam = "";
    float tong = 0;

    void init() {
        this.setLocationRelativeTo(null);
        this.setTable();
        fillToJlist();
        fillToComBoboxthang();
        fillToComBoBoxNam();
        jlistcuahang.setSelectedIndex(0);
        fillToTable();
    }

    void setTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MÃ CỬA HÀNG");
        model.addColumn("TỔNG TIỀN (VNĐ)");

        tbldoanhthu.setModel(model);
        DesignHelper.setTable(tbldoanhthu);
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
            String tien = String.format("%0,3f", row[1]);
            String doanhThu = tien.substring(0, tien.lastIndexOf("."));
            model.addRow(new Object[]{row[0], doanhThu});
            tong = tong + Float.valueOf(String.valueOf(row[1]));
        }
        //set thanh tieu de
        lbltieude.setText("Tổng doanh thu " + mach + " / " + nam1 + " / " + thang1);

        //set tính tổng
        String tongtien = String.format("%0,3f", tong);
        String tongtien1 = tongtien.substring(0, tongtien.lastIndexOf("."));
        lbltong.setText("Tổng doanh thu " + mach + " / " + thang1 + " / " + nam1 + " là " + tongtien1 + " VNĐ");
    }

    void tinhTong() {
        for (int i = 0; i < tbldoanhthu.getRowCount(); i++) {
            tong = tong + Float.valueOf(String.valueOf(tbldoanhthu.getValueAt(i, 1)));
        }

    }
}
