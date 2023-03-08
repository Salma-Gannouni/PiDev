/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import DAO.CRUDlivreur;
import entities.Livreur;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author asus
 */

public class AfficheLivreurController implements Initializable {

    @FXML
    private TableColumn<Livreur, Integer> idTv;
    @FXML
    private TableColumn<Livreur, String> nomTv;
    @FXML
    private TableColumn<Livreur, String> prenomTv;
    @FXML
    private TableColumn<Livreur, String> telTv;
    @FXML
    private TableColumn<Livreur, String> regionTv;
    @FXML
    private ComboBox<String> comboTv;
    @FXML
    private TableView<Livreur> livTv;
     private String combo ;
    @FXML
    private Button retourbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        comboTv.getItems().addAll("Ariana","raoued","borj louzir");
        comboTv.setOnAction(event->{ 
           combo = comboTv.getSelectionModel().getSelectedItem();
           System.out.println(combo);
      table();
 }  );
    }
    public void table(){
       CRUDlivreur  cd = new CRUDlivreur();
      //ObservableList<Livreur> listeLivreurs= cd.RechercherLivreur(combo);
      //ObservableList<Livreur> livreurs = FXCollections.observableArrayList(cd.RechercherLivreur(combo));
      idTv.setCellValueFactory(new PropertyValueFactory("id"));
        nomTv.setCellValueFactory(new PropertyValueFactory("nom"));
        prenomTv.setCellValueFactory(new PropertyValueFactory("prenom"));      
        telTv.setCellValueFactory(new PropertyValueFactory("tel"));      
        regionTv.setCellValueFactory(new PropertyValueFactory("region"));   
       livTv.setItems(FXCollections.observableArrayList(cd.RechercherLivreur(combo))); 
    }
    @FXML
    private void Cancel(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherLivraison.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
//                stage.setFullScreen(true);
                stage.show();

    }
}