
package studentframe;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;


public class Frame2 extends javax.swing.JFrame {

    
    public Frame2() {
       setTitle("DATA FRAME2");
       setSize(400,300); 
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new BorderLayout());
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        GuideBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dark = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 0, 51));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("           GUIDE ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        HomeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HomeBtn.setText("HOME");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        GuideBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GuideBtn.setText("  Guide Me ");
        GuideBtn.setBorder(null);
        GuideBtn.setFocusable(false);
        GuideBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GuideBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GuideBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GuideBtnStateChanged(evt);
            }
        });
        GuideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuideBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(GuideBtn);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\ddd\\light.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dark.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\ddd\\icon.jpg")); // NOI18N
        dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkActionPerformed(evt);
            }
        });

        helpBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        helpBtn.setText("HELP");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dark, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(HomeBtn)
                .addGap(27, 27, 27)
                .addComponent(helpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(dark)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 390, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
       
        new BankAccountApplication().setVisible(true);
       
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void GuideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuideBtnActionPerformed
        
        new EDebs().setVisible(true);
       
    }//GEN-LAST:event_GuideBtnActionPerformed

    private void GuideBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GuideBtnStateChanged
   
    }//GEN-LAST:event_GuideBtnStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        panel.setBackground(Color.white);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkActionPerformed
       
        panel.setBackground(Color.black);
    }//GEN-LAST:event_darkActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
       
        new Help().setVisible(true);
    }//GEN-LAST:event_helpBtnActionPerformed

   
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new Frame2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuideBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton dark;
    private javax.swing.JButton helpBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
