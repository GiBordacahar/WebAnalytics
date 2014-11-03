package db;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import db.usuarioDAO;
import db.usuarioVO;

class principal {
	
	public static void main(String[] args) {
		   
		principal miPrincipal = new principal();
		miPrincipal.verMenu();
	}
	
	private void verMenu() {
		   
		  String textoMenu="Menú Principal\n\n";
		  textoMenu+="Ingrese alguna de las opciones del Menú    \n";
		  textoMenu+="1. Registrar visitor\n";
		  textoMenu+="2. Registrar web\n";
		  textoMenu+="3. Salir.\n\n";
		   
		  try {
		  int seleccion= Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
		  defineSeleccion(seleccion);
		  } catch (NumberFormatException e) {
		   JOptionPane.showMessageDialog(null,"Error en el ingreso de Datos, " +
		     "solo se permiten valores númericos","ERROR",JOptionPane.ERROR_MESSAGE);
		   verMenu();
		  } catch (Exception e) {
		   JOptionPane.showMessageDialog(null,"blablabla","ERROR",JOptionPane.ERROR_MESSAGE);
		   verMenu();
		  }
	}
	
	 private void defineSeleccion(int seleccion) throws ParseException {
		   
		   System.out.println("Selecciona "+seleccion);
		    
		   switch (seleccion) {
		   case 1:
		     registrarVisitor();
		     verMenu();
		    break;
		   case 2:
			 registrarWeb();
			 verMenu();
		    break;
		   case 3:
			    System.exit(0);
			    break;
		   default:
		    JOptionPane.showMessageDialog(null, "Ingrese un " +
		      "numero valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		    verMenu();
		    break;
		   }
	}
	 
	 private void registrarVisitor() throws ParseException {
		  visitorsDAO miUsuarioDAO = new visitorsDAO();
		  visitorsVO miUsuario=new visitorsVO();
		   
		  String mensajeIngreso="Ingrese\n\n";
		   
		  String datosSolicitados[] = {"Id : ","Id Web : ",
		          "Fecha: ","Hora: ", "IP: ", "Link: "};
		  String datosuser[] = new String[6];
		  for (int i = 0; i < datosSolicitados.length; i++) {
		   //solicita el ingreso del dato y se almacena en el arreglo de datosPersona
			  datosuser[i]=JOptionPane.showInputDialog(null, mensajeIngreso+
		      datosSolicitados[i],"Datos Visitor",JOptionPane.INFORMATION_MESSAGE);
		    
		   System.out.println(datosSolicitados[i]+datosuser[i]);
		  }
		   
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		  DateFormat formatter2 = new SimpleDateFormat("HH:mm");
		  
		  miUsuario.setId(Integer.parseInt(datosuser[0]));
		  miUsuario.setId_web(Integer.parseInt(datosuser[1]));
		  miUsuario.setFecha();
		  miUsuario.setHora(Time.);
		  miUsuario.setIp(datosuser[4]);
		  miUsuario.setLink(datosuser[5]);

		   
		  miUsuarioDAO.registrarVisitor(miUsuario);
		   
	 }
	 
	 private void registrarWeb() {
		  webDAO miUsuarioDAO = new webDAO();
		  webVO miUsuario=new webVO();
		   
		  String mensajeIngreso="Ingrese\n\n";
		   
		  String datosSolicitados[] = {"Id : ","Id Usuario : ",
		          "Dominio: "};
		  String datosuser[] = new String[5];
		  for (int i = 0; i < datosSolicitados.length; i++) {
		   //solicita el ingreso del dato y se almacena en el arreglo de datosPersona
			  datosuser[i]=JOptionPane.showInputDialog(null, mensajeIngreso+
		      datosSolicitados[i],"Datos Web",JOptionPane.INFORMATION_MESSAGE);
		    
		   System.out.println(datosSolicitados[i]+datosuser[i]);
		  }
		   
		  miUsuario.setId(Integer.parseInt(datosuser[0]));
		  miUsuario.setId_usuario(Integer.parseInt(datosuser[1]));
		  miUsuario.setDominio(datosuser[2]);
		   
		  miUsuarioDAO.registrarWeb(miUsuario);
		   
	 }
	 
	 
	 
}
