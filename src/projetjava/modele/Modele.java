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
    
    protected List<Enseignant> mesEnseignants = new ArrayList<>();
    protected List<Classes> mesClasses = new ArrayList<>();
    
    //private static Modele instance = null;
    public Modele() {
        
    }
    
    /*public static Modele getInstance() {
        if(instance == null) return instance = new Modele();
        else return instance;
    }*/
    
    public String ajoutEnseignant(Enseignant e) {
        if(e == null) return "enseignant nul";
        if(mesEnseignants.contains(e)) return "enseignant déjà enregistré";
        mesEnseignants.add(e);
        return "ajout enseignant effectuée";
    }
    
    public String ajoutClasses(Classes c) {
        if(c == null) return "Classe nul";
        if(mesClasses.contains(c)) return "classe déjà enregistrée";
        mesClasses.add(c);
        return "ajout classe effectuée";
    }
    
    public List<Enseignant> tousEnseignant() {
        mesEnseignants.sort(new CompareEnseignant());
        return mesEnseignants;
    }
    
    public List<Classes> toutesClasses() {
        mesClasses.sort(new CompareClasses());
        return mesClasses;
    }
    
    public Enseignant getEnseignant(String idRech) {
        Enseignant eRech = new Enseignant(idRech);
        int i = mesEnseignants.indexOf(eRech);
        if(i<0) return null;
        else return mesEnseignants.get(i);
    }
    
    public Classes getClasse(String sigleRech) {
        Classes cRech = new Classes(sigleRech);
        int i = mesClasses.indexOf(cRech);
        if(i < 0) return null;
        else return mesClasses.get(i);
    }
    
    public String modifNom(Enseignant e, String nom) {
        e.setNom(nom);
        return "Changement de nom effectué";
    }
    
    public String modifPrenom(Enseignant e, String prenom) {
        e.setPrenom(prenom);
        return "Changement de prénom effectué";
    }
    
    public String modifIdProf(Enseignant e, String id_prof) {
        e.setId_prof(id_prof);
        return "Changement de d'id effectué";
    }
}
