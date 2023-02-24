/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entities.Livraison;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import services.InterfaceLivraison;
import test.DBConnection;

/**
 *
 * @author asus
 */
public class CRUDlivraison implements InterfaceLivraison {
 Statement st;
    Connection conn = DBConnection.getInstance();
     private final String INSERT_LIVRAISON="INSERT INTO `livraison` VALUES (NULL,?,?,?,?);";
      private final String DELETE_LIVRAISON=" DELETE from `livraison` WHERE id= ?";
      private final String RECHERCHE_LIVRAISON=" SELECT * from `livraison` WHERE nom= ?";



    @Override
    public void AjouterLivraison(Livraison L) {
        try {
        st= conn.createStatement();
        PreparedStatement req=conn.prepareStatement(INSERT_LIVRAISON);
        req.setString(1,L.getNom());      
        req.setString(2,L.getAdresse());    
        req.setString(3,L.getEtat());  
        req.setInt(4, L.getId_produit());
        req.executeUpdate();
         
        System.out.println("livraison ajouté");
        }
        catch(SQLException ex){
            System.out.println("Livraison non ajouté");
            System.out.println(ex.getMessage());

                   
    }
    }

    @Override
    public void ModifierLivraison(Livraison L) {
         try {
            String req = "UPDATE `livraison` SET `nom` = '" + L.getNom() + "', `adresse` = '" + L.getAdresse()+ "', `etat` = '" + L.getEtat()+ "' WHERE "
                    + "`id` = " + L.getId();
            Statement st = conn.createStatement();
            st.executeUpdate(req);
            System.out.println("Livraison updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void SupprimerLivraison(int id) {
         try{
            st= conn.createStatement();
            PreparedStatement req=conn.prepareStatement(DELETE_LIVRAISON);
            req.setInt(1,id); 
          
            req.executeUpdate();
            System.out.println("livraison supprimé");
        }
        catch (SQLException ex){
            System.out.println("livraison non supprimé!!!");
            System.out.println(ex.getMessage());
        }
    }

    @Override
     public List<Livraison> RechercherLivraison(String nom){
           List<Livraison> livraison = new ArrayList<>();
        try{
            
            st= conn.createStatement();
            PreparedStatement req=conn.prepareStatement(RECHERCHE_LIVRAISON);
            req.setString(1,nom); 
            ResultSet result =req.executeQuery();
            while(result.next()){
                
                livraison.add(new Livraison(
                        result.getInt("id"),
                        result.getString("nom"),
                        result.getString("adresse"),
                        result.getString("etat")));
                
            }
            
            System.out.println(livraison);
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
    
        return livraison;
         
     }

    @Override
    public List<Livraison> afficherLivraison() {
                   List<Livraison> livraison = new ArrayList<>();
                   try{
            st= conn.createStatement();
            String req="Select * from `livraison`";
            ResultSet result =st.executeQuery(req);
            while(result.next()){
                livraison.add(new Livraison(
                        result.getInt("id"),
                         result.getInt("id_produit"),
                        result.getString("nom"),
                        result.getString("adresse"),
                        result.getString("etat")));  


                
            }
            
            System.out.println(livraison);
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
    
        return livraison;

    }
    
}
