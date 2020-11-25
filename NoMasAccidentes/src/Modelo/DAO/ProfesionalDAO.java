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
    
    //Metodo para listar
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
    
    public int agregar(Profesional p){
        String sql= "INSERT INTO PROFESIONAL(RUT,NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,DIRECCION,TELEFONO,ESTADO) VALUES(?,?,?,?,?,?,?)";
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement(sql);
            ps.setString(1, p.getRut());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellidoPaterno());
            ps.setString(4, p.getApellidoMaterno());
            ps.setString(5, p.getDireccion());
            ps.setInt(6, p.getTelefono());
            ps.setInt(7, p.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return 1;
    }
}


