/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import entities.Livreur;
import java.util.List;

/**
 *
 * @author asus
 */
public interface InterfacesLivreur {
     public void AjouterLivreur(Livreur v);   
    public void ModifierLivreur(Livreur v);
    public void SupprimerLivreur(int id);
 //   public List<Livreur> RechercherLivreur(String region);
}
