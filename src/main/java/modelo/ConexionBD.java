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
    public String database = "bp2xxkmj72wwpiibl4qt";
    // Host
    public String hostname = "bp2xxkmj72wwpiibl4qt-mysql.services.clever-cloud.com";
    // Puerto
    public String port = "3306";
    
    // Nombre de usuario
    public String username = "uhr6kjqbxuq6vwgs";

    // Clave de usuario
    public String password = "faTAK0FpNuVvEpisAlLw";
    
    //Rura a nuestra base de datos
    public String url = "jdbc:mysql://" + username + ":" + port + "/" + database + "?useSSL=false";
    
       
    public ConexionBD() {
        this.hostname = "bp2xxkmj72wwpiibl4qt-mysql.services.clever-cloud.com";
        this.port = "3306";
        this.database = "bp2xxkmj72wwpiibl4qt";
        this.username = "uhr6kjqbxuq6vwgs";
        this.password = "faTAK0FpNuVvEpisAlLw";

        this.driver = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

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
