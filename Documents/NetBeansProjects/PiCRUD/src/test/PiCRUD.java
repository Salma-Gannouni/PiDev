/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Reclamation;
import entities.Reponse;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.CRUDReclamation;
import services.CRUDReponse;
import utils.MyConnection;

/**
 *
 * @author lenovo
 */
public class PiCRUD extends Application {
    public static void main(String[] args) {
         MyConnection mc = MyConnection.getInstance();
      launch(args);
       
      /*  Reclamation R1 = new Reclamation( 1,"kn", "matekhdmch", "bch nmchi nor9od w toz fih lpi",0);
        Reclamation R2 = new Reclamation( 5,"hedhi", "dedicace", "likom",1);
        CRUDReclamation cr = new CRUDReclamation();
       cr.ajouterReclamation(R1);
        cr.modifierReclamation(R1);*/
        //cr.supprimerReclamation(R1);
       //cr.afficherReclamations();
        
        //Reponse Rp1 = new Reponse( 1, "yezi");
        //Reponse Rp2 = new Reponse( 5,"wlh fadit");
        //CRUDReponse cr = new CRUDReponse();
        /*cr.ajouterReponse(Rp1);
        cr.ajouterReponse(Rp2);*/
        //cr.modifierReponse(Rp1);
       // cr.supprimerReponse(Rp1);
       // cr.afficherReponses();
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/gui/Menu.fxml")) ;
Scene scene = new Scene(root);

primaryStage.setTitle("VOS RECLAMATIONS");
primaryStage.setScene(scene);
primaryStage.show();
    }
}
