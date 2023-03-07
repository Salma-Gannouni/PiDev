/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import entities.Livraison;
import entities.Livreur;
import java.util.List;

/**
 *
 * @author asus
 */
public interface InterfaceLivraison {
     public void AjouterLivraison(Livraison L);   
    public void ModifierLivraison(Livraison L);
    public void SupprimerLivraison(int id);
  public List<Livraison> afficherLivraison();
  public void affecterLivreur(Livraison L1, Livreur liv1);
  public boolean validateEtat(int p);
}
