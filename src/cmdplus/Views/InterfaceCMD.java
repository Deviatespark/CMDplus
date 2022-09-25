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
        jPbuttonOk = new javax.swing.JPanel();
        jButtonOk = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListData = new javax.swing.JList<>();
        Login1 = new javax.swing.JLabel();
        jPbuttonDell = new javax.swing.JPanel();
        jButtonDell = new java.awt.Label();
        jVersion = new javax.swing.JLabel();

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

        jPbuttonOk.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPbuttonOkAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButtonOk.setAlignment(java.awt.Label.CENTER);
        jButtonOk.setBackground(new java.awt.Color(0, 134, 190));
        jButtonOk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonOk.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonOk.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOk.setText("ACEPTAR");
        jButtonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbuttonOkLayout = new javax.swing.GroupLayout(jPbuttonOk);
        jPbuttonOk.setLayout(jPbuttonOkLayout);
        jPbuttonOkLayout.setHorizontalGroup(
            jPbuttonOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbuttonOkLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPbuttonOkLayout.setVerticalGroup(
            jPbuttonOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbuttonOkLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jPbuttonDell.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPbuttonDellAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButtonDell.setAlignment(java.awt.Label.CENTER);
        jButtonDell.setBackground(new java.awt.Color(0, 134, 190));
        jButtonDell.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDell.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonDell.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDell.setText("BORRAR");
        jButtonDell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDellMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDellMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPbuttonDellLayout = new javax.swing.GroupLayout(jPbuttonDell);
        jPbuttonDell.setLayout(jPbuttonDellLayout);
        jPbuttonDellLayout.setHorizontalGroup(
            jPbuttonDellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonDell, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPbuttonDellLayout.setVerticalGroup(
            jPbuttonDellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbuttonDellLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonDell, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelLoginLayout.createSequentialGroup()
                            .addComponent(jPbuttonDell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPbuttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(Login1)
                    .addContainerGap(543, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPbuttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPbuttonDell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLoginLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(Login1)
                    .addContainerGap(553, Short.MAX_VALUE)))
        );

        jVersion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jVersion.setForeground(new java.awt.Color(0, 134, 190));
        jVersion.setText("v 2.0");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVersion)
                .addGap(96, 96, 96)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelVersion)
                    .addGap(0, 613, Short.MAX_VALUE)))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelBar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jVersion)
                        .addContainerGap())))
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
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOkMouseEntered
        jButtonOk.setBackground(new Color(0,83,190));
        jButtonOk.setForeground(Color.white);
    }//GEN-LAST:event_jButtonOkMouseEntered

    private void jButtonOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOkMouseExited
        jButtonOk.setBackground(new Color(0,134,190));
        jButtonOk.setForeground(Color.white);
    }//GEN-LAST:event_jButtonOkMouseExited

    private void jPbuttonOkAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPbuttonOkAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPbuttonOkAncestorAdded

    private void JTextCommandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextCommandMouseClicked
        this.JTextCommand.setText("");
        this.JTextCommand.setForeground(Color.black);
    }//GEN-LAST:event_JTextCommandMouseClicked

    private void jButtonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOkMouseClicked
        this.datosEjecucion = this.consola.ejecucionConRetorno(this.JTextCommand.getText());
        mostrarDatos(datosEjecucion);
    }//GEN-LAST:event_jButtonOkMouseClicked

    private void jButtonDellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDellMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDellMouseClicked

    private void jButtonDellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDellMouseEntered
        jButtonDell.setBackground(new Color(0,83,190));
        jButtonDell.setForeground(Color.white);
    }//GEN-LAST:event_jButtonDellMouseEntered

    private void jButtonDellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDellMouseExited
        jButtonDell.setBackground(new Color(0,134,190));
        jButtonDell.setForeground(Color.white);
    }//GEN-LAST:event_jButtonDellMouseExited

    private void jPbuttonDellAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPbuttonDellAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPbuttonDellAncestorAdded

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
    private javax.swing.JLabel Login1;
    private javax.swing.JLabel User;
    private java.awt.Label jButtonAceptar2;
    private java.awt.Label jButtonDell;
    private java.awt.Label jButtonOk;
    private javax.swing.JLabel jLButtonExit;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JList<String> jListData;
    private javax.swing.JPanel jPExit;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPboton1;
    private javax.swing.JPanel jPbuttonDell;
    private javax.swing.JPanel jPbuttonOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jVersion;
    // End of variables declaration//GEN-END:variables
}
