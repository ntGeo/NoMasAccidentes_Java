package Controlador;

import Modelo.Actividad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.DAO.ActividadDAO;
import Vista.VistaChecklist;
import Vista.VistaFormularioNuevoCasoAsesoria;
import Vista.VistaActividades;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class ControladorVistaActividades implements ActionListener{
    ActividadDAO aDao = new ActividadDAO();
    Actividad a = new Actividad();
    VistaActividades inicio = new VistaActividades();
    DefaultTableModel modelo= new DefaultTableModel();
    

    public ControladorVistaActividades(VistaActividades i){
        this.inicio=i;
        listarActividades(inicio.tablaActividades);
        this.inicio.btnIniciarActividad.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== inicio.btnIniciarActividad) {
            iniciarActividad();
        }
    }

    // Metodo que lista todas las actividades
    private void listarActividades(JTable tabla) {
        modelo= (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Actividad>lista= aDao.listar();
        Object[]object=new Object[10];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getTipo();
            object[2]=lista.get(i).getDescripcion();
            object[3]=lista.get(i).getDetalle();
            object[4]=lista.get(i).getFechaInicio();
            object[5]=lista.get(i).getFechaTermino();
            object[6]=lista.get(i).getLugar();
            object[7]=lista.get(i).getParticipante();
            object[8]=lista.get(i).getRecurso();
            object[9]=lista.get(i).getEstado();
            modelo.addRow(object);
        }
        inicio.tablaActividades.setModel(modelo);
    }
    
    //Metodo que controla los inicios de actividades
    private void iniciarActividad(){
        int fila = inicio.tablaActividades.getSelectedRow();
        String tipo = null;
        String estado =null;
        if (fila==-1) {
            JOptionPane.showMessageDialog(inicio,"Debe seleccionar una actividad");
        }
        else{
            tipo= inicio.tablaActividades.getValueAt(fila, 1).toString();
            estado= inicio.tablaActividades.getValueAt(fila,9).toString();
            //Valido si actividad es Visita
            }if ("Visita".equals(tipo)&& "En Proceso".equals(estado)) 
            {
            int yn=JOptionPane.showConfirmDialog(inicio, "Ha seleccionado una Actividad de Tipo Visita, ¿Desea comenzar checklist?","Inicio de Actividad",JOptionPane.YES_NO_OPTION);
            
                if (yn== JOptionPane.YES_OPTION) {
                VistaChecklist ia= new VistaChecklist();
                ia.setVisible(true);
                this.inicio.setVisible(false);      
                }else{
                this.inicio.setVisible(true);
                }
            //Validacion si actividad es Asesoria   
                
            }if ("Asesoria".equals(tipo)&& "En Proceso".equals(estado)) 
            {
            int yn2=JOptionPane.showConfirmDialog(inicio, "Ha seleccionado una Actividad de Tipo Asesoria, ¿Desea crear Caso de Asesoria?","Inicio de Actividad",JOptionPane.YES_NO_OPTION);
            
                if (yn2== JOptionPane.YES_OPTION) {
                    VistaFormularioNuevoCasoAsesoria ica= new VistaFormularioNuevoCasoAsesoria();
                    ica.setVisible(true);
                    this.inicio.setVisible(false);
                }else{
                this.inicio.setVisible(true);    
                }
            }if ("Finalizada".equals(estado)) 
            {
              JOptionPane.showMessageDialog(inicio,"Actividad Finalizada, no es posible iniciar");
            
        }
        
    }
}
    

