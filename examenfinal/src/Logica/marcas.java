/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Conexion.Conectar;
import entidades.lmarcas;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author personal
 */
public class marcas {
     
    public ArrayList<entidades.lmarcas> Marcas(){
       
        Conectar conec = new Conectar();
      
                entidades.lmarcas vo = new entidades.lmarcas();
        return null;
              
    }
    public void Agregarmarca(entidades.lmarcas vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO marcas (Id, Nombresmarcas )\n" +
"VALUES (NULL,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getMarca());
           
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("A "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("B "+ex.getMessage());
        }
            
        
    }
    public void Modificarvehiculos(entidades.lmarcas vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE marcas SET Nombresmarcas = ? \n" +
"WHERE Id = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
           
            ps.setString(1, vo.getMarca());
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
