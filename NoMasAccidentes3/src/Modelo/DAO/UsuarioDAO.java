package Modelo.DAO;

import Modelo.Conexion;
import Vista.Login;
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
        String sql="SELECT * FROM NMA6.USUARIO WHERE nombre='"+usuario+"' AND clave='"+contrasena+"'";
        
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            if (rs.next()) {
                r =1;
            }else{
                r=0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        return r;
    }

}

//SELECT * FROM NMA6.USUARIO WHERE nombre='Geovanni' AND clave='g112358'