package Modelo;

/**
 *
 * @author Geovanni
 */
public class Usuario {
    int id, estado;
    String nombre, clave, rol;

    public Usuario() {
    }

    public Usuario(int id, int estado, String nombre, String clave, String rol) {
        this.id = id;
        this.estado = estado;
        this.nombre = nombre;
        this.clave = clave;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
   
    
}
