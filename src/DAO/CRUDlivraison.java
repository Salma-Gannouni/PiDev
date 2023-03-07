/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entities.Livraison;
import entities.Livreur;
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
     private final String INSERT_LIVRAISON="INSERT INTO `livraison` VALUES (NULL,?,?,?,?,?,?);";
      private final String DELETE_LIVRAISON=" DELETE from `livraison` WHERE id= ?";
      private final String VALIDATE_LIVRAISON = "UPDATE livraison SET etat = 'livré' WHERE id = ?";



    @Override
    public void AjouterLivraison(Livraison L) {
        try {
        st= conn.createStatement();
        PreparedStatement req=conn.prepareStatement(INSERT_LIVRAISON);
        req.setString(1,L.getAdresse());    
        req.setString(2,L.getEtat());        
        req.setString(3,L.getNum());  
        req.setInt(4,L.getId_user());  
        req.setInt(5, L.getId_produit());  
        req.setInt(6, L.getId_livreur());

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
            String req = "UPDATE `livraison` SET  `adresse` = '" + L.getAdresse()+ "', `etat` = '" + L.getEtat()+ "' WHERE "
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
                        result.getInt("id_user"),  
                        result.getInt("id_livreur"),
                        result.getString("adresse"),         
                        result.getString("etat"),
                        result.getString("num")));  


                
            }
            
            System.out.println(livraison);
        }catch(SQLException ex){
            System.out.println(ex);
            
        }
    
        return livraison;

    }
    
    @Override
    public void affecterLivreur(Livraison L, Livreur v) {
        
     {
        try{
            
         String req="UPDATE `livraison` SET id_livreur =  ? WHERE id= ? ;";
            PreparedStatement stmt=conn.prepareStatement(req);
            stmt.setInt(1, v.getId());
         stmt.setInt(2, L.getId());
        stmt.executeUpdate();
            System.out.println("Livreur effectué");
        
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
         
    
    }

    }
 @Override
     public boolean validateEtat(int p) {
        
        try {
            st = conn.createStatement();
            PreparedStatement stmt = conn.prepareStatement(VALIDATE_LIVRAISON);
            
            stmt.setInt(1,p);
            stmt.execute();
            return true;
        }catch(SQLException sQLException){
            System.out.println(sQLException.getMessage());
        }catch(IllegalArgumentException illegalArgumentException){
            System.out.println(illegalArgumentException.getMessage());
        }catch(NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }
        return false;
    }
}

