/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_dao_tao;

import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class MainAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainAdmin
     */
    public MainAdmin() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon/main.png")).getImage());
        setTitle("HUS-App");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logOut = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        qlsvMenu = new javax.swing.JMenuItem();
        qlgvMenu = new javax.swing.JMenuItem();
        qlmhMenu = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hoc-phi-Dh-KHTN-Ha-noi.jpeg"))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-setting-40.png"))); // NOI18N
        jMenu1.setText("Tài Khoản");
        jMenu1.setPreferredSize(new java.awt.Dimension(145, 32));

        logOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-log-out-16.png"))); // NOI18N
        logOut.setText("Đăng xuất");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        jMenu1.add(logOut);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-power-16.png"))); // NOI18N
        exitMenu.setText("Thoát");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bag-40.png"))); // NOI18N
        jMenu2.setText("Quản Lí Đào Tạo ");
        jMenu2.setPreferredSize(new java.awt.Dimension(145, 32));

        qlsvMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        qlsvMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-student-24.png"))); // NOI18N
        qlsvMenu.setText("Quản Lí Sinh Viên");
        qlsvMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlsvMenuActionPerformed(evt);
            }
        });
        jMenu2.add(qlsvMenu);

        qlgvMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        qlgvMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-teacher-24.png"))); // NOI18N
        qlgvMenu.setText("Quản Lí Giáo Viên");
        qlgvMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlgvMenuActionPerformed(evt);
            }
        });
        jMenu2.add(qlgvMenu);

        qlmhMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        qlmhMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-school-centralize-lab-for-all-subject-student-24.png"))); // NOI18N
        qlmhMenu.setText("Quản Lí Môn Học");
        qlmhMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlmhMenuActionPerformed(evt);
            }
        });
        jMenu2.add(qlmhMenu);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-class-24.png"))); // NOI18N
        jMenuItem7.setText("Quản Lí Lớp Học");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-40.png"))); // NOI18N
        jMenu3.setText("Tìm Kiếm");
        jMenu3.setPreferredSize(new java.awt.Dimension(145, 32));
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qlmhMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlmhMenuActionPerformed
        // TODO add your handling code here:
        new QLmonhoc().setVisible(true);
        dispose();
    }//GEN-LAST:event_qlmhMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void qlsvMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlsvMenuActionPerformed
        // TODO add your handling code here:
        new QLsinhvien().setVisible(true);
        dispose();
    }//GEN-LAST:event_qlsvMenuActionPerformed

    private void qlgvMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlgvMenuActionPerformed
        // TODO add your handling code here:
        new QLgiaovien().setVisible(true);
        dispose();
    }//GEN-LAST:event_qlgvMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem logOut;
    private javax.swing.JMenuItem qlgvMenu;
    private javax.swing.JMenuItem qlmhMenu;
    private javax.swing.JMenuItem qlsvMenu;
    // End of variables declaration//GEN-END:variables
}
