package modelo.Productos;

import java.sql.*;
import javax.swing.*;
import modelo.ConexionBD;

/**
 *
 * @author jair1
 */
public class Producto_DAO{

    public void agregarProducto(Producto producto) {
        ConexionBD c = new ConexionBD();
        String sql = "INSERT INTO productos (id_P, id_V, nombre, tipo, descripcion, precio, stock, foto, cantidad)\n" +
"VALUES (NULL,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        try{
            ps = c.getConnection().prepareStatement(sql);
            ps.setInt(1, producto.getId_V());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getTipo());
            ps.setString(4, producto.getDescripcion());
            ps.setInt(5, producto.getPrecio());
            ps.setString(6, producto.getStock());
            ps.setBytes(7, producto.getFoto());
            ps.setInt(8, producto.getCantidad());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Producto ha sido registrado", "Operación exitosa ", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            System.out.println("A "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("B "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "El sistema perdío conexión con la Base de Datos, Por favor intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                ps.close();
            }catch(Exception ex){}
        }
    }
    
   
    
}
