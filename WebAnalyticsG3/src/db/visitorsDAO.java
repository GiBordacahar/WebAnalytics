package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

class visitorsDAO {
	
	public visitorsDAO() {
		
	}
	public void registrarVisitor(visitorsVO visitor) {
		  dbConnection conex= new dbConnection();
		  try {
		   Statement estatuto = conex.getConnection().createStatement();
		   estatuto.executeUpdate("INSERT INTO visitors VALUES ('"+visitor.getId()+"', '"
		     +visitor.getId_web()+"', '"+visitor.getFecha()+"', '"
		     +visitor.getHora()+"', '"+visitor.getIp()+"', '"+visitor.getLink()+"')");
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro el visitor log");
		  }
	}

}
