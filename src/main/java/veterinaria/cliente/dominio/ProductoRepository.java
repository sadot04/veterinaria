package veterinaria.cliente.dominio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductoRepository {

    public ArrayList<Producto> cargarAlimentos() {
        ArrayList<Producto> alimentos = new ArrayList();
        
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
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

                alimentos.add(prod);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alimentos;
    }
        
    public ArrayList<Producto> cargarRopa() {
        ArrayList<Producto> ropa = new ArrayList();
            System.out.println("asd");
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM ropa");
            Producto prod;
            while (rs.next()) {
                prod = new Producto();

                prod.setID(rs.getInt("cod_producto"));

                prod.setNombre(rs.getString("nombre_producto"));

                prod.setUnidades(rs.getInt("unidades"));

                prod.setDescripcion(rs.getString("descripcion"));

                prod.setPrecio(rs.getInt("precio"));

                ropa.add(prod);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ropa;
    }
        
    public ArrayList<Producto> cargarMedicamentos() {
        ArrayList<Producto> medicamentos = new ArrayList();
            System.out.println("asd");
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM medicamentos");
            Producto prod;
            while (rs.next()) {
                prod = new Producto();

                prod.setID(rs.getInt("cod_producto"));

                prod.setNombre(rs.getString("nombre_producto"));

                prod.setUnidades(rs.getInt("unidades"));

                prod.setDescripcion(rs.getString("descripcion"));

                prod.setPrecio(rs.getInt("precio"));

                medicamentos.add(prod);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return medicamentos;
    }

    public ArrayList<Producto> cargarJuguetes() {
        ArrayList<Producto> juguetes = new ArrayList();
            System.out.println("asd");
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM juguetes");
            Producto prod;
            while (rs.next()) {
                prod = new Producto();

                prod.setID(rs.getInt("cod_producto"));

                prod.setNombre(rs.getString("nombre_producto"));

                prod.setUnidades(rs.getInt("unidades"));

                prod.setDescripcion(rs.getString("descripcion"));

                prod.setPrecio(rs.getInt("precio"));

                juguetes.add(prod);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return juguetes;
    }    
        
    public ArrayList<Producto> cargarAccesorios() {
        ArrayList<Producto> accesorios = new ArrayList();
            System.out.println("asd");
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM accesorios");
            Producto prod;
            while (rs.next()) {
                prod = new Producto();

                prod.setID(rs.getInt("cod_producto"));

                prod.setNombre(rs.getString("nombre_producto"));

                prod.setUnidades(rs.getInt("unidades"));

                prod.setDescripcion(rs.getString("descripcion"));

                prod.setPrecio(rs.getInt("precio"));

                accesorios.add(prod);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accesorios;
    }         
}
