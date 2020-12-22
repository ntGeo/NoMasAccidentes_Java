package Modelo.DAO;

import Modelo.Conexion;
import Vista.VistaLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class UsuarioDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public int validar(String usuario, String contrasena){
        int r=0;
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement("SELECT * FROM USUARIO WHERE nombre='"+usuario+"' AND clave='"+contrasena+"'");
//            rs= ps.executeQuery();
            r=ps.executeUpdate();
            
            if (r==1) {
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    

}

//SELECT * FROM NMA6.USUARIO WHERE nombre='Geovanni' AND clave='g112358'