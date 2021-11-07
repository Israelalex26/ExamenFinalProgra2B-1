/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Conexion.Conectar;
import entidades.modelos;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author personal
 */
public class modelo {
     public ArrayList<modelos> modelos(){
       
        Conectar conec = new Conectar();
      
                modelos vo = new modelos();
        return null;
              
    }
    public void Agregarmodelo(entidades.modelos vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO modelos (Id, Nombresmodelos )\n" +
"VALUES (NULL,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
        
            ps.setString(1, vo.getModelo());
           
           
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("A "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("B "+ex.getMessage());
        }
            
        
    }
    public void Modificarmodelo(entidades.modelos vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE modelo SET  modelos = ? \n" +
"WHERE Id = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
           
            ps.setString(1, vo.getModelo());
            ps.setInt(2, vo.getId());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            
            
        }
    }


}
