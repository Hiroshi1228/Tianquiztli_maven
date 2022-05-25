package controlador.AsignarPedido;

import java.sql.Connection;
import vista.AsignarPedido.*;
import modelo.AsignarPedido.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AsignarPControlador {

    AsignarP vista = new AsignarP();
    PedidoDAO pDAO = new PedidoDAO();
    RepartidorDAO rDAO = new RepartidorDAO();
    Conexion conexion;
    PreparedStatement  ps;
    Pedido p = new Pedido();
    Repartidor r = new Repartidor();

    public AsignarPControlador(){
        conexion = new Conexion();
    }
 
 
    public void AsignarPedido(int id_Pe, int id_R) { 
            try {
                p.setIdR(id_R);
                r.setIdPe(id_Pe);
                r.setEstado("Ocupado");
                Connection acceBD = (Connection) conexion.getConexion();
                ps = acceBD.prepareStatement("UPDATE repartidor SET Id_Pe = '" + r.getIdPe() + "',Estado ='" + r.getEstado() + "' WHERE Id_R = '" + p.getIdR() + "'" );
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Pedido asignado");
                    pDAO.listPedido();
                } else {
                    JOptionPane.showMessageDialog(null, "Pedido no asignado");
                }
                ps.close();
                acceBD.close();
            } catch (Exception e) {
                System.err.println(e);
            }
    }
    
    public void AsignarRepartidor(int id_Pe, int id_R) { 
            try {
                p.setIdR(id_R);
                r.setIdPe(id_Pe);
                Connection acceBD = (Connection) conexion.getConexion();
                ps = acceBD.prepareStatement("UPDATE pedidos SET Id_R = '" + p.getIdR() + "' WHERE Id_Pe = '" + r.getIdPe() + "'" );
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Repartidor asignado");
                    rDAO.listRepartidor();
                } else {
                    JOptionPane.showMessageDialog(null, "Repartidor no asignado");
                }
                ps.close();
                acceBD.close();
            } catch (Exception e) {
                System.err.println(e);
            }
    }
}
