/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entities.PointRelais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import services.InterfacePointRelais;
import test.DBConnection;

/**
 *
 * @author asus
 */
public class CRUDPointRelais implements InterfacePointRelais {
      Statement st;
    Connection conn = DBConnection.getInstance();
 private final String INSERT_PointRelais="Insert into point_relais(`nom`,`adresse`,`etat`) values (?,?,?)";
 private final String DELETE_PointRelais=" DELETE from `point_relais` WHERE id= ?";
private final String RECHERCHE_PointRelais=" SELECT * from `point_relais` WHERE nom= ?";


    @Override
    public void AjouterPointRelais(PointRelais p) {
             try {
        st= conn.createStatement();
        PreparedStatement req=conn.prepareStatement(INSERT_PointRelais);
        req.setString(1,p.getNom());      
        req.setString(2,p.getAdresse());    
        req.setString(3,p.getEtat());       
        req.executeUpdate();
         
        System.out.println("point relais ajoutée");
        }
        catch(SQLException ex){
            System.out.println("point relais non ajoutée");
            System.out.println(ex.getMessage());

                   
    }
        
    }

    @Override
    public void ModifierPointRelais(PointRelais p) {
         try {
            String req = "UPDATE `point_relais` SET `nom` = '" + p.getNom() + "', `adresse` = '" + p.getAdresse()+ "', `etat` = '" + p.getEtat()+ "' WHERE "
                    + "`id` = " + p.getId();
            Statement st = conn.createStatement();
            st.executeUpdate(req);
            System.out.println("point relais updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void SupprimerPointRelais(int id) {
              try{
            st= conn.createStatement();
            PreparedStatement req=conn.prepareStatement(DELETE_PointRelais);
            req.setInt(1,id); 
          
            req.executeUpdate();
            System.out.println("point relais supprimé");
        }
        catch (SQLException ex){
            System.out.println("point relais non supprimé!!!");
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<PointRelais> RechercherPointRelais(String nom) {
       List<PointRelais> pointRelais = new ArrayList<>();
        try{
            
            st= conn.createStatement();
            PreparedStatement req=conn.prepareStatement(RECHERCHE_PointRelais);
            req.setString(1,nom); 
            ResultSet result =req.executeQuery();
            while(result.next()){
                
                pointRelais.add(new PointRelais(
                        result.getInt("id"),
                        result.getString("nom"),
                        result.getString("adresse"),
                        result.getString("etat")));
                
            }
            
            System.out.println(pointRelais);
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
    
        return pointRelais;

    }
     @Override
    public List<PointRelais> afficherPointRelais() {
    
        List<PointRelais> pointRelais = new ArrayList<>();
        try{
            st= conn.createStatement();
            String req="Select * from `point_relais`";
            ResultSet result =st.executeQuery(req);
            while(result.next()){
                
                pointRelais.add(new PointRelais(
                        result.getInt("id"),
                        result.getString("nom"),
                        result.getString("adresse"),
                        result.getString("etat")));
                
            }
            
            System.out.println(pointRelais);
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
    
        return pointRelais;
    }
    
}
