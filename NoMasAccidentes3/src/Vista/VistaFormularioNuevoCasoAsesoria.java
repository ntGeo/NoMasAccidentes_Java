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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jLabel1 = new javax.swing.JLabel();
        radioButtonAccidente = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuActividades = new javax.swing.JMenu();
        menuCasosAsesoria = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Caso de Asesoria"));
        jPanel1.setPreferredSize(new java.awt.Dimension(1176, 650));

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
        txtAreaDetalleAccidente.setEnabled(false);
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
        txtLugarAccidente.setEnabled(false);
        txtLugarAccidente.setPreferredSize(new java.awt.Dimension(200, 22));

        jDateChooser2.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Debe indicar si asesoria es por accidente (?)");
        jLabel1.setToolTipText("El tipo de caso define los campos a completar para su registro");

        radioButtonAccidente.setText("Accidente");
        radioButtonAccidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonAccidenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreFiscalizador)
                            .addComponent(lblRutFiscalizador)
                            .addComponent(lblLugarAccidente)
                            .addComponent(lblFechaAccidente)
                            .addComponent(lblFechaCreacion)
                            .addComponent(lblResponsable))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLugarAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRutFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDetalleCaso)
                                    .addComponent(lblDetalleAccidente))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(radioButtonAccidente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radioButtonAccidente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblDetalleCaso)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblDetalleAccidente)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblResponsable))
                            .addComponent(txtResponsable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaCreacion))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreFiscalizador)
                            .addComponent(txtNombreFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRutFiscalizador)
                            .addComponent(txtRutFiscalizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLugarAccidente)
                            .addComponent(txtLugarAccidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaAccidente)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
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

    private void radioButtonAccidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonAccidenteActionPerformed
        if (radioButtonAccidente.isSelected()) {
            txtLugarAccidente.setEnabled(true);
            txtAreaDetalleAccidente.setEnabled(true);
            jDateChooser2.setEnabled(true);
        }else{
            txtLugarAccidente.setEnabled(false);
            txtAreaDetalleAccidente.setEnabled(false);
            jDateChooser2.setEnabled(false);
            
            txtLugarAccidente.setText("");
            txtAreaDetalleAccidente.setText("");
            jDateChooser2.setCalendar(null);
        }
    }//GEN-LAST:event_radioButtonAccidenteActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    public com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
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
    public javax.swing.JRadioButton radioButtonAccidente;
    public javax.swing.JTextArea txtAreaDetalleAccidente;
    public javax.swing.JTextArea txtAreaDetalleCaso;
    public javax.swing.JTextField txtLugarAccidente;
    public javax.swing.JTextField txtNombreFiscalizador;
    public javax.swing.JTextField txtResponsable;
    public javax.swing.JTextField txtRutFiscalizador;
    // End of variables declaration//GEN-END:variables
}
