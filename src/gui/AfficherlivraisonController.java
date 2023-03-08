/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import DAO.CRUDlivraison;
import entities.Livraison;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import test.DBConnection;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class AfficherlivraisonController implements Initializable {

    @FXML
    private TableView<Livraison> livraisonTv;
    @FXML
    private TableColumn<Livraison,Integer> idTv;
    @FXML
    private TableColumn<Livraison,String> adresseTv;
    @FXML
    private TableColumn<Livraison,String>  etatTv;
    @FXML
    private TableColumn<Livraison,String>  numTv;
    @FXML
    private TableColumn<Livraison,Integer> idUserTv;
    @FXML
    private TableColumn<Livraison,Integer>  idProTv;
     @FXML
    private TableColumn<Livraison,Integer> idLiv;
    @FXML
    private Button btnSupprimer;
    @FXML
    private Button btnAffecter;
    
    @FXML
    private Button btnValider;
    

 
   

    /**
     * Initializes the controller class.
     */
    Connection conn = DBConnection.getInstance();
    CRUDlivraison ps =new CRUDlivraison();
    

        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
         table();    
        

    }
    @FXML
      public void delete() {
        int myIndex =  livraisonTv.getSelectionModel().getSelectedIndex();
        int id = Integer.parseInt(String.valueOf(livraisonTv.getItems().get(myIndex).getId()));
        System.out.println(id);
        ps.SupprimerLivraison(id);
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle(" supprimer Livraison");
             table();
            
            alert.setHeaderText("Livraison supprimée");
            alert.setContentText("supprimé!");

            alert.showAndWait();
    }
      public void table(){
       livraisonTv.setItems(FXCollections.observableArrayList(ps.afficherLivraison()));
        idTv.setCellValueFactory(new PropertyValueFactory("id"));
        adresseTv.setCellValueFactory(new PropertyValueFactory("adresse"));
        etatTv.setCellValueFactory(new PropertyValueFactory("etat"));      
        numTv.setCellValueFactory(new PropertyValueFactory("num"));   
        idUserTv.setCellValueFactory(new PropertyValueFactory("id_user"));
        idProTv.setCellValueFactory(new PropertyValueFactory("id_produit"));  
        idLiv.setCellValueFactory(new PropertyValueFactory("id_livreur"));

           livraisonTv.setRowFactory(tv -> {
		     TableRow<Livraison> myRow = new TableRow<>();
		     myRow.setOnMouseClicked ((event) -> 
		     {
		        if (event.getClickCount() == 1 && (!myRow.isEmpty()))
		        {
		            int myIndex =  livraisonTv.getSelectionModel().getSelectedIndex();

		           int id = Integer.parseInt(String.valueOf(livraisonTv.getItems().get(myIndex).getId()));
                            }
		     });
		        return myRow;
                   });
      }

    
//btn valider
@FXML
    private void valider_etat(ActionEvent event) {
        
        int myIndex = livraisonTv.getSelectionModel().getSelectedIndex();
        int id = Integer.parseInt(String.valueOf(livraisonTv.getItems().get(myIndex).getId()));
            System.out.println(id);
                ps.validateEtat(id);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("etat valider");
                alert.setHeaderText("etat Registation");
                alert.setContentText("Updateddd!");

                alert.showAndWait();
                                table();

    }
    @FXML
    private void Affecter(ActionEvent event) throws IOException {
       // FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/AfficherLivreur.fxml"));  
          FXMLLoader loader = new FXMLLoader (getClass().getResource("/gui/AfficheLivreur.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();

    }
 
    }

   