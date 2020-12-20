package Controlador;

import Modelo.DAO.CasoAsesoriaDAO;
import Modelo.CasoAsesoria;
import Vista.VistaActividades;
import Vista.VistaCasosDeAsesoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
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
}
