/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava.vue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import projetjava.modele.Enseignant;
import projetjava.modele.Classes;
import projetjava.modele.Attribution;

/**
 *
 * @author Fabrice
 */
public class Vue {
    
    private Scanner sc = new Scanner(System.in);
    
    public int menu() {
        
        List<String> listeItems = new ArrayList<>(Arrays.asList(
                "Ajouter",
                "Rechercher",
                "Modifier",
                "Supprimer",
                "Afficher",
                "Attribution",
                "Fin"
        ));
        affListe(listeItems);
        
        int choix;
        do {
            String chs = getMsg("Votre choix : ");
            choix = Integer.parseInt(chs);
            if (choix > 0 && choix <= listeItems.size()) {
                break;
            }
            affMsg("Choix incorrect");
        }while(true);
        return choix;
    }
    
    public String getMsg() {
        String msg = sc.nextLine();
        return msg;
    }
    
    public String getMsg(String msg) {
        affMsg(msg);
        return getMsg();
    }
    
    public void affMsg(Object msg) {
        System.out.println(msg);
    }
    
    public void affListe(Collection liste) {
        int i = 1;
        for(Object o : liste) {
            affMsg((i++)+"."+o);
        }
    }
    
    public Enseignant encodeEnseignant() {
        String id_prof = getMsg("Id de l'enseignant ? ");
        String nom = getMsg("nom de l'enseignant ? ");
        String prenom = getMsg("prénom de l'enseignant ? ");
        Enseignant e = new Enseignant(id_prof, nom, prenom);
        return e;
    }
    
    public Classes encodeClasses() {
        String sigle = getMsg("Sigle de la classe ? ");
        String orientation = getMsg("Orientation de la classe ? ");
        String an = getMsg("L'année de la classe ? ");
        int annee = Integer.parseInt(an);
        
        
        try {
            Classes cl = new Classes.ClassesBuilder().
                setSigle(sigle)
                    .setOrientation(orientation)
                    .setAnnee(annee)
                    .build();
        } catch (Exception e) {
            System.out.println("Erreur de création"+e);
        }
        
        
        Classes c = new Classes(sigle, orientation, annee);
        return c;
    }
    
    public Enseignant formRechEns() {
        String id_prof = getMsg("Id : ");
        System.out.println(id_prof);
        return new Enseignant(id_prof);
    }
    
    
    public Classes formRechClasse() {
        String sigle = getMsg("sigle : ");
        System.out.println(sigle);
        return new Classes(sigle);
    }
    
