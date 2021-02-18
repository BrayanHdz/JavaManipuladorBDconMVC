
import ModeloUsuarios.Usuario;
import java.util.*;

public class Mantenimiento extends Usuario {

    private float presupuesto;
    private String fechaUltimoMantenimiento;
    private String turno;
    private String area;
    
    public Mantenimiento(float presupuesto, String fecha, String turno, String area) {
        this.presupuesto = presupuesto;
        this.fechaUltimoMantenimiento = fecha;
        this.turno = turno;
        this.area = area;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }

    public void setFechaUltimoMantenimiento(String fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public void reparar(){
    
    }

}
