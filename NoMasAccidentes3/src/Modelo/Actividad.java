package Modelo;

import java.sql.Date;

/**
 *
 * @author Geovanni
 */
public class Actividad {
    int id;
    String tipo, descripcion, detalle, lugar, participante, recurso, estado;
    Date fechaInicio, fechaTermino;

    public Actividad() {
    }

    public Actividad(int id, String tipo, String descripcion, String detalle, String lugar, String participante, String recurso, String estado, Date fechaInicio, Date fechaTermino) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.lugar = lugar;
        this.participante = participante;
        this.recurso = recurso;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }
    
    
}
