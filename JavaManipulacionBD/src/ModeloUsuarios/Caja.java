
import ModeloUsuarios.Usuario;
import java.util.*;

public class Caja extends Usuario {

    private float cantidadTotal;
    private String fechaRetiro;
    private String fechaDeposito;
    
    public Caja(float cantidad, String fecha1, String fecha2) {
        this.cantidadTotal = cantidad;
        this.fechaRetiro = fecha1;
        this.fechaDeposito = fecha2;
    }

    public float getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(float cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(String fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }
    
    public void retirar(float cantidad){
        this.cantidadTotal -= cantidad;
    }

    public void depositar(float cantidad){
        this.cantidadTotal += cantidad;
    }
}
