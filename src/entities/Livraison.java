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
    private int id,id_produit,id_user,id_livreur;
    private String adresse,etat,num;

    public Livraison() {
    }

    public Livraison(int id, int id_produit, int id_user, int id_livreur, String adresse, String etat, String num) {
        this.id = id;
        this.id_produit = id_produit;
        this.id_user = id_user;
        this.id_livreur = id_livreur;
        this.adresse = adresse;
        this.etat = etat;
        this.num = num;
    }

    public Livraison(int id_produit, int id_user, int id_livreur, String adresse, String etat, String num) {
        this.id_produit = id_produit;
        this.id_user = id_user;
        this.id_livreur = id_livreur;
        this.adresse = adresse;
        this.etat = etat;
        this.num = num;
    }
 
    public int getId() {
        return id;
    }

   

    public void setId(int id) {
        this.id = id;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_livreur() {
        return id_livreur;
    }

    public void setId_livreur(int id_livreur) {
        this.id_livreur = id_livreur;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Livraison{" + "id=" + id + ", id_produit=" + id_produit + ", id_user=" + id_user + ", id_livreur=" + id_livreur + ", adresse=" + adresse + ", etat=" + etat + ", num=" + num + '}';
    }

}