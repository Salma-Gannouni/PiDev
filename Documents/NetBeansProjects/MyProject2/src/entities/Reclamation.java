/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lenovo
 */
public class Reclamation {
    private int id_Reclamation ;
    private int id_user ;
    private String categorie_Reclamation ;
    private String objet_Reclamation ;
    private String description_Reclamation ;
    private int etat_Reclamation ;

    public Reclamation() {
    }

    public Reclamation(int id_Reclamation) {
        this.id_Reclamation = id_Reclamation;
    }

    public Reclamation(String categorie_Reclamation,String objet_Reclamation, String description_Reclamation,  int etat_Reclamation) {
        this.categorie_Reclamation = categorie_Reclamation;
        this.objet_Reclamation = objet_Reclamation;
        this.description_Reclamation = description_Reclamation;
        this.etat_Reclamation = etat_Reclamation;
    }

   
    

    public Reclamation(int id_Reclamation, int id_user,String categorie_Reclamation, String objet_Reclamation, String description_Reclamation,  int etat_Reclamation) {
        this.id_Reclamation = id_Reclamation;
        this.id_user = id_user;
        this.categorie_Reclamation = categorie_Reclamation;
        this.objet_Reclamation = objet_Reclamation;
        this.description_Reclamation = description_Reclamation;
        this.etat_Reclamation = etat_Reclamation;
    }

    public Reclamation(int id_user,String categorie_Reclamation, String objet_Reclamation, String description_Reclamation,  int etat_Reclamation) {
        this.id_user = id_user;
        this.categorie_Reclamation = categorie_Reclamation;
        this.objet_Reclamation = objet_Reclamation;
        this.description_Reclamation = description_Reclamation;
        this.etat_Reclamation = etat_Reclamation;
    }

    public int getId_Reclamation() {
        return id_Reclamation;
    }

    public void setId_Reclamation(int id_Reclamation) {
        this.id_Reclamation = id_Reclamation;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
     public String getCategorie_Reclamation() {
        return categorie_Reclamation;
    }

    public void setCategorie_Reclamation(String categorie_Reclamation) {
        this.categorie_Reclamation = categorie_Reclamation;
    }

    public String getObjet_Reclamation() {
        return objet_Reclamation;
    }

    public void setObjet_Reclamation(String objet_Reclamation) {
        this.objet_Reclamation = objet_Reclamation;
    }

    public String getDescription_Reclamation() {
        return description_Reclamation;
    }

    public void setDescription_Reclamation(String description_Reclamation) {
        this.description_Reclamation = description_Reclamation;
    }


    public int getEtat_Reclamation() {
        return etat_Reclamation;
    }

    public void setEtat_Reclamation(int etat_Reclamation) {
        this.etat_Reclamation = etat_Reclamation;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "id_Reclamation=" + id_Reclamation + ", id_user=" + id_user + ", categorie_Reclamation=" + categorie_Reclamation + ", objet_Reclamation=" + objet_Reclamation + ", description_Reclamation=" + description_Reclamation +  ", etat_Reclamation=" + etat_Reclamation + '}';
    }
}
