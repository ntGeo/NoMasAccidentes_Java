package Controlador;

import Modelo.Actividad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.DAO.ActividadDAO;
import Vista.IniciarActividad;
import Vista.Inicio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class ControladorInicio implements ActionListener{
    ActividadDAO aDao = new ActividadDAO();
    Actividad a = new Actividad();
    Inicio inicio = new Inicio();
    DefaultTableModel modelo= new DefaultTableModel();
    

    public ControladorInicio(Inicio i){
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
    
    private void iniciarActividad(){
        int fila = inicio.tablaActividades.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(inicio,"Debe seleccionar una actividad");
        }else{
            JOptionPane.showMessageDialog(inicio,"Se iniciará actividad");
            IniciarActividad ia= new IniciarActividad();
            ia.setVisible(true);
            this.inicio.setVisible(false);
        }
    }
    
}