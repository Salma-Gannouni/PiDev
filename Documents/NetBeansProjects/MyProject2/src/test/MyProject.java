/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import entities.Reclamation;
import java.sql.SQLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.CRUDReclamation;
import utils.MyConnection;

/**
 *
 * @author lenovo
 */
public class MyProject /*extends Application*/{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Reclamation R = new Reclamation( 1,"gtyh", "Ala", "Ali",0);
        CRUDReclamation cr = new CRUDReclamation();
        cr.ajouterReclamation(R);
        //cr.modifierReclamation(R);
        //cr.supprimerReclamation(R);
    }
    
     /* MyConnection mc = MyConnection.getInstance();
      launch(args);
       CRUDReclamation crud1=new CRUDReclamation();
         Reclamation R1=new Reclamation(12,"test"," SATISFAIT","Livraison",0);*/
         
         //crud1.supprimerReclamation(Reclamation1);
         //crud1.modifierReclamation(Reclamation1);
       // crud1.supprimerReclamation(Reclamation1);
       // System.out.println(crud1.afficherReclamations());
      // crud1.ajouterReclamation(R1);
       
       //ReponseCRUD crud1=new ReponseCRUD();
       //Reponse Reponse1=new Reponse(3,"MMM");
         //crud1.ajouterReponse(Reponse1);
         //crud1.modifierReponse(Reponse1);
          //System.out.println(crud1.afficherReponses());
         // crud1.supprimerReponse(Reponse1);
       
       
       
       
    }

   /* @Override
    public void start(Stage primaryStage) throws Exception {
        
Parent root = FXMLLoader.load(getClass().getResource("/gui/AjoutReclamation.fxml")) ;
Scene scene = new Scene(root);

primaryStage.setTitle("MON APPLICATION JAVAFX");
primaryStage.setScene(scene);
primaryStage.show();*/
        }

        
        


