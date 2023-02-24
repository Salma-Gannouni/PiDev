/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import entite.Bid;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import service.ServiceBid;

/**
 * FXML Controller class
 *
 * @author SBS
 */
public class Enter_BidController implements Initializable {
    @FXML
    private Button Display_list;
    @FXML
    private TextField bid_amount;
    @FXML
    private Button button_bid;
    @FXML
    private Button button_buyout;
    @FXML
    private ChoiceBox<String> nb_of_days;
    Stage Stage_1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> availableChoices = FXCollections.observableArrayList("7","14","21");
        nb_of_days.setItems(availableChoices);
    }    

    @FXML
    private void Enter_Bid(ActionEvent event) {

        int amount = Integer.parseInt(bid_amount.getText());
        int bid_duration = Integer.parseInt(nb_of_days.getSelectionModel().getSelectedItem());

        try {Bid U = new Bid(amount,bid_duration,"active");

        ServiceBid SB= new ServiceBid();
        SB.ajouterBid(U);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notif");
            alert.setHeaderText(null);
            alert.setContentText("Bid entered successfully!");
            alert.show();
        
    } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Notif");
            alert.setHeaderText(null);
            alert.setContentText("Missing Info!");
            alert.show();
        }

    }
    @FXML
    public void list_display(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/GUI/Display_Bids.fxml"));
            Stage_1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            root.setOnMousePressed(pressEvent -> {
                root.setOnMouseDragged(dragEvent -> {
                    Stage_1.setX(dragEvent.getScreenX() - pressEvent.getSceneX());
                    Stage_1.setY(dragEvent.getScreenY() - pressEvent.getSceneY());
                });
            });
            Scene scene = new Scene(root);

            Stage_1.setScene(scene);
            Stage_1.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void app_close(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }
}
