    package Controlador;

import Modelo.DAO.UsuarioDAO;
import Modelo.Usuario;
import Vista.VistaActividades;
import Vista.VistaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class ControladorVistaLogin implements ActionListener{
    
    Usuario usuario = new Usuario();
    UsuarioDAO usuariodao = new UsuarioDAO();
    VistaLogin login = new VistaLogin();
    
    
    public ControladorVistaLogin(VistaLogin log){
    this.login= log;
    this.login.btnIngresar.addActionListener(this);
}
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== login.btnIngresar) {
            credenciales();
        }
    }
    
//    public int validarIngreso(){
//        String usuario = VistaLogin.txtUsuario.getText();
//        String clave = String.valueOf(VistaLogin.txtContrasena.getPassword());
//        
//        int resultado =0;
//        String sql="SELECT * FROM usuario WHERE usuario='"+usuario+"' AND clave=sha1('"+clave+"')";
//        
//
//        
//    }

    private void credenciales() {
        String nombreUsuario=login.txtUsuario.getText();
        String contrasena =login.txtContrasena.toString();
        int r=usuariodao.validar(nombreUsuario, contrasena);
        
        if (validacionCorreo()==true && validacionContrasena()==true) {
            if (r==0) {
//            JOptionPane.showMessageDialog(login, "Bienvenido");
            VistaActividades i = new VistaActividades();
            i.setVisible(true);
            this.login.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(login, "Error al intentar ingresar");
            limpiarCampos();
        }
      }
    }
    
  private void limpiarCampos(){
      login.txtUsuario.setText("");
      login.txtContrasena.setText("");
  }
  
  private boolean validacionCorreo(){
      if (login.txtUsuario.getText().length()> 0) {
          return true;
      }else{
          JOptionPane.showMessageDialog(login, "Debe ingresar Correo de Usuario");
          limpiarCampos();
          return false;
      }
  }
  
  private boolean validacionContrasena(){
      if (login.txtContrasena.getText().length()> 0) {
          return true;
      }else{
          JOptionPane.showMessageDialog(login, "Debe ingresar Contrsaeña");
          limpiarCampos();
          return false;
      }
  }
    
}
