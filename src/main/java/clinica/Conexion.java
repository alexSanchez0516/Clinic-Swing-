package clinica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author alexander
 */
public class Conexion {
    
    
    private static Connection conn;
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "1690001299Gr.";
    private static final String DB = "java_02_clinica";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB;

     
    private static class ConexionSingleton {
        public static final Conexion INSTACE = new Conexion();
        
    }

    public  Connection getConn() {
        return conn;
    }
    
    
    
    private Conexion() {
        try {
            Class.forName(JDBC_DRIVER);
            Properties properties = new Properties();
            properties.setProperty("user", USER);
            properties.setProperty("password", PASS);
            properties.setProperty("useSSL", "false");
            properties.setProperty("autoReconnect", "true");
            
            conn = (Connection) DriverManager.getConnection(DB_URL, properties);
            
            if (conn != null) {
                System.out.println("Conexion exitosa -->");
            }
            
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public static Conexion getInstance() {
        return ConexionSingleton.INSTACE;
    }
}
