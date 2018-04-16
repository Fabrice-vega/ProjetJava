package projetjava.modele;


import java.util.*;

/**
 * @author fabrice.vega
 */
public class Attribution {
    
    protected Classes classes = null;
    protected Enseignant enseignant = null;
    
    public Attribution() {
    }

    public Classes getClasses() {
        return classes;
    }
    
    public void setClasses(Classes classes) {
        this.classes = classes;
    }
    
    public Enseignant getEnseignant() {
        return enseignant;
    }
    
    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

}