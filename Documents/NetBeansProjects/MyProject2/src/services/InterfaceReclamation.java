/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import entities.Reclamation;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface InterfaceReclamation {
  public void ajouterReclamation(Reclamation R);
    public void modifierReclamation(Reclamation R);
    public void supprimerReclamation(Reclamation R);
    public List<Reclamation> afficherReclamations(); 
}
