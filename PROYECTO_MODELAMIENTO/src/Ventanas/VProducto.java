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
public class VProducto extends javax.swing.JFrame {

    /**
     * Creates new form VProducto
     */
    public VProducto() {
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

        jLabel1 = new javax.swing.JLabel();
        Boton_Salir = new javax.swing.JButton();
        Producto1 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        Codigo_Producto = new javax.swing.JLabel();
        text_Codigo = new javax.swing.JTextField();
        Descripcion_Producto = new javax.swing.JLabel();
        Categoria_Producto = new javax.swing.JLabel();
        Modelo_Producto = new javax.swing.JLabel();
        text_Descripcion = new javax.swing.JTextField();
        text_Categoria = new javax.swing.JTextField();
        text_Modelo = new javax.swing.JTextField();
        Buscar_tabla = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BT_Grabar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        BT_Ok = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Salir.setText("SALIR");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        Producto1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        Producto1.setForeground(new java.awt.Color(255, 255, 255));
        Producto1.setText("PRODUCTO");
        getContentPane().add(Producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        Codigo_Producto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Codigo_Producto.setText("C??digo: ");
        getContentPane().add(Codigo_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        text_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_CodigoActionPerformed(evt);
            }
        });
        getContentPane().add(text_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, -1));

        Descripcion_Producto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Descripcion_Producto.setText("Descripci??n: ");
        getContentPane().add(Descripcion_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        Categoria_Producto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Categoria_Producto.setText("Categor??a:");
        getContentPane().add(Categoria_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        Modelo_Producto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Modelo_Producto.setText("Modelo: ");
        getContentPane().add(Modelo_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));
        getContentPane().add(text_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 170, -1));
        getContentPane().add(text_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 170, -1));
        getContentPane().add(text_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 170, -1));

        jLabel2.setText("Informaci??n: ");

        jButton1.setText("Editar");

        jButton2.setText("Eliminar");

        jLabel3.setText("Buscar:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Buscar_tablaLayout = new javax.swing.GroupLayout(Buscar_tabla);
        Buscar_tabla.setLayout(Buscar_tablaLayout);
        Buscar_tablaLayout.setHorizontalGroup(
            Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buscar_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Buscar_tablaLayout.createSequentialGroup()
                        .addGroup(Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Buscar_tablaLayout.setVerticalGroup(
            Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buscar_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(Buscar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 430, 150));

        BT_Grabar.setText("Grabar");
        getContentPane().add(BT_Grabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 80, -1));

        BT_Cancelar.setText("Cancelar");
        BT_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 80, -1));

        BT_Ok.setText("OK");
        getContentPane().add(BT_Ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void text_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_CodigoActionPerformed

    private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VProducto().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Grabar;
    private javax.swing.JButton BT_Ok;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JPanel Buscar_tabla;
    private javax.swing.JLabel Categoria_Producto;
    private javax.swing.JLabel Codigo_Producto;
    private javax.swing.JLabel Descripcion_Producto;
    private javax.swing.JLabel Modelo_Producto;
    private javax.swing.JLabel Producto1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField text_Categoria;
    private javax.swing.JTextField text_Codigo;
    private javax.swing.JTextField text_Descripcion;
    private javax.swing.JTextField text_Modelo;
    // End of variables declaration//GEN-END:variables
}
