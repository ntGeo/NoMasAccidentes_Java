package Vista;

import Controlador.Controlador;

/**
 *
 * @author Geovanni
 */
public class MantenedorProfesionales extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public MantenedorProfesionales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaProfesionales = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnGuardarProfesional = new javax.swing.JButton();
        lblRutProfesional = new java.awt.Label();
        txtRutProfesional = new java.awt.TextField();
        lblNombreProfesional = new java.awt.Label();
        txtNombreProfesional = new java.awt.TextField();
        lblApellidoPaternoProfesional = new java.awt.Label();
        lblApellidoMaternoProfesional = new java.awt.Label();
        lblDireccionProfesional = new java.awt.Label();
        lblTelefono = new java.awt.Label();
        lblEstado = new java.awt.Label();
        txtApellidoPaternoProfesional = new java.awt.TextField();
        txtApellidoMaternoProfesional = new java.awt.TextField();
        txtDireccionProfesional = new java.awt.TextField();
        txtTelefonoProfesional = new java.awt.TextField();
        txtEstadoProfesional = new java.awt.TextField();
        lblID = new java.awt.Label();
        txtID = new java.awt.TextField();
        btnEditarProfesional = new javax.swing.JButton();
        btnActualizarProfesional = new javax.swing.JButton();
        btnEliminarProfesional = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivoMantenedorProfesionales = new javax.swing.JMenu();
        itemMenuInicioMantendorProfesional = new javax.swing.JMenuItem();
        itemMenuSalirMantenedorProfesionales = new javax.swing.JMenuItem();
        menuMantenedoresMantenedorProfesional = new javax.swing.JMenu();
        itemMenuProfesionalesMantenedorProfesionales = new javax.swing.JMenuItem();
        itemMenuClientesMantendorProfesionales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profesionales");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaListaProfesionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rut", "Nombre", "Apellido P", "Apellido M", "Direccion", "Telefono", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tablaListaProfesionales);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnGuardarProfesional.setText("Guardar");

        lblRutProfesional.setText("RUT");

        lblNombreProfesional.setText("Nombre");

        txtNombreProfesional.setPreferredSize(new java.awt.Dimension(150, 20));

        lblApellidoPaternoProfesional.setText("Apellido Paterno");

        lblApellidoMaternoProfesional.setText("Apellido Materno");

        lblDireccionProfesional.setText("Direccion");

        lblTelefono.setText("Telefono");

        lblEstado.setText("Estado");

        lblID.setText("ID");

        txtID.setEditable(false);

        btnEditarProfesional.setText("Editar");

        btnActualizarProfesional.setText("Actualizar");

        btnEliminarProfesional.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRutProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblApellidoPaternoProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblApellidoMaternoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(lblDireccionProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRutProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoPaternoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoMaternoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstadoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnEliminarProfesional)
                                        .addComponent(txtDireccionProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEditarProfesional)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarProfesional)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardarProfesional)
                                .addGap(46, 46, 46)
                                .addComponent(btnListar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRutProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRutProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellidoPaternoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtApellidoPaternoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellidoMaternoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoMaternoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccionProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarProfesional)
                    .addComponent(btnActualizarProfesional))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnGuardarProfesional)
                    .addComponent(btnEliminarProfesional))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuArchivoMantenedorProfesionales.setText("Archivo");

        itemMenuInicioMantendorProfesional.setText("Inicio");
        itemMenuInicioMantendorProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuInicioMantendorProfesionalActionPerformed(evt);
            }
        });
        menuArchivoMantenedorProfesionales.add(itemMenuInicioMantendorProfesional);

        itemMenuSalirMantenedorProfesionales.setText("Salir");
        itemMenuSalirMantenedorProfesionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSalirMantenedorProfesionalesActionPerformed(evt);
            }
        });
        menuArchivoMantenedorProfesionales.add(itemMenuSalirMantenedorProfesionales);

        jMenuBar1.add(menuArchivoMantenedorProfesionales);

        menuMantenedoresMantenedorProfesional.setText("Mantenedores");

        itemMenuProfesionalesMantenedorProfesionales.setText("Profesionales");
        itemMenuProfesionalesMantenedorProfesionales.setEnabled(false);
        menuMantenedoresMantenedorProfesional.add(itemMenuProfesionalesMantenedorProfesionales);

        itemMenuClientesMantendorProfesionales.setText("Clientes");
        itemMenuClientesMantendorProfesionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuClientesMantendorProfesionalesActionPerformed(evt);
            }
        });
        menuMantenedoresMantenedorProfesional.add(itemMenuClientesMantendorProfesionales);

        jMenuBar1.add(menuMantenedoresMantenedorProfesional);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuSalirMantenedorProfesionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSalirMantenedorProfesionalesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemMenuSalirMantenedorProfesionalesActionPerformed

    private void itemMenuInicioMantendorProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuInicioMantendorProfesionalActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuInicioMantendorProfesionalActionPerformed

    private void itemMenuClientesMantendorProfesionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuClientesMantendorProfesionalesActionPerformed
        MantenedorClientes mantenedorClientes = new MantenedorClientes();
        mantenedorClientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuClientesMantendorProfesionalesActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { //metodo original
//       java.awt.EventQueue.invokeLater(new Runnable(){
//           public void run(){
//               new Inicio().setVisible(true);
//           }
//       });
        
        
        //Metodo que trabaja controlador
        MantenedorProfesionales m=new MantenedorProfesionales();
        Controlador c = new Controlador(m);
        m.setVisible(true);
//        m.setLocationRelativeTo(m);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarProfesional;
    public javax.swing.JButton btnEditarProfesional;
    public javax.swing.JButton btnEliminarProfesional;
    public javax.swing.JButton btnGuardarProfesional;
    public javax.swing.JButton btnListar;
    private javax.swing.JMenuItem itemMenuClientesMantendorProfesionales;
    private javax.swing.JMenuItem itemMenuInicioMantendorProfesional;
    private javax.swing.JMenuItem itemMenuProfesionalesMantenedorProfesionales;
    private javax.swing.JMenuItem itemMenuSalirMantenedorProfesionales;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public java.awt.Label lblApellidoMaternoProfesional;
    public java.awt.Label lblApellidoPaternoProfesional;
    public java.awt.Label lblDireccionProfesional;
    public java.awt.Label lblEstado;
    public java.awt.Label lblID;
    public java.awt.Label lblNombreProfesional;
    public java.awt.Label lblRutProfesional;
    public java.awt.Label lblTelefono;
    private javax.swing.JMenu menuArchivoMantenedorProfesionales;
    private javax.swing.JMenu menuMantenedoresMantenedorProfesional;
    public javax.swing.JTable tablaListaProfesionales;
    public java.awt.TextField txtApellidoMaternoProfesional;
    public java.awt.TextField txtApellidoPaternoProfesional;
    public java.awt.TextField txtDireccionProfesional;
    public java.awt.TextField txtEstadoProfesional;
    public java.awt.TextField txtID;
    public java.awt.TextField txtNombreProfesional;
    public java.awt.TextField txtRutProfesional;
    public java.awt.TextField txtTelefonoProfesional;
    // End of variables declaration//GEN-END:variables
}
