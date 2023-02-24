/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import entities.Reclamation;
import entities.Reponse;
import java.sql.Connection;
import services.CRUDReclamation;
import services.CRUDReponse;
import utils.MyConnection;

/**
 *
 * @author lenovo
 */
public class test {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MyConnection mc = MyConnection.getInstance();
         
        //Reclamation R1 = new Reclamation(2,"produit","fake image","azertyuiopqsdfghjkl",0);
         /*Reclamation R2 = new Reclamation("vendeur","details manquant","nbvcxwmlkjhgfdspoij",0);
         Reclamation R3 = new Reclamation("site","problem technique","azsdcezfdvbretyhj,ujkll",1);
         Reclamation R4 = new Reclamation("livraison","livraison retarde","nbvcxwqsdfghytrezzzzzsdcpl",1);
         Reclamation R5 = new Reclamation("produit","produit trucke","njiyhbvcxwqaze",1);
         Reclamation R6 = new Reclamation("vendeur","faux profile","njiioppmlkjjhh",1);
         Reclamation R7 = new Reclamation("livraison","livraison annule","mploikjuyhnb",0);*/
         
         
         Reponse Rp1 = new Reponse(1,"c'est noté");
         Reponse Rp2 = new Reponse(2,"votre reclamationa ete prise en consideration");
         Reponse Rp3 = new Reponse(3,"hadheka lmawjoud");
         Reponse Rp4 = new Reponse(4,"ochrob wl tayer garnek");
         Reponse Rp5 = new Reponse(5,"c'est noté");
    
         

        
         
         //reclamation
      //CRUDReclamation crud=new CRUDReclamation();
       // crud.ajouter();  
         /*crud.AjouterReclamation(R3);  
         crud.AjouterReclamation(R4);  
         crud.AjouterReclamation(R5);
         crud.AjouterReclamation(R6);  
         crud.AjouterReclamation(R7);*/
       // crud.supprimer(R1); 
        // crud.SupprimerReclamation(7); 
         //crud.SupprimerReclamation(8);
        // crud.RechercherReclamation("l2");
      //crud.afficher();     
           //crud.ModifierReclamation(L3);

           
           //reponse
           CRUDReponse crud1=new CRUDReponse();
        /* crud1.ajouter(Rp1);
         crud1.ajouter(Rp2);  
         crud1.ajouter(Rp3);  
         crud1.ajouter(Rp4);  
         crud1.ajouter(Rp5);*/
        //crud1.supprimer(Rp5); 
        //crud.SupprimerReponse(7); 
        //crud.SupprimerReponse(8);
        //crud.RechercherReponse("l2");*/
      crud1.afficher();  
       //
     // crud1.modifier(Rp4);
           
      



         


         
             
    }
}
