package vista.RegistrarUsuario;

import tianquiztli.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String base = "bp2xxkmj72wwpiibl4qt";
    private final String user = "uhr6kjqbxuq6vwgs";
    private final String password = "faTAK0FpNuVvEpisAlLw";
    private final String url = "jdbc:mysql://192.168.64.2:3306/" + base;
    private Connection con = null;
    
    public Connection getConnection(){
        //Se puede actualizar
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
