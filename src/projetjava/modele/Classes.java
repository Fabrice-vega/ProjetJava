package projetjava.modele;


import java.util.*;

/**
 * @author fabrice.vega
 */
public class Classes {

    private String sigle = "";
    private String orientation = "";
    private int annee = 0;
    
    public Classes() {  // constructeur par défaut
        
    }
    
    public Classes( String sigle ) { //constructeur de recherche
        this.sigle = sigle;
    }
    
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
        return "\tSigle = "+sigle+"\n\tAnnée = "+annee+"\n\tOrientation = "+orientation+"\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.sigle);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Classes other = (Classes) obj;
        if (!Objects.equals(this.sigle, other.sigle)) {
            return false;
        }
        return true;
    }
    
    

}