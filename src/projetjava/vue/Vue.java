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
                "Afficher un enseignant",
                "Afficher une classe",
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
}
