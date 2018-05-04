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
    
    public Attribution(Classes classe, Enseignant enseignant) {
        this.classes = classe;
        this.enseignant = enseignant;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.enseignant);
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
        final Attribution other = (Attribution) obj;
        if (!Objects.equals(this.enseignant, other.enseignant)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Attribution{" + "classes=" + classes + ", enseignant=" + enseignant + '}';
    }
}