package projetjava.modele;


import java.util.*;

/**
 * @author fabrice.vega
 */
public class Enseignant {
    
    private String id_prof = "";
    private String nom = "";
    private String prenom = "";
    private Classes titulaire = null;
    private Classes remplacant = null;
       
    public Enseignant( String id_prof, String nom, String prenom ) {
        this.id_prof = id_prof;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getId_prof() {
        return id_prof;
    }
    
    public void setId_prof(String id) {
        this.id_prof = id;
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
    
     public Classes getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Classes titulaire) {
        this.titulaire = titulaire;
    }

    public Classes getRemplacant() {
        return remplacant;
    }

    public void setRemplacant(Classes remplacant) {
        this.remplacant = remplacant;
    }

    @Override
    public String toString() {
        return "\tId du professeur ="+id_prof+"\n\tNom ="+nom+"\n\tPrenom ="+prenom+"\n";
    }

}