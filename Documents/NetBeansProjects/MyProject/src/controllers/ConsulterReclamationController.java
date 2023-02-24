/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class ConsulterReclamationController implements Initializable {

    @FXML
    private TableView<?> tableRecClient;
    @FXML
    private TableColumn<?, ?> categorie_traite;
    @FXML
    private TableColumn<?, ?> objet_traite;
    @FXML
    private TableColumn<?, ?> etat_traite;
    @FXML
    private TableColumn<?, ?> reclamationClient;
    @FXML
    private TableView<?> ViewReponse;
    @FXML
    private TableColumn<?, ?> idRec;
    @FXML
    private TableColumn<?, ?> rep;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
