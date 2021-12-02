package com.Sell.UI;

import com.Sell.DAO.PhieuGiamGia_Dao;
import com.Sell.Helper.MsgBox;
import com.Sell.entity.PhieuGiamGia;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class QL_PhieuGiamGia extends javax.swing.JDialog {

    public QL_PhieuGiamGia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quản Lý Phiếu Giảm Giá");
        fillTable();
//        updateStatus();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        pnlList = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhieuGiamGia = new javax.swing.JTable();
        pnlEdit = new javax.swing.JPanel();
        lblMaNhapHang = new javax.swing.JLabel();
        txtMaGiamGia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblMaSanPham = new javax.swing.JLabel();
        lblLuong = new javax.swing.JLabel();
        txtNgayGiam = new javax.swing.JTextField();
        lblMaCH = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        rdoDaSD = new javax.swing.JRadioButton();
        rdoChuaSD = new javax.swing.JRadioButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabs.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        tblPhieuGiamGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblPhieuGiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã giảm giá", "Ngày giảm giá", "Mã khách hàng", "Trạng thái"
            }
        ));
        tblPhieuGiamGia.setRowHeight(25);
        tblPhieuGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuGiamGiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPhieuGiamGia);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", pnlList);

        lblMaNhapHang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMaNhapHang.setText("Mã giảm giá");

        txtMaGiamGia.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtMaGiamGia.setForeground(new java.awt.Color(255, 51, 51));

        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.setEnabled(false);
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)))
        );

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Sell/icons/Add.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel3.add(btnFirst);

        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrev);

        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel3.add(btnNext);

        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel3.add(btnLast);

        lblMaSanPham.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMaSanPham.setText("Mã khách hàng");

        lblLuong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLuong.setText("Ngày giảm giá");

        txtNgayGiam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtNgayGiam.setForeground(new java.awt.Color(255, 51, 51));

        lblMaCH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMaCH.setText("Trạng thái");

        txtMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKhachHangActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoDaSD);
        rdoDaSD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoDaSD.setText("Đã sử dụng");

        buttonGroup1.add(rdoChuaSD);
        rdoChuaSD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoChuaSD.setSelected(true);
        rdoChuaSD.setText("Chưa sử dụng");
        rdoChuaSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChuaSDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaNhapHang)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(lblMaSanPham)
                    .addComponent(txtMaGiamGia))
                .addGap(65, 65, 65)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayGiam)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(lblLuong)
                                .addGap(0, 337, Short.MAX_VALUE)))
                        .addGap(121, 121, 121))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaCH)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addComponent(rdoDaSD)
                                .addGap(41, 41, 41)
                                .addComponent(rdoChuaSD)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblMaNhapHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSanPham)
                    .addComponent(lblMaCH))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoDaSD)
                    .addComponent(rdoChuaSD))
                .addGap(329, 329, 329)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabs.addTab("Cập nhật", pnlEdit);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 255));
        lblTitle.setText("QUẢN LÝ PHIẾU GIẢM GIÁ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
        clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
        setColor();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblPhieuGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuGiamGiaMouseClicked
        if (evt.getClickCount() == 2) {
            row = tblPhieuGiamGia.getSelectedRow();
            this.edit();
            tabs.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tblPhieuGiamGiaMouseClicked

    private void txtMaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKhachHangActionPerformed
        
    }//GEN-LAST:event_txtMaKhachHangActionPerformed

    private void rdoChuaSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChuaSDActionPerformed
        
    }//GEN-LAST:event_rdoChuaSDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QL_PhieuGiamGia dialog = new QL_PhieuGiamGia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaCH;
    private javax.swing.JLabel lblMaNhapHang;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlList;
    private javax.swing.JRadioButton rdoChuaSD;
    private javax.swing.JRadioButton rdoDaSD;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblPhieuGiamGia;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtNgayGiam;
    // End of variables declaration//GEN-END:variables

    PhieuGiamGia_Dao dao = new PhieuGiamGia_Dao();
    int row = -1;

    //tblHocVien double click
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblPhieuGiamGia.getModel();

        // xóa dữ liệu trên table
        model.setRowCount(0);

        try {
            List<PhieuGiamGia> list = dao.selectAll();//Đọc dữ liệu từ CSDL
            for (PhieuGiamGia entity : list) {
                Object[] row = {
                    entity.getMaGiamGia(),
                    entity.getNgayGiamGia(),
                    entity.getMaKhachHang(),
                    entity.getTrangThai() ? "Đã sử dụng" : "Chưa sử dụng"

                };
                model.addRow(row);

            }
        } catch (Exception e) {
            System.out.println(e + " loi dong 50*");
        }

    }

    void setForm(PhieuGiamGia hd) {

        txtMaGiamGia.setText(hd.getMaGiamGia());
        txtNgayGiam.setText(hd.getNgayGiamGia());
        txtMaKhachHang.setText(hd.getMaKhachHang());

        if (hd.getTrangThai()) {
            rdoDaSD.setSelected(true);
        } else {
            rdoChuaSD.setSelected(true);
        }

    }

    void updateStatus() {
        boolean edit = row >= 0;
        boolean first = row == 0;
        boolean last = row == tblPhieuGiamGia.getRowCount() - 1;
        //trạng thái form
        txtMaGiamGia.setEditable(!edit);//vì mặc đinh row = -1
        btnInsert.setEnabled(!edit);

        btnUpdate.setEnabled(edit);
        btnDelete.setEnabled(edit);

        //trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);

    }

    PhieuGiamGia getForm() {
        PhieuGiamGia hd = new PhieuGiamGia();

        hd.setMaGiamGia(txtMaGiamGia.getText());
        hd.setNgayGiamGia(txtNgayGiam.getText());

        hd.setMaKhachHang(txtMaKhachHang.getText());
        hd.setTrangThai(rdoDaSD.isSelected());

        return hd;
    }

    void clearForm() {
        PhieuGiamGia hd = new PhieuGiamGia();
        hd.setTrangThai(true);
        this.setForm(hd);
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String mahd = (String) tblPhieuGiamGia.getValueAt(row, 0);
        PhieuGiamGia hd = dao.selectById(mahd);
        this.setForm(hd);
        this.updateStatus();
    }

    void insert() {
        PhieuGiamGia hd = getForm();
        try {
            dao.insert(hd);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "them thanh cong");
        } catch (Exception e) {
            MsgBox.alert(this, "them khong thanh cong");
        }

    }

    void update() {
        PhieuGiamGia hd = getForm();
        try {
            dao.update(hd);
            this.fillTable();
            MsgBox.alert(this, "cap nhat thanh cong");

        } catch (Exception e) {
            MsgBox.alert(this, "cap nhat that bai");
        }

    }

    void delete() {
        if (true) {
            String mahd = txtMaGiamGia.getText();
            if (MsgBox.confirm(this, "Bạn có muốn xóa hay không?")) {
                try {
                    String mahd1 = txtMaGiamGia.getText();
                    dao.delete(mahd1);
                    this.fillTable();
                    this.clearForm();
                    JOptionPane.showMessageDialog(this, "xoa thanh cong");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "xoa  0 thanh cong");
                }
            }
        }

    }

    void first() {
        row = 0;
        edit();
    }

    void prev() {
        if (row > 0) {
            row--;
            edit();
        }
    }

    void next() {
        if (row < tblPhieuGiamGia.getRowCount() - 1) {
            row++;
            edit();
        }
    }

    void last() {
        row = tblPhieuGiamGia.getRowCount() - 1;
        edit();
    }

//    public boolean validateform() {
//        StringBuilder sb = new StringBuilder();
//        validation.isEmpty(txtMaNV, sb, "Mã nhân viên không để trống");
//        validation.isEmpty(txtMatKhau2, sb, "Mật khẩu không để trống");
//        validation.isEmpty(txtMatKhau2, sb, "Mật khẩu 2 không để trống");
//        validation.isEmpty(txtHoTen, sb, "Họ tên không để trống");
//
//        if (sb.length() > 0) {
//            JOptionPane.showMessageDialog(this, sb.toString());
//            return false;
//        }
//        return true;
//    }
    public void setColor() {
        txtMaGiamGia.setBackground(Color.white);
        txtMaGiamGia.setBackground(Color.white);
        txtMaKhachHang.setBackground(Color.white);
        txtMaKhachHang.setBackground(Color.white);
    }

    private void init() {
        JTableHeader header = tblPhieuGiamGia.getTableHeader();
        header.setBackground(Color.yellow);
        header.setForeground(Color.blue);
        header.setFont(new Font("Tahome", Font.BOLD, 18));
        tblPhieuGiamGia.setShowGrid(true);
        tblPhieuGiamGia.setGridColor(Color.red);
    }
}
