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
                    rechEnseignant();
                    break;
                case 5:
                    rechClasse();
                    break;
                case 6:
                    modifEnseignant();
                    break;
                case 7:
                   modifClasse();
                    break;
                case 8:
                    supprEnseignant();
                    break;
                case 9:
                    supprClasse();
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
    
    public void rechEnseignant() {
        Enseignant id_prof = v.formRechEns();
        v.affMsg(m.getEnseignant(id_prof));
    }
    
    public void modifEnseignant() {
        Enseignant ensRech = v.formRechEns();
        if(ensRech == null) {
            v.affMsg("Enseignant introuvable");
            return;
        }
        Enseignant ensTrouv=m.getEnseignant(ensRech);
        if(ensTrouv == null){
            v.affMsg("Enseignant introuvable");
            return;
        }
        v.affMsg(ensTrouv);
        
        int ch;
        do {
            ch = v.menuEns();
        
            switch (ch) {
                case 1:
                    String nvId = v.getMsg("Nouvel id : ");
                    m.modifIdProf(ensTrouv, nvId);
                    break;
                case 2:
                    String nvNom = v.getMsg("Nouveau nom : ");
                    m.modifNom(ensTrouv, nvNom);
                    break;
                case 3:
                    String nvPrenom = v.getMsg("Nouveau prénom : ");
                    m.modifPrenom(ensTrouv, nvPrenom);
                    break;
                default:
                    v.affMsg("Choix invalide");
                    return;
            }
            } while (ch != 1 && ch != 2 && ch != 3);
    }
    
    public void supprEnseignant() {
        Enseignant ensRech = v.formRechEns();
        if(ensRech == null) {
            v.affMsg("Enseignant introuvable");
            return;
        }
        v.affMsg(m.getEnseignant(ensRech));
        String supp = v.getMsg("Supprimer ? OUI / NON \t");
        if(supp.equals("OUI")) {
            String msg = m.supprEnseignant(ensRech);
            v.affMsg(msg);
        } else {
            v.affMsg("Suppression annulée");
        }
        
    }
    
    public void rechClasse() {
        Classes sigle = v.formRechClasse();
        v.affMsg(m.getClasse(sigle));
    }
    
    public void modifClasse() {
        Classes classeRech = v.formRechClasse();
        if(classeRech == null) {
            v.affMsg("Classe introuvable");
            return;
        }
        v.affMsg(m.getClasse(classeRech));
        
        int ch;
        do {
            ch = v.menuClas();
        
            switch (ch) {
                case 1:
                    String nvSigle = v.getMsg("Nouveau sigle : ");
                    m.modifSigle(classeRech, nvSigle);
                    break;
                case 2:
                    String nvOrientation = v.getMsg("Nouvel orientation : ");
                    m.modifOrientation(classeRech, nvOrientation);
                    break;
                case 3:
                    int nvAnnee = Integer.parseInt(v.getMsg("Nouvelle année : "));
                    m.modifAnnee(classeRech, nvAnnee);
                    break;
                default:
                    v.affMsg("Choix invalide");
                    return;
            }
            } while (ch != 1 && ch != 2 && ch != 3);
    }
    
    public void supprClasse() {
        Classes classeRech = v.formRechClasse();
        if(classeRech == null) {
            v.affMsg("Classe introuvable");
            return;
        }
        v.affMsg(m.getClasse(classeRech));
        String supp = v.getMsg("Supprimer ? OUI / NON \t");
        if(supp.equals("OUI")) {
            String msg = m.supprClasse(classeRech);
            v.affMsg(msg);
        } else {
            v.affMsg("Suppression annulée.");
        }
    }
    
    
}
