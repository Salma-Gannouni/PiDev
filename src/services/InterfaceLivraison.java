/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import entities.Livraison;
import java.util.List;

/**
 *
 * @author asus
 */
public interface InterfaceLivraison {
     public void AjouterLivraison(Livraison L);   
    public void ModifierLivraison(Livraison L);
    public void SupprimerLivraison(int id);
  public List<Livraison> RechercherLivraison(String nom);
  public List<Livraison> afficherLivraison();
}
