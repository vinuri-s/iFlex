/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author THRUSH DRAKE
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    private String userid;

    public Home() {
        initComponents();

        //setSizes();
    }

    public Home(String userid) {
        initComponents();
        this.userid = userid;
        firstPanel(userid);
    }

    private void setColor(JPanel btn, JPanel inbtn) {
        btn.setBackground(new Color(41, 57, 80));
        inbtn.setBackground(new Color(240, 240, 240));
    }

    private void resetColor(JPanel btn, JPanel inbtn) {
        btn.setBackground(new Color(23, 35, 51));
        inbtn.setBackground(new Color(23, 35, 51));
    }

    private void firstPanel(String userid) {

        //removing panels
        changing_panel.removeAll();
        changing_panel.repaint();
        changing_panel.revalidate();

        //adding panels
        changing_panel.add(userpanel);
        changing_panel.repaint();
        changing_panel.revalidate();

        UserProfile u = new UserProfile(userid);
        userpanel.setLayout(new BorderLayout());
        userpanel.add(u);
        userpanel.validate();
    }

    private void setSizes() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(d);
        int height = d.height;
        int width = d.width;
        mainPanel.setSize(d);
        mainDBPanel.setSize(width % 12, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainDBPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        changing_panel = new javax.swing.JPanel();
        userpanel = new javax.swing.JPanel();
        dashboardpanel = new javax.swing.JPanel();
        shiftpanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btn_01 = new javax.swing.JPanel();
        inbtn_01 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_03 = new javax.swing.JPanel();
        inbtn_03 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainDBPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RES/icons8_Multiply_20px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RES/icons8_Subtract_20px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        changing_panel.setBackground(new java.awt.Color(255, 255, 255));
        changing_panel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout userpanelLayout = new javax.swing.GroupLayout(userpanel);
        userpanel.setLayout(userpanelLayout);
        userpanelLayout.setHorizontalGroup(
            userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        userpanelLayout.setVerticalGroup(
            userpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );

        changing_panel.add(userpanel, "card2");

        javax.swing.GroupLayout dashboardpanelLayout = new javax.swing.GroupLayout(dashboardpanel);
        dashboardpanel.setLayout(dashboardpanelLayout);
        dashboardpanelLayout.setHorizontalGroup(
            dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        dashboardpanelLayout.setVerticalGroup(
            dashboardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );

        changing_panel.add(dashboardpanel, "card2");

        javax.swing.GroupLayout shiftpanelLayout = new javax.swing.GroupLayout(shiftpanel);
        shiftpanel.setLayout(shiftpanelLayout);
        shiftpanelLayout.setHorizontalGroup(
            shiftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        shiftpanelLayout.setVerticalGroup(
            shiftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );

        changing_panel.add(shiftpanel, "card2");

        javax.swing.GroupLayout mainDBPanelLayout = new javax.swing.GroupLayout(mainDBPanel);
        mainDBPanel.setLayout(mainDBPanelLayout);
        mainDBPanelLayout.setHorizontalGroup(
            mainDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDBPanelLayout.createSequentialGroup()
                .addGap(1064, 1064, 1064)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel1))
            .addComponent(changing_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainDBPanelLayout.setVerticalGroup(
            mainDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDBPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(mainDBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDBPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changing_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(mainDBPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1120, 750));

        menuPanel.setBackground(new java.awt.Color(23, 35, 51));
        menuPanel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_01.setBackground(new java.awt.Color(41, 57, 80));
        btn_01.setPreferredSize(new java.awt.Dimension(130, 52));
        btn_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_01MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inbtn_01Layout = new javax.swing.GroupLayout(inbtn_01);
        inbtn_01.setLayout(inbtn_01Layout);
        inbtn_01Layout.setHorizontalGroup(
            inbtn_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        inbtn_01Layout.setVerticalGroup(
            inbtn_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RES/icons8_User_Male_30px.png"))); // NOI18N

        javax.swing.GroupLayout btn_01Layout = new javax.swing.GroupLayout(btn_01);
        btn_01.setLayout(btn_01Layout);
        btn_01Layout.setHorizontalGroup(
            btn_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_01Layout.createSequentialGroup()
                .addComponent(inbtn_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 104, Short.MAX_VALUE))
        );
        btn_01Layout.setVerticalGroup(
            btn_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inbtn_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuPanel.add(btn_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, -1));

        btn_03.setBackground(new java.awt.Color(23, 35, 51));
        btn_03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_03MouseClicked(evt);
            }
        });

        inbtn_03.setBackground(new java.awt.Color(23, 35, 51));

        javax.swing.GroupLayout inbtn_03Layout = new javax.swing.GroupLayout(inbtn_03);
        inbtn_03.setLayout(inbtn_03Layout);
        inbtn_03Layout.setHorizontalGroup(
            inbtn_03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        inbtn_03Layout.setVerticalGroup(
            inbtn_03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Invoice");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RES/icons8_Leave_30px.png"))); // NOI18N

        javax.swing.GroupLayout btn_03Layout = new javax.swing.GroupLayout(btn_03);
        btn_03.setLayout(btn_03Layout);
        btn_03Layout.setHorizontalGroup(
            btn_03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_03Layout.createSequentialGroup()
                .addComponent(inbtn_03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        btn_03Layout.setVerticalGroup(
            btn_03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inbtn_03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_03Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuPanel.add(btn_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, -1));

        mainPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 750));

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(d);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_01MouseClicked
        // TODO add your handling code here:
        setColor(btn_01, inbtn_01);
        resetColor(btn_03, inbtn_03);

        //removing panels
        changing_panel.removeAll();
        changing_panel.repaint();
        changing_panel.revalidate();

        //adding panels
        changing_panel.add(userpanel);
        changing_panel.repaint();
        changing_panel.revalidate();

        UserProfile u = new UserProfile(this.userid);
        u.setVisible(true);
        userpanel.setLayout(new BorderLayout());
        userpanel.add(u);
        userpanel.validate();
    }//GEN-LAST:event_btn_01MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_03MouseClicked
        // TODO add your handling code here:
        setColor(btn_03, inbtn_03);
        resetColor(btn_01, inbtn_01);

        //removing panels
        changing_panel.removeAll();
        changing_panel.repaint();
        changing_panel.revalidate();

        //adding panels
        changing_panel.add(shiftpanel);
        changing_panel.repaint();
        changing_panel.revalidate();

        InvoicePanel inp = new InvoicePanel();
        inp.setVisible(true);
        shiftpanel.setLayout(new BorderLayout());
        shiftpanel.add(inp);
        shiftpanel.validate();
    }//GEN-LAST:event_btn_03MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_01;
    private javax.swing.JPanel btn_03;
    private javax.swing.JPanel changing_panel;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JPanel inbtn_01;
    private javax.swing.JPanel inbtn_03;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel mainDBPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel shiftpanel;
    private javax.swing.JPanel userpanel;
    // End of variables declaration//GEN-END:variables
}
