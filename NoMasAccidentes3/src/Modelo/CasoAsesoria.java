package Modelo;

import java.util.Date;

/**
 *
 * @author Geovanni
 */
public class CasoAsesoria {
    int id;
    String responsable, nombreFiscalizador, rutFiscalizador, lugarAccidente, detalleAccidente, detalleCaso, estado;
    Date fechaCreacion,fechaAccidente; 

    public CasoAsesoria() {
    }

    public CasoAsesoria(int id, String responsable, String nombreFiscalizador, String rutFiscalizador, String lugarAccidente, String detalleAccidente, String estado, Date fechaAccidente, String detalleCaso, Date fechaCreacion) {
        this.id = id;
        this.responsable = responsable;
        this.nombreFiscalizador = nombreFiscalizador;
        this.rutFiscalizador = rutFiscalizador;
        this.lugarAccidente = lugarAccidente;
        this.detalleAccidente = detalleAccidente;
        this.fechaAccidente = fechaAccidente;
        this.detalleCaso = detalleCaso;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getNombreFiscalizador() {
        return nombreFiscalizador;
    }

    public void setNombreFiscalizador(String nombreFiscalizador) {
        this.nombreFiscalizador = nombreFiscalizador;
    }

    public String getRutFiscalizador() {
        return rutFiscalizador;
    }

    public void setRutFiscalizador(String rutFiscalizador) {
        this.rutFiscalizador = rutFiscalizador;
    }

    public String getLugarAccidente() {
        return lugarAccidente;
    }

    public void setLugarAccidente(String lugarAccidente) {
        this.lugarAccidente = lugarAccidente;
    }

    public String getDetalleAccidente() {
        return detalleAccidente;
    }

    public void setDetalleAccidente(String detalleAccidente) {
        this.detalleAccidente = detalleAccidente;
    }

    public Date getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(Date fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getDetalleCaso() {
        return detalleCaso;
    }

    public void setDetalleCaso(String detalleCaso) {
        this.detalleCaso = detalleCaso;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
