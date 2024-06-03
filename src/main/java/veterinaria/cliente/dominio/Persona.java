package veterinaria.cliente.dominio;

public class Persona {

    int ID;
    String nombre;
    int celular;
    String correo;

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
