package db;

import java.sql.*;

class dbConnection {
		   /**Parametros de conexion*/
		   static final String bd = "webanalytics_db";
		   static final String login = "root";
		   static final String password = "";
		   static final String url = "jdbc:mysql://localhost/"+bd;
		 
		   Connection connection = null;
		 
		   /** Constructor de DbConnection */
		   public dbConnection() {
		      try{
		         //obtenemos el driver de para mysql
		         Class.forName("com.mysql.jdbc.Driver");
		         //obtenemos la conexión
		         connection = DriverManager.getConnection(url,login,password);
		 
		         if (connection!=null){
		            System.out.println("Conexión a base de datos "+bd+" OK\n");
		         }
		      }
		      catch(SQLException e){
		         System.out.println(e);
		      }catch(ClassNotFoundException e){
		         System.out.println(e);
		      }catch(Exception e){
		         System.out.println(e);
		      }
		   }
		   /**Permite retornar la conexión*/
		   public Connection getConnection(){
		      return connection;
		   }
		 
		   public void desconectar(){
		      connection = null;
		   }
	}
