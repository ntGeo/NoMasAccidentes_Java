package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Geovanni
 */
public class Conexion {
    String url="jdbc:oracle:thin:@localhost:1521:XE";//String de Conexion
    String user="nma6";
    String pass="123"; //Usuario base y contraseña   
    // String Conexion Sebastian
//    String user="SEBASTIAN";
//    String pass="1234"; //Usuario base y contraseña   
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Se ha conectado exitosamente a la BD"); 
        } catch (Exception e) {            
            System.out.println("Error de conexión: " + e.getMessage()); 
        }
        return con;
    }
}