    public int menuEns(){
       List<String> listeItems = new ArrayList<>(Arrays.asList(
            "Id", 
            "Nom", 
            "Prénom"));
       affListe(listeItems);
       
            int ch;
        do {
            String chs = getMsg("votre choix");
            ch = Integer.parseInt(chs);
            if (ch > 0 && ch <= listeItems.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return ch;
   }
    
    public int menuClas(){
       List<String> listeItems = new ArrayList<>(Arrays.asList(
            "Sigle", 
            "Orientation", 
            "Année"));
       affListe(listeItems);
       
            int ch;
        do {
            String chs = getMsg("votre choix");
            ch = Integer.parseInt(chs);
            if (ch > 0 && ch <= listeItems.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return ch;
    }
    
   public int menuAjouter() {
        
        List<String> listeItems = new ArrayList<>(Arrays.asList(
                "Ajouter un enseignant",
                "Ajouter une classe",
                "Retour"
        ));
        affListe(listeItems);
        
        int choix;
        do {
            String chs = getMsg("Votre choix : ");
            choix = Integer.parseInt(chs);
            if (choix > 0 && choix <= listeItems.size()) {
                break;
            }
            affMsg("Choix incorrect");
        }while(true);
        return choix;
    }
   
   public int menuRecherche() {
        
        List<String> listeItems = new ArrayList<>(Arrays.asList(
                "Rechercher un enseignant",
                "Rechercher une classe",
                "Retour"
        ));
        affListe(listeItems);
        
        int choix;
        do {
            String chs = getMsg("Votre choix : ");
            choix = Integer.parseInt(chs);
            if (choix > 0 && choix <= listeItems.size()) {
                break;
            }
            affMsg("Choix incorrect");
        }while(true);
        return choix;
    }
   
   public int menuModifier() {
        
        List<String> listeItems = new ArrayList<>(Arrays.asList(
                "Modifier un enseignant",
                "Modifier une classe",
                "Retour"
        ));
        affListe(listeItems);
        
        int choix;
        do {
            String chs = getMsg("Votre choix : ");
            choix = Integer.parseInt(chs);
            if (choix > 0 && choix <= listeItems.size()) {
                break;
            }
            affMsg("Choix incorrect");
        }while(true);
        return choix;
    }
   
   public int menuSupprimer() {
        
        List<String> listeItems = new ArrayList<>(Arrays.asList(
                "Supprimer un enseignant",
                "Supprimer une classe",
                "Retour"
        ));
        affListe(listeItems);
        
        int choix;
        do {
            String chs = getMsg("Votre choix : ");
            choix = Integer.parseInt(chs);
            if (choix > 0 && choix <= listeItems.size()) {
                break;
            }
            affMsg("Choix incorrect");
        }while(true);
        return choix;
    }
   
   public int menuAfficher() {
        
        List<String> listeItems = new ArrayList<>(Arrays.asList(
                "Afficher les enseignants",
                "Afficher les classes",
                "Afficher les Attributions",
                "Retour"
        ));
        affListe(listeItems);
        
        int choix;
        do {
            String chs = getMsg("Votre choix : ");
            choix = Integer.parseInt(chs);
            if (choix > 0 && choix <= listeItems.size()) {
                break;
            }
            affMsg("Choix incorrect");
        }while(true);
        return choix;
    }
   
   
   
   public Attribution newAttribution(List<Classes> toutesClasses, List<Enseignant> tousEnseignant, List<Attribution> toutesAttribution) {

        int tc = toutesClasses.size();
        int te = tousEnseignant.size();
        
        int ens = 0; //choix de l'enseignant 
        int cl = 0; //choix de la classe 
        int att = 0; //choix de l'attribution

        
        //affiche la liste des classes
            affListe(toutesClasses);
            String ch1 = getMsg("Choisissez une classe : ");
            int chx = Integer.parseInt(ch1);
        do {
            if (chx > 0 && chx <= tc) {
                cl = chx - 1;
            } else {
                affListe(toutesClasses);
                ch1 = getMsg("Entrez un nombre entier : ");
                chx = Integer.parseInt(ch1);
            }
        }while(chx < 0 || chx > tc);
        
        //affiche la liste des enseignants
            affListe(tousEnseignant);
            String ch2 = getMsg("Choisissez un enseignant : ");
            chx = Integer.parseInt(ch2);
        do {
            if (chx > 0 && chx <= te) {
                ens = chx - 1;
            } else {
                affListe(tousEnseignant);
                ch2 = getMsg("Entrez un nombre entier : ");
                chx = Integer.parseInt(ch2);
            }   
        }while(chx < 0 ||  chx > te);
        
        //choix titulaire / remplaçants
        do {
            ch2 = getMsg("Entrez son statut : \n -- 1 pour les titulaires"
                + " \n -- 2 pour les remplacants");
            chx = Integer.parseInt(ch2);
            if (chx >= 1 && chx <= 2) {
                att = chx;
            } 
            else {
                affMsg("Choisissez l'une des 2 propositions ");
            }
        }while(chx !=1 && chx != 2);
        

        Classes c = toutesClasses.get(cl);
        Enseignant e = tousEnseignant.get(ens);

        if (e.getRemplacant() != null || e.getTitulaire() != null) {
            affMsg("Il y a déjà une attribution pour cet enseignant : ");
            return null;

        } else {
          
            if (att == 1) {
                for (Attribution a : toutesAttribution) {
                    Enseignant eCher = a.getEnseignant();
                    if (eCher.getTitulaire() == c) {
                        affMsg("Déjà un titulaire ! ");
                        return null;
                    }
                    e.setTitulaire(c);
                    e.setRemplacant(null);
                }
            }
            if (att == 2) {
                e.setRemplacant(c);
                e.setTitulaire(null);
            }
                
            Attribution a = new Attribution(c, e);

            return a;

        }
}
   public Attribution rechAttr() {
       Classes rechc = null;
       Enseignant reche = null;
       boolean ok;
       do {
           String id_prof = getMsg("Id du professeur recherché : ");
           if(id_prof.trim().equals("")) {
               affMsg("Entrez le correctement ");
               ok = false;
           } else {
               ok = true;
               reche = new Enseignant(id_prof);
           }
       }while(!ok);
       
       do {
            String sigle = getMsg("Sigle de la classe recherchée : ");
            if(sigle.trim().equals("")) {
                affMsg("Entrez le correctement ");
                ok = false;
            } else {
                ok = true;
                rechc = new Classes(sigle);
            }
       }while(!ok);
       
       Attribution recha = new Attribution(rechc, reche);
       return recha;
   }
}
