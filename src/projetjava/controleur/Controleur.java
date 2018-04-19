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
                    affRechEnseignant();
                    break;
                case 5:
                    //affRechClasses();
                    break;
                case 6:
                    modifEnseignant();
                    break;
                case 7:
                   //modifClasses();
                    break;
                case 8:
                    //supprEnseignant();
                    break;
                case 9:
                    //supprClasses();
                    break;
                case 10:
                    listeEnseignants();
                    break;
                case 11:
                    listeClasses();
                    break;
                case 12:
                    v.affMsg("à la prochaine !");
                    break;
                default:
                    v.affMsg("choix incorrect");
            }
        }while(choix != 12);
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
    
    public Enseignant rechEnseignant() {
        //String id_prof = v.formRechEns();
        System.out.println(m.getEnseignant(v.formRechEns()));
        return m.getEnseignant(v.formRechEns());
    }
    
    public void affRechEnseignant() {
        Enseignant oRech = rechEnseignant();
        
        if(oRech != null) {
            v.affMsg("L'enseignant trouvé est : ");
            v.affEnseignant(oRech);
        } else {
            v.affMsg("Enseignant introuvable");
            return;
        }
    }
    
    public void modifEnseignant() {
        Enseignant ensRech = rechEnseignant();
        if(ensRech == null) {
            v.affMsg("Enseignant introuvable");
            return;
        }
        v.affEnseignant(ensRech);
        
        int ch = 0;
        System.out.println("1.id\t2.nom\t3.prenom :\n");
            switch (ch) {
                case 1:
                    String nvId = v.getMsg("Nouvel id : ");
                    m.modifIdProf(ensRech, nvId);
                    break;
                case 2:
                    String nvNom = v.getMsg("Nouveau nom : ");
                    m.modifNom(ensRech, nvNom);
                    break;
                case 3:
                    String nvPrenom = v.getMsg("Nouveau prénom : ");
                    m.modifPrenom(ensRech, nvPrenom);
                    break;
                default:
                    v.affMsg("Choix invalide");
                    return;
            }
    }  
}
