/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorVistaFormularioNuevoCasoAsesoria;
import javax.swing.ImageIcon;

/**
 *
 * @author Geovanni
 */
public class VistaFormularioNuevoCasoAsesoria extends javax.swing.JFrame {

    /**
     * Creates new form IniciarCasoAsesoria
     */
    public VistaFormularioNuevoCasoAsesoria() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblResponsable = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        lblFechaCreacion = new javax.swing.JLabel();
        lblNombreFiscalizador = new javax.swing.JLabel();
        lblRutFiscalizador = new javax.swing.JLabel();
        lblLugarAccidente = new javax.swing.JLabel();
        lblFechaAccidente = new javax.swing.JLabel();
        lblDetalleAccidente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDetalleAccidente = new javax.swing.JTextArea();
        lblDetalleCaso = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDetalleCaso = new javax.swing.JTextArea();
        txtNombreFiscalizador = new javax.swing.JTextField();
        txtRutFiscalizador = new javax.swing.JTextField();
        txtLugarAccidente = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuActividades = new javax.swing.JMenu();
        menuCasosAsesoria = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Caso de Asesoria"));

        lblResponsable.setText("Responsable(*)");

        txtResponsable.setMinimumSize(new java.awt.Dimension(100, 22));
        txtResponsable.setPreferredSize(new java.awt.Dimension(200, 22));

        lblFechaCreacion.setText("Fecha de Creacion(*)");

        lblNombreFiscalizador.setText("Nombre Fiscalizador(*)");

        lblRutFiscalizador.setText("Rut Fiscalizador(*)");

        lblLugarAccidente.setText("Lugar de Accidente");

        lblFechaAccidente.setText("Fecha de Accidente");

        lblDetalleAccidente.setText("Detalle Accidente");

        txtAreaDetalleAccidente.setColumns(20);
        txtAreaDetalleAccidente.setRows(5);
        txtAreaDetalleAccidente.setPreferredSize(new java.awt.Dimension(164, 100));
        jScrollPane1.setViewportView(txtAreaDetalleAccidente);

        lblDetalleCaso.setText("Detalle de Caso(*)");

        txtAreaDetalleCaso.setColumns(20);
        txtAreaDetalleCaso.setRows(5);
        txtAreaDetalleCaso.setPreferredSize(new java.awt.Dimension(164, 100));
        jScrollPane2.setViewportView(txtAreaDetalleCaso);

        txtNombreFiscalizador.setMinimumSize(new java.awt.Dimension(200, 22));
        txtNombreFiscalizador.setPreferredSize(new java.awt.Dimension(200, 22));

        txtRutFiscalizador.setPreferredSize(new java.awt.Dimension(200, 22));

        txtLugarAccidente.setToolTipText("");
        txtLugarAccidente.setPreferredSize(new java.awt.Dimension(200, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreFiscalizador)
                    .addComponent(lblRutFiscalizador)
                    .addComponent(lblLugarAccidente)
                    .addComponent(lblFechaAccidente)
                    .addComponent(lblFechaCreacion)
                    .addComponent(lblResponsable))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLugarAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRutFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetalleAccidente)
                            .addComponent(lblDetalleCaso))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblResponsable)
                                .addGap(26, 26, 26)
                                .addComponent(lblFechaCreacion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreFiscalizador)
                            .addComponent(txtNombreFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRutFiscalizador)
                            .addComponent(txtRutFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLugarAccidente)
                            .addComponent(txtLugarAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaAccidente)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblDetalleAccidente)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lblDetalleCaso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        menuActividades.setText("Actividades");
        menuActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuActividadesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuActividades);

        menuCasosAsesoria.setText("Casos de Asesoria");
        menuCasosAsesoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCasosAsesoriaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuCasosAsesoria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuActividadesMouseClicked
       VistaActividades i = new VistaActividades();
       i.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_menuActividadesMouseClicked

    private void menuCasosAsesoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCasosAsesoriaMouseClicked
        VistaCasosDeAsesoria cda= new VistaCasosDeAsesoria();
        cda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuCasosAsesoriaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ControladorVistaFormularioNuevoCasoAsesoria cnca = new ControladorVistaFormularioNuevoCasoAsesoria(this);
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaFormularioNuevoCasoAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioNuevoCasoAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioNuevoCasoAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFormularioNuevoCasoAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaFormularioNuevoCasoAsesoria().setVisible(true);
//            }
//        });
        VistaFormularioNuevoCasoAsesoria nca = new VistaFormularioNuevoCasoAsesoria();
        ControladorVistaFormularioNuevoCasoAsesoria cnca = new ControladorVistaFormularioNuevoCasoAsesoria(nca);
        nca.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    public com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblDetalleAccidente;
    public javax.swing.JLabel lblDetalleCaso;
    public javax.swing.JLabel lblFechaAccidente;
    public javax.swing.JLabel lblFechaCreacion;
    public javax.swing.JLabel lblLugarAccidente;
    public javax.swing.JLabel lblNombreFiscalizador;
    public javax.swing.JLabel lblResponsable;
    public javax.swing.JLabel lblRutFiscalizador;
    public javax.swing.JMenu menuActividades;
    public javax.swing.JMenu menuCasosAsesoria;
    public javax.swing.JTextArea txtAreaDetalleAccidente;
    public javax.swing.JTextArea txtAreaDetalleCaso;
    public javax.swing.JTextField txtLugarAccidente;
    public javax.swing.JTextField txtNombreFiscalizador;
    public javax.swing.JTextField txtResponsable;
    public javax.swing.JTextField txtRutFiscalizador;
    // End of variables declaration//GEN-END:variables
}
