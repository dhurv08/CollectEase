package com.mycompany.collagemanagementapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kumra
 */
public class DashboardTeacher extends javax.swing.JFrame {

    /**
     * Creates new form TeacherDashboard
     */
    public DashboardTeacher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        pnlHeading = new javax.swing.JPanel();
        lbTeacherDashboard = new javax.swing.JLabel();
        pnlBage = new javax.swing.JPanel();
        btnCourse = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(226, 218, 214));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(0, 0, 0));

        pnlHeading.setBackground(new java.awt.Color(51, 51, 51));
        pnlHeading.setPreferredSize(new java.awt.Dimension(700, 35));

        lbTeacherDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTeacherDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lbTeacherDashboard.setText("Teacher Dashboard");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(lbTeacherDashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTeacherDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlBage.setBackground(new java.awt.Color(100, 130, 173));
        pnlBage.setPreferredSize(new java.awt.Dimension(700, 465));

        btnCourse.setBackground(new java.awt.Color(226, 218, 214));
        btnCourse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCourse.setText("Get Student List");
        btnCourse.setBorder(new javax.swing.border.MatteBorder(null));
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(226, 218, 214));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBageLayout = new javax.swing.GroupLayout(pnlBage);
        pnlBage.setLayout(pnlBageLayout);
        pnlBageLayout.setHorizontalGroup(
            pnlBageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBageLayout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(pnlBageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBageLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBageLayout.createSequentialGroup()
                        .addComponent(btnCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))))
        );
        pnlBageLayout.setVerticalGroup(
            pnlBageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addGap(141, 141, 141)
                .addComponent(btnCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        StudentListTeacher studentListTeacher = new StudentListTeacher();
        studentListTeacher.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCourseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginPage lg = new LoginPage();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginPage lg = new LoginPage();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbTeacherDashboard;
    private javax.swing.JPanel pnlBage;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
