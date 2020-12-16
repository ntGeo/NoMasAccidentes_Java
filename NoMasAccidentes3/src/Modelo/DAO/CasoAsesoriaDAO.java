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
            ps=con.prepareStatement("SELECT * FROM NMA6.CASO_ASESORIA");
            rs=ps.executeQuery();
            while (rs.next()) {
                CasoAsesoria p = new CasoAsesoria();
                p.setId(rs.getInt(1));
                p.setResponsable(rs.getString(2));
                p.setFechaCreacion(rs.getDate(3));
                p.setNombreFiscalizador(rs.getString(4));
                p.setRutFiscalizador(rs.getString(5));
                p.setLugarAccidente(rs.getString(6));
                p.setDetalleAccidente(rs.getString(7));
                p.setFechaAccidente(rs.getDate(8));
                p.setDetalleCaso(rs.getString(9));
                p.setEstado(rs.getString(10));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
}
