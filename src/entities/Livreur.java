/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author asus
 */
public class Livreur {
    private int id;
    private String nom,prenom,tel,region;

    public Livreur() {
    }

    public Livreur(int id, String nom, String prenom, String tel, String region) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.region = region;
    }

    public Livreur(String nom, String prenom, String tel, String region) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.region = region;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Livreur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", region=" + region + '}';
    }

    
}
