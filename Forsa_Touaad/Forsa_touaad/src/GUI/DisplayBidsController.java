package GUI;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import service.ServiceBid;


public class DisplayBidsController implements Initializable {
    @FXML
    public TableView<Bid> list_bids;
    @FXML
    public TableColumn<?, ?> id_bid_col;
    @FXML
    public TableColumn<?, ?> bid_amount_col;
    @FXML
    public TableColumn<?, ?> entry_date_col;
    @FXML
    public TableColumn<?, ?> entry_time_col;
    @FXML
    public TableColumn<?, ?> active_duration_col;
    @FXML
    public TableColumn<?, ?> type_col;
    Stage Stage_2;
    ServiceBid sb = new ServiceBid();
    List<Bid> lt = sb.afficherBids();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<Bid> datalist = FXCollections.observableArrayList(lt);

        id_bid_col.setCellValueFactory(new PropertyValueFactory<>("id_bid"));
        bid_amount_col.setCellValueFactory(new PropertyValueFactory<>("bid_amount"));
        entry_date_col.setCellValueFactory(new PropertyValueFactory<>("entry_date"));
        entry_time_col.setCellValueFactory(new PropertyValueFactory<>("entry_time"));
        active_duration_col.setCellValueFactory(new PropertyValueFactory<>("active_duration"));
        type_col.setCellValueFactory(new PropertyValueFactory<>("type"));
        System.out.println(lt);
        list_bids.setItems(datalist);
    }

    public void go_back(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/GUI/Enter_Bid.fxml"));
            Stage_2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            root.setOnMousePressed(pressEvent -> {
                root.setOnMouseDragged(dragEvent -> {
                    Stage_2.setX(dragEvent.getScreenX() - pressEvent.getSceneX());
                    Stage_2.setY(dragEvent.getScreenY() - pressEvent.getSceneY());
                });
            });
            Scene scene = new Scene(root);

            Stage_2.setScene(scene);
            Stage_2.show();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public void app_close(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }
}
