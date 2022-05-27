package controlador.Productos;

import java.io.*;
import javax.swing.*;
import modelo.VisualizarProducto.*;
import vista.Productos.*;

/**
 *
 * @author Aridai
 */
public class ControladorPantallaEditarProductos {
    private Productos producto;
    private ProductoDAO producto_dao;
    ProductoDAO dao;
    private PantallaEditarProductos pantallaEditar;
    private VisualizarProductosVendedor vpv = new VisualizarProductosVendedor();
   ControladorP t = new ControladorP();
    

    public ControladorPantallaEditarProductos(ProductoDAO producto_dao, PantallaEditarProductos pantallaEditar) {
        this.producto_dao=producto_dao;
        this.pantallaEditar=pantallaEditar;
    }



    public ControladorPantallaEditarProductos(ProductoDAO producto_dao, PantallaEditarProductos pantallaEditar, ControladorP vpv) {
       this.producto_dao=producto_dao;
        this.pantallaEditar=pantallaEditar;
       // this.vpvc=vpvc;
    }

    public ControladorPantallaEditarProductos(ProductoDAO producto_dao, PantallaEditarProductos pantallaEditar,int id, String nombre, String tipo, String descripcion, int precio, int cantidad, String stock) {
        //pantallaEditar.txtId_V = id.getText();
      System.out.println("Hola" + nombre + tipo + descripcion);
      pantallaEditar.txtId.setText(String.valueOf(id));
      pantallaEditar.txtNombre.setText(nombre);
      pantallaEditar.txtPrecio.setText(String.valueOf(precio));
      pantallaEditar.txtCantidad2.setText(String.valueOf(cantidad));
      pantallaEditar.txtDescripcion.setText(descripcion);
      pantallaEditar.stockProducto.setSelectedItem(cantidad);
      pantallaEditar.tipoProducto.setSelectedItem(tipo);
    }
    

    public void recibirDatos(){
        Productos producto = new Productos();
        
        if( campoVacioNombre() == false && campoVacioDescripcion() == false && campoVacioPrecio() == false && campoNumericoValidoPrecio() == false ){
            
        }else {
            int id = Integer.parseInt(pantallaEditar.txtId.getText());
            String nombre = pantallaEditar.txtNombre.getText();
            String tipo = (String) pantallaEditar.tipoProducto.getSelectedItem();
            String descripcion = pantallaEditar.txtDescripcion.getText();
            int precio = Integer.parseInt(pantallaEditar.txtPrecio.getText());
            String stock = (String) pantallaEditar.stockProducto.getSelectedItem();
            File ruta = new File (pantallaEditar.txtRuta.getText());
            int cantidad = Integer.parseInt(pantallaEditar.txtCantidad2.getText());
        
            //this.agregarProducto( nombre, tipo, descripcion, precio, stock, ruta);
            this.modificar2(nombre, tipo, descripcion, precio, id, cantidad, stock);
        }
    }
    
    public void recibirDatos2(){
        Productos producto = new Productos();
        
        if( campoVacioNombre() == false && campoVacioDescripcion() == false && campoVacioPrecio() == false && campoNumericoValidoPrecio() == false ){
      
        }else {
            int id = Integer.parseInt(pantallaEditar.txtId.getText());
           
            File ruta = new File (pantallaEditar.txtRuta.getText());
        
            //this.agregarProducto( nombre, tipo, descripcion, precio, stock, ruta);
            this.modificar(ruta,id);
        }
    }
    
    public void modificar2(String nombre, String tipo, String descripcion, int precio, int id, int cantidad, String stock){
        Productos vo = new Productos();
        dao = new ProductoDAO();
        
        vo.setNombre(nombre);
        vo.setTipo(tipo);
        vo.setDescripcion(descripcion);
        vo.setPrecio(precio);
        vo.setId(id);
        vo.setStock(stock);
        vo.setCantidad(cantidad);
        
        dao.Modificar_ProductoVO2(vo);
     
    
   
    }
    
    private boolean campoVacioPrecio(){
        String errorMessage = "";
        if(pantallaEditar.txtPrecio.getText().trim().isEmpty()){
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
        String precio = pantallaEditar.txtPrecio.getText();
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
    private boolean campoVacioNombre(){
        String errorMessage = "";
        if(pantallaEditar.txtNombre.getText().trim().isEmpty()){
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
        if(pantallaEditar.txtDescripcion.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo descripción está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    
    private boolean campoVacioCantidad(){
        String errorMessage = "";
        if(pantallaEditar.txtCantidad2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo cantidad está vacío, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
                
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    

     
    
        public void modificar(File foto, int id){
        Productos vo = new Productos();
        producto_dao = new ProductoDAO();

        vo.setId(id);
        
        try{
            byte[] icono = new byte[(int) foto.length()];
            InputStream input = new FileInputStream(foto);
            input.read(icono);
            vo.setImagen(icono);
        }catch(Exception ex){
            vo.setImagen(null);
        }
        producto_dao.Modificar_ProductoVO(vo);
    }

}
