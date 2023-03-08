/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import DAO.CRUDlivreur;
import entities.Livraison;
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
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class AfficherLivreurController implements Initializable {
       
    @FXML
    private TableView<Livreur> livreurTv1;
    @FXML
    private TableColumn<Livreur, Integer> idt1;
    @FXML
    private TableColumn<Livreur, String> nomt1;
    @FXML
    private TableColumn<Livreur, String> prenomt1;
    @FXML
    private TableColumn<Livreur, String>  telt1;
    @FXML
    private TableColumn<Livreur, String> regiont1;
    @FXML
    private ComboBox<String>  comboRegion1;
      private String combo ;
   

    

        
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    comboRegion1.getItems().addAll("Ariana","raoued","borj louzir");
        comboRegion1.setOnAction(event->{ 
                combo = comboRegion1.getSelectionModel().getSelectedItem();
                System.out.println(combo);
      CRUDlivreur  cdLiv = new CRUDlivreur();
    ObservableList<Livreur> listeLivreurs= cdLiv.RechercherLivreur(combo);
    ObservableList<Livreur> livreurs = FXCollections.observableArrayList(listeLivreurs);
            idt1.setCellValueFactory(new PropertyValueFactory("id"));
        nomt1.setCellValueFactory(new PropertyValueFactory("nom"));
        prenomt1.setCellValueFactory(new PropertyValueFactory("prenom"));      
        telt1.setCellValueFactory(new PropertyValueFactory("tel"));      
        regiont1.setCellValueFactory(new PropertyValueFactory("region"));   
       livreurTv1.setItems(FXCollections.observableArrayList(livreurs));



    }  );}

   

    /**@FXML
     public void affiche(){
       livreurTv1.setItems(FXCollections.observableArrayList(cd.afficherlivreurs()));
        idt1.setCellValueFactory(new PropertyValueFactory("id"));
        nomt1.setCellValueFactory(new PropertyValueFactory("nom"));
        prenomt1.setCellValueFactory(new PropertyValueFactory("prenom"));      
        telt1.setCellValueFactory(new PropertyValueFactory("tel"));      
        regiont1.setCellValueFactory(new PropertyValueFactory("region"));   

           livreurTv1.setRowFactory(tv -> {
		     TableRow<Livreur> myRow = new TableRow<>();
		     myRow.setOnMouseClicked ((event) -> 
		     {
		        if (event.getClickCount() == 1 && (!myRow.isEmpty()))
		        {
		            int myIndex =  livreurTv1.getSelectionModel().getSelectedIndex();

		           int id = Integer.parseInt(String.valueOf(livreurTv1.getItems().get(myIndex).getId()));
                            }
		     });
		        return myRow;
                   });
      }
**/

    
}
