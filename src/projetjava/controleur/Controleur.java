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
                case 1:          //menu ajouter
                    choix = v.menuAjouter();
                    do {
                        switch(choix) {
                            case 1:
                                ajoutEnseignant();
                                break;
                            case 2:
                                ajoutClasses();
                                break;
                            case 3:
                                v.affMsg("\tRetour au menu précédant.");
                                break;
                            default:
                                v.affMsg("choix incorrect");
                        }
                        break;
                    }while(choix != 3);
                    break;
                    
                case 2:             //menu rechercher
                    choix = v.menuRecherche();
                    do {
                        switch(choix) {
                            case 1:
                                rechEnseignant();
                                break;
                            case 2:
                                rechClasse();
                                break;
                            case 3:
                                v.affMsg("\tRetour au menu précédant.");
                                break;
                            default:
                                v.affMsg("choix incorrect");
                        }
                        break;
                    }while(choix != 3);
                    break;
                    
                case 3:             //menu modifier
                    choix = v.menuModifier();
                    do {
                        switch(choix) {
                            case 1:
                                modifEnseignant();
                                break;
                            case 2:
                                modifClasse();
                                break;
                            case 3:
                                v.affMsg("\tRetour au menu précédant.");
                                break;
                            default:
                                v.affMsg("choix incorrect");
                        }
                        break;
                    }while(choix != 3);
                    break;
               
                case 4:             //menu supprimer
                    choix = v.menuSupprimer();
                    do {
                        switch(choix) {
                            case 1:
                                supprEnseignant();
                                break;
                            case 2:
                                supprClasse();
                                break;
                            case 3:
                                v.affMsg("\tRetour au menu précédant.");
                                break;
                            default:
                                v.affMsg("choix incorrect");
                        }
                        break;
                    }while(choix != 3);
                    break;
                    
                case 5:             //menu afficher
                    choix = v.menuAfficher();
                    do {
                        switch(choix) {
                            case 1:
                                listeEnseignants();
                                break;
                            case 2:
                                listeClasses();
                                break;
                            case 3:
                                listeAttributions();
                                break;
                            case 4:
                                v.affMsg("\tRetour au menu précédant.");
                                break;
                            default:
                                v.affMsg("choix incorrect");
                        }
                        break;
                    }while(choix != 4);
                    break;
                case 6:
                    gestionAttribution();
                    break;
                case 7:
                    v.affMsg("à la prochaine !");
                    break;
                default:
                    v.affMsg("choix incorrect");
            }
        }while(choix != 7);
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
    
    public void listeAttributions() {
        List<Attribution> la = m.toutesAttribution();
        v.affListe(la);
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
    
    private void gestionAttribution() {
        
        int choix = 0;
        
        do {

            List<Enseignant> le = m.tousEnseignant() ;
            List<Classes> lc = m.toutesClasses();
            List<Attribution> la = m.toutesAttribution();

            choix = Integer.parseInt(v.getMsg(""
                    + "1. Ajouter une attribution"
                    + "\n2. Supprimer une attribution"
                    + "\n3. Retour "));

            if (choix == 1) {
                v.affMsg(" --- Ajout d'une attribution ---");
                Attribution a = v.newAttribution(m.toutesClasses(), m.tousEnseignant(), m.toutesAttribution());
                String msg = m.ajoutAttribution(a);
                v.affMsg(msg);

            }
        
            if (choix == 2) {
                v.affMsg(" --- Suppression de l'attribution ---");
                v.affMsg(la);
                Attribution aRech = v.rechAttr();
                Attribution att = m.getAttribution(aRech);
                v.affMsg(m.getAttribution(att));
                v.affMsg(m.supprAttribution(att));
            }                                                     
            if (choix == 3) {
                // RETOUR
            }
        }while(choix != 1 && choix != 2 && choix != 3);
            
}
    
}
