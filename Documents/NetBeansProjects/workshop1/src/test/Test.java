/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import entities.Reclamation;
import java.sql.SQLException;
import services.CRUDReclamation;
import utils.MyDB;

/**
 *
 * @author lenovo
 */
public class Test {
    public static void main(String[] args) {
       try {
            Reclamation r = new Reclamation( 1, "traitee");
            CRUDReclamation cr = new CRUDReclamation();
            cr.ajouter(r);
           /* cr.modifier(r);
            cr.afficherReclamations();*/
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
