package veterinaria.cliente.dominio;

public class Desaparecido {

    String nombre;
    String zona;
    String descripcion;
    String datos;

    public String getNombre() {
        return nombre;
    }

    public String getZona() {
        return zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDatos() {
        return datos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

}
