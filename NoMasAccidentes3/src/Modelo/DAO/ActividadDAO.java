package Modelo.DAO;

import Modelo.Actividad;
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
public class ActividadDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Actividad actividad = new Actividad();
    
    //Metodo para listar Actividades en Tabla
    public List listar(){
        List<Actividad>datos= new ArrayList<>();
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement("SELECT * FROM ACTIVIDAD");
            rs=ps.executeQuery();
            while (rs.next()) {
                Actividad p = new Actividad();
                p.setId(rs.getInt(1));
                p.setTipo(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setDetalle(rs.getString(4));
                p.setFechaInicio(rs.getDate(5));
                p.setFechaTermino(rs.getDate(6));
                p.setLugar(rs.getString(7));
                p.setParticipante(rs.getString(8));
                p.setRecurso(rs.getString(9));
                p.setEstado(rs.getString(10));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    
}
