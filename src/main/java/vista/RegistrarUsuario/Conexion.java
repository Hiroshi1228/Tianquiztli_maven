package vista.RegistrarUsuario;

import tianquiztli.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String base = "bqcxcfusmjifn4l4vomm";
    private final String user = "ufos6b4mrp3fqkxn";
    private final String password = "1DPl9QHCZiz4LTG8VcJm";
    private final String url = "mysql://ufos6b4mrp3fqkxn:1DPl9QHCZiz4LTG8VcJm@bqcxcfusmjifn4l4vomm-mysql.services.clever-cloud.com:3306/bqcxcfusmjifn4l4vomm";
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
