package modelo.PedidoR;

/**
 *
 * @author Aridai
 */
public class PedidoR {
    int idP;
    int idC;
    int idR;
    String nombre;
    String estado;
    String direccion;
    String productos;
    int total;

    public int getIdP() {
        return idP;
    }
    public int getIdC() {
        return idC;
    }
    public int getIdR() {
        return idR;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getProductos() {
        return productos;
    }
    public int getTotal() {
        return total;
    }
    public void setIdP(int idP) {
        this.idP = idP;
    }
    public void setIdR(int idR) {
        this.idR = idR;
    }
    
    public void setIdC(int idC) {
        this.idC = idC;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    public void setTotal(int total) {
        this.total = total;
    }

}
