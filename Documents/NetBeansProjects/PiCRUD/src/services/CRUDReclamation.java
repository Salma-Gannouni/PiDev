/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Reclamation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class CRUDReclamation implements InterfaceReclamation{

     Connection cnx1;
    public CRUDReclamation() {
        cnx1=MyConnection.getInstance().getCnx();}
    
    @Override
    public void ajouterReclamation(Reclamation R) {
         try {
            
            String requete="INSERT INTO `reclamation`"
                    + "(`id_reclamation`, "
                    + "`id_utilisateur`, "
                    + "`categorie_reclamation`,"
                    + "`objet_reclamation`, "
                    + "`description_reclamation`,"
                    + "`etat_reclamation`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst2=cnx1.prepareStatement(requete);
            pst2.setInt(1, R.getId_Reclamation());
            pst2.setInt(2, R.getId_user());
            pst2.setString(3, R.getCategorie_Reclamation());
            pst2.setString(4, R.getObjet_Reclamation());
            pst2.setString(5, R.getDescription_Reclamation());
            pst2.setInt(6, R.getEtat_Reclamation());
            
           
            pst2.executeUpdate();
            System.out.println("Reclamation ajoutée avec succès");//}

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());        }
    }

    @Override
    public void modifierReclamation(Reclamation R) {
         try {
            String requete="UPDATE `reclamation` SET"
                    + " `id_reclamation`=?,"
                    + "`id_utilisateur`=?,`"
                    + "categorie_reclamation`=?,"
                    + "`objet_reclamation`=?,"
                    + "`description_reclamation`=?,"
                    + "`etat_reclamation`=? WHERE `objet_reclamation`=?";
            PreparedStatement pst=cnx1.prepareStatement(requete);
           pst.setInt(1, R.getId_Reclamation());
            pst.setInt(2, R.getId_user());
            pst.setString(3, R.getCategorie_Reclamation());
            pst.setString(4, R.getObjet_Reclamation());
            pst.setString(5, R.getDescription_Reclamation());
            pst.setInt(6, R.getEtat_Reclamation());
            
            pst.executeUpdate();
            System.out.println("Reclamation modifiée avec succès");
        } 
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void supprimerReclamation(Reclamation R) {
           try {
            String requete="DELETE FROM `reclamation` WHERE `id_reclamation`=?";
            PreparedStatement pst=cnx1.prepareStatement(requete);
            pst.setInt(1, R.getId_Reclamation());
            pst.executeUpdate();
            System.out.println("Reclamation supprimée avec succès");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public List<Reclamation> afficherReclamations() {
        ObservableList<Reclamation> ReclamationList=FXCollections.observableArrayList();
        try {
            String requete="SELECT * FROM reclamation";
            Statement st=cnx1.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
                Reclamation Reclamation=new Reclamation();
                Reclamation.setId_Reclamation(rs.getInt(1));
                Reclamation.setId_user(rs.getInt(2));
                Reclamation.setCategorie_Reclamation(rs.getString(3));
                Reclamation.setObjet_Reclamation(rs.getString(4));
                Reclamation.setDescription_Reclamation(rs.getString(5));
                Reclamation.setEtat_Reclamation(rs.getInt(6));
                
                ReclamationList.add(Reclamation);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage()); 
        }
        return ReclamationList;
    }
    
      public ObservableList<Reclamation> afficherReclamationsClient(){
        ObservableList<Reclamation> ReclamationList=FXCollections.observableArrayList();
        try {
            String requete="SELECT * FROM reclamation where id_utilisateur=3";
            Statement st=cnx1.createStatement();
            ResultSet rs=st.executeQuery(requete);
            while(rs.next()){
                Reclamation Reclamation=new Reclamation();
                
                
                Reclamation.setCategorie_Reclamation(rs.getString(3));
                Reclamation.setObjet_Reclamation(rs.getString(4));
                Reclamation.setDescription_Reclamation(rs.getString(5));
                Reclamation.setEtat_Reclamation(rs.getInt(6));
                
                ReclamationList.add(Reclamation);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage()); 
        }
        return ReclamationList;
    }
      
    
    public void etat(Reclamation reclamation){
        try {
            String requete = "UPDATE `reclamation` SET `etat_reclamation`=? WHERE `id_reclamation`=?";
            PreparedStatement pst = cnx1.prepareStatement(requete);
            pst.setInt(1, 1);
            pst.setInt(2, reclamation.getId_Reclamation());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CRUDReclamation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
