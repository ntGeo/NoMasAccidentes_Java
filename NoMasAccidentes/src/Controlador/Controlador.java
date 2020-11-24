package Controlador;

import Modelo.DAO.ProfesionalDAO;
import Modelo.Profesional;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Inicio;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class Controlador implements ActionListener{

    ProfesionalDAO pDao= new ProfesionalDAO();
    Profesional p = new Profesional();
    Inicio vista = new Inicio();
    DefaultTableModel modelo= new DefaultTableModel();
    
    public Controlador(Inicio i){
        this.vista=i;
        this.vista.btnListar.addActionListener(this);
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnListar) {
            listar(vista.tablaListaProfesionales);
        }
    }
    
    public void listar(JTable tabla){
        modelo= (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Profesional>lista= pDao.listar();
        Object[]object=new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getRut();
            object[2]=lista.get(i).getNombre();
            object[3]=lista.get(i).getApellidoPaterno();
            object[4]=lista.get(i).getApellidoMaterno();
            object[5]=lista.get(i).getDireccion();
            object[6]=lista.get(i).getTelefono();
            object[7]=lista.get(i).getEstado();
            modelo.addRow(object);
        }
//        vista.tablaListaProfesionales.setModel(modelo);
    }
    
}
