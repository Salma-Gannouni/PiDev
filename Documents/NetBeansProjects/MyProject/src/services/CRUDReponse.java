/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Reponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utils.MyConnection;
/**
 *
 * @author lenovo
 */

public class CRUDReponse implements InterfaceReponse{

    Connection cnx1;
    public CRUDReponse() {
        cnx1=MyConnection.getInstance().getCnx();
    }
    
    public ObservableList<Reponse> afficherReponsesClient(){
        ObservableList<Reponse> ReponseList=FXCollections.observableArrayList();
        try {
            String requete="SELECT description_reponse FROM reponse where id_reclamation=13";
            Statement st=cnx1.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
                Reponse Reponse=new Reponse(13,null);
                
                Reponse.setDescription_Reponse(rs.getString(1));
                
                
                ReponseList.add(Reponse);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage()); 
        }
        return ReponseList;
    }
    
    
  
    @Override
    public void ajouter(Reponse Reponse){
        try {
            
            String requete="INSERT INTO `reponse`(`id_reponse`, `id_reclamation`, `description_reponse`) VALUES (?,?,?)";
            PreparedStatement pst2=cnx1.prepareStatement(requete);
            pst2.setInt(1, Reponse.getId_Reponse());
            pst2.setInt(2, Reponse.getId_Reclamation());
            pst2.setString(3, Reponse.getDescription_Reponse());
            
            pst2.executeUpdate();
            System.out.println("Reponse ajoutée avec succès");//}

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());        }
    }
    
     @Override
    public void supprimer(Reponse Reponse){
        try {
            String requete="DELETE FROM `reponse` WHERE `id_reclamation`=?";
            PreparedStatement pst=cnx1.prepareStatement(requete);
            pst.setInt(1, Reponse.getId_Reclamation());
            pst.executeUpdate();
            System.out.println("Reponse supprimée avec succès");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
     @Override
    public void modifier(Reponse Reponse) {
        try {
            String requete="UPDATE `reponse` SET `id_reponse`=?,`id_reclamation`=?,`description_reponse`=? WHERE `id_reclamation`=?";
            PreparedStatement pst=cnx1.prepareStatement(requete);
            pst.setInt(1, Reponse.getId_Reponse());
            pst.setInt(2, Reponse.getId_Reclamation());
            pst.setString(3, Reponse.getDescription_Reponse());
            pst.setInt(4, Reponse.getId_Reclamation());
   
            
            pst.executeUpdate();
            System.out.println("Reponse modifiée avec succès");
        } 
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    
        @Override
    public List<Reponse> afficher(){
        List<Reponse> ReponseList=new ArrayList<>();
        try {
            String requete="SELECT * FROM reponse";
            Statement st=cnx1.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
                Reponse Reponse=new Reponse();
                Reponse.setId_Reponse(rs.getInt(1));
                Reponse.setId_Reclamation(rs.getInt(2));
                Reponse.setDescription_Reponse(rs.getString(3));
              
                
              ReponseList.add(Reponse);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage()); 
        }
        return ReponseList;
    }

    
    
    
}
