package modelo.AsignarPedido;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static String db = "tianquiztli";
    private static String user = "root";
    private static String pass = "";
    private static String host = "localhost:3306";
    private static String server = "jdbc:mysql://"+host+"/"+db;
    
    public static Connection getConexion(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(server,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR" + e); 
            return cn;
        }
        return cn;
    }


}
