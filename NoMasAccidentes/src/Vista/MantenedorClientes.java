/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCliente;
import Controlador.ControladorProfesional;

/**
 *
 * @author Geovanni
 */
public class MantenedorClientes extends javax.swing.JFrame {

    /**
     * Creates new form MantenedorClientes
     */
    public MantenedorClientes() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaClientes = new javax.swing.JTable();
        btnListarClientes = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        lblIDCliente = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblRazonSocialCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblCorreoCliente = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        lblEstadoCliente = new javax.swing.JLabel();
        lblGiroCliente = new javax.swing.JLabel();
        txtIDCliente = new java.awt.TextField();
        txtRutCliente = new java.awt.TextField();
        txtRazonSocialCliente = new java.awt.TextField();
        txtDireccionCliente = new java.awt.TextField();
        txtCorreoCliente = new java.awt.TextField();
        txtTelefonoCliente = new java.awt.TextField();
        txtEstadoCliente = new java.awt.TextField();
        txtGiroCliente = new java.awt.TextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivoMantenedorClientes = new javax.swing.JMenu();
        itemMenuInicioMantenedorClientes = new javax.swing.JMenuItem();
        itemMenuSalirMantenedorClientes = new javax.swing.JMenuItem();
        menuMantenedoresMantenedorClientes = new javax.swing.JMenu();
        itemMenuProfesionalesMantenedorClientes = new javax.swing.JMenuItem();
        itemMenuClientesMantenedorClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        tablaListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Rut", "Razon Social", "Direccion", "Email", "Telefono", "Estado", "Giro", "Comuna"
            }
        ));
        jScrollPane1.setViewportView(tablaListaClientes);

        btnListarClientes.setText("Listar");
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        btnActualizarCliente.setText("Actualizar");

        btnEditarCliente.setText("Editar");

        btnGuardarCliente.setText("Guardar");

        btnEliminarCliente.setText("Eliminar");

        lblIDCliente.setText("ID");

        lblRut.setText("Rut");

        lblRazonSocialCliente.setText("Razon Social");

        lblDireccionCliente.setText("Direccion");

        lblCorreoCliente.setText("Correo");

        lblTelefonoCliente.setText("Telefono");

        lblEstadoCliente.setText("Estado");

        lblGiroCliente.setText("Giro");

        menuArchivoMantenedorClientes.setText("Archivo");

        itemMenuInicioMantenedorClientes.setText("Inicio");
        itemMenuInicioMantenedorClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuInicioMantenedorClientesActionPerformed(evt);
            }
        });
        menuArchivoMantenedorClientes.add(itemMenuInicioMantenedorClientes);

        itemMenuSalirMantenedorClientes.setText("Salir");
        itemMenuSalirMantenedorClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSalirMantenedorClientesActionPerformed(evt);
            }
        });
        menuArchivoMantenedorClientes.add(itemMenuSalirMantenedorClientes);

        jMenuBar1.add(menuArchivoMantenedorClientes);

        menuMantenedoresMantenedorClientes.setText("Mantenedores");

        itemMenuProfesionalesMantenedorClientes.setText("Profesionales");
        itemMenuProfesionalesMantenedorClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuProfesionalesMantenedorClientesActionPerformed(evt);
            }
        });
        menuMantenedoresMantenedorClientes.add(itemMenuProfesionalesMantenedorClientes);

        itemMenuClientesMantenedorClientes.setText("Clientes");
        itemMenuClientesMantenedorClientes.setEnabled(false);
        menuMantenedoresMantenedorClientes.add(itemMenuClientesMantenedorClientes);

        jMenuBar1.add(menuMantenedoresMantenedorClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarCliente)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRazonSocialCliente)
                            .addComponent(lblDireccionCliente)
                            .addComponent(lblCorreoCliente)
                            .addComponent(lblTelefonoCliente)
                            .addComponent(lblEstadoCliente)
                            .addComponent(lblGiroCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRazonSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIDCliente)
                                    .addComponent(lblRut))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarCliente)))
                        .addGap(94, 94, 94)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblIDCliente)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblRut)
                                                        .addGap(14, 14, 14)
                                                        .addComponent(lblRazonSocialCliente))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtRutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(30, 30, 30))
                                                    .addComponent(txtRazonSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lblDireccionCliente))
                                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCorreoCliente))
                                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefonoCliente))
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblEstadoCliente))
                    .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGiroCliente)
                    .addComponent(txtGiroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarCliente)
                    .addComponent(btnEditarCliente))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarClientes)
                    .addComponent(btnGuardarCliente)
                    .addComponent(btnEliminarCliente))
                .addGap(78, 78, 78))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuSalirMantenedorClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSalirMantenedorClientesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemMenuSalirMantenedorClientesActionPerformed

    private void itemMenuInicioMantenedorClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuInicioMantenedorClientesActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuInicioMantenedorClientesActionPerformed

    private void itemMenuProfesionalesMantenedorClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuProfesionalesMantenedorClientesActionPerformed
        MantenedorProfesionales m = new MantenedorProfesionales();
        ControladorProfesional c = new ControladorProfesional(m);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itemMenuProfesionalesMantenedorClientesActionPerformed

    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MantenedorClientes m=new MantenedorClientes();
        ControladorCliente c = new ControladorCliente(m);
        m.setVisible(true);
        m.setLocationRelativeTo(m);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarCliente;
    public javax.swing.JButton btnEditarCliente;
    public javax.swing.JButton btnEliminarCliente;
    public javax.swing.JButton btnGuardarCliente;
    public javax.swing.JButton btnListarClientes;
    private javax.swing.JMenuItem itemMenuClientesMantenedorClientes;
    private javax.swing.JMenuItem itemMenuInicioMantenedorClientes;
    private javax.swing.JMenuItem itemMenuProfesionalesMantenedorClientes;
    private javax.swing.JMenuItem itemMenuSalirMantenedorClientes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblCorreoCliente;
    public javax.swing.JLabel lblDireccionCliente;
    public javax.swing.JLabel lblEstadoCliente;
    public javax.swing.JLabel lblGiroCliente;
    public javax.swing.JLabel lblIDCliente;
    public javax.swing.JLabel lblRazonSocialCliente;
    public javax.swing.JLabel lblRut;
    public javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JMenu menuArchivoMantenedorClientes;
    private javax.swing.JMenu menuMantenedoresMantenedorClientes;
    public javax.swing.JTable tablaListaClientes;
    public java.awt.TextField txtCorreoCliente;
    public java.awt.TextField txtDireccionCliente;
    public java.awt.TextField txtEstadoCliente;
    public java.awt.TextField txtGiroCliente;
    public java.awt.TextField txtIDCliente;
    public java.awt.TextField txtRazonSocialCliente;
    public java.awt.TextField txtRutCliente;
    public java.awt.TextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
