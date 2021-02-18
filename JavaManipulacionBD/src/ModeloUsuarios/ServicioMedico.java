import ModeloUsuarios.Usuario;


public class ServicioMedico extends Usuario {

    
    private String numeroSeguroSocial;
    private String fechaNacimiento;
    private boolean sexo;
    private String telefonoEmergencia;
    
    public ServicioMedico(String nss, String fN, boolean sexo, String telEmg) {
        this.numeroSeguroSocial = nss;
        this.fechaNacimiento = fN;
        this.sexo = sexo;
        this.telefonoEmergencia = telEmg;
        
    }

    public void setNumeroSeguroSocial(String nss) {
        this.numeroSeguroSocial = nss;
    }
    public String getNumeroSeguroSocial() {
        return "";
    }

    public void setFechaNacimiento(String fN) {
        this.fechaNacimiento = fN;
    }

    public String getFechaNacimiento() {
        return "";
    }
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean getSexo() {
        return false;
    }
    
    public void setTelefonoEmergencia(String telEmg) {
        this.telefonoEmergencia = telEmg;
    }

    public String getTelefonoEmergencia() {
        return "";
    }

    public void consulta() {
    }

    public String resetarMedicamento() {
        return "";
    }

}