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
public class Detalle_Compra extends javax.swing.JFrame {

    /**
     * Creates new form Detalle_Compra
     */
    public Detalle_Compra() {
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

        Boton_Salir = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        Precio_unitario = new javax.swing.JLabel();
        Id_Cabecera_compra = new javax.swing.JLabel();
        Precio_Total = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        text_ID = new javax.swing.JTextField();
        text_cantidad = new javax.swing.JTextField();
        text_PrecioUnitario = new javax.swing.JTextField();
        text_IdCabecera = new javax.swing.JTextField();
        text_PrecioTotal = new javax.swing.JTextField();
        text_Producto = new javax.swing.JTextField();
        BT_Grabar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        BT_OK = new javax.swing.JButton();
        editar_tabla = new javax.swing.JPanel();
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

        Boton_Salir.setText("SALIR");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        titulo.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        titulo.setText("DETALLE COMPRA");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra.png"))); // NOI18N
        getContentPane().add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID.setText("Id: ");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        Cantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cantidad.setText("Cantidad: ");
        getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        Precio_unitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Precio_unitario.setText("Precio Unitario: ");
        getContentPane().add(Precio_unitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        Id_Cabecera_compra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Id_Cabecera_compra.setText("ID Cabecera Compra:  ");
        getContentPane().add(Id_Cabecera_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        Precio_Total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Precio_Total.setText("Precio Total: ");
        getContentPane().add(Precio_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 30));

        Producto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Producto.setText("Producto: ");
        getContentPane().add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));
        getContentPane().add(text_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 220, -1));
        getContentPane().add(text_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 220, -1));
        getContentPane().add(text_PrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 220, -1));
        getContentPane().add(text_IdCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 220, -1));
        getContentPane().add(text_PrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 220, -1));
        getContentPane().add(text_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 220, -1));

        BT_Grabar.setText("Grabar");
        getContentPane().add(BT_Grabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 80, -1));

        BT_Cancelar.setText("Cancelar");
        getContentPane().add(BT_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 80, -1));

        BT_OK.setText("OK");
        getContentPane().add(BT_OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 80, -1));

        jLabel1.setText("Informaci??n: ");

        jButton1.setText("Editar");

        jButton2.setText("Eliminar");

        jLabel2.setText("Buscar: ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout editar_tablaLayout = new javax.swing.GroupLayout(editar_tabla);
        editar_tabla.setLayout(editar_tablaLayout);
        editar_tablaLayout.setHorizontalGroup(
            editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editar_tablaLayout.createSequentialGroup()
                .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editar_tablaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(editar_tablaLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        editar_tablaLayout.setVerticalGroup(
            editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editar_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(editar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 560, 180));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Boton_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Detalle_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalle_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalle_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalle_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalle_Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Grabar;
    private javax.swing.JButton BT_OK;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Id_Cabecera_compra;
    private javax.swing.JLabel Precio_Total;
    private javax.swing.JLabel Precio_unitario;
    private javax.swing.JLabel Producto;
    private javax.swing.JPanel editar_tabla;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField text_ID;
    private javax.swing.JTextField text_IdCabecera;
    private javax.swing.JTextField text_PrecioTotal;
    private javax.swing.JTextField text_PrecioUnitario;
    private javax.swing.JTextField text_Producto;
    private javax.swing.JTextField text_cantidad;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
