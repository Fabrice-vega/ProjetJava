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
                "Ajouter un enseignant",
                "Ajouter une classe",
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
        Classes c = new Classes(sigle, orientation, annee);
        return c;
    }
   
    
}
