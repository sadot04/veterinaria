package veterinaria.cliente.dominio;

public class Mascotas {

    String nombre;
    String edad;
    String raza;

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
