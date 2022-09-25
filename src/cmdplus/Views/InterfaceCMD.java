/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdplus.Views;

import cmdplus.Models.Consola;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author galve
 */
public class InterfaceCMD extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    private Consola consola ;
    private ArrayList<String> datosEjecucion;
    private DefaultListModel model;
    
    public InterfaceCMD() {
        initComponents();
        this.consola = new Consola();
        this.datosEjecucion = new ArrayList<>();
        this.model = new DefaultListModel();
        this.jListData.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelVersion = new javax.swing.JLabel();
        jPanelBar = new javax.swing.JPanel();
        jPExit = new javax.swing.JPanel();
        jLButtonExit = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        JTextCommand = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPboton = new javax.swing.JPanel();
        jButtonAceptar = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListData = new javax.swing.JList<>();
        Login1 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(3, 19, 47));
        setUndecorated(true);

        jPanelPrincipal.setBackground(new java.awt.Color(3, 19, 47));

        jLabelVersion.setText("Version 2.0");

        jPanelBar.setBackground(new java.awt.Color(3, 19, 47));
        jPanelBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarMouseDragged(evt);
            }
        });
        jPanelBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarMousePressed(evt);
            }
        });

        jPExit.setBackground(new java.awt.Color(3, 19, 47));
        jPExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPExitMouseEntered(evt);
            }
        });

        jLButtonExit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLButtonExit.setText("X");
        jLButtonExit.setToolTipText("");
        jLButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLButtonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLButtonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLButtonExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPExitLayout = new javax.swing.GroupLayout(jPExit);
        jPExit.setLayout(jPExitLayout);
        jPExitLayout.setHorizontalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPExitLayout.setVerticalGroup(
            jPExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelBarLayout = new javax.swing.GroupLayout(jPanelBar);
        jPanelBar.setLayout(jPanelBarLayout);
        jPanelBarLayout.setHorizontalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarLayout.createSequentialGroup()
                .addComponent(jPExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1240, Short.MAX_VALUE))
        );
        jPanelBarLayout.setVerticalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarLayout.createSequentialGroup()
                .addComponent(jPExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setInheritsPopupMenu(true);

        User.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        User.setForeground(new java.awt.Color(0, 134, 190));
        User.setText("Comando");

        JTextCommand.setBackground(new java.awt.Color(255, 255, 255));
        JTextCommand.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JTextCommand.setForeground(new java.awt.Color(204, 204, 204));
        JTextCommand.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JTextCommand.setText("Introduce comando de shell");
        JTextCommand.setBorder(null);
        JTextCommand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTextCommandMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTextCommandMousePressed(evt);
            }
        });
        JTextCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCommandActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 134, 190));

        jPboton.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPbotonAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButtonAceptar.setAlignment(java.awt.Label.CENTER);
        jButtonAceptar.setBackground(new java.awt.Color(0, 134, 190));
        jButtonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAceptar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbotonLayout = new javax.swing.GroupLayout(jPboton);
        jPboton.setLayout(jPbotonLayout);
        jPbotonLayout.setHorizontalGroup(
            jPbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPbotonLayout.setVerticalGroup(
            jPbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jListData.setBackground(new java.awt.Color(0, 0, 0));
        jListData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jListData.setForeground(new java.awt.Color(255, 255, 255));
        jListData.setToolTipText("");
        jListData.setEnabled(false);
        jScrollPane1.setViewportView(jListData);

        Login1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Login1.setForeground(new java.awt.Color(0, 134, 190));
        Login1.setText("CMDplus");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPboton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(Login1)
                    .addContainerGap(573, Short.MAX_VALUE)))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTextCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPboton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(Login1)
                    .addContainerGap(553, Short.MAX_VALUE)))
        );

        Login.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 134, 190));
        Login.setText("v 2.0");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Login)
                .addGap(212, 212, 212)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelVersion)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Login, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelVersion)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLButtonExitMouseClicked

    private void jLButtonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonExitMouseEntered
        //jLButtonEnter1.setBackground(Color.white);
        jLButtonExit.setForeground(Color.red);
    }//GEN-LAST:event_jLButtonExitMouseEntered

    private void jLButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonExitMouseExited
        jLButtonExit.setForeground(Color.white);
    }//GEN-LAST:event_jLButtonExitMouseExited

    private void jPExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPExitMouseEntered

    }//GEN-LAST:event_jPExitMouseEntered

    private void jPanelBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMouseDragged
        int xPantalla = evt.getXOnScreen();
        int yPantalla = evt.getYOnScreen();
        this.setLocation(xPantalla - xMouse,yPantalla - yMouse);
    }//GEN-LAST:event_jPanelBarMouseDragged

    private void jPanelBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelBarMousePressed

    private void JTextCommandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextCommandMousePressed
        if(JTextCommand.getText().equals("Ingrese nombre de usuario")){
            JTextCommand.setText("");
            JTextCommand.setForeground(Color.black);
        }
       

    }//GEN-LAST:event_JTextCommandMousePressed

    private void JTextCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCommandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCommandActionPerformed

    private void jButtonAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseEntered
        jButtonAceptar.setBackground(new Color(0,83,190));
        jButtonAceptar.setForeground(Color.white);
    }//GEN-LAST:event_jButtonAceptarMouseEntered

    private void jButtonAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseExited
        jButtonAceptar.setBackground(new Color(0,134,190));
        jButtonAceptar.setForeground(Color.white);
    }//GEN-LAST:event_jButtonAceptarMouseExited

    private void jPbotonAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPbotonAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPbotonAncestorAdded

    private void JTextCommandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextCommandMouseClicked
        this.JTextCommand.setText("");
        this.JTextCommand.setForeground(Color.black);
    }//GEN-LAST:event_JTextCommandMouseClicked

    private void jButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseClicked
        this.datosEjecucion = this.consola.ejecucionConRetorno(this.JTextCommand.getText());
        mostrarDatos(datosEjecucion);
    }//GEN-LAST:event_jButtonAceptarMouseClicked

    private void mostrarDatos(ArrayList<String> retornoEjecucion){
                
        model.removeAllElements();
        
        for (int i = 0; i < this.datosEjecucion.size(); i++) {
            model.addElement(this.datosEjecucion.get(i));
        }
    
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
            java.util.logging.Logger.getLogger(InterfaceCMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCMD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCMD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextCommand;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Login1;
    private javax.swing.JLabel User;
    private java.awt.Label jButtonAceptar;
    private javax.swing.JLabel jLButtonExit;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JList<String> jListData;
    private javax.swing.JPanel jPExit;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPboton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
