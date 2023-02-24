/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import entities.PointRelais;
import java.util.List;

/**
 *
 * @author asus
 */
public interface InterfacePointRelais {
 public void AjouterPointRelais (PointRelais p);   
    public void ModifierPointRelais (PointRelais p);
    public void SupprimerPointRelais (int id);
  public List<PointRelais> RechercherPointRelais(String nom);
  public List<PointRelais> afficherPointRelais();

}
