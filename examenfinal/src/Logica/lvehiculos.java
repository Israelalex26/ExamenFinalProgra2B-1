

package Logica;
import Conexion.Conectar;
import entidades.vehiculos;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author personal
 */
public class lvehiculos {
    
    public ArrayList<vehiculos> vehiculos(){
       
        Conectar conec = new Conectar();
      
                vehiculos vo = new vehiculos();
        return null;
              
    }
    public void Agregarvehiculo(vehiculos vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO cvehiculos (Id, Tipovehiculo, Modelo, Marca )\n" +
"VALUES (NULL,?,?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTipovehi());
            ps.setString(2, vo.getModelo());
            ps.setString(3, vo.getMarca());
           
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println("A "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("B "+ex.getMessage());
        }
            
        
    }
    public void Modificarvehiculos(vehiculos vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE cvehiculos SET Tipovehiculo = ?, Modelo = ?, Marca = ? \n" +
"WHERE Id = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTipovehi());
            ps.setString(2, vo.getModelo());
            ps.setString(3, vo.getMarca());
            ps.setInt(4, vo.getIdproducto());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            
            
        }
    }
}

