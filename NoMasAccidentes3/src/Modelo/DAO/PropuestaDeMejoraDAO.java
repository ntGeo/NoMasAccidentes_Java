package Modelo.DAO;

import Modelo.Actividad;
import Modelo.Conexion;
import Modelo.PropuestaDeMejora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "INSERT INTO PROPUESTA_DE_MEJORA(RESPONSABLE, ITEMDEMEJORA, PROPUESTA, OBSERVACIONES, FECHAEMISION)"
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
    
    public List listar(){
        List<PropuestaDeMejora>datos= new ArrayList<>();
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement("SELECT * FROM PROPUESTA_DE_MEJORA");
            rs=ps.executeQuery();
            while (rs.next()) {
                PropuestaDeMejora pm = new PropuestaDeMejora();
                pm.setId(rs.getInt(1));
                pm.setResponsable(rs.getString(2));
                pm.setItemDeMejora(rs.getString(3));
                pm.setPropuesta(rs.getString(4));
                pm.setObservaciones(rs.getString(5));
                pm.setFechaEmision(rs.getString(6));
                datos.add(pm);
            }
        } catch (Exception e) {
        }
        return datos;
    }
}
