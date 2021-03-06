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
public class Detalle_Venta extends javax.swing.JFrame {

    /**
     * Creates new form Detalle_Venta
     */
    public Detalle_Venta() {
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

        BT_salir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        Id_Cabecera_venta = new javax.swing.JLabel();
        text_Id_cabeceraVenta = new javax.swing.JTextField();
        editar_tabla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cantidad = new javax.swing.JLabel();
        text_cantidad = new javax.swing.JTextField();
        Precio_unitario = new javax.swing.JLabel();
        text_precioUnitario = new javax.swing.JTextField();
        PrecioTotal = new javax.swing.JLabel();
        text_precio_total = new javax.swing.JTextField();
        BT_Ok = new javax.swing.JButton();
        Id_venta = new javax.swing.JLabel();
        text_Id = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_salir.setText("SALIR");
        BT_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_salirActionPerformed(evt);
            }
        });
        getContentPane().add(BT_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        titulo.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        titulo.setText("DETALLE VENTA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventadet.jpg"))); // NOI18N
        getContentPane().add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        Id_Cabecera_venta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Id_Cabecera_venta.setText("Cliente:");
        getContentPane().add(Id_Cabecera_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));
        getContentPane().add(text_Id_cabeceraVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 230, -1));

        jLabel1.setText("Datos del Producto");

        jLabel2.setText("Producto");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        cantidad.setText("Cantidad: ");

        Precio_unitario.setText("Precio Unitario: ");

        PrecioTotal.setText("Precio Total: ");

        BT_Ok.setText("OK");

        javax.swing.GroupLayout editar_tablaLayout = new javax.swing.GroupLayout(editar_tabla);
        editar_tabla.setLayout(editar_tablaLayout);
        editar_tablaLayout.setHorizontalGroup(
            editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editar_tablaLayout.createSequentialGroup()
                .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editar_tablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(editar_tablaLayout.createSequentialGroup()
                        .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editar_tablaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Precio_unitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PrecioTotal))
                            .addGroup(editar_tablaLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_precio_total, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        editar_tablaLayout.setVerticalGroup(
            editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editar_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad)
                    .addComponent(text_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio_unitario)
                    .addComponent(text_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioTotal)
                    .addComponent(text_precio_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editar_tablaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editar_tablaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BT_Ok)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(editar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 750, 230));

        Id_venta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Id_venta.setText("Id");
        getContentPane().add(Id_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 40, -1));
        getContentPane().add(text_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 220, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BT_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Detalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalle_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Ok;
    private javax.swing.JButton BT_salir;
    private javax.swing.JLabel Id_Cabecera_venta;
    private javax.swing.JLabel Id_venta;
    private javax.swing.JLabel PrecioTotal;
    private javax.swing.JLabel Precio_unitario;
    private javax.swing.JLabel cantidad;
    private javax.swing.JPanel editar_tabla;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField text_Id;
    private javax.swing.JTextField text_Id_cabeceraVenta;
    private javax.swing.JTextField text_cantidad;
    private javax.swing.JTextField text_precioUnitario;
    private javax.swing.JTextField text_precio_total;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
