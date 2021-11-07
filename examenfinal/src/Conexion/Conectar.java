package Conexion;

import java.sql.*;
import java.sql.DriverManager;
public class Conectar{

 
    Connection con;
    
    public Conectar(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examenfinalprogra2b-1,","root","");
            
        }
        catch(Exception e){
             System.err.println("Error: " + e);
            
        }
         
    }
     public Connection getConnection(){
        return con;
    }
  
}


   
