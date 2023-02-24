/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author asus
 */
public class Livraison {
    private int id,id_produit;
    private String nom,adresse,etat;

    public Livraison() {
    }

    public Livraison(int id, int id_produit, String nom, String adresse, String etat) {
        this.id = id;
        this.id_produit = id_produit;
        this.nom = nom;
        this.adresse = adresse;
        this.etat = etat;
    }

  /**  public Livraison(String nom, String adresse, String etat) {
        this.nom = nom;
        this.adresse = adresse;
        this.etat = etat;
    }**/

    public Livraison(int id_produit, String nom, String adresse, String etat) {
        this.id_produit = id_produit;
        this.nom = nom;
        this.adresse = adresse;
        this.etat = etat;
    }

  

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    @Override
    public String toString() {
        return "Livraison{" + "id=" + id + ", id_produit=" + id_produit + ", nom=" + nom + ", adresse=" + adresse + ", etat=" + etat + '}';
    }



   
    
    
}
