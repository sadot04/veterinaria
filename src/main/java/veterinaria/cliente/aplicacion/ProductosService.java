package veterinaria.cliente.aplicacion;

import java.util.ArrayList;
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
}
