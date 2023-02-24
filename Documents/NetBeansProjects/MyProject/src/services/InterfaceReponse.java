/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import entities.Reponse;
import java.util.List;

/**
 *
 * @author Meriem
 */
public interface InterfaceReponse {
     public void ajouter(Reponse reponse);
    public void modifier(Reponse reponse);
    public void supprimer(Reponse reponse);
    public List<Reponse> afficher();
    

}
