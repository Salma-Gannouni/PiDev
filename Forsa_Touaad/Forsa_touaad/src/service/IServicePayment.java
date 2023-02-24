/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entite.Payment;

import java.util.List;


public interface IServicePayment {
    
    public void ajouterPayement(Payment p);
    public List<Payment> afficherPayment();
    public void modifierPayment (Payment p);
    public void supprimerPayment(int id_p);
    public List<Payment> chercherPayment(Payment p);
   public  List <Payment> displayByID(int id_p) ;
    
}
