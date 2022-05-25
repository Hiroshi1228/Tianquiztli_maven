package modelo.AsignarPedido;

import java.sql.*;
import java.util.ArrayList;

public class RepartidorDAO {
    Conexion conexion;
    PreparedStatement  ps;
    ResultSet rs;
    public ArrayList listRepartidor = new ArrayList();

    public RepartidorDAO(){
        conexion = new Conexion();
    }
    
    public ArrayList<Repartidor> listRepartidor(){
        
        Repartidor repartidor;
        
        try{
            Connection acceBD = conexion.getConexion();
            ps = acceBD.prepareStatement("select * from repartidor");
            rs = ps.executeQuery();
            while (rs.next()){
                repartidor = new Repartidor();
                repartidor.setIdR(rs.getInt(1));
                repartidor.setIdV(rs.getInt(2));
                repartidor.setIdPe(rs.getInt(3));
                repartidor.setNombreR(rs.getString(4));
                repartidor.setContraseñaR(rs.getString(5));
                repartidor.setCiudad(rs.getString(6));
                repartidor.setContrato(rs.getString(7));
                repartidor.setEstado(rs.getString(8));
                listRepartidor.add(repartidor);
            }
            ps.close();
            rs.close();
            acceBD.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return listRepartidor;
    } 
}
