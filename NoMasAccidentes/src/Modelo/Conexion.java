package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Geovanni
 */
public class Conexion {
    String url="jdbc:oracle:thin:@localhost:1521:XE";
    String user="NMA6",pass="123";    
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {            
            System.out.println("Error de conexión: " + e.getMessage()); 
        }
        return con;
    }
}

//Connection con;
//    String url = "jdbc:oracle:thin:@localhost:1521:XE";
//    String user = "NMA3";
//    String pass = "geo112358";


//public class Conexion {
//    
//    Connection con;
//    String url = "jdbc:oracle:thin:@localhost:1521:XE";
//    String user = "NMA3";
//    String pass = "geo112358";
//
//    public Connection conectar() {
//
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            con = DriverManager.getConnection(url, user, pass);
//            System.out.println("Se ha conectado exitosamente a la BD"); 
//            
//        } catch (Exception e) {
//            System.out.println("Error de conexión: " + e.getMessage()); 
//        }
//        return con;
//    }
//}