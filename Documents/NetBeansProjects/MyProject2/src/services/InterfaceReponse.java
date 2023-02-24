/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import entities.Reponse;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface InterfaceReponse {
     public void ajouterReponse(Reponse Rp);
    public void modifierReponse(Reponse Rp);
    public void supprimerReponse(Reponse Rp);
    public List<Reponse> afficherReponses();
}
