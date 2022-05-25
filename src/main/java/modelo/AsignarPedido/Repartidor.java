package modelo.AsignarPedido;

public class Repartidor {
    public int idR;
    public int idV;
    public int idPe;
    public String nombreR;
    public String contraseñaR;
    public String ciudad;
    public String contrato;
    public String estado;

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public int getIdV() {
        return idV;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }

    public int getIdPe() {
        return idPe;
    }

    public void setIdPe(int idPe) {
        this.idPe = idPe;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombre) {
        this.nombreR = nombre;
    }

    public String getContraseñaR() {
        return contraseñaR;
    }

    public void setContraseñaR(String contraR) {
        this.contraseñaR = contraR;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
