/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import DAO.CRUDlivraison;
import entities.Livraison;
import java.net.URL;
import static java.nio.file.Files.delete;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import test.DBConnection;
import java.sql.Connection;
import javafx.scene.control.Alert;
import javafx.scene.control.TableRow;


/**
 * FXML Controller class
 *
 * @author asus
 */
public class AfficheLivraisonController implements Initializable {
    @FXML
    private TableView<Livraison> livraisonTv;
    @FXML
    private TableColumn<Livraison, Integer> idTv;
    @FXML
    private TableColumn<Livraison, String> nomTv;
    @FXML
    private TableColumn<Livraison, String> adresseTv;
    @FXML
    private TableColumn<Livraison, String> etatTv;
    @FXML
    private TableColumn<Livraison, Integer>idProTv;


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
                alert.setTitle("Livraison Registationn");
             table();
            
            alert.setHeaderText("Livraison Registation");
            alert.setContentText("Deleted!");

            alert.showAndWait();
    }
      public void table(){
       livraisonTv.setItems(FXCollections.observableArrayList(ps.afficherLivraison()));
        idTv.setCellValueFactory(new PropertyValueFactory("id"));
        nomTv.setCellValueFactory(new PropertyValueFactory("nom"));
        adresseTv.setCellValueFactory(new PropertyValueFactory("adresse"));
        etatTv.setCellValueFactory(new PropertyValueFactory("etat"));
        idProTv.setCellValueFactory(new PropertyValueFactory("id_produit"));
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

    void setData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    }

   