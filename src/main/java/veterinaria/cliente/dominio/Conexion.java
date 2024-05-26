package veterinaria.cliente.dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/baseveterinaria";
        Connection con = DriverManager.getConnection(url, "postgres", "12345678");

        return con;
    }

    public static int modo;
}
