package controlador.RepartidorCRUD;

import modelo.RepartidorCRUD.RepartidorDAO;
import modelo.AsignarPedido.*;
import vista.RepartidorCRUD.*;
import java.sql.*;
import javax.swing.*;

public class RegistrarRControlador {
        RepartidorDAO rDAO = new RepartidorDAO();
        RepartidorRME vista = new RepartidorRME();
        Conexion conexion;
        PreparedStatement  ps;
        Pedido p = new Pedido();
        Repartidor r = new Repartidor();

    public RegistrarRControlador(){
        conexion = new Conexion();
    }
    
    public void RegistrarRepartidor(String nombre,String contrase, String ciudad, String contrato, String estado) { 
            try {
                r.setNombreR(nombre);
                r.setContraseñaR(contrase);
                r.setCiudad(ciudad);
                r.setContrato(contrato);
                r.setEstado(estado);
                Connection acceBD = (Connection) conexion.getConexion();
                ps = acceBD.prepareStatement("INSERT INTO repartidor SET Id_R = '" + vista.numero + "',ID_V ='" + 1 + "',ID_PE ='" + 0 + "', nombreR ='" + r.getNombreR() + "', contraseñaR ='" + r.getContraseñaR() + "', ciudad ='" + r.getCiudad() + "', contrato ='" + r.getContrato() + "',estado ='" + r.getEstado() + "'" );
                
                int res = ps.executeUpdate();
                
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Repartidor Registrado");
                   
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar repartidor");
                }
                ps.close();
                acceBD.close();
            } catch (Exception e) {
                System.err.println(e);
            }
    }
    
    public void ModificarRepartidor(int id_R, String nombre,String contrase, String ciudad, String contrato, String estado) { 
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea modificar repartidor?", "Modificar Repartidor", JOptionPane.YES_NO_OPTION);
            if (respuesta == 1){
                vista.Text_IDR.setText(vista.numero + "");
                vista.Text_Nom.setText(null);
                vista.Text_Ciu.setText(null);
                vista.Text_Cont.setText(null);
                vista.Text_Contrato.setText(null);
            }else{  
               
            try {
                r.setIdR(id_R);
                r.setNombreR(nombre);
                r.setContraseñaR(contrase);
                r.setCiudad(ciudad);
                r.setContrato(contrato);
                r.setEstado(estado);
                
                Connection acceBD = (Connection) conexion.getConexion();
                ps = acceBD.prepareStatement("UPDATE repartidor SET nombreR ='" + r.getNombreR() + "', contraseñaR ='" + r.getContraseñaR() + "', ciudad ='" + r.getCiudad() + "', contrato ='" + r.getContrato() + "',estado ='" + r.getEstado() + "' WHERE Id_R ='" + r.getIdR() + "'");
                
                int res = ps.executeUpdate();
                if (res > 1) {
                    JOptionPane.showMessageDialog(null, "Error al modificar repartidor");
                } else {
                    JOptionPane.showMessageDialog(null, "Repartidor modificado");
                }
                ps.close();
                acceBD.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    
    public void EliminarRepartidor(int id_R) { 
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar repartidor?", "Modificar Repartidor", JOptionPane.YES_NO_OPTION);
               if (respuesta == 1){
                   //Pendiente
               }else{
                    vista.n2 = (int)(Math.random()*10000+1);
                    vista.Text_IDR.setText(vista.n2 + "");
                    vista.Text_Nom.setText(null);
                    vista.Text_Ciu.setText(null);
                    vista.Text_Cont.setText(null);
                    vista.Text_Contrato.setText(null);
               
                    try {
                            r.setIdR(id_R);
                            Connection acceBD = (Connection) conexion.getConexion();
                            ps = acceBD.prepareStatement("DELETE FROM repartidor WHERE Id_R = '" + r.getIdR() + "'");

                            int res = ps.executeUpdate();

                            if (res > 0) {
                                JOptionPane.showMessageDialog(null, "Repartidor eliminado");

                            } else {
                                JOptionPane.showMessageDialog(null, "Error al eliminar repartidor");
                            }
                            ps.close();
                            acceBD.close();
                        } catch (Exception e) {
                            System.err.println(e);
                        } 
                    }
    }     
}
