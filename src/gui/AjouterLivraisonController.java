/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import DAO.CRUDlivraison;
import entities.Livraison;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class AjouterLivraisonController implements Initializable {

    @FXML
    private TextField nomTf;
    @FXML
    private TextField etatTV;
    @FXML
    private TextField adresseTv;
    @FXML
    private TextField idProdTv;
    CRUDlivraison ps =new CRUDlivraison();
    @FXML
    private Button btnAffiche;
    @FXML
    private Button btn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    private void affiche(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficheLivraison.fxml"));
            Parent root = loader.load();
            AfficheLivraisonController controller = loader.getController();
            controller.setData(nomTf.getText()+ " " + etatTV.getText()+ " " + adresseTv.getText());
            idProdTv.getScene().setRoot(root);
            
        } catch (IOException ex) {
            System.out.println("error" + ex.getMessage());
        }
        
    }
    // button ajouter livraison
    @FXML
        private void ajout(ActionEvent event) {
            int id=Integer.parseInt(idProdTv.getText());
            String nom=nomTf.getText(); 
            String etat=etatTV.getText();      
            String adresse=adresseTv.getText();
            Livraison L = new Livraison(id,nom,adresse,etat);
            ps.AjouterLivraison(L);
            System.out.println("Livraison ajouter avec succes");
    }
        @FXML
    private void Afficher(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/AfficheLivraison.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();

    }


    
    
}
