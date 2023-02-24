/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Reclamation;
import entities.Reponse;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import services.CRUDReclamation;
import services.CRUDReponse;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class ConsulterReclamationAdminController implements Initializable {

    @FXML
    private TableColumn<?, ?> UtilisateurReclamation;
    @FXML
    private TableColumn<?, ?> id_reclamation;
    @FXML
    private TableColumn<?, ?> ObjetReclamation;
    @FXML
    private TableColumn<?, ?> categorieReclamation;
    @FXML
    private TableColumn<?, ?> etatReclamation;
    @FXML
    private TableColumn<?, ?> rec;
    @FXML
    private TableView<Reclamation> tablerec;
    @FXML
    private TextField idReclamationadmin;
    @FXML
    private Button btnr;
    @FXML
    private Button supprimerrec;
    @FXML
    private TextArea textReponse;
    @FXML
    private Button validerReponse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        afficherReclamations();
        selectReclamation();
        btnr.setOnAction(event -> {
            Reclamation reclamation = new Reclamation(Integer.parseInt(idReclamationadmin.getText()));
            CRUDReclamation rec = new CRUDReclamation();
            rec.etat(reclamation);
            afficherReclamations();
        });
        
        validerReponse.setOnAction( e -> {
        if (textReponse.getText().isEmpty() )
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Information Dialog");

                alert.setHeaderText(null);

                alert.setContentText("Veuillez remplir tous les champs!");

                alert.show();
                }
            else {
            
        Reponse rep = new Reponse(Integer.parseInt(idReclamationadmin.getText()),textReponse.getText());
        CRUDReponse crud1=new CRUDReponse();
        crud1.ajouter(rep);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Information Dialog");

                alert.setHeaderText(null);

                alert.setContentText("Reponse ajoutée avec succés!");

                alert.show();
        }
    
    } );
        
         supprimerrec.setOnAction(event -> {
             Reclamation reclamation= new Reclamation(Integer.parseInt(idReclamationadmin.getText()));
             CRUDReclamation rec = new CRUDReclamation();
            rec.supprimer(reclamation);
            afficherReclamations();
            
            });
        
        
    }  
    
    public void afficherReclamations() {
       CRUDReclamation reclamation = new CRUDReclamation();
        ObservableList<Reclamation> ReclamationList = reclamation.afficher();

        UtilisateurReclamation.setCellValueFactory(new PropertyValueFactory<>("id_user"));
        id_reclamation.setCellValueFactory(new PropertyValueFactory<>("id_Reclamation"));
        categorieReclamation.setCellValueFactory(new PropertyValueFactory<>("categorie_Reclamation"));
        ObjetReclamation.setCellValueFactory(new PropertyValueFactory<>("objet_Reclamation"));
        rec.setCellValueFactory(new PropertyValueFactory<>("description_Reclamation"));
        etatReclamation.setCellValueFactory(new PropertyValueFactory<>("etat_Reclamation"));
        tablerec.setItems(ReclamationList);
    }
    
    public void selectReclamation() {
        tablerec.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                
                idReclamationadmin.setText(Integer.toString(newValue.getId_Reclamation()));
                
            }
        });
        
        

    }
    
    
    
    
    
    
    
}
