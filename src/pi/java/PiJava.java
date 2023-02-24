/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pi.java;

import DAO.CRUDPointRelais;
import DAO.CRUDlivraison;
import DAO.CRUDlivreur;
import entities.Livraison;
import entities.Livreur;
import entities.PointRelais;
import java.sql.Connection;
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
         
         
         Livraison L1 = new Livraison(5,"sousse","livré","aa");  
         Livraison L2 = new Livraison(5,"ggg","livré","aagg");     
         Livraison L3 = new Livraison(9,"bb","bbb","bbbb");
         CRUDlivraison crud=new CRUDlivraison();
        // crud.AjouterLivraison(L1);  
        // crud.AjouterLivraison(L2);  
        // crud.AjouterLivraison(L3);
        //crud.SupprimerLivraison(22); 
        //crud.SupprimerLivraison(19);    
        //crud.SupprimerLivraison(20); 
        //crud.SupprimerLivraison(21); 
        //crud.SupprimerLivraison(8);
        //crud.RechercherLivraison("l2");
        crud.afficherLivraison();    
     // crud.ModifierLivraison(L3);
         
     
     
     
     
     
     
     
     //crud Livreur
      //  Livreur liv1 = new Livreur("ranya","matrouh","50625093","aaa");     
      //  Livreur liv2= new Livreur("naima","ghedir","24441538","ariana");
    //    CRUDlivreur cd = new CRUDlivreur();
    //    cd.AjouterLivreur(liv1);
     //   cd.AjouterLivreur(liv2);
      //  cd.ModifierLivreur(liv1);
      //  cd.RechercherLivreur("ranya");
     //cd.SupprimerLivreur(0);
   //  cd.afficherlivreurs();
        
        
        
        
        //crud point_relais
        
    // PointRelais p1=new PointRelais("p1","enfidha","livrée");
  //   PointRelais p2=new PointRelais("p2","sousse","livrée");
     //PointRelais p3=new PointRelais("p3","ariana","nonlivrée");



       // CRUDPointRelais pr = new CRUDPointRelais();
    //   pr.AjouterPointRelais(p1);
      //  pr.AjouterPointRelais(p2);
    /*  pr.AjouterPointRelais(p3);
       pr.ModifierPointRelais(p3);
    pr.SupprimerPointRelais(3);
      pr.afficherPointRelais();
      pr.RechercherPointRelais("p2");



        
     

      



         


         
              //crud.SupprimerLivreur(5);
              //crud.afficherlivreurs();
             //crud.RechercherLivreur("med");
             //crud.ModifierLivreur(liv2);
         // CRUDlivreur crud=new CRUDlivreur();
               //crud.AjouterLivreur(liv1);            
           //    crud.AjouterLivreur(liv2);
               //crud.AjouterLivreur(liv3);

              //crud.SupprimerLivreur(5);
              //crud.afficherlivreurs();
             //crud.RechercherLivreur("med");
    }}*/
    }}
