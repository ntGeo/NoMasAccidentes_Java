package Controlador;

import Modelo.DAO.CasoAsesoriaDAO;
import Modelo.CasoAsesoria;
import Vista.VistaPropuestaDeMejora;
import Vista.VistaCasosDeAsesoria;
import Vista.VistaChecklist;
import Vista.VistaFormularioNuevoCasoAsesoria;
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
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== mCA.btnCrearPropuesta) {
            crearPropuesta();
        }
    }
    
    //Lista casos de Asesoria
    private void listarCasosDeAsesoria(JTable tabla){
        modelo= (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<CasoAsesoria>lista= caDAO.listar();
        Object[]object=new Object[8];
        for (int i = 0; i < lista.size(); i++) {
//            object[0]=lista.get(i).getId();
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
            JOptionPane.showMessageDialog(mCA,"Debe seleccionar una actividad");
        }
        else{
            tipo= mCA.tablaCasosAsesoria.getValueAt(fila, 7).toString();
            System.out.println(tipo);
            //Valido si actividad es Visita
            }if ("En proceso".equals(tipo)) 
            {
            int yn=JOptionPane.showConfirmDialog(mCA, "Ha seleccionado un Caso en Proceso, ¿Desea comenzar Propuesta de Mejora?","Inicio de Propuesta",JOptionPane.YES_NO_OPTION);
            
                if (yn== JOptionPane.YES_OPTION) {
                VistaPropuestaDeMejora pm= new VistaPropuestaDeMejora();
                pm.setVisible(true);
                this.mCA.setVisible(false);      
                }else{
                this.mCA.setVisible(true);
                }
            //Validacion si actividad es Asesoria    
            }
    }
}
