package modelo.AsignarPedido;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static String db = "tianquiztli";
    private static String user = "uhr6kjqbxuq6vwgs";
    private static String pass = "faTAK0FpNuVvEpisAlLw";
    private static String host = "bp2xxkmj72wwpiibl4qt-mysql.services.clever-cloud.com";
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
