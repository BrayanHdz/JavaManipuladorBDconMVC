
import ModeloUsuarios.Usuario;
import java.util.*;

public class Alumnos extends Usuario {
 private String matricula;
    private String nombre;
    private String telefono;
    private String periodo; 
    public Alumnos(String m, int par, String n, int par1, String t, int par2, String p, int par3){
        this.matricula=m;
        this.nombre=n;
        this.telefono=t;
        this.periodo=p;   
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    @Override
    public String toString() {
        return "Alumnos{" + "matricula=" + matricula + ", nombre=" + nombre + ", telefono=" + telefono + ", periodo=" + periodo + '}';
    }
    
    public Alumnos() {
         Alumnos estudiante = new Alumnos("2031118405",10,"Astrid",6,"7731399138",10,"enero-abril",11);
        System.out.println(estudiante.toString());  
    }

}
