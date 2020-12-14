    package Controlador;

import Modelo.DAO.UsuarioDAO;
import Modelo.Usuario;
import Vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class ControladorLogin implements ActionListener{
    
    Usuario usuario = new Usuario();
    UsuarioDAO usuariodao = new UsuarioDAO();
    Login login = new Login();
    
    
    public ControladorLogin(Login log){
    this.login= log;
    this.login.btnIngresar.addActionListener(this);
}
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== login.btnIngresar) {
            credenciales();
            limpiarCampos();
        }
    }
    
//    public int validarIngreso(){
//        String usuario = Login.txtUsuario.getText();
//        String clave = String.valueOf(Login.txtContrasena.getPassword());
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
        
        if (r==1) {
            JOptionPane.showMessageDialog(login, "Bienvenido");
        } else{
            JOptionPane.showMessageDialog(login, "Error. Credenciales no validas");
        }
        
    }
    
  private void limpiarCampos(){
      login.txtUsuario.setText("");
      login.txtContrasena.setText("");
  }
    
}
