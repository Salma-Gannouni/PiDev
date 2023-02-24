/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import entities.Reclamation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import services.CRUDReclamation;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class AjoutReclamationController implements Initializable {

    @FXML
    private ComboBox<String> comboCategorie;
    @FXML
    private TextField textObjet;
    @FXML
    private TextArea textReclamation;
    @FXML
    private Button envoyerReclamation;
    private String combo ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboCategorie.getItems().addAll("Vendeur","Produit","Livraison");
        comboCategorie.setOnAction(event->{ 
        
                combo = comboCategorie.getSelectionModel().getSelectedItem();
                System.out.println(combo);
} );
        
      
        
//            public Reclamation(int id_user, String objet_Reclamation, 
//                    String description_Reclamation, String categorie_Reclamation, 
//                    int etat_Reclamation) {
        envoyerReclamation.setOnAction( e -> {
            if (textObjet.getText().isEmpty() || textReclamation.getText().isEmpty()||comboCategorie.getValue().isEmpty() )
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Information Dialog");

                alert.setHeaderText(null);

                alert.setContentText("Veuillez remplir tous les champs!");

                alert.show();
                }
            else {
        Reclamation rec = new Reclamation(12,textObjet.getText(),textReclamation.getText(),combo,0);
        CRUDReclamation crud1=new CRUDReclamation();
        crud1.ajouterReclamation(rec);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Information Dialog");

                alert.setHeaderText(null);

                alert.setContentText("Reclamation ajoutée avec succés!");

                alert.show();
        }
        
        } );
        

    }    
    
}
