package veterinaria.cliente.dominio;

import Catalogo.Conexion;
import Catalogo.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import veterinaria.cliente.aplicacion.IniciarSesionForm;
import veterinaria.cliente.aplicacion.RegistroForm;

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
            ResultSet rs = stmt.executeQuery("SELECT * FROM indumentaria");
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

                prod.setFechaV(rs.getString("fecha_vencimiento"));

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

    public ArrayList<Persona> cargarPersonas() {
        ArrayList<Persona> personas = new ArrayList();

        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM registro");
            Persona pers;
            while (rs.next()) {
                pers = new Persona();

                pers.setID(rs.getInt("id_usuario"));

                pers.setNombre(rs.getString("nombre"));

                pers.setCelular(rs.getInt("numero_celular"));

                pers.setCorreo(rs.getString("correo"));

                personas.add(pers);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personas;
    }

    public void registrarPersona() {
        System.out.println("registrarPersona ejecutado");
        RegistroForm rf = new RegistroForm();

        try (Connection con = Conexion.conectar()) {
            PreparedStatement pps = con.prepareStatement("INSERT INTO registro (id, nombre,celular, correo) VALUES (?, ?, ?, ?)");
            pps.setInt(1, 458);
            pps.setString(2, rf.nombre);
            pps.setInt(3, 457);
            pps.setString(4, rf.correo);

            pps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Pago> cargarPagos() {
        IniciarSesionForm is = new IniciarSesionForm();

        ArrayList<Pago> pagos = new ArrayList();
        System.out.println("asd");
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM historial\n"
                    + "WHERE id_historial =" + is.id + ";");
            Pago pago;
            while (rs.next()) {
                pago = new Pago();

                pago.setDescripcion(rs.getString("descripcion"));

                pago.setFecha(rs.getString("fecha_pago"));

                pago.setMonto(rs.getInt("monto"));

                pagos.add(pago);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pagos;
    }

    public ArrayList<Mascotas> cargarMascotas() {
        IniciarSesionForm is = new IniciarSesionForm();

        ArrayList<Mascotas> mascotas = new ArrayList();
        System.out.println("asd");
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM mascota\n"
                    + "WHERE id_dueno =" + is.id + ";");
            Mascotas masco;
            while (rs.next()) {
                masco = new Mascotas();

                masco.setNombre(rs.getString("nombre"));

                masco.setEdad(rs.getString("edad"));

                masco.setRaza(rs.getString("raza"));

                mascotas.add(masco);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mascotas;
    }

    public ArrayList<Desaparecido> cargarDesaparecidos() {

        ArrayList<Desaparecido> desaparecidos = new ArrayList();
        System.out.println("asd");
        try (Connection con = Conexion.conectar(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM desapariciones");
            Desaparecido desa;
            while (rs.next()) {
                desa = new Desaparecido();

                desa.setNombre(rs.getString("nombre"));

                desa.setZona(rs.getString("zona"));

                desa.setDescripcion(rs.getString("descripcion"));

                desa.setDatos(rs.getString("datos"));

                desaparecidos.add(desa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return desaparecidos;
    }
}
