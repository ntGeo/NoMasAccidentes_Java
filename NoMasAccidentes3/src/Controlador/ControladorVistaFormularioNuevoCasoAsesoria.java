package Controlador;

import Modelo.CasoAsesoria;
import Modelo.DAO.CasoAsesoriaDAO;
import Vista.VistaCasosDeAsesoria;
import Vista.VistaFormularioNuevoCasoAsesoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
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
            limpiarCampos();
        }
    }
    

    private void guardar() {
        if (validarResponsable()==true && validarNombreFiscalizador()== true && validarFechaCreacion()==true && validarRut()==true && validarDetalleCaso()==true) {
        int dia, mes, anio;
        dia= vistaFormulario.jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes= vistaFormulario.jDateChooser1.getCalendar().get(Calendar.MONTH);
        anio= vistaFormulario.jDateChooser1.getCalendar().get(Calendar.YEAR);
        String fechaCreacion= dia+"/"+mes+"/"+anio;
        
         int dia2, mes2, anio2;
        dia2= vistaFormulario.jDateChooser2.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes2= vistaFormulario.jDateChooser2.getCalendar().get(Calendar.MONTH);
        anio2= vistaFormulario.jDateChooser2.getCalendar().get(Calendar.YEAR);
        String fechaAccidente= dia2+"/"+mes2+"/"+anio2;
        
        String responsable = vistaFormulario.txtResponsable.getText();
        String nombreFiscalizador = vistaFormulario.txtNombreFiscalizador.getText();
        String rutFiscalizador = vistaFormulario.txtRutFiscalizador.getText();
        String lugarAccidente = vistaFormulario.txtLugarAccidente.getText();
        String detalleAccidente = vistaFormulario.txtAreaDetalleAccidente.getText();
        String detalleCaso = vistaFormulario.txtAreaDetalleCaso.getText();
        String estado= "En proceso";
        
        ca.setResponsable(responsable);
        ca.setFechaCreacion(fechaCreacion);
        ca.setNombreFiscalizador(nombreFiscalizador);
        ca.setRutFiscalizador(rutFiscalizador);
        ca.setLugarAccidente(lugarAccidente);
        ca.setDetalleAccidente(detalleAccidente);
        ca.setFechaAccidente(fechaAccidente);
        ca.setDetalleCaso(detalleCaso);
        ca.setEstado(estado);
        
        int r = caDao.agregar(ca);
        if (r==1) {
            JOptionPane.showMessageDialog(vistaFormulario, "Caso de Asesoria agregado con exito.");
            VistaCasosDeAsesoria vca = new VistaCasosDeAsesoria();
            vca.setVisible(true);
            this.vistaFormulario.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(vistaFormulario, "No es posible agregar Caso de Asesoria");
        }
        }
        
        
        
        
    }
    
    private void limpiarCampos(){
        vistaFormulario.txtResponsable.setText("");
        vistaFormulario.txtNombreFiscalizador.setText("");
        vistaFormulario.txtRutFiscalizador.setText("");
        vistaFormulario.txtLugarAccidente.setText("");
        vistaFormulario.txtAreaDetalleAccidente.setText("");
        vistaFormulario.txtAreaDetalleCaso.setText("");
        vistaFormulario.jDateChooser1.setCalendar(null);
        vistaFormulario.jDateChooser2.setCalendar(null);
    }
    
    private boolean validarResponsable(){
        if (vistaFormulario.txtResponsable.getText().length()<1) {
            JOptionPane.showMessageDialog(vistaFormulario, "Debe completar campo Responsable");
            limpiarCampos();
            return false;
        }else{
            return true;
        }
    }
    
    private boolean validarNombreFiscalizador(){
        if (vistaFormulario.txtNombreFiscalizador.getText().length()<1) {
            JOptionPane.showMessageDialog(vistaFormulario, "Debe completar campo Nombre Fiscalizador");
            limpiarCampos();
            return false;
        }else{
            return true;
        }
    }
    
    private boolean validarFechaCreacion(){
        if (vistaFormulario.jDateChooser1.getDate()==null) {
            JOptionPane.showMessageDialog(vistaFormulario, "Debe selecciona fecha de Creacion");
            return false;
        }else{
            return true;
        }
    }
    
    private boolean validarRut() {
        if (vistaFormulario.txtRutFiscalizador.getText().length()<1) {
            JOptionPane.showMessageDialog(vistaFormulario, "Debe completar ingresar Rut de Fiscalizador");
            limpiarCampos();
            return false;
        }else{
            return true;
        }
    
    }
    
    private boolean validarDetalleCaso(){
        if (vistaFormulario.txtAreaDetalleCaso.getText().length()<1) {
            JOptionPane.showMessageDialog(vistaFormulario, "Debe completar campo Detalle de Caso");
            limpiarCampos();
            return false;
        }
        return true;
    }


}
