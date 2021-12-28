/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_dao_tao;

import Class.Lophoc;
import Modify.LophocModify;
import Modify.MonhocModify;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLlophoc extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    List<Lophoc> lophocList = new ArrayList<>(); //lưu môn học 
    public QLlophoc() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon/main.png")).getImage());
        setTitle("HUS-App");
        tableModel = (DefaultTableModel) tblLophoc.getModel(); //getModel(): đưa dữ liệu ra bảng
        showQLLophoc(LophocModify.findAll());
    }

    private void showQLLophoc(List<Lophoc> findAll) {
        lophocList = LophocModify.findAll();
        DefaultTableModel tableModel;
        tblLophoc.getModel();
        tableModel = (DefaultTableModel) tblLophoc.getModel();
        tableModel.setRowCount(0);// xóa hàng
        lophocList.forEach(lophoc -> {
            tableModel.addRow(new Object[]{/*tableModel.getRowCount() + 1,*/lophoc.getMaLopHoc(), lophoc.getTenLopHoc(), lophoc.getKhoa(), lophoc.getSiSo()});
        });

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFindButon = new javax.swing.JButton();
        jFind = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLophoc = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtmaLH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttenLH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsiso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbKhoa = new javax.swing.JComboBox<>();
        jSaveButton = new javax.swing.JButton();
        jDeleteButon = new javax.swing.JButton();
        jSửaButton = new javax.swing.JButton();
        jLammoi = new javax.swing.JButton();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1006, 585));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1006, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ LỚP HỌC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(376, 376, 376))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFindButon.setBackground(new java.awt.Color(255, 204, 0));
        jFindButon.setText("Tìm Kiếm");
        jFindButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindButonActionPerformed(evt);
            }
        });

        jLabel2.setText("(Tìm kiếm theo tên lớp học)");

        tblLophoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Lớp", "Tên Lớp", "Khoa", "Sĩ Số"
            }
        ));
        tblLophoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLophocMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblLophoc);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Mã Lớp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tên Lớp");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sĩ Số");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Khoa");

        cbKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vật Lí", "Toán", "Hóa", "Sinh" }));

        jSaveButton.setBackground(new java.awt.Color(255, 51, 51));
        jSaveButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSaveButton.setText("Lưu");
        jSaveButton.setPreferredSize(new java.awt.Dimension(72, 30));
        jSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveButtonActionPerformed(evt);
            }
        });

        jDeleteButon.setBackground(new java.awt.Color(0, 255, 255));
        jDeleteButon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDeleteButon.setText("Xóa");
        jDeleteButon.setPreferredSize(new java.awt.Dimension(72, 30));
        jDeleteButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButonActionPerformed(evt);
            }
        });

        jSửaButton.setBackground(new java.awt.Color(0, 255, 0));
        jSửaButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSửaButton.setText("Sửa");
        jSửaButton.setPreferredSize(new java.awt.Dimension(72, 30));
        jSửaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSửaButtonActionPerformed(evt);
            }
        });

        jLammoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLammoi.setText("Làm Mới");
        jLammoi.setPreferredSize(new java.awt.Dimension(72, 30));
        jLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLammoiActionPerformed(evt);
            }
        });

        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logout_100px.png"))); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmaLH)
                    .addComponent(txttenLH)
                    .addComponent(txtsiso, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSửaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDeleteButon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitLabel)
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmaLH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDeleteButon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttenLH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSửaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtsiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitLabel)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jFindButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFind, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(264, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFindButon)
                    .addComponent(jFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        new MainAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitLabelMouseClicked

    private void jSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveButtonActionPerformed
        // TODO add your handling code here:
         String MaLH = txtmaLH.getText();
        String TenLH = txttenLH.getText();
        String SiSo= txtsiso.getText();//parseInt(): chuyển string sang int
        String Khoa = cbKhoa.getSelectedItem().toString();
        Lophoc lh = new Lophoc(MaLH, TenLH, Khoa, SiSo);
        LophocModify.insert(lh);
        txtmaLH.setText("");
        txttenLH.setText("");
        txtsiso.setText("");
        cbKhoa.setSelectedIndex(0);
        showQLLophoc(LophocModify.findAll());
    }//GEN-LAST:event_jSaveButtonActionPerformed

    private void jLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLammoiActionPerformed
        // TODO add your handling code here:
        txtmaLH.setText("");
        txttenLH.setText("");
        txtsiso.setText("");
        cbKhoa.setSelectedIndex(0);
    }//GEN-LAST:event_jLammoiActionPerformed

    private void jDeleteButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblLophoc.getSelectedRow();// xem hàng nào được chọn
        //  System.out.println(selectedIndex);
        if (selectedIndex >= 0) {
            Lophoc lh = lophocList.get(selectedIndex);// lấy ra lop học được chọn
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa lớp học không?");
            if (option == 0) {
               LophocModify.delete(lh.getMaLopHoc());
                showQLLophoc(LophocModify.findAll());
            }
        }
    }//GEN-LAST:event_jDeleteButonActionPerformed

    private void jFindButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindButonActionPerformed
        // TODO add your handling code here:
        if (jFind.getText() != null && jFind.getText().length() > 0) {
            lophocList = LophocModify.findTenLH(jFind.getText());
            tableModel.setRowCount(0);// xóa hàng
           lophocList.forEach(lophoc -> {
                tableModel.addRow(new Object[]{lophoc.getMaLopHoc(), lophoc.getTenLopHoc(), lophoc.getKhoa(), lophoc.getSiSo()});
            });
        } else {
            showQLLophoc(LophocModify.findAll());
        }
    }//GEN-LAST:event_jFindButonActionPerformed

    private void jSửaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSửaButtonActionPerformed
        // TODO add your handling code here:
        if (tblLophoc.getSelectedRowCount() >= 0) {
            String MaLH = txtmaLH.getText();
            String TenLH = txttenLH.getText();
            String SiSo= txtsiso.getText();
            String Khoa = cbKhoa.getSelectedItem().toString();
            Lophoc lh = new Lophoc(MaLH, TenLH, Khoa, SiSo);
            LophocModify.update(lh);
            showQLLophoc(LophocModify.findAll());

        }
    }//GEN-LAST:event_jSửaButtonActionPerformed

    private void tblLophocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLophocMousePressed
        // TODO add your handling code here:
        txtmaLH.setText(tblLophoc.getValueAt(tblLophoc.getSelectedRow(), 0).toString());
        txttenLH.setText(tblLophoc.getValueAt(tblLophoc.getSelectedRow(), 1).toString());
        cbKhoa.setSelectedItem(tblLophoc.getValueAt(tblLophoc.getSelectedRow(), 2));
        txtsiso.setText(tblLophoc.getValueAt(tblLophoc.getSelectedRow(), 3).toString());
        
    }//GEN-LAST:event_tblLophocMousePressed

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
            java.util.logging.Logger.getLogger(QLlophoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLlophoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLlophoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLlophoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLlophoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbKhoa;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JButton jDeleteButon;
    private javax.swing.JTextField jFind;
    private javax.swing.JButton jFindButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLammoi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSaveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSửaButton;
    private javax.swing.JTable tblLophoc;
    private javax.swing.JTextField txtmaLH;
    private javax.swing.JTextField txtsiso;
    private javax.swing.JTextField txttenLH;
    // End of variables declaration//GEN-END:variables
}
