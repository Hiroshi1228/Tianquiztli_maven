package controlador.Productos;

import java.io.*;
import javax.swing.*;
import modelo.Productos.*;
import vista.Productos.*;

/**
 *
 * @author jair1
 */
public class ControladorPantallaRegistrarProductos{
    private Producto producto;
    private Producto_DAO producto_dao;
    private PantallaRegistrarProductos pantallaRegistro;
    
    public ControladorPantallaRegistrarProductos(Producto_DAO producto_dao, PantallaRegistrarProductos pantallaRegistro){
        this.producto_dao=producto_dao;
        this.pantallaRegistro=pantallaRegistro;
    }
    
    public void recibirDatos(){
        Producto producto = new Producto();
        
        if(campoVacioId_V() && campoVacioNombre() && campoVacioDescripcion() && campoVacioPrecio() && campoNumericoValidoPrecio() && campoVacioCantidad() &&campoVacioRuta()){
            int id_V = Integer.parseInt(pantallaRegistro.txtId_V.getText());
            String nombre = pantallaRegistro.txtNombre.getText();
            String tipo = (String) pantallaRegistro.tipoProducto.getSelectedItem();
            String descripcion = pantallaRegistro.txtDescripcion.getText();
            int precio = Integer.parseInt(pantallaRegistro.txtPrecio.getText());
            String stock = (String) pantallaRegistro.stockProducto.getSelectedItem();
            int cantidad = Integer.parseInt(pantallaRegistro.txtCantidad.getText());
            File ruta = new File (pantallaRegistro.txtRuta.getText());
        
            this.agregarProducto(id_V, nombre, tipo, descripcion, precio, stock, ruta, cantidad);
        }
    }
    
     public void agregarProducto(int id_V, String nombre, String tipo, String descripcion, int precio, String stock, File ruta, int cantidad){
        Producto p = new Producto();
        Producto_DAO dao = new Producto_DAO();
        
        p.setId_V(id_V);
        p.setNombre(nombre);
        p.setTipo(tipo);
        p.setDescripcion(descripcion);
        p.setPrecio(precio);
        p.setStock(stock);
        p.setCantidad(cantidad);
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            p.setFoto(icono);
        }catch(Exception ex){
            p.setFoto(null);
        }
        producto_dao.agregarProducto(p);
    }
     
     private boolean campoVacioId_V(){
        String errorMessage = "";
        if(pantallaRegistro.txtId_V.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Id_V está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
     
     private boolean campoVacioNombre(){
        String errorMessage = "";
        if(pantallaRegistro.txtNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo nombre está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
     
    private boolean campoVacioDescripcion(){
        String errorMessage = "";
        if(pantallaRegistro.txtDescripcion.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo descripción está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioPrecio(){
        String errorMessage = "";
        if(pantallaRegistro.txtPrecio.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo precio está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoNumericoPrecio(){
        boolean numero = false;
        String precio = pantallaRegistro.txtPrecio.getText();
        for(int i = 0;i<precio.length();i++){
            if(precio.charAt(i) == '1' || precio.charAt(i) == '2'|| precio.charAt(i) == '3' ||
                    precio.charAt(i) == '4' || precio.charAt(i) == '5' || precio.charAt(i) == '6' ||
                    precio.charAt(i) == '7' || precio.charAt(i) == '8' || precio.charAt(i) == '9'){
                numero = true;
                break;
            }
        }
        return numero;
    }
    
    private boolean campoNumericoValidoPrecio(){
        String errorMessage = "";
        if(this.campoNumericoPrecio() == false){
            JOptionPane.showMessageDialog(null, "El campo precio solo debe tener numeros, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    } 
    
    private boolean campoVacioCantidad(){
        String errorMessage = "";
        if(pantallaRegistro.txtCantidad.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo cantidad está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioRuta(){
        String errorMessage = "";
        if(pantallaRegistro.txtRuta.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Te ha faltado seleccionar una imagen paa tu producto", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
     
}
