/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.UI;

import com.Sell.DAO.HoaDonBanHang_Dao;
import com.Sell.DAO.KhachHangDAO;
import com.Sell.DAO.ThongKeDAO;
import com.Sell.Helper.DateHelper;
import com.Sell.Helper.DesignHelper;
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
public class ThongKeKhachHangJDialog extends java.awt.Dialog {

    /**
     * Creates new form ThongKeKhachHanga
     */
    public ThongKeKhachHangJDialog(java.awt.Frame parent, boolean modal) {
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
        jlistmakhachang = new javax.swing.JList<>();
        cboNam = new javax.swing.JComboBox<>();
        cboThang = new javax.swing.JComboBox<>();
        lbltieude = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblthongkekhachhang = new javax.swing.JTable();
        chkkiemtra = new javax.swing.JCheckBox();

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
        jLabel6.setText("TRANG CHỦ/ THỐNG KÊ/ THỐNG KÊ KHÁCH HÀNG");
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

        add(panelTitle, java.awt.BorderLayout.NORTH);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jlistmakhachang.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlistmakhachang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistmakhachangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlistmakhachang);

        cboNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboThangMouseClicked(evt);
            }
        });
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        lbltieude.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltieude.setText("jLabel1");

        tblthongkekhachhang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblthongkekhachhang);

        chkkiemtra.setBackground(new java.awt.Color(153, 255, 153));
        chkkiemtra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkkiemtra.setText("6 tháng chưa mua hàng kể từ ngày mua gần nhất");
        chkkiemtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkkiemtraActionPerformed(evt);
            }
        });

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
                            .addComponent(chkkiemtra, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(lbltieude)))
                        .addGap(0, 335, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltieude))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(chkkiemtra)
                .addContainerGap())
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

    private void chkkiemtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkkiemtraActionPerformed
        // TODO add your handling code here:

        if (chkkiemtra.isSelected()) {
            cboNam.setSelectedIndex(0);
            cboThang.setSelectedIndex(0);
            this.kiemTrangaymua();
            chkkiemtra.setSelected(true);
        }
        if (chkkiemtra.isSelected() == false) {
            fillToTable();
        }
    }//GEN-LAST:event_chkkiemtraActionPerformed

    private void jlistmakhachangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistmakhachangMouseClicked
        // TODO add your handling code here:
        this.fillToTable();
    }//GEN-LAST:event_jlistmakhachangMouseClicked

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        nam = (String) cboNam.getSelectedItem();
        nam = nam.substring(5);
        chkkiemtra.setSelected(false);
        this.fillToTable();
    }//GEN-LAST:event_cboNamActionPerformed

    private void cboThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThangMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cboThangMouseClicked

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        // TODO add your handling code here:
        this.fillToTable();
        chkkiemtra.setSelected(false);
    }//GEN-LAST:event_cboThangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeKhachHangJDialog dialog = new ThongKeKhachHangJDialog(new java.awt.Frame(), true);
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
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JCheckBox chkkiemtra;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlistmakhachang;
    private javax.swing.JLabel lbltieude;
    private com.k33ptoo.components.KGradientPanel panelTitle;
    private javax.swing.JTable tblthongkekhachhang;
    // End of variables declaration//GEN-END:variables
      // End of variables declaration                   
    ThongKeDAO thongkedao = new ThongKeDAO();
    KhachHangDAO khachHangDAO = new KhachHangDAO();
    HoaDonBanHang_Dao BanHang_Dao = new HoaDonBanHang_Dao();
    String nam = "";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

    void init() {
        this.setLocationRelativeTo(null);
        this.setTable();
        fillToJlist();
        fillToComBoBoxNam();
        fillToComBoboxthang();
        jlistmakhachang.setSelectedIndex(0);
        fillToTable();
    }

    void setTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MÃ KHÁCH HÀNG");
        model.addColumn("TÊN KHÁCH HÀNG");
        model.addColumn("SỐ LẦN MUA");
        model.addColumn("NGÀY MUA GẦN NHẤT");
        model.addColumn("KHOẢNG NGÀY MUA ĐẾN HIỆN TẠI");
        tblthongkekhachhang.setModel(model);
        
        DesignHelper.setTable(tblthongkekhachhang);
    }

    void fillToJlist() {
        DefaultListModel listModel = new DefaultListModel();
        jlistmakhachang.removeAll();
        List<KhachHang> listkh = khachHangDAO.selectAll();
        listModel.addElement(" Tất cả");
        for (KhachHang kh : listkh) {
            listModel.addElement(kh.getMaKhachHang());
        }
        jlistmakhachang.setModel(listModel);
    }

    void fillToComBoboxthang() {
        DefaultComboBoxModel cbomodel = new DefaultComboBoxModel();
        cboThang.removeAll();
        cbomodel.addElement(" Tất cả Tháng ");
        for (int i = 1; i < 13; i++) {
            cbomodel.addElement(" Tháng " + i);
        }
        cboThang.setModel(cbomodel);

    }

    void fillToComBoBoxNam() {
        DefaultComboBoxModel cbomodel = new DefaultComboBoxModel();
        cboNam.removeAll();
        Date date = new Date();

        simpleDateFormat.applyPattern("yyyy");
        String format = simpleDateFormat.format(date);
        int nam = Integer.parseInt(format);
        cbomodel.addElement("Tất cả năm ");
        for (int i = 2020; i <= nam; i++) {
            cbomodel.addElement("Năm " + i);
        }
        cboNam.setModel(cbomodel);
    }

    void fillToTable() {
        //  String[] header = {"Tổng tiền", "Mã cửa hàng"};

        DefaultTableModel model = (DefaultTableModel) tblthongkekhachhang.getModel();
        model.setRowCount(0);
        String thang = null;
        String thang1;
        String nam1;
        if (cboThang.getSelectedIndex() == 0) {
            thang = "";
            thang1 = " Tất cả tháng";
        } else if (cboThang.getSelectedIndex() == 1 || cboThang.getSelectedIndex() == 2) {
            thang = "0" + String.valueOf(cboThang.getSelectedIndex());
            thang1 = "Tháng " + cboThang.getSelectedIndex();
        } else {
            thang = String.valueOf(cboThang.getSelectedIndex());
            thang1 = "Tháng " + cboThang.getSelectedIndex();
        }
        //lấy năm chọn trên combobox
        if (cboNam.getSelectedIndex() == 0) {
            nam = "";
            nam1 = "Tất cả năm";
        } else {
            nam = (String) cboNam.getSelectedItem();
            nam = nam.substring(4);
            nam1 = (String) cboNam.getSelectedItem();
        }
        //lấy cửa hàng chọn trên jlist
        String makh = jlistmakhachang.getSelectedValue();
        if (jlistmakhachang.getSelectedIndex() == 0) {
            makh = "";
        }

        List<Object[]> listdoanhthu = thongkedao.getThongKeKhachHang(thang, nam, makh);
        for (Object[] row : listdoanhthu) {

            model.addRow(new Object[]{row[0], row[1], row[2]});
        }
        //set thanh tieu de
            lbltieude.setText("Số Lượt mua của " + makh + " / " + nam1 + " / " + thang1);
    }

    void kiemTrangaymua() {
        DefaultTableModel model = (DefaultTableModel) tblthongkekhachhang.getModel();
        model.setRowCount(0);

        String thang = null;
        String thangOut;
        String namOut;
        //lấy tháng chọn trên combobox
        if (cboThang.getSelectedIndex() == 0) {
            thang = "";
            thangOut = " Tất cả tháng";
        } else if (cboThang.getSelectedIndex() == 1 || cboThang.getSelectedIndex() == 2) {
            thang = "";
            thangOut = " Tháng " + cboThang.getSelectedIndex();
        } else {
            thang = "";
            thangOut = " Tháng " + cboThang.getSelectedIndex();
        }
        //lấy năm chọn trên combobox
        if (cboNam.getSelectedIndex() == 0) {
            nam = "";
            namOut = " Tất cả năm";
        } else {
            nam = (String) "";
            namOut = (String) cboNam.getSelectedItem();
        }
        //lấy cửa hàng chọn trên jlist
        String makh = jlistmakhachang.getSelectedValue();
        if (jlistmakhachang.getSelectedIndex() == 0) {
            makh = " Tất cả";
        }

        List<Object[]> listdoanhthu = thongkedao.getThongKeKhachHangItMuaHang(thang, nam, makh);
        for (Object[] row : listdoanhthu) {
            Object[] obj = new Object[]{row[0], row[1], row[2], DateHelper.toString((Date) row[3]), row[4]};
            if (Integer.valueOf((int) row[4]) > 180) {
                model.addRow(new Object[]{row[0], row[1], row[2], DateHelper.toString((Date) row[3]), row[4]});
                lbltieude.setText("Số Lượt mua của " + makh + " " + namOut + " " + thangOut);
            }
            //set thanh tieu de
            lbltieude.setText("Số Lượt mua của " + makh + "/ " + namOut + " / " + thangOut);
        }

    }
}
