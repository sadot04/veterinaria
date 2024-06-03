package Catalogo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/baseVeterinaria";
        Connection con = DriverManager.getConnection(url, "postgres", "12345678");

        return con;
    }
    
    public static int modo;
    public static String añadirProducto;
    public static int añadirCantidad;
    public static Object[] fila = new Object[2];
    

}
