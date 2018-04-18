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
public class CompareClasses implements Comparator<Classes> {
    @Override
    public int compare(Classes c1, Classes c2) {
        if(!c1.getOrientation().equals(c2.getOrientation())) return c1.getOrientation().compareTo(c2.getOrientation());
        return c1.getSigle().compareTo(c2.getSigle());
    }
    
}
