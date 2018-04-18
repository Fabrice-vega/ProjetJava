/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava.modele;

import java.util.Comparator;

/**
 *
 * @author Fabrice
 */
public class CompareEnseignant implements Comparator<Enseignant> {
    @Override
    public int compare(Enseignant e1, Enseignant e2) {
        if(!e1.getNom().equals(e2.getNom())) return e1.getNom().compareTo(e2.getNom());
        if(!e1.getPrenom().equals(e2.getPrenom())) return e1.getPrenom().compareTo(e2.getPrenom());
        return e1.getId_prof().compareTo(e2.getId_prof());
    }
}
