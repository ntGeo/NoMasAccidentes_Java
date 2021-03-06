package Modelo.DAO;

import Modelo.CasoAsesoria;
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
public class CasoAsesoriaDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    CasoAsesoria casoAsesoria = new CasoAsesoria();
    
    //Metodo para listar Casos de Asesoria en Tabla
    public List listar(){
        List<CasoAsesoria>datos= new ArrayList<>();
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement("SELECT * FROM CASO_ASESORIA");
            rs=ps.executeQuery();
            while (rs.next()) {
                CasoAsesoria p = new CasoAsesoria();
                p.setId(rs.getInt(1));
                p.setResponsable(rs.getString(2));
                p.setFechaCreacion(rs.getString(3));
                p.setNombreFiscalizador(rs.getString(4));
                p.setRutFiscalizador(rs.getString(5));
                p.setLugarAccidente(rs.getString(6));
                p.setDetalleAccidente(rs.getString(7));
                p.setFechaAccidente(rs.getString(8));
                p.setDetalleCaso(rs.getString(9));
                p.setEstado(rs.getString(10));
                datos.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al ver caso de asesoria");
        }
        return datos;
    }
    
    //Agrega nuevo Caso de Asesoria
    public int agregar(CasoAsesoria ca){
        String sql= "INSERT INTO CASO_ASESORIA(RESPONSABLE, FECHACREACION, NOMBREFISCALIZADOR, RUTFISCALIZADOR, LUGARACCIDENTE, DETALLEACCIDENTE, FECHAACCIDENTE, DETALLECASO, ESTADO) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement(sql);
            ps.setString(1,ca.getResponsable());
            ps.setString(2,ca.getFechaCreacion());
            ps.setString(3,ca.getNombreFiscalizador());
            ps.setString(4,ca.getRutFiscalizador());
            ps.setString(5,ca.getLugarAccidente());
            ps.setString(6,ca.getDetalleAccidente());
            ps.setString(7,ca.getFechaAccidente());
            ps.setString(8,ca.getDetalleCaso());
            ps.setString(9,ca.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar caso de asesoria");
        }
        return 1;
    }
    
    public int actualizar(int id){
        String sql="UPDATE CASO_ASESORIA SET ESTADO= 'Finalizado' WHERE ID="+id;
        
        try {
            con= conectar.getConnection();
            ps= con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar caso de asesoria");
        }
            return 1;
    }
}
