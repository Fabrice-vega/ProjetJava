package projetjava.modele;


import java.util.*;

/**
 * @author fabrice.vega
 */
public class Classes {

    private String sigle = "";
    private String orientation = "";
    private int annee = 0;
    
    public Classes( String sigle, String orientation, int annee ) {
        this.sigle = sigle;
        this.orientation = orientation;
        this.annee = annee;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public int getAnnee() {
        return annee;
    }
    
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
    
    @Override
    public String toString() {
        return "\tSigle = "+sigle+"\n\tAnnée  = "+annee+"\n\tOrientation = "+orientation+"\n";
    }

}