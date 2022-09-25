
package cmdplus.controller;

import cmdplus.Models.Consola;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class InterfazPrincipal extends javax.swing.JFrame {

    private Consola consola ;
    private ArrayList<String> datosEjecucion;
    private DefaultListModel model;
    
    public InterfazPrincipal() {
        initComponents(); 
        this.consola = new Consola();
        this.datosEjecucion = new ArrayList<>();
        this.model = new DefaultListModel();
        this.jListData.setModel(model);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAccept = new javax.swing.JButton();
        jTextFieldCommand = new javax.swing.JTextField();
        jLabelCommandTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListData = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAccept.setText("Aceptar");
        jButtonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcceptActionPerformed(evt);
            }
        });

        jLabelCommandTitle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCommandTitle.setText("Inserte comando");

        jListData.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jListData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAccept))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCommandTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextFieldCommand)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE)))))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelCommandTitle)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonAccept)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcceptActionPerformed
        this.datosEjecucion = this.consola.ejecucionConRetorno(this.jTextFieldCommand.getText());
        mostrarDatos(datosEjecucion);
        
    }//GEN-LAST:event_jButtonAcceptActionPerformed

    private void mostrarDatos(ArrayList<String> retornoEjecucion){
                
        model.removeAllElements();
        
        for (int i = 0; i < this.datosEjecucion.size(); i++) {
            model.addElement(this.datosEjecucion.get(i));
        }
    
    }
    
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JLabel jLabelCommandTitle;
    private javax.swing.JList<String> jListData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCommand;
    // End of variables declaration//GEN-END:variables
}
