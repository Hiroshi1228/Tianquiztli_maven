package controlador.RegistrarUsuarioControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.RegistrarUsuarioModelo.CompradorDAO;
import modelo.RegistrarUsuarioModelo.VendedorDAO;
import modelo.RegistrarUsuarioModelo.Comprador;
import modelo.RegistrarUsuarioModelo.Vendedor;
import vista.RegistrarUsuario.VentanaRegistro;

public class UsuarioRegistrarControlador {
    private Comprador comprador;
    private CompradorDAO compradorDAO;
    private Vendedor vendedor;
    private VendedorDAO vendedorDAO;
    private VentanaRegistro pantallaRegistro;
    
    public UsuarioRegistrarControlador(VendedorDAO vendedorDAO, CompradorDAO compradorDAO, VentanaRegistro pantallaRegistro){
        this.vendedorDAO=vendedorDAO;
        this.compradorDAO=compradorDAO;
        this.pantallaRegistro=pantallaRegistro;
    }

    public UsuarioRegistrarControlador(VentanaRegistro vntRstr) {
        
    }
    
    public void recibirDatosComprador(){
         Comprador comprador = new Comprador();
         
        if(campoVacioNombre() == false && campoVacioContraseña() == false && campoVacioDireccion() == false){

        }else{
        
            String nombre = pantallaRegistro.txtNomUser.getText();
            String contra = pantallaRegistro.txtNewPass.getText();
            String direc = pantallaRegistro.txtDirection.getText();
            
            this.agregarComprador(nombre, contra, direc);
        }
    }
    
    public void recibirDatosVendedor(){
        Vendedor vendedor = new Vendedor();
        
        if(campoVacioNombre() == false && campoVacioContraseña() == false && campoVacioCiudad() == false && campoVacioNGocio() == false){
            System.out.println("prueba");
        }else{
            String nombreV = pantallaRegistro.txtNomUser.getText();
            String contraV = pantallaRegistro.txtNewPass.getText();
            String ciudad = pantallaRegistro.txtCity.getText();
            String nomGocio = pantallaRegistro.txtNameDeal.getText();
            
            this.agregarVendedor(nombreV, contraV, ciudad, nomGocio);
        }
        
    }
    
    public void agregarComprador(String nombre, String contra, String direc){
        Comprador comp = new Comprador();
        CompradorDAO cdao = new CompradorDAO();
        
        comp.setNombreC(nombre);
        comp.setContraseñaC(contra);
        comp.setDirección(direc);
        compradorDAO.agregarComprador(comp);
    }
    
    public void agregarVendedor(String nombreV, String contraV, String ciudad, String nomGocio){
        Vendedor vndr = new Vendedor();
        VendedorDAO vdao = new VendedorDAO();
        
        vndr.setNombreV(nombreV);
        vndr.setContraseñaV(contraV);
        vndr.setCiudad(ciudad);
        vndr.setNombre_negocio(nomGocio);
        vendedorDAO.agregarVendedor(vndr);
    }
    
    private boolean campoVacioNombre(){
        String errorMessage = "";
        if(pantallaRegistro.txtNomUser.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No agregaste un nombre, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioContraseña(){
        String errorMessage = "";
        if(pantallaRegistro.txtNewPass.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No agregaste una contraseña, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioDireccion(){
        String errorMessage = "";
        if(pantallaRegistro.txtDirection.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No agregaste una direccion, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioCiudad(){
        String errorMessage = "";
        if(pantallaRegistro.txtCity.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No agregaste una ciudad, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean campoVacioNGocio(){
        String errorMessage = "";
        if(pantallaRegistro.txtNameDeal.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No agregaste el nombre del negocio, verifica el campo", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if(errorMessage.length() == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
