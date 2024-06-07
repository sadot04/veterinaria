package veterinaria.cliente.aplicacion;

import java.util.ArrayList;
import veterinaria.cliente.dominio.Desaparecido;
import veterinaria.cliente.dominio.Mascotas;
import veterinaria.cliente.dominio.Pago;
import veterinaria.cliente.dominio.Persona;
import veterinaria.cliente.dominio.Producto;
import veterinaria.cliente.dominio.ProductoRepository;

public class ProductosService {

    private ProductoRepository productoRepository;

    public ProductosService() {
        this.productoRepository = new ProductoRepository();
    }

    public ArrayList<Producto> cargarAlimentos() {
        return this.productoRepository.cargarAlimentos();
    }

    public ArrayList<Producto> cargarRopa() {
        return this.productoRepository.cargarRopa();
    }

    public ArrayList<Producto> cargarMedicamentos() {
        return this.productoRepository.cargarMedicamentos();
    }

    public ArrayList<Producto> cargarJuguetes() {
        return this.productoRepository.cargarJuguetes();
    }

    public ArrayList<Producto> cargarAccesorios() {
        return this.productoRepository.cargarAccesorios();
    }

    public ArrayList<Persona> cargarPersonas() {
        return this.productoRepository.cargarPersonas();
    }

    public ArrayList<Pago> cargarPagos() {
        return this.productoRepository.cargarPagos();
    }

    public ArrayList<Mascotas> cargarMascotas() {
        return this.productoRepository.cargarMascotas();
    }

    public ArrayList<Desaparecido> cargarDesaparecidos() {
        return this.productoRepository.cargarDesaparecidos();
    }
}
