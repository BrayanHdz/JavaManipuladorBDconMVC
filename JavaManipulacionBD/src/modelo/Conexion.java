package modelo;

import java.sql.*;

public class Conexion {
	
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/manipulacionMVC";
	private String user = "root";
	private String password = "1Puerc@Volador9";
	public Connection connection;

	
	public Connection getConexion(){
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			return connection;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			return null;		
	}
	
	public void setDriver(String controlador){
		driver = controlador;
	}

	public void setPassword(String contrasena){
		password = contrasena;
	}
	
	public void setURL(String URL){
		url = URL;
	}
	
	public void setUser(String usuario){
		user = usuario;
	}
	
	public String getDriver(){
		return driver;
	}

	public String getPassword(){
		return password;
	}

	public String getURL(){
		return url;
	}

	public String getUser(){
		return user;
	}
}
