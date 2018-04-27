/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import projetjava.vue.Vue;
import projetjava.controleur.Controleur;
import projetjava.modele.Modele;
/**
 *
 * @author Fabrice
 */
public class ProjetJava {
    
    private Vue vue;
    private Controleur controleur;
    private Modele modele;
    
    public ProjetJava() {
        
        vue = new Vue();
        modele = new Modele();/*.getInstance();*/
        
        modele.populate();
        controleur = new Controleur(modele, vue);
        controleur.gestion();
    }
    
    public static void main(String[] args) {
        
        ProjetJava projetjava = new ProjetJava();
    }
}
