package Modelo.DAO;

import Modelo.Profesional;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geovanni
 */
public class ProfesionalDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
//    Profesional p = new Profesional();
    
    public List listar(){
        List<Profesional>datos= new ArrayList<>();
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement("SELECT * FROM PROFESIONAL");
            rs=ps.executeQuery();
            while (rs.next()) {
                Profesional p = new Profesional();
                p.setId(rs.getInt(1));
                p.setRut(rs.getString(2));
                p.setNombre(rs.getString(3));
                p.setApellidoPaterno(rs.getString(4));
                p.setApellidoMaterno(rs.getString(5));
                p.setDireccion(rs.getString(6));
                p.setTelefono(rs.getInt(7));
                p.setEstado(rs.getInt(8));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
}


