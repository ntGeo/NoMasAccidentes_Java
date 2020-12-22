package Controlador;

import Modelo.Actividad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.DAO.PropuestaDeMejoraDAO;
import Modelo.PropuestaDeMejora;
import Vista.VistaListaPropuestasDeMejora;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ControladorVistaListaPropuestasDeMejora implements ActionListener{
    PropuestaDeMejoraDAO propuestaMejoraDao = new PropuestaDeMejoraDAO();
    PropuestaDeMejora propuestaDeMejora = new PropuestaDeMejora();
    VistaListaPropuestasDeMejora vistaListaPropuestaMejora = new VistaListaPropuestasDeMejora();
    DefaultTableModel modelo= new DefaultTableModel();

    public ControladorVistaListaPropuestasDeMejora(VistaListaPropuestasDeMejora v) {
        this.vistaListaPropuestaMejora= v;
        listarPropuestas(vistaListaPropuestaMejora.tablaPropuestas);
    }
    
  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private void listarPropuestas(JTable tabla) {
        modelo= (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<PropuestaDeMejora>lista= propuestaMejoraDao.listar();
        Object[]object=new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getResponsable();
            object[2]=lista.get(i).getItemDeMejora();
            object[3]=lista.get(i).getFechaEmision();
            modelo.addRow(object);
        }
        vistaListaPropuestaMejora.tablaPropuestas.setModel(modelo);
    }
}
