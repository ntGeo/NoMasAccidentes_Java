package Modelo;

/**
 *
 * @author Geovanni
 */
public class Cliente {
    int id, telefono, estado, comunaID;
    String rut, razonSocial, direccion, email, giro;
    
    public Cliente(){
    }

    public Cliente(int id, int telefono, int estado, int comunaID, String rut, String razonSocial, String direccion, String email, String giro) {
        this.id = id;
        this.telefono = telefono;
        this.estado = estado;
        this.comunaID = comunaID;
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.email = email;
        this.giro = giro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getComunaID() {
        return comunaID;
    }

    public void setComunaID(int comunaID) {
        this.comunaID = comunaID;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }
    

    
}

