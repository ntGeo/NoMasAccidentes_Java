package Modelo;

/**
 *
 * @author Geovanni
 */
public class PropuestaDeMejora {
    
    int id;
    String responsable, itemDeMejora, Propuesta, Observaciones, fechaEmision;

    public PropuestaDeMejora() {
    }

    public PropuestaDeMejora(int id, String responsable, String itemDeMejora, String Propuesta, String Observaciones, String fechaEmision) {
        this.id = id;
        this.responsable = responsable;
        this.itemDeMejora = itemDeMejora;
        this.Propuesta = Propuesta;
        this.Observaciones = Observaciones;
        this.fechaEmision = fechaEmision;
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

    public String getItemDeMejora() {
        return itemDeMejora;
    }

    public void setItemDeMejora(String itemDeMejora) {
        this.itemDeMejora = itemDeMejora;
    }

    public String getPropuesta() {
        return Propuesta;
    }

    public void setPropuesta(String Propuesta) {
        this.Propuesta = Propuesta;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    
    
}
