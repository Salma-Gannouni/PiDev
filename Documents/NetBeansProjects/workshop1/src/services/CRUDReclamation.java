/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.sun.jdi.connect.spi.Connection;
import entities.Reclamation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MyDB;

/**
 *
 * @author lenovo
 */
public class CRUDReclamation implements InterfaceServices {
Statement ste;
    MyDB cnx = (MyDB) MyDB.getInstance().getCnx();

  
    @Override
    public void ajouter(Reclamation r) throws SQLException {
       try {
        ste = cnx.createStatement();
        String req = "Insert into reclamation values(0,'"+r.getId_reclamation()+"','"+r.getCommentaire()+"')";
        ste.executeUpdate(req);
        System.out.println("reclamation ajouté");
    } catch (SQLException ex) {
            System.out.println("reclamation non ajouté!!!!");    }
    }

    @Override
    public void modifier(Reclamation r) throws SQLException {
         try {
            String req = "UPDATE `reclamation` SET `id_reclamation` = '" + r.getId_reclamation() + "', `commentaire` = '" + r.getCommentaire() +"' WHERE `reclamation`.`id_reclamation` = " + r.getId_reclamation();
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("fournisseur updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(int id_reclamation) throws SQLException {
        try {
            String req = "DELETE FROM `reclamation` WHERE id_reclamation = " + id_reclamation;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("reclamation deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public List<Reclamation> afficherReclamations() {
     List<Reclamation> fors = new ArrayList<Reclamation>();
        try {
            ste =cnx.createStatement();
        String req = "SELECT * FROM `reclamation`";
        ResultSet result = ste.executeQuery(req);
        
        while (result.next()) {
            Reclamation resultfors = new Reclamation(result.getInt("id_reclamation"), result.getString("commentaire"));
            fors.add(resultfors);
        }
        System.out.println(fors);
      
    } catch (SQLException ex) {
         System.out.println(ex);   
    }
   return fors;  
    }
    
}
