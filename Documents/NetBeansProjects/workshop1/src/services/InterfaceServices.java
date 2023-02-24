/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;


import entities.Reclamation;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface InterfaceServices {
    
    public void ajouter(Reclamation r) throws SQLException;
    public void modifier(Reclamation r) throws SQLException;
    public void supprimer(int id_reclamation) throws SQLException;
    public List<Reclamation> afficherReclamations();
}