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
    
    public Modele() {
        
    }
    
    public String ajoutEnseignant(Enseignant e) {
        if(e == null) return "Enseignant null";
        if(mesEnseignants.contains(e)) {
            Log lg = Log.getInstance();
            lg.ajouter("refus de l'ajout de "+e);
            return "Enseignant déjà enregistré";
        }
        mesEnseignants.add(e);
        Log lg = Log.getInstance();
        lg.ajouter("Enseignant "+e+" enregistré");
        return "ajout enseignant effectué";
    }
    
    public String ajoutClasses(Classes c) {
        /*if(c == null) return "Classes null";
        if(mesClasses.contains(c)) {
            Log lg = Log.getInstance();
            lg.ajouter("refus de l'ajout de "+c);
            return "Classe déjà enregistrée";
        }
        mesClasses.add(c);
        Log lg = Log.getInstance();
        lg.ajouter("Classes "+c+" enregistrée");
        return "Ajout classe effectué";*/
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
    
}
