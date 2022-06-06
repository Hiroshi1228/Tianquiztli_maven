package modelo.AsignarPedido;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static String db = "bqcxcfusmjifn4l4vomm";
    private static String user = "ufos6b4mrp3fqkxn";
    private static String pass = "1DPl9QHCZiz4LTG8VcJm";
    private static String host = "bqcxcfusmjifn4l4vomm-mysql.services.clever-cloud.com";
    private static String server = "jdbc:mysql://ufos6b4mrp3fqkxn:1DPl9QHCZiz4LTG8VcJm@bqcxcfusmjifn4l4vomm-mysql.services.clever-cloud.com:3306/bqcxcfusmjifn4l4vomm";
    
    public static Connection getConexion(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(server,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR" + e); 
            return cn;
        }
        return cn;
    }


}
