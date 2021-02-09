package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas{
    private String sqlQuery;
    private PreparedStatement ps;
    private ResultSet rs;
    protected Conexion conexion;
    
    public Consultas(){
        conexion = new Conexion();
    }
    
    public boolean agregarUsuario(Usuario us){
        
        System.out.println(conexion.getDriver()+"\n"+conexion.getURL()+"\n"+conexion.getUser()+"\n"+conexion.getPassword());
        ps = null;
        Connection con = conexion.getConexion();
        sqlQuery = "INSERT INTO tablabUsuario(matricula,nombre,apellidoP,apellidoM,correo,cPostal,contra) VALUES(?,?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sqlQuery);
            ps.setString(1, us.getMatricula());
            ps.setString(2, us.getNombre());
            ps.setString(3, us.getApellidoP());
            ps.setString(4, us.getApellidoM());
            ps.setString(5, us.getCorreo());
            ps.setString(6, us.getCodigoP());
            ps.setString(7, us.getContra());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean modificarUsuario(Usuario us){
        System.out.println(conexion.getDriver()+"\n"+conexion.getURL()+"\n"+conexion.getUser()+"\n"+conexion.getPassword());
        ps = null;
        Connection con = conexion.getConexion();
        sqlQuery = "UPDATE tablabUsuario SET nombre=?,apellidoP=?,apellidoM=?,correo=?,cPostal=?,contra=? WHERE matricula=?";
        
        try{
            ps = con.prepareStatement(sqlQuery);
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getApellidoP());
            ps.setString(3, us.getApellidoM());
            ps.setString(4, us.getCorreo());
            ps.setString(5, us.getCodigoP());
            ps.setString(6, us.getContra());
            ps.setString(7, us.getMatricula());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean borrarUsuario(Usuario us){
        System.out.println(conexion.getDriver()+"\n"+conexion.getURL()+"\n"+conexion.getUser()+"\n"+conexion.getPassword());
        ps = null;
        Connection con = conexion.getConexion();
        sqlQuery = "DELETE FROM tablabUsuario WHERE matricula=?";
        
        try{
            ps = con.prepareStatement(sqlQuery);
            ps.setString(1, us.getMatricula());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean buscarUsuario(Usuario us){
        ps = null;
        Connection con = conexion.getConexion();
        sqlQuery = "SELECT * FROM tablabUsuario WHERE matricula=?";
        
        try{
            ps = con.prepareStatement(sqlQuery);
            ps.setString(1, us.getMatricula());
            rs = ps.executeQuery();
            if(rs.next()){
                us.setMatricula(rs.getString("matricula"));
                us.setNombre(rs.getString("nombre"));
                us.setApellidoP(rs.getString("apellidoP"));
                us.setApellidoM(rs.getString("apellidoM"));
                us.setCorreo(rs.getString("correo"));
                us.setCodigoP(rs.getString("cPostal"));
                return true;
            }
            
            return false;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
}