/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap3;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nongvandat
 */
public class QLSVForm extends javax.swing.JFrame implements Runnable{

    private QLSVInterface<SinhVien> qlds;
    Thread time;
    Thread runTxt;

    public QLSVForm() {
        initComponents();
        setLocationRelativeTo(null);
        time = new Thread(this);
        time.start();
        this.runTxt();
        this.qlds = new QLSV();
        this.fillToTable();
    }

    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) this.tblSV.getModel();
        model.setRowCount(0);
        List<SinhVien> ds = this.qlds.getList();
        for (SinhVien sv : ds) {
            model.addRow(new Object[]{
                sv.getName(),
                sv.getMarks(),
                sv.getMajor(),
                sv.getGrade(),
                sv.isBonus()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        cbbNganh = new javax.swing.JComboBox<>();
        txtHL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        chkThuong = new javax.swing.JCheckBox();
        btnMarks = new javax.swing.JButton();
        btnTen = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Quản Lý Sinh Viên ");

        jPanel2.setBackground(new java.awt.Color(204, 102, 255));

        jLabel2.setText("Họ và tên");

        cbbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UDPM", "WEB", "MOB", " " }));
        cbbNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNganhActionPerformed(evt);
            }
        });

        jLabel3.setText("Điểm");

        jLabel4.setText("Ngành");

        jLabel5.setText("Học lực");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDoc.setText("Đọc file");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi File");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        chkThuong.setText("Thưởng ?");

        btnMarks.setText("order Điểm");
        btnMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarksActionPerformed(evt);
            }
        });

        btnTen.setText("Order Tên");
        btnTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(19, 19, 19)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkThuong))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGhi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMarks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTen)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiem, txtHL, txtTen});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(chkThuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnDoc)
                    .addComponent(btnMarks)
                    .addComponent(btnTen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDiem, txtHL, txtTen});

        lblTime.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 51, 0));
        lblTime.setText("00:00:00 AM");

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ và tên", "Điểm", "Ngành", "Học lực", "Thưởng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblTime)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNganhActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        int index = this.tblSV.getSelectedRow();
        if (index == -1) {
            return;
        }
        SinhVien sv = this.qlds.getList().get(index);
        this.txtTen.setText(sv.getName());
        this.txtDiem.setText(String.valueOf(sv.getMarks()));
        this.cbbNganh.setSelectedItem(sv.getMajor());
        this.txtHL.setText(sv.getGrade());
        this.chkThuong.setSelected(sv.isBonus());
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       if(this.checkTT()==false){
            return;
        }
        String name = this.txtTen.getText(),
                major = this.cbbNganh.getSelectedItem().toString();
        double marks = Double.parseDouble(this.txtDiem.getText());
        SinhVien sv = new SinhVien(name, major, marks);
        this.txtHL.setText(sv.getGrade());
        this.chkThuong.setSelected(sv.isBonus());
        this.qlds.them(sv);
        this.fillToTable();
        JOptionPane.showMessageDialog(this, "Thêm mới thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int index = this.tblSV.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chọn vị trí cần sửa");
            return;
        }
        if(this.checkTT()==false){
            return;
        }
        String name = this.txtTen.getText(),
                major = this.cbbNganh.getSelectedItem().toString();
        double marks = Double.parseDouble(this.txtDiem.getText());
        SinhVien sv = new SinhVien(name, major, marks);
        this.txtHL.setText(sv.getGrade());
        this.chkThuong.setSelected(sv.isBonus());
        this.qlds.sua(index, sv);
        this.fillToTable();
        JOptionPane.showMessageDialog(this, "Sửa thành công");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int index = this.tblSV.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chọn vị trí muốn xóa");
            return;
        }
        int YN = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (YN == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Đã hủy xóa");
            return;
        } else if (YN == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Đã hủy xóa");
            return;
        } else if (YN == JOptionPane.YES_OPTION) {
            this.qlds.xoa(index);
            this.fillToTable();
            JOptionPane.showMessageDialog(this, "Xóa thành công !");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showMessageDialog(this, "Xóa thành công !");
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        String path = "txt.txt";
        this.qlds.openFile(path);
        this.fillToTable();
        JOptionPane.showMessageDialog(this, "Đọc file thành công !");
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        String path = "txt.txt";
        List<SinhVien> list = this.qlds.getList();
        this.qlds.saveFile(path, list);
        JOptionPane.showMessageDialog(this, "Ghi file thành công !");
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarksActionPerformed
        this.qlds.getOrderByMarks();
        this.fillToTable();
    }//GEN-LAST:event_btnMarksActionPerformed

    private void btnTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenActionPerformed
        this.qlds.getOrderByName();
        this.fillToTable();
    }//GEN-LAST:event_btnTenActionPerformed

    public void clear() {
        this.txtTen.setText("");
        this.txtDiem.setText("");
        this.cbbNganh.setSelectedIndex(0);
        this.txtHL.setText("");
        this.chkThuong.setSelected(false);

    }

    public boolean checkTT() {
        boolean check = true;
        if (this.txtTen.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống tên !");
            this.txtTen.setBackground(Color.YELLOW);
            return check = false;
        } else {
            this.txtTen.setBackground(Color.WHITE);
        }
        if (this.txtDiem.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống điểm !");
            this.txtDiem.setBackground(Color.YELLOW);
            return check = false;
        } else {
            this.txtDiem.setBackground(Color.WHITE);
        }
        double diem;

        try {
            diem = Double.parseDouble(this.txtDiem.getText());
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Điểm không hợp lệ!");
                this.txtDiem.setBackground(Color.YELLOW);
                return check = false;
            } else {
                this.txtDiem.setBackground(Color.WHITE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Điểm không hợp lệ!");
            this.txtDiem.setBackground(Color.YELLOW);
            return check = false;
        }
        
        return check;
    }
    public void runTxt(){
    runTxt = new Thread(){
        public void run(){
            String txt = lblTitle.getText();
            while(true){
                
                try {
                    txt= txt.substring(1,txt.length())+txt.charAt(0);
                    lblTitle.setText(txt);
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                   break;
                }
            }
        }
    };runTxt.start();
    }
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
            java.util.logging.Logger.getLogger(QLSVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSVForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMarks;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTen;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbNganh;
    private javax.swing.JCheckBox chkThuong;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHL;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){
            try {
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss aa");
                Date date = new Date();
                String time = formater.format(date);
                lblTime.setText(time);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                break;
            }
        }
    }
}
