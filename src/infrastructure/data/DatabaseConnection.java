package infrastructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import io.github.cdimascio.dotenv.Dotenv;


public class DatabaseConnection {
    private static final String DB_URL = "jdbc:postgresql://localhost:7000/futo_db";
    private static final String USER = "postgres";
    private static final String PASS = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
