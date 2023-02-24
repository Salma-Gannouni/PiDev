/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Objects;

/**
 *
 * @author lenovo
 */
public class Reclamation {
    private int id_reclamation;
    private String commentaire;

    public Reclamation() {
    }
    
    public Reclamation( String commentaire) {
        this.commentaire = commentaire;
    }
    
    public Reclamation(int id_reclamation, String commentaire) {
        this.id_reclamation = id_reclamation;
        this.commentaire = commentaire;
    }

    public int getId_reclamation() {
        return id_reclamation;
    }

    public void setId_reclamation(int id_reclamation) {
        this.id_reclamation = id_reclamation;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id_reclamation;
        hash = 89 * hash + Objects.hashCode(this.commentaire);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reclamation other = (Reclamation) obj;
        if (this.id_reclamation != other.id_reclamation) {
            return false;
        }
        return Objects.equals(this.commentaire, other.commentaire);
    }

    @Override
    public String toString() {
        return "Reclamation{" + "id_reclamation=" + id_reclamation + ", commentaire=" + commentaire + '}';
    }
    
    
    
    
    
}
