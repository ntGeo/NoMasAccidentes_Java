package Modelo.DAO;

import Modelo.Cliente;
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
public class ClienteDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente c = new Cliente();
    
    
    public List listar(){
        List<Cliente>datos= new ArrayList<>();
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement("SELECT * FROM NMA3.CLIENTE");
            rs=ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setRut(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setEmail(rs.getString(5));
                c.setTelefono(rs.getInt(6));
                c.setEstado(rs.getInt(7));
                c.setGiro(rs.getString(8));
                c.setComunaID(rs.getInt(9));
                datos.add(c);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    
    
    
    
}
