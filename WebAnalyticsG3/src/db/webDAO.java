package db;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

class webDAO {

	public void registrarWeb(webVO web) {
		  dbConnection conex= new dbConnection();
		  try {
		   Statement estatuto = conex.getConnection().createStatement();
		   estatuto.executeUpdate("INSERT INTO web VALUES ('"+web.getId()+"', '"
		     +web.getId_usuario()+"', '"+web.getDominio()+"')");
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro la web");
		  }
	}
	
}
