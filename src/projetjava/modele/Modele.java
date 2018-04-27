/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava.modele;

import java.util.*;
import projetjava.Log;
import projetjava.modele.Enseignant;
import projetjava.modele.Classes;


/**
 *
 * @author Fabrice
 */
public class Modele {
    
    /**
     * Liste des enseignants
     */
    protected List<Enseignant> mesEnseignants = new ArrayList<>();

    /**
     * Liste des classes
     */
    protected List<Classes> mesClasses = new ArrayList<>();
    
    //private static Modele instance = null;

    /**
     * Constructeur par défaut
     */
    public Modele() {
        
    }
    
    /*public static Modele getInstance() {
        if(instance == null) return instance = new Modele();
        else return instance;
    }*/

    /**
     * Méthode qui ajoute un enseignant
     * @param e l'enseignant à ajouter
     * @return l'état de l'ajout
     */

    
    public String ajoutEnseignant(Enseignant e) {
        if(e == null) return "enseignant nul";
        if(mesEnseignants.contains(e)) return "enseignant déjà enregistré";
        mesEnseignants.add(e);
        return "ajout enseignant effectuée";
    }
    
    /**
     * Méthode qui ajoute une classe
     * @param c la classe à ajouter
     * @return l'état de la classe
     */
    public String ajoutClasses(Classes c) {
        if(c == null) return "Classe nul";
        if(mesClasses.contains(c)) return "classe déjà enregistrée";
        mesClasses.add(c);
        return "ajout classe effectuée";
    }
    
    /**
     * Méthode qui compare les enseignants
     * @return la liste des enseignants
     */
    public List<Enseignant> tousEnseignant() {
        mesEnseignants.sort(new CompareEnseignant());
        return mesEnseignants;
    }
    
    /**
     * Méthode qui compare les classes
     * @return la liste des classes
     */
    public List<Classes> toutesClasses() {
        mesClasses.sort(new CompareClasses());
        return mesClasses;
    }
    
    /**
     * Méthode qui accède à un enseignant
     * @param idRech objet de type Enseignant qui sert à trouver l'élément cherché
     * @return l'objet de type Enseignant
     */
    public Enseignant getEnseignant(Enseignant idRech) {
        int i = mesEnseignants.indexOf(idRech);
        if(i<0) return null;
        return mesEnseignants.get(i);
    }
    
    /**
     * Méthode qui accède à une classe
     * @param sigleRech objet de type Classes qui sert à trouver l'élément cherché
     * @return m'objet de type Classes
     */
    public Classes getClasse(Classes sigleRech) {
        int i = mesClasses.indexOf(sigleRech);
        if(i < 0) return null;
        return mesClasses.get(i);
    }
    
    /**
     * Méthode qui modifie le nom
     * @param e objet de type Enseignant
     * @param nom objet qui reçoit le nouveau nom
     * @return l'état de l'objet
     */
    public String modifNom(Enseignant e, String nom) {
        e.setNom(nom);
        return "Changement de nom effectué";
    }
    
    /**
     * Méthode qui modifie le prénom
     * @param e objet de type Enseignant
     * @param prenom objet qui reçoit le nouveau prénom
     * @return l'état de l'objet
     */
    public String modifPrenom(Enseignant e, String prenom) {
        e.setPrenom(prenom);
        return "Changement de prénom effectué";
    }
    
    /**
     * Méthode qui modifie l'id du prof
     * @param e objet de type Enseignant
     * @param id_prof objet qui reçoit le nouvel id
     * @return l'état de l'objet
     */
    public String modifIdProf(Enseignant e, String id_prof) {
        e.setId_prof(id_prof);
        return "Changement de d'id effectué";
    }
    
    /**
     * Méthode qui modifie le sigle
     * @param c objet de type Classes
     * @param sigle objet qui reçoit le nouveau sigle
     * @return l'état de l'objet
     */
    public String modifSigle(Classes c, String sigle) {
        c.setSigle(sigle);
        return "Changement du sigle effectué";
    }
    
    /**
     * Méthode qui modifie l'orientation
     * @param c objet de type Classes
     * @param orientation objet qui reçoit la nouvelle orientation
     * @return l'état de l'objet
     */
    public String modifOrientation(Classes c, String orientation) {
        c.setOrientation(orientation);
        return "Changement de l'orientation effectué";
    }
    
    /**
     * Méthode qui modifie l'année
     * @param c objet de type Classes
     * @param annee objet qui reçoit la nouvelle année
     * @return l'état de l'objet
     */
    public String modifAnnee(Classes c, int annee) {
        c.setAnnee(annee);
        return "Changement de l'année effectuée";
    }
    
    /**
     * Méthode qui supprime une classe
     * @param c objet de type Classes à supprimer
     * @return l'état de l'objet
     */
    public String supprClasse(Classes c) {
        boolean ok = mesClasses.remove(c);
        if(ok) return "Classe supprimée";
        else return "Classe introuvable ou impossible à supprimer";
    }
    
    /**
     * Méthode qui supprime un enseignants
     * @param e objet de type Enseignement à supprimer
     * @return l'état de l'objet
     */
    public String supprEnseignant(Enseignant e) {
        boolean ok = mesEnseignants.remove(e);
        if(ok) return "Enseignant supprimé";
        else return "Enseignant introuvable ou impossible à supprimer";
    }
    
    public void populate(){
       mesEnseignants.addAll(Arrays.asList(
               new Enseignant("FA21","Vega","Fabrice"),
               new Enseignant("LA22","Gallet","Laura"),
               new Enseignant("TH20","Thomas","Glibert"))
               );
       mesClasses.addAll(Arrays.asList(
               new Classes("M1","Marketing",1),
               new Classes("P3","Préscolaire",3),
               new Classes("I2","Informatique",2))
       );
   }
}
