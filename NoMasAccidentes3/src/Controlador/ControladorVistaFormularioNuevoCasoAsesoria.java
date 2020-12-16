package Controlador;

import Modelo.CasoAsesoria;
import Modelo.DAO.CasoAsesoriaDAO;
import Vista.VistaFormularioNuevoCasoAsesoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class ControladorVistaFormularioNuevoCasoAsesoria implements ActionListener{
    CasoAsesoriaDAO caDao = new CasoAsesoriaDAO();
    CasoAsesoria ca = new CasoAsesoria();
    VistaFormularioNuevoCasoAsesoria vistaFormulario = new VistaFormularioNuevoCasoAsesoria();
    DefaultTableModel modelo= new DefaultTableModel();

    public ControladorVistaFormularioNuevoCasoAsesoria(VistaFormularioNuevoCasoAsesoria v){
        this.vistaFormulario=v;
        this.vistaFormulario.btnGuardar.addActionListener(this);
    }
            
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==vistaFormulario.btnGuardar) {
            guardar();
        }
    }

    private void guardar() {
        String responsable = vistaFormulario.txtResponsable.getText();
        Date fechaCreacion = Date.valueOf(vistaFormulario.txtFechaCreacion.getText());
        String nombreFiscalizador = vistaFormulario.txtNombreFiscalizador.getText();
        String rutFiscalizador = vistaFormulario.txtRutFiscalizador.getText();
        String lugarAccidente = vistaFormulario.txtLugarAccidente.getText();
        Date fechaAccidente = Date.valueOf(vistaFormulario.txtFechaAccidente.getText());
        String detalleAccidente = vistaFormulario.txtAreaDetalleAccidente.getText();
        String detalleCaso = vistaFormulario.txtAreaDetalleCaso.getText();
        ca.setResponsable(responsable);
        ca.setFechaCreacion(fechaCreacion);
        ca.setNombreFiscalizador(nombreFiscalizador);
        ca.setRutFiscalizador(rutFiscalizador);
        ca.setLugarAccidente(lugarAccidente);
        ca.setFechaAccidente(fechaAccidente);
        ca.setDetalleAccidente(detalleAccidente);
        ca.setDetalleCaso(detalleCaso);
        int r = caDao.agregar(ca);
        
        if (r==1) {
            JOptionPane.showMessageDialog(vistaFormulario, "Cliente agregado con exito.");
        }else{
            JOptionPane.showMessageDialog(vistaFormulario, "Error al agregar Cliente.");
        }
    }
}
