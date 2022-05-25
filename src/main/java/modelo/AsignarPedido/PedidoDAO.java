package modelo.AsignarPedido;

import java.sql.*;
import java.util.ArrayList;

public class PedidoDAO {

    Conexion conexion;
    PreparedStatement  ps;
    ResultSet rs;

    public PedidoDAO(){
        conexion = new Conexion();
    }
    
    public ArrayList<Pedido> listPedido(){
        ArrayList listPedido = new ArrayList();
        Pedido pedido;
        
        try{
            Connection acceBD = conexion.getConexion();
            ps = acceBD.prepareStatement("select * from pedidos");
            rs = ps.executeQuery();
            while (rs.next()){
                pedido = new Pedido();
                pedido.setIdP(rs.getInt(1));
                pedido.setIdC(rs.getInt(2));
                pedido.setIdR(rs.getInt(3));
                pedido.setNombre(rs.getString(4));
                pedido.setEstado(rs.getString(5));
                pedido.setDireccion(rs.getString(6));
                pedido.setProductos(rs.getString(7));
                pedido.setTotal(rs.getInt(8));
                listPedido.add(pedido); 
            }
            ps.close();
            rs.close();
            acceBD.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return listPedido;        
    }

}
