/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorVistaCasosDeAsesoria;
import javax.swing.ImageIcon;

/**
 *
 * @author Geovanni
 */
public class VistaCasosDeAsesoria extends javax.swing.JFrame {

    /**
     * Creates new form CasosDeAsesoria
     */
    public VistaCasosDeAsesoria() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCasosAsesoria = new javax.swing.JTable();
        btnCrearPropuesta = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuActividades = new javax.swing.JMenu();
        menuCasosASesoria = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Casos de Asesoria"));

        tablaCasosAsesoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Responsable", "Fecha Creacion", "Fiscalizador", "Rut Fiscalizador", "Lugar de Accidente", "Fecha Accidente", "Estado"
            }
        ));
        tablaCasosAsesoria.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaCasosAsesoriaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tablaCasosAsesoria);

        btnCrearPropuesta.setText("Crear Propuesta");

        btnFinalizar.setText("Marcar Como Finalizada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearPropuesta)
                        .addGap(31, 31, 31)
                        .addComponent(btnFinalizar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPropuesta)
                    .addComponent(btnFinalizar))
                .addContainerGap())
        );

        menuActividades.setText("Actividades");
        menuActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuActividadesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuActividades);

        menuCasosASesoria.setText("Casos de Asesoria");
        menuCasosASesoria.setEnabled(false);
        jMenuBar1.add(menuCasosASesoria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaCasosAsesoriaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaCasosAsesoriaAncestorAdded
        ControladorVistaCasosDeAsesoria cca = new ControladorVistaCasosDeAsesoria(this);
    }//GEN-LAST:event_tablaCasosAsesoriaAncestorAdded

    private void menuActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuActividadesMouseClicked
       VistaActividades i = new VistaActividades();
       i.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_menuActividadesMouseClicked

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
            java.util.logging.Logger.getLogger(VistaCasosDeAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCasosDeAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCasosDeAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCasosDeAsesoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaCasosDeAsesoria().setVisible(true);
//            }
//        });

        VistaCasosDeAsesoria ca= new VistaCasosDeAsesoria();
        ControladorVistaCasosDeAsesoria cca= new ControladorVistaCasosDeAsesoria(ca);
        ca.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearPropuesta;
    public javax.swing.JButton btnFinalizar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JMenu menuActividades;
    public javax.swing.JMenu menuCasosASesoria;
    public javax.swing.JTable tablaCasosAsesoria;
    // End of variables declaration//GEN-END:variables
}
