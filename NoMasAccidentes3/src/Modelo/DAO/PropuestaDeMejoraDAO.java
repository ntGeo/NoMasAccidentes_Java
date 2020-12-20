package Modelo.DAO;

import Modelo.Conexion;
import Modelo.PropuestaDeMejora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Geovanni
 */
public class PropuestaDeMejoraDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    PropuestaDeMejora propuestaMejora= new PropuestaDeMejora();
    
    
    public int agregar(PropuestaDeMejora pm){
        String sql = "INSERT INTO NMA6.PROPUESTA_DE_MEJORA(RESPONSABLE, ITEMDEMEJORA, PROPUESTA, OBSERVACIONES, FECHAEMISION)"
                + " VALUES(?,?,?,?,?)";
        
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement(sql);
            
            ps.setString(1, pm.getResponsable());
            ps.setString(2, pm.getItemDeMejora());
            ps.setString(3, pm.getPropuesta());
            ps.setString(4, pm.getObservaciones());
            ps.setString(5, pm.getFechaEmision());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al insertar caso Popuesta de Mejora");
        }
        
        return 1;
    }
}
