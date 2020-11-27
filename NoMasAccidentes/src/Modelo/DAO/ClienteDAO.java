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
    
    //Listar Clientes
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
    
    public int agregar(Cliente c){
        String sql="INSERT INTO NMA3.CLIENTE(Rut,RazonSocial,Direccion,Email,Telefono,Estado,Giro,Comuna_ID) VALUES(?,?,?,?,?,?,?,?)";
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement(sql);
            ps.setString(1, c.getRut());
            ps.setString(2, c.getRazonSocial());
            ps.setString(3, c.getDireccion());
            ps.setString(4, c.getEmail());
            ps.setInt(5, c.getTelefono());
            ps.setInt(6, c.getEstado());
            ps.setString(7, c.getGiro());
            ps.setInt(8, c.getComunaID());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return 1;
    }
    
    
    
}
