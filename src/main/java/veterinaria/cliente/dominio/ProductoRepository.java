package veterinaria.cliente.dominio;

import Catalogo.Editor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductoRepository {

    public static String consulta = "ropa";

    public ArrayList<Producto> cargarProductos() {
        ArrayList<Producto> lista = new ArrayList();
        
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            System.out.println(consulta + " repositrio");
            ResultSet rs = stmt.executeQuery("SELECT * FROM alimentos");
            Producto prod;
            while (rs.next()) {
                prod = new Producto();

                prod.setID(rs.getInt("cod_producto"));

                prod.setNombre(rs.getString("nombre_producto"));

                prod.setFechaV(rs.getString("fecha_vencimiento"));

                prod.setUnidades(rs.getInt("unidades"));

                prod.setDescripcion(rs.getString("descripcion"));

                prod.setPrecio(rs.getInt("precio"));

                lista.add(prod);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
