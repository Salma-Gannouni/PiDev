/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pi.java;

import DAO.CRUDlivraison;
import DAO.CRUDlivreur;
import entities.Livraison;
import entities.Livreur;
import java.sql.Connection;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import test.DBConnection;


/**
 *
 * @author asus
 */
public class PiJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Connection connexion=DBConnection.getInstance();
         
         
         
         //CRUD LIVRAISON
         
         
         Livraison L1 = new Livraison(1,25,30,0,"borj louzir","livré","50369852");   
         Livraison L2 = new Livraison(2,26,31,0,"ariana","livré","58705242");     
         Livraison L3 = new Livraison(3,27,32,0,"raoued","en cours","24565584");     
  
         
         
         CRUDlivraison crud=new CRUDlivraison();
        //crud.AjouterLivraison(L1);  
       // crud.AjouterLivraison(L2);  
        //crud.AjouterLivraison(L3);
        //crud.SupprimerLivraison(135); 
        //crud.SupprimerLivraison(19);    
        //crud.SupprimerLivraison(20); 
        //crud.SupprimerLivraison(21); 
        //crud.SupprimerLivraison(8);
        //crud.afficherLivraison();    
      crud.ModifierLivraison(L3);
      crud.validateEtat(149);
         
     //crud Livreur
        Livreur liv1 = new Livreur("ranya","matrouh","50625093","raoued");     
        Livreur liv2= new Livreur("naima","ghedir","24441538","ariana");   
        Livreur liv3= new Livreur("salma","gannouni","56325942","borj louzir");

        CRUDlivreur cd = new CRUDlivreur();
        
        
    /*cd.AjouterLivreur(liv1);
     cd.AjouterLivreur(liv2);    
     cd.AjouterLivreur(liv3);
*/
     //cd.ModifierLivreur(liv1);
      cd.RechercherLivreur("raoued");
     //cd.SupprimerLivreur(0);
     cd.afficherlivreurs();
    crud.affecterLivreur(L2, liv1);

     
  /**      String to = "matrouh.ranya.11@gmail.com";
         String from = "moula.mohamedali@esprit.tn";
        String password = "223JMT2830";

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
    Session session = Session.getInstance(props,
        new javax.mail.Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, password);
          }
        });

    try {
      // Create a new message
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress(from));
      message.setRecipients(Message.RecipientType.TO,
          InternetAddress.parse(to));
      message.setSubject("Produit Valider");
      message.setText("Votre Produit est validé");

      // Send the message
      Transport.send(message);

      System.out.println("Message sent successfully!");

    } catch (MessagingException e) {
      System.out.println("Failed to send message: " + e.getMessage());
    }
  
    }
    **/
    }}
