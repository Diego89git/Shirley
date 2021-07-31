/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author roni9
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
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

        BT_Salir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        text_Id = new javax.swing.JTextField();
        text_Nombre = new javax.swing.JTextField();
        text_Apellido = new javax.swing.JTextField();
        Text_correo = new javax.swing.JTextField();
        text_Direccion = new javax.swing.JTextField();
        BT_Grabar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        BT_OK = new javax.swing.JButton();
        Editar_tabla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Salir.setText("SALIR");
        BT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        titulo.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("CLIENTE");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clien.png"))); // NOI18N
        getContentPane().add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID.setText("Id: ");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre.setText("Nombre: ");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        Apellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Apellido.setText("Apellido: ");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        Correo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Correo.setText("Correo: ");
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        Direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Direccion.setText("Dirección: ");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));
        getContentPane().add(text_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 180, -1));

        text_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(text_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 180, -1));
        getContentPane().add(text_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 180, -1));
        getContentPane().add(Text_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 180, -1));
        getContentPane().add(text_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 180, -1));

        BT_Grabar.setText("Grabar");
        BT_Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_GrabarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Grabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 80, -1));

        BT_Cancelar.setText("Cancelar");
        getContentPane().add(BT_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 80, -1));

        BT_OK.setText("OK");
        getContentPane().add(BT_OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, -1));

        jLabel1.setText("Información: ");

        jButton1.setText("Editar");

        jButton2.setText("Eliminar");

        jLabel2.setText("Buscar: ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Editar_tablaLayout = new javax.swing.GroupLayout(Editar_tabla);
        Editar_tabla.setLayout(Editar_tablaLayout);
        Editar_tablaLayout.setHorizontalGroup(
            Editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Editar_tablaLayout.createSequentialGroup()
                .addGroup(Editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Editar_tablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(Editar_tablaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(Editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Editar_tablaLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Editar_tablaLayout.setVerticalGroup(
            Editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Editar_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(Editar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 480, 190));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BT_SalirActionPerformed

    private void text_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_NombreActionPerformed

    private void BT_GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_GrabarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_GrabarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Grabar;
    private javax.swing.JButton BT_OK;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private javax.swing.JPanel Editar_tabla;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Icono;
    private javax.swing.JTextField Text_correo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField text_Apellido;
    private javax.swing.JTextField text_Direccion;
    private javax.swing.JTextField text_Id;
    private javax.swing.JTextField text_Nombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
