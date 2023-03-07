/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;


import DAO.CRUDlivraison;
import com.mysql.cj.Session;
import com.mysql.cj.protocol.Message;
import entities.Livraison;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Optional;
import java.util.Properties;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import entities.Mail;


/**
 * FXML Controller class
 *
 * @author asus
 */
public class LivrerCommandeController implements Initializable {

    @FXML
    private TextField adresseTf;
    @FXML
    private TextField numeroTf;
    @FXML
    private Button Confirmerbtn;
  

    /**
     * Initializes the controller class.
     */
    
 


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void confirmerButtonAction(ActionEvent event) {
       Confirmerbtn.setOnAction( e -> {
            if (adresseTf.getText().isEmpty() || numeroTf.getText().isEmpty() )
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Information Dialog");

                alert.setHeaderText(null);

                alert.setContentText("Veuillez remplir tous les champs!");

                alert.show();
                }
            else {
         Livraison L = new Livraison(3,27,32,10,adresseTf.getText(),"non livré",numeroTf.getText());     
      CRUDlivraison crud1 = new CRUDlivraison();
        crud1.AjouterLivraison(L);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setTitle("Information Dialog");

                alert.setHeaderText(null);

//                alert.setContentText("votre livraison est en cours de traitement!");
alert.setContentText("votre livraison est en cours");

                alert.show(); 
    }
       }
            );
       
}
     public void envoyeremail() {
      String to = "matrouh.ranya.11@gmail.com";
         String from = "rania.matrouh@€sprit.tn";
        String password = "223JFT1437";

    String host = "smtp.gmail.com";
    String port = "587";

    // Set up properties for the SMTP connection
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
    props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

    // Create a new Session object
    javax.mail.Session session = javax.mail.Session.getInstance(props,
        new javax.mail.Authenticator() {
          protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
            return new javax.mail.PasswordAuthentication(from, password);
          }
        });

    try {
      // Create a new message
      javax.mail.Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress(from));
      message.setRecipients(javax.mail.Message.RecipientType.TO,
          InternetAddress.parse(to));
      message.setSubject("Produit Valider");
      message.setText("Votre Produit est validé");

      // Send the message
      Transport.send(message);

      System.out.println("Message sent successfully!");

    } catch (MessagingException e) {
      System.out.println("Failed to send message: " + e.getMessage());
    }}
}  

 
           
 



