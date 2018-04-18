/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava.controleur;

import projetjava.vue.Vue;
import projetjava.modele.Modele;
import projetjava.modele.Attribution;
import projetjava.modele.Classes;
import projetjava.modele.Enseignant;
import java.util.List;

/**
 *
 * @author Fabrice
 */
public class Controleur {
    
    private Modele m = null;
    private Vue v = null;
    
    public Controleur() {
        
    }
    
    public Controleur(Modele m, Vue v) {
        this.m = m;
        this.v = v;
    }
    
    public void gestion() {
        int choix;
        
        do {
            choix = v.menu();
            
            switch(choix) {
                case 1:
                    ajoutEnseignant();
                    break;
                case 2:
                    ajoutClasses();
                    break;
                case 3:
                    //attribution();
                    break;
                case 4:
                    listeEnseignants();
                    break;
                case 5:
                    listeClasses();
                    break;
                case 6:
                    v.affMsg("à la prochaine !");
                    break;
                default:
                    v.affMsg("choix incorrect");
            }
        }while(choix != 6);
    }
    
    public void ajoutEnseignant() {
        Enseignant e = v.encodeEnseignant();
        String msg = m.ajoutEnseignant(e);
        v.affMsg(msg);
    }
    
    public void ajoutClasses() {
        Classes c = v.encodeClasses();
        String msg = m.ajoutClasses(c);
        v.affMsg(msg);
    }
    
    public void listeEnseignants() {
        List<Enseignant> le = m.tousEnseignant();
        v.affListe(le);
    }
    
    public void listeClasses() {
        List<Classes> lc = m.toutesClasses();
        v.affListe(lc);
    }
    
    
}
