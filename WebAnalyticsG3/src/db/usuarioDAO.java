package db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import db.dbConnection;
import db.usuarioVO;

class usuarioDAO {
	
	public usuarioDAO() {
	
	}
	public void registrarUsuario(usuarioVO usuario) {
		  dbConnection conex= new dbConnection();
		  try {
		   Statement estatuto = conex.getConnection().createStatement();
		   estatuto.executeUpdate("INSERT INTO usuario VALUES ('"+usuario.getId()+"', '"
		     +usuario.getNombre()+"', '"+usuario.getUser()+"', '"
		     +usuario.getPass()+"')");
		   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
		   estatuto.close();
		   conex.desconectar();
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro el usuario");
		  }
	}
	
	public ArrayList<usuarioVO> consultarUsuario(String user) {
		  ArrayList<usuarioVO> miUsuario = new ArrayList<usuarioVO>();
		  dbConnection conex= new dbConnection();
		     
		  try {
		   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM usuario where user = ? ");
		   consulta.setString(1, user);
		   ResultSet res = consulta.executeQuery();
		    
		  if(res.next()){
			usuarioVO usuario= new usuarioVO();
			usuario.setId(Integer.parseInt(res.getString("id")));
			usuario.setNombre(res.getString("nombre"));
			usuario.setUser(res.getString("user"));
			usuario.setPass(res.getString("pass"));
		    miUsuario.add(usuario);
		          }
		          res.close();
		          consulta.close();
		          conex.desconectar();
		    
		  } catch (Exception e) {
		   JOptionPane.showMessageDialog(null, "no se pudo consultar el usuario\n"+e);
		  }
		  return miUsuario;
	}
	
	
}
