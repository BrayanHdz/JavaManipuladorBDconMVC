package controlador;

import java.awt.event.ActionEvent;
import modelo.Usuario;
import modelo.Consultas;
import vista.VistaUsuario;
import javax.swing.JOptionPane;

public class ControlUsuario {
    private Usuario user; 
    private Consultas query;
    private VistaUsuario view;
    
    public ControlUsuario(Usuario usuario1, Consultas consulta, VistaUsuario vista){
        this.user = usuario1;
        this.query = consulta;
        this.view = vista;
        this.view.btnAgregar.addActionListener(this::actionPerformed);
        this.view.btnModificar.addActionListener(this::actionPerformed);
        this.view.btnBorrar.addActionListener(this::actionPerformed);
        this.view.btnExit.addActionListener(this::actionPerformed);
        this.view.btnLimpiar.addActionListener(this::actionPerformed);
        this.view.btnExit.addActionListener(this::actionPerformed);
    }
    
    public void inicar(){    
        view.setTitle("Usuario");
        view.setLocationRelativeTo(null);
        view.txtId.setVisible(false);
        view.btnBorrar.setVisible(false);
        view.btnModificar.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == view.btnAgregar ){
            if(view.txtNombre.getText().length() > 0 && view.txtApellidoPaterno.getText().length() > 0 && view.txtApellidoMaterno.getText().length() > 0 && view.txtCorreo.getText().length() > 0 && view.txtPsw.getText().length() > 0){
                if(view.txtPsw.getText().length() > 8 && view.txtPsw.getText().length() < 17){
                    if(view.txtMatricula.getText().length() == 10){
                        if(view.txtMatricula.getText().length() == 10){
                            user.setMatricula(view.txtMatricula.getText());
                            user.setNombre(view.txtNombre.getText());
                            user.setApellidoP(view.txtApellidoPaterno.getText());
                            user.setApellidoM(view.txtApellidoMaterno.getText());
                            user.setCorreo(view.txtCorreo.getText());
                            user.setContra(view.txtPsw.getText());
                            user.setCodigoP(view.txtCodigoPostal.getText());
                            if(query.agregarUsuario(user)){
                                JOptionPane.showMessageDialog(null, "Usuario guardado correctamente!! :D","Operacion realizada",1);
                                limpiar();
                            }else{
                                JOptionPane.showMessageDialog(null, "Error al guardar. D:","ERROR",0);
                                limpiar();
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "El codigo postal debe tener 5 caracteres.","ALERTA",JOptionPane.WARNING_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "La matricula debe tener 10 digitos.","ALERTA",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                        JOptionPane.showMessageDialog(null, "La contraseña debe contar entre 8-16 caracteres.","ALERTA",JOptionPane.WARNING_MESSAGE);
                }
                
            }else{
            JOptionPane.showMessageDialog(null, "NO se han llenado todos los campos.","ALERTA",JOptionPane.WARNING_MESSAGE);
            }
            
        }
        
        if(e.getSource() == view.btnModificar){
            user.setMatricula(view.txtMatricula.getText());
            user.setNombre(view.txtNombre.getText());
            user.setApellidoP(view.txtApellidoPaterno.getText());
            user.setApellidoM(view.txtApellidoMaterno.getText());
            user.setCorreo(view.txtCorreo.getText());
            user.setContra(view.txtPsw.getText());
            user.setCodigoP(view.txtCodigoPostal.getText());
            if(query.modificarUsuario(user)){
               JOptionPane.showMessageDialog(null, "Los cambios se han guardado correctamente!! :D","Operacion realizada",1);
               limpiar();
            }else{
               JOptionPane.showMessageDialog(null, "Error al guardar. D:","ERROR",0);
               limpiar();
            }
                       
        }
        
        if(e.getSource() == view.btnBorrar){
            user.setMatricula(view.txtMatricula.getText());
            if(query.borrarUsuario(user)){
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente!! :D","Operacion realizada",1);
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al hacer la operación. D:","ERROR",0);
                limpiar();
            }
            
        }
        
        if(e.getSource() == view.btnExit){
            user.setMatricula(view.txtMatricula.getText());
            if(query.buscarUsuario(user)){
                view.txtMatricula.setText(user.getMatricula());
                view.txtNombre.setText(user.getNombre());
                view.txtApellidoPaterno.setText(user.getApellidoP());
                view.txtApellidoMaterno.setText(user.getApellidoM());
                view.txtCorreo.setText(user.getCorreo());
                view.txtCodigoPostal.setText(user.getCodigoP());
                view.btnBorrar.setVisible(true);
                view.btnModificar.setVisible(true);
                view.btnAgregar.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "No se han encontrado datos similares. D:","Ups!!", 0);
                limpiar();
            }
            
        }
        
        if(e.getSource() == view.btnLimpiar){
            limpiar();
        }
        if(e.getSource() == view.btnExit){
            view.dispose();
        }
        
    }
    
    public void limpiar(){
        view.txtMatricula.setText(null);
        view.txtNombre.setText(null);
        view.txtApellidoPaterno.setText(null);
        view.txtApellidoMaterno.setText(null);
        view.txtCorreo.setText(null);
        view.txtCodigoPostal.setText(null);
        view.txtPsw.setText(null);
        view.btnBorrar.setVisible(false);
        view.btnModificar.setVisible(false);
        view.btnAgregar.setVisible(true);
    }
    
}
