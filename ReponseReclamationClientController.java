/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class ReponseReclamationClientController implements Initializable {

    @FXML
    private TableColumn<?, ?> reclamation;
    @FXML
    private TableColumn<?, ?> etat;
    @FXML
    private TableColumn<?, ?> reponse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
