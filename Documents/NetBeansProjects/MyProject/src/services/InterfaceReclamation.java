/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Reclamation;
import java.util.List;


/**
 *
 * @author Meriem
 */
public interface InterfaceReclamation {
    
    public void ajouter(Reclamation reclamation);
    public void modifier(Reclamation reclamation);
    public void supprimer(Reclamation reclamation);
    public List<Reclamation> afficher();
    
}
