package com.mycompany.laligacotizacion.controlador;

import java.sql.*;


/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class Conexion {
   static String bd = "railway";
   static String login = "root";
   static String password = "mvqpytn5WqvSY7ph9lK8";
   static String url = "jdbc:mysql://root:mvqpytn5WqvSY7ph9lK8@containers-us-west-107.railway.app:6646/railway";

   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.cj.jdbc.Driver");
         //obtenemos la conexi�n
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
             System.out.println(conn);
            System.out.println("Conecci�n a base de datos "+bd+" OK");
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
   /**Permite retornar la conexi�n*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}