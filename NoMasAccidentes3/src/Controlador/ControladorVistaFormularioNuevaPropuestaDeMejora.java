package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.DAO.PropuestaDeMejoraDAO;
import Modelo.PropuestaDeMejora;
import Vista.VistaFormularioNuevaPropuestaDeMejora;
import Vista.VistaListaPropuestasDeMejora;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class ControladorVistaFormularioNuevaPropuestaDeMejora implements ActionListener{
    PropuestaDeMejoraDAO pDao = new PropuestaDeMejoraDAO();
    PropuestaDeMejora p = new PropuestaDeMejora();
    VistaFormularioNuevaPropuestaDeMejora vistaPropuesta = new VistaFormularioNuevaPropuestaDeMejora();

    public ControladorVistaFormularioNuevaPropuestaDeMejora(VistaFormularioNuevaPropuestaDeMejora v) {
        this.vistaPropuesta=v;
        this.vistaPropuesta.btnGuardar.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()== vistaPropuesta.btnGuardar) {
            guardar();
            limpiar();
        }
    }

    //Metodo para guardar propuesta
    private void guardar() {
        String responsable = vistaPropuesta.txtResponsable.getText();
        String itemDeMejora = vistaPropuesta.txtItemMejora.getText();
        String propuesta = vistaPropuesta.txtAreaPropuesta.getText();
        String observaciones = vistaPropuesta.txtAreaObservaciones.getText();
        String fechaEmision = vistaPropuesta.txtFechaActual.getText();
        
        p.setResponsable(responsable);
        p.setItemDeMejora(itemDeMejora);
        p.setPropuesta(propuesta);
        p.setObservaciones(observaciones);
        p.setFechaEmision(fechaEmision);
        System.out.println("Seteo de campos");
        
        int r = pDao.agregar(p);
        if (r==1) {
            JOptionPane.showMessageDialog(vistaPropuesta, "Propuesta de Mejora creada con exito.");
        }else{
            JOptionPane.showMessageDialog(vistaPropuesta, "No es posible guardar Propuesta de Mejora");
        }
        
        VistaListaPropuestasDeMejora vlpm = new VistaListaPropuestasDeMejora();
        vlpm.setVisible(true);
        this.vistaPropuesta.setVisible(false);
    }

    // Metodo para limpiar campos
    private void limpiar() {
        vistaPropuesta.txtResponsable.setText("");
        vistaPropuesta.txtItemMejora.setText("");
        vistaPropuesta.txtAreaPropuesta.setText("");
        vistaPropuesta.txtAreaObservaciones.setText("");
    }
    
    
    
}
