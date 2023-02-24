/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author asus
 */
public class PointRelais {
    private int id;
    private String nom,adresse,etat;

    public PointRelais() {
    }

    public PointRelais(int id, String nom, String adresse, String etat) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.etat = etat;
    }

    public PointRelais(String nom, String adresse, String etat) {
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

    @Override
    public String toString() {
        return "PointRelais{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", etat=" + etat + '}';
    }
    
    
}
