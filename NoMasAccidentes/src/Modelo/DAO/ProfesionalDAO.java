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
            ps=con.prepareStatement("SELECT * FROM GEOATAVALES.PROFESIONAL");
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
    
    //Metodo que agrega un nurvo profesional a la base
    public int agregar(Profesional p){
        int r=0;
        String sql= "INSERT INTO GEOATAVALES.PROFESIONAL(Rut,Nombre,Apellidopaterno,Apellidomaterno,Direccion,Telefono,Estado)VALUES(?,?,?,?,?,?,?)";
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
    
    //Metodo para ctualizar datos de un profesional
    public int actualizar(Profesional p){
        int r=0;
        String sql="UPDATE GEOATAVALES.PROFESIONAL SET Rut=?, Nombre=?, Apellidopaterno=?, Apellidomaterno=?, Direccion=?, Telefono=?, Estado=? WHERE Id=?";
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
            ps.setInt(8, p.getId());
            r= ps.executeUpdate();
            if (r==1) {
                return 1;
            }else{
            return 0;
            }
        } catch (Exception e) {
        }
        return r;
    }
    
    public void delete(int id){
        String sql="DELETE FROM GEOATAVALES.PROFESIONAL WHERE ID="+id;
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}


