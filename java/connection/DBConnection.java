
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection connection;
    static String bd ="suits_rental"; //aqui va el nombre de la DB
    static String port = "3306"; //pueerto
    static String login = "root";
    static String password = "admin";
    
    //constructor
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection=DriverManager.getConnection(url,this.login,this.password);
            System.out.println("Coneccion establecida");
        } catch (Exception ex) {
            System.out.println("Error en la conexion");
        }
    }


public Connection getConnection() {
        return connection;
    }
    
    public void desconectar() {
        connection = null;
    }
}
