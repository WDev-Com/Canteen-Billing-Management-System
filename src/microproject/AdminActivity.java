/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package microproject;

/**
 *
 * @author Rushikesh
 */
public class AdminActivity extends javax.swing.JFrame {

    /**
     * Creates new form AdminActivity
     */
    public AdminActivity() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CreateMenuLink = new javax.swing.JLabel();
        GenrateBillLink = new javax.swing.JLabel();
        SellsAnyalysisLink = new javax.swing.JLabel();
        LogoutAdminSystem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN SYSTEM");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        CreateMenuLink.setBackground(new java.awt.Color(255, 204, 153));
        CreateMenuLink.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CreateMenuLink.setForeground(new java.awt.Color(51, 51, 255));
        CreateMenuLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateMenuLink.setText("CREATE MENU");
        CreateMenuLink.setOpaque(true);
        CreateMenuLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMenuLinkMouseClicked(evt);
            }
        });

        GenrateBillLink.setBackground(new java.awt.Color(204, 255, 102));
        GenrateBillLink.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GenrateBillLink.setForeground(new java.awt.Color(0, 0, 255));
        GenrateBillLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenrateBillLink.setText("GENRATE BILL");
        GenrateBillLink.setOpaque(true);
        GenrateBillLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenrateBillLinkMouseClicked(evt);
            }
        });

        SellsAnyalysisLink.setBackground(new java.awt.Color(204, 255, 153));
        SellsAnyalysisLink.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SellsAnyalysisLink.setForeground(new java.awt.Color(51, 51, 255));
        SellsAnyalysisLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SellsAnyalysisLink.setText("SELLS ANALYSIS");
        SellsAnyalysisLink.setOpaque(true);
        SellsAnyalysisLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellsAnyalysisLinkMouseClicked(evt);
            }
        });

        LogoutAdminSystem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutAdminSystem.setForeground(new java.awt.Color(255, 0, 51));
        LogoutAdminSystem.setText("LOGOUT");
        LogoutAdminSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutAdminSystemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 150, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SellsAnyalysisLink, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CreateMenuLink, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(GenrateBillLink, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(163, 163, 163))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutAdminSystem)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutAdminSystem)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateMenuLink, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenrateBillLink, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(SellsAnyalysisLink, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
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

    private void CreateMenuLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMenuLinkMouseClicked
        CreateMenuActivity ma = new CreateMenuActivity();
        this.setVisible(false);       
        ma.setVisible(true);
    }//GEN-LAST:event_CreateMenuLinkMouseClicked

    private void GenrateBillLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenrateBillLinkMouseClicked
       OrderingActivity ma = new OrderingActivity();
        this.setVisible(false);       
        ma.setVisible(true);
    }//GEN-LAST:event_GenrateBillLinkMouseClicked

    private void SellsAnyalysisLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellsAnyalysisLinkMouseClicked
        SalesReport ma = new SalesReport();
        this.setVisible(false);       
        ma.setVisible(true);
    }//GEN-LAST:event_SellsAnyalysisLinkMouseClicked

    private void LogoutAdminSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutAdminSystemMouseClicked
        MainActivity ma = new MainActivity();
        this.setVisible(false);
        this.dispose();
        ma.setVisible(true);
    }//GEN-LAST:event_LogoutAdminSystemMouseClicked

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
            java.util.logging.Logger.getLogger(AdminActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateMenuLink;
    private javax.swing.JLabel GenrateBillLink;
    private javax.swing.JLabel LogoutAdminSystem;
    private javax.swing.JLabel SellsAnyalysisLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
