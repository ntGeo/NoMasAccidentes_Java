package Controlador;

import Modelo.DAO.ProfesionalDAO;
import Modelo.Profesional;
import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.MantenedorProfesionales;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class Controlador implements ActionListener{

    ProfesionalDAO pDao= new ProfesionalDAO();
    Profesional p = new Profesional();
    MantenedorProfesionales mantendorProfesional = new MantenedorProfesionales();
    DefaultTableModel modelo= new DefaultTableModel();
    
    //Constructor clase controlador
    public Controlador(MantenedorProfesionales m){
        this.mantendorProfesional=m;
        this.mantendorProfesional.btnListar.addActionListener(this);
        this.mantendorProfesional.btnGuardarProfesional.addActionListener(this);
        this.mantendorProfesional.btnEditarProfesional.addActionListener(this);
        this.mantendorProfesional.btnActualizarProfesional.addActionListener(this);
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mantendorProfesional.btnListar) {
            limpiarTabla();
            listar(mantendorProfesional.tablaListaProfesionales);
        }
        if (e.getSource()==mantendorProfesional.btnGuardarProfesional) {
            agregar();
            limpiarCamposProfesional();
            limpiarTabla();
            listar(mantendorProfesional.tablaListaProfesionales);
        }
        if (e.getSource()==mantendorProfesional.btnEditarProfesional) {
            int fila= mantendorProfesional.tablaListaProfesionales.getSelectedRow();
            if (fila==-1) {
                JOptionPane.showMessageDialog(mantendorProfesional,"Debe seleccionar una fila");
            }else {
                int id= Integer.parseInt((String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 0).toString());
                String rut= (String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 1);
                String nombre= (String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 2);
                String apellidoP= (String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 3);
                String apellidoM= (String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 4);
                String direccion= (String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 5);
                int telefono= Integer.parseInt((String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 6).toString());
                int estado= Integer.parseInt((String)mantendorProfesional.tablaListaProfesionales.getValueAt(fila, 7).toString());
                mantendorProfesional.txtID.setText(""+id);
                mantendorProfesional.txtRutProfesional.setText(rut);
                mantendorProfesional.txtNombreProfesional.setText(nombre);
                mantendorProfesional.txtApellidoPaternoProfesional.setText(apellidoP);
                mantendorProfesional.txtApellidoMaternoProfesional.setText(apellidoM);
                mantendorProfesional.txtDireccionProfesional.setText(direccion);
                mantendorProfesional.txtTelefonoProfesional.setText(""+telefono);
                mantendorProfesional.txtEstadoProfesional.setText(""+estado);
            }
        }
        if (e.getSource()==mantendorProfesional.btnActualizarProfesional) {
            actualizar();
            limpiarTabla();
            listar(mantendorProfesional.tablaListaProfesionales);
        }
    }
    
    public void actualizar(){
        int id=Integer.parseInt(mantendorProfesional.txtID.getText());
        String rut= mantendorProfesional.txtRutProfesional.getText();
        String nombre= mantendorProfesional.txtNombreProfesional.getText();
        String apellidoP= mantendorProfesional.txtApellidoPaternoProfesional.getText();
        String apellidoM= mantendorProfesional.txtApellidoMaternoProfesional.getText();
        String direccion= mantendorProfesional.txtDireccionProfesional.getText();
        int telefono= Integer.parseInt( mantendorProfesional.txtTelefonoProfesional.getText());
        int estado= Integer.parseInt( mantendorProfesional.txtEstadoProfesional.getText());
        p.setId(id);
        p.setRut(rut);
        p.setNombre(nombre);
        p.setApellidoPaterno(apellidoP);
        p.setApellidoMaterno(apellidoM);
        p.setDireccion(direccion);
        p.setTelefono(telefono);
        p.setEstado(estado);
        int r=pDao.actualizar(p);
        if (r==1) {
            JOptionPane.showMessageDialog(mantendorProfesional, "Profesional ha sido actualizado");
        }else{
            JOptionPane.showMessageDialog(mantendorProfesional, "Error. Profesional no pudo ser actualizado");
        }
    }
    
    //Metodo Agregar
    public void agregar(){
        String rut= mantendorProfesional.txtRutProfesional.getText();
        String nombre= mantendorProfesional.txtNombreProfesional.getText();
        String apellidoP= mantendorProfesional.txtApellidoPaternoProfesional.getText();
        String apellidoM= mantendorProfesional.txtApellidoMaternoProfesional.getText();
        String direccion= mantendorProfesional.txtDireccionProfesional.getText();
        int telefono= Integer.parseInt( mantendorProfesional.txtTelefonoProfesional.getText());
        int estado= Integer.parseInt( mantendorProfesional.txtEstadoProfesional.getText());
        p.setRut(rut);
        p.setNombre(nombre);
        p.setApellidoPaterno(apellidoP);
        p.setApellidoMaterno(apellidoM);
        p.setDireccion(direccion);
        p.setTelefono(telefono);
        p.setEstado(estado);
        int r=pDao.agregar(p);
        if (r==1) {
            JOptionPane.showMessageDialog(mantendorProfesional, "Profesional agregado con exito.");
        }else{
            JOptionPane.showMessageDialog(mantendorProfesional, "Error al agregar Profesional");
        }
    } 
    
    //Metodo Listar
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
        mantendorProfesional.tablaListaProfesionales.setModel(modelo);
    }
    
    //Metodo para limpiar campos
    void limpiarCamposProfesional(){
        mantendorProfesional.txtRutProfesional.setText("");
        mantendorProfesional.txtNombreProfesional.setText("");
        mantendorProfesional.txtApellidoPaternoProfesional.setText("");
        mantendorProfesional.txtApellidoMaternoProfesional.setText("");
        mantendorProfesional.txtDireccionProfesional.setText("");
        mantendorProfesional.txtTelefonoProfesional.setText("");
        mantendorProfesional.txtEstadoProfesional.setText("");
    }
    
    //Metodo para refrescar tabla
    void limpiarTabla(){
        for (int i = 0; i < mantendorProfesional.tablaListaProfesionales.getRowCount(); i++) {
            modelo.removeRow(i);
            i= i-1;
        }
    }
}
