package Controlador;

import Modelo.DAO.ClienteDAO;
import Modelo.Cliente;
import Vista.MantenedorClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class ControladorCliente implements ActionListener{
    
    ClienteDAO cDao= new ClienteDAO();
    Cliente c = new Cliente();
    MantenedorClientes mantenedorClientes = new MantenedorClientes();
    DefaultTableModel modelo= new DefaultTableModel();
    
    public ControladorCliente (MantenedorClientes mc){
        this.mantenedorClientes=mc;
        this.mantenedorClientes.btnListarClientes.addActionListener(this);
        listar(mantenedorClientes.tablaListaClientes);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==mantenedorClientes.btnListarClientes) {
            limpiarTabla();
            listar(mantenedorClientes.tablaListaClientes);
        }
    }
    
    //Metodo Listar que agrega los objetos a lista
    public void listar(JTable tabla){
        modelo= (DefaultTableModel)tabla.getModel();
        tabla.setModel(modelo);
        List<Cliente>lista=cDao.listar();
        Object[]object=new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getRut();
            object[2]=lista.get(i).getRazonSocial();
            object[3]=lista.get(i).getDireccion();
            object[4]=lista.get(i).getEmail();
            object[5]=lista.get(i).getTelefono();
            object[6]=lista.get(i).getEstado();
            object[7]=lista.get(i).getGiro();
            object[8]=lista.get(i).getComunaID();
            modelo.addRow(object);
        }
        mantenedorClientes.tablaListaClientes.setModel(modelo);
    }
    
    //Metodo para refrescar tabla
    void limpiarTabla(){
        for (int i = 0; i < mantenedorClientes.tablaListaClientes.getRowCount(); i++) {
            modelo.removeRow(i);
            i= i-1;
        }
    }
   
}
