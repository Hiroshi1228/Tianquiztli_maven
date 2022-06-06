package modelo;

/**
 *
 * @author jair1
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    
    // Librería de MySQL
    public String driver = "com.mysql.cj.jdbc.Driver";
    // Nombre de la base de datos
    public String database = "bqcxcfusmjifn4l4vomm";
    // Host
    public String hostname = "bqcxcfusmjifn4l4vomm-mysql.services.clever-cloud.com";
    // Puerto
    public String port = "3306";
    
    // Nombre de usuario
    public String username = "ufos6b4mrp3fqkxn";

    // Clave de usuario
    public String password = "1DPl9QHCZiz4LTG8VcJm";
    
    //Rura a nuestra base de datos
    public String url = "jdbc:mysql://" + username + ":" + port + "/" + database;
    
       
    public ConexionBD() {
        this.hostname = "bqcxcfusmjifn4l4vomm-mysql.services.clever-cloud.com";
        this.port = "3306";
        this.database = "bqcxcfusmjifn4l4vomm";
        this.username = "ufos6b4mrp3fqkxn";
        this.password = "1DPl9QHCZiz4LTG8VcJm";

        this.driver = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;

    }
    
    public Connection getConnection() throws Exception{
       
        try {
            Class.forName(driver);
            System.out.println("CONECTADO");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            throw new Exception("Error en ConexionDB. La causa es: " + ex.getCause().toString());
        }
        
    }    
}
