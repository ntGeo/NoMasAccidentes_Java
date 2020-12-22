package Controlador;

import Modelo.DAO.CasoAsesoriaDAO;
import Modelo.CasoAsesoria;
import Vista.VistaFormularioNuevaPropuestaDeMejora;
import Vista.VistaCasosDeAsesoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class ControladorVistaCasosDeAsesoria implements ActionListener{
    CasoAsesoriaDAO caDAO= new CasoAsesoriaDAO();
    CasoAsesoria ca= new CasoAsesoria();
    VistaCasosDeAsesoria mCA= new VistaCasosDeAsesoria();
    DefaultTableModel modelo= new DefaultTableModel();
    
    
    public ControladorVistaCasosDeAsesoria(VistaCasosDeAsesoria i){
        this.mCA=i;
        listarCasosDeAsesoria(mCA.tablaCasosAsesoria);
        this.mCA.btnCrearPropuesta.addActionListener(this);
        this.mCA.btnFinalizar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== mCA.btnCrearPropuesta) {
            crearPropuesta();
        }
        if (e.getSource()==mCA.btnFinalizar){
            finalizarCaso();
            limpiarTabla();
            listarCasosDeAsesoria(mCA.tablaCasosAsesoria);
        }
    }
    
    //Lista casos de Asesoria
    private void listarCasosDeAsesoria(JTable tabla){
        modelo= (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<CasoAsesoria>lista= caDAO.listar();
        Object[]object=new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getResponsable();
            object[2]=lista.get(i).getFechaCreacion();
            object[3]=lista.get(i).getNombreFiscalizador();
            object[4]=lista.get(i).getRutFiscalizador();
            object[5]=lista.get(i).getLugarAccidente();
            object[6]=lista.get(i).getFechaAccidente();
            object[7]=lista.get(i).getEstado();
            modelo.addRow(object);
        }
        mCA.tablaCasosAsesoria.setModel(modelo);
    }

    private void crearPropuesta() {
        int fila = mCA.tablaCasosAsesoria.getSelectedRow();
        String tipo = null;
        if (fila==-1) {
            JOptionPane.showMessageDialog(mCA,"Debe seleccionar un Caso de Asesoria");
        }
        else{
            tipo= mCA.tablaCasosAsesoria.getValueAt(fila, 7).toString();
            }if ("En proceso".equals(tipo)) 
            {
            int yn=JOptionPane.showConfirmDialog(mCA, "Ha seleccionado un Caso en Proceso, ¿Desea comenzar Propuesta de Mejora?","Inicio de Propuesta",JOptionPane.YES_NO_OPTION);
            
                if (yn== JOptionPane.YES_OPTION) {
                VistaFormularioNuevaPropuestaDeMejora pm= new VistaFormularioNuevaPropuestaDeMejora();
                pm.setVisible(true);
                this.mCA.setVisible(false);      
                }else{
                this.mCA.setVisible(true);
                }  
            }
            if ("Finalizado".equals(tipo)) {
            JOptionPane.showMessageDialog(mCA,"Caso se encuentra finalizado, no es posible crear nueva propuesta");
        }
    }
    
    private void finalizarCaso(){
        int fila = mCA.tablaCasosAsesoria.getSelectedRow();
        String tipo= mCA.tablaCasosAsesoria.getValueAt(fila, 7).toString();
        
        if ("En proceso".equals(tipo)) {
            int yn=JOptionPane.showConfirmDialog(mCA, "¿Esta seguro de finalizar Caso de Asesoria?","Finalizar",JOptionPane.YES_NO_OPTION);
            
            if (yn== JOptionPane.YES_OPTION) {
                String id= mCA.tablaCasosAsesoria.getValueAt(fila, 0).toString();
                int id2= Integer.parseInt(id);
                ca.setId(id2);
                
                int r = caDAO.actualizar(id2);
        }else{
            this.mCA.setVisible(true);
        }
       }
    }
    
    void limpiarTabla(){
        for (int i = 0; i < mCA.tablaCasosAsesoria.getRowCount(); i++) {
            modelo.removeRow(i);
            i= i-1;
        }
    }
    
   
}
