/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entities.Livreur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import services.InterfacesLivreur;
import test.DBConnection;

/**
 *
 * @author asus
 */
public class CRUDlivreur implements InterfacesLivreur {
    
    Statement st;
    Connection conn = DBConnection.getInstance();
 private final String INSERT_LIVREUR="Insert into livreur(`id`,`nom`,`prenom`,`tel`,`region`) values (NULL,?,?,?,?)";
private final String DELETE_LIVREUR=" DELETE from `livreur` WHERE id= ?";
private final String RECHERCHE_LIVREUR=" SELECT * from `livreur` WHERE region= ?";

      @Override
    public void AjouterLivreur(Livreur v) {
        try {
        st= conn.createStatement();
        PreparedStatement req=conn.prepareStatement(INSERT_LIVREUR);
        req.setString(1,v.getNom());      
        req.setString(2,v.getPrenom());    
        req.setString(3,v.getTel());      
        req.setString(4,v.getRegion());       
        req.executeUpdate();
        System.out.println("livreur ajouté");
        }
        catch(SQLException ex){
            System.out.println("Livreur non ajouté");
            System.out.println(ex.getMessage());

                   
    }
    }

    @Override
    public void ModifierLivreur(Livreur v) {
        try {
            String req = "UPDATE `livreur` SET `tel` = '" + v.getNom() + "', `nom` = '" + v.getPrenom()+ "', `prenom` = '" + v.getTel()+ "' WHERE "
                    + "`id` = " + v.getId();
            Statement st = conn.createStatement();
            st.executeUpdate(req);
            System.out.println("Livreur updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void SupprimerLivreur(int id) {
        try{
            st= conn.createStatement();
            PreparedStatement req=conn.prepareStatement(DELETE_LIVREUR);
            req.setInt(1,id); 
          
            req.executeUpdate();
            System.out.println("Livreur supprimé");
        }
        catch (SQLException ex){
            System.out.println("Livreur non supprimé!!!");
            System.out.println(ex.getMessage());
        }
    }
     
   @Override
    public List<Livreur> RechercherLivreur(String region) {
        List<Livreur> livreur = new ArrayList<>();
        try{
            
            st= conn.createStatement();
            PreparedStatement req=conn.prepareStatement(RECHERCHE_LIVREUR);
            req.setString(1,region); 
            ResultSet result =req.executeQuery();
            while(result.next()){
                
                livreur.add(new Livreur(
                       result.getInt("id"),
                       result.getString("nom"),
                        result.getString("prenom"),
                        result.getString("tel"),
                        result.getString("region")));
                
            }
            
            System.out.println(livreur);
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
    
        return livreur;
    }
   
     public List<Livreur> afficherlivreurs() {
    
        List<Livreur> livreur = new ArrayList<>();
        try{
            st= conn.createStatement();
            String req="Select * from `livreur`";
            ResultSet result =st.executeQuery(req);
            while(result.next()){
                
                livreur.add(new Livreur(
                       result.getInt("id"),
                        result.getString("nom"),
                        result.getString("prenom"),
                        result.getString("tel"),
                        result.getString("region")));  

                
            }
            
            System.out.println(livreur);
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
    
        return livreur;
    }

  
    
}
