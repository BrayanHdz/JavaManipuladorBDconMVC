
import ModeloUsuarios.Usuario;
import java.util.*;

/**
 * 
 */
public class ControlEscolar extends Usuario {
private String matricula;
private String area;
private Boolean empleadoEscuela;

    public ControlEscolar(String matricula, String area, Boolean empleadoEscuela) {
        this.matricula = matricula;
        this.area = area;
        this.empleadoEscuela = empleadoEscuela;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Boolean getEmpleadoEscuela() {
        return empleadoEscuela;
    }

    public void setEmpleadoEscuela(Boolean empleadoEscuela) {
        this.empleadoEscuela = empleadoEscuela;
    }
   
    
    
    public ControlEscolar() {
    }
    
    public void agregarAlumno(){
        
    }
    
    public void eliminarAlumno(){
        
    }

}
