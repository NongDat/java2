/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_NongVanDatPH18618;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nongvandat
 */
public class QLSVFormLap3 extends javax.swing.JFrame {

    private QLSinhVienInterface qlds;

    public QLSVFormLap3() {
        initComponents();
        setLocationRelativeTo(null);
        this.clearForm();
        this.qlds = new QLSinhVien();
        this.qlds.addStudent(new SinhVien("Nông Văn Đạt", "UDPM", 9));
        this.qlds.addStudent(new SinhVien("Lâm Quế", "Thiết Kế WEB", 7));
        this.qlds.addStudent(new SinhVien("Lâm Anh", "UDPM", 8));
        this.qlds.addStudent(new SinhVien("Vân Anh", "Lập Trình MOBILE", 6));
        this.qlds.addStudent(new SinhVien("Xuân Trường", "Thiết Kế WEB", 7));
        fillToTable();
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) this.tblSinhVien.getModel();
        model.setRowCount(0);
        List<SinhVien> sv = this.qlds.getList();
        for (SinhVien x : sv) {
            Object[] rowData = new Object[]{
                x.getName(),
                x.getMarks(),
                x.getMajor(),
                x.getGrade(),
                x.isBonus()
            };
            model.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        txtHocluc = new javax.swing.JTextField();
        cbbNganh = new javax.swing.JComboBox<>();
        chkThuong = new javax.swing.JCheckBox();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapnhap = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        btnTheoDiem = new javax.swing.JButton();
        btnTheoTen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Quản Lý Sinh Viên");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Họ tên");

        jLabel3.setText("Điểm");

        jLabel4.setText("Ngành");

        jLabel5.setText("Học lực");

        txtHocluc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoclucActionPerformed(evt);
            }
        });

        cbbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UDPM", "Thiết Kế WEB", "Lập Trình MOBILE", " " }));

        chkThuong.setText("Có phần thưởng");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapnhap.setText("Cập nhập");
        btnCapnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhapActionPerformed(evt);
            }
        });

        jButton4.setText("Nhập mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(cbbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkThuong)
                    .addComponent(txtHocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCapnhap)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiem, txtHocluc, txtTen});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbNganh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkThuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapnhap)
                    .addComponent(jButton4))
                .addGap(36, 36, 36))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDiem, txtHocluc, txtTen});

        jPanel4.setBackground(new java.awt.Color(255, 153, 204));

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ tên", "Điểm", "Ngành", "Học Lực", "Thưởng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSinhVien.setRowHeight(25);
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        btnTheoDiem.setText("Sắp xếp theo điểm");
        btnTheoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoDiemActionPerformed(evt);
            }
        });

        btnTheoTen.setText("Sắp xếp theo tên");
        btnTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoTenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnTheoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTheoDiem)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTheoDiem)
                    .addComponent(btnTheoTen))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoclucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoclucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoclucActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        int viTri = this.tblSinhVien.getSelectedRow();
        if (viTri == -1) {
            return;
        }
        SinhVien sv = this.qlds.getList().get(viTri);
        this.txtTen.setText(sv.getName());
        this.txtDiem.setText(Double.toString(sv.getMarks()));
        this.chkThuong.setSelected(sv.isBonus());
        this.cbbNganh.setSelectedItem(sv.getMajor());
        this.txtHocluc.setText(sv.getGrade());
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (this.txtTen.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống tên !");
            return;
        } else if (this.txtDiem.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Khong de trong Marks !");
            return;
        }
       
            if(Double.parseDouble(this.txtDiem.getText())>= 0 && Double.parseDouble(this.txtDiem.getText())<= 10) {
                
            }else{
                JOptionPane.showMessageDialog(this, "Điểm không hợp lệ!");
                this.txtDiem.setText("");
                return;
            }
        

        String name = this.txtTen.getText(),
                major = this.cbbNganh.getSelectedItem().toString();
        double marks = Double.parseDouble(this.txtDiem.getText());

        SinhVien sv = new SinhVien(name, major, marks);

        this.txtHocluc.setText(sv.getGrade());
        this.chkThuong.setSelected(sv.isBonus());
        this.qlds.addStudent(sv);
        this.fillToTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Add thành công !");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhapActionPerformed
        int viTri = this.tblSinhVien.getSelectedRow();
        if (viTri == -1) {
            JOptionPane.showMessageDialog(this, "Chọn vị trí cần sửa !");
            return;
        }
        if (this.txtTen.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống tên !");
            return;
        } else if (this.txtDiem.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống Điểm !");
            return;
        }
        if(Double.parseDouble(this.txtDiem.getText())>= 0 && Double.parseDouble(this.txtDiem.getText())<= 10) {
                
            }else{
                JOptionPane.showMessageDialog(this, "Điểm không hợp lệ!");
                this.txtDiem.setText("");
                return;
            }
        String name = this.txtTen.getText(),
                major = this.cbbNganh.getSelectedItem().toString();
        double marks = Double.parseDouble(this.txtDiem.getText());
        SinhVien sv = new SinhVien(name, major, marks);
        this.txtHocluc.setText(sv.getGrade());
        this.chkThuong.setSelected(sv.isBonus());
        this.qlds.updateStudent(viTri, sv);
        this.fillToTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Update thành công !");
    }//GEN-LAST:event_btnCapnhapActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int viTri = this.tblSinhVien.getSelectedRow();
        if (viTri == -1) {
            JOptionPane.showMessageDialog(this, "Chọn vị trí cần xóa !");
            return;
        }
        int xacNhan = JOptionPane.showConfirmDialog(this, "Xác nhận xóa !");
        if (xacNhan == JOptionPane.YES_OPTION) {
            this.qlds.removeStudent(viTri);
            this.fillToTable();
            JOptionPane.showMessageDialog(this, "Xóa thành công !");
            this.clearForm();
        } else if (xacNhan == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Đã hủy xóa !");
            return;
        } else if (xacNhan == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Đã hủy xóa !");
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTheoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoDiemActionPerformed

        this.qlds.orderByMarks();
        this.fillToTable();
    }//GEN-LAST:event_btnTheoDiemActionPerformed

    private void btnTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoTenActionPerformed

        this.qlds.orderByName();
        this.fillToTable();
    }//GEN-LAST:event_btnTheoTenActionPerformed

    public void clearForm() {
        this.txtTen.setText("");
        this.txtDiem.setText("");
        this.cbbNganh.setSelectedIndex(0);
        this.txtHocluc.setText("");
        this.chkThuong.setSelected(false);
    }

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
            java.util.logging.Logger.getLogger(QLSVFormLap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVFormLap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVFormLap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVFormLap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSVFormLap3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhap;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTheoDiem;
    private javax.swing.JButton btnTheoTen;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbNganh;
    private javax.swing.JCheckBox chkThuong;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHocluc;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
