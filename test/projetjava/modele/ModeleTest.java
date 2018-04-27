/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava.modele;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabrice
 */
public class ModeleTest {
    
    public ModeleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajoutEnseignant method, of class Modele.
     */
    @Test
    public void testAjoutEnseignant() {
        System.out.println("ajoutEnseignant");
        Enseignant e = new Enseignant("A1B2", "Smith", "John");
        Modele instance = new Modele();
        String expResult = "ajout enseignant effectuée";
        String result = instance.ajoutEnseignant(e);
        assertEquals("Ajout",expResult, result);
    }

    /**
     * Test of ajoutClasses method, of class Modele.
     */
    @Test
    public void testAjoutClasses() {
        System.out.println("ajoutClasses");
        Classes c = new Classes("F23", "informatique", 2);
        Modele instance = new Modele();
        String expResult = "ajout classe effectuée";
        String result = instance.ajoutClasses(c);
        assertEquals("Ajout", expResult, result);        
    }

    /**
     * Test of tousEnseignant method, of class Modele.
     */
    @Test
    public void testTousEnseignant() {
        System.out.println("tousEnseignant");
        Modele instance = new Modele();
        List<Enseignant> expResult = null;
        List<Enseignant> result = instance.tousEnseignant();
        assertEquals(expResult, result);
    }

    /**
     * Test of toutesClasses method, of class Modele.
     */
    @Test
    public void testToutesClasses() {
        System.out.println("toutesClasses");
        Modele instance = new Modele();
        List<Classes> expResult = null;
        List<Classes> result = instance.toutesClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnseignant method, of class Modele.
     */
    @Test
    public void testGetEnseignant() {
        System.out.println("getEnseignant");
        Enseignant idRech = new Enseignant("A1B2", "Smith", "John");
        Modele instance = new Modele();
        Enseignant expResult = new Enseignant("A1B2", "Smith", "John");
        Enseignant result = instance.getEnseignant(idRech);
        assertEquals("Récuperation", expResult, result);
    }

    /**
     * Test of getClasse method, of class Modele.
     */
    @Test
    public void testGetClasse() {
        System.out.println("getClasse");
        Classes sigleRech = new Classes("F23", "informatique", 2);
        Modele instance = new Modele();
        Classes expResult = new Classes("F23", "informatique", 2);
        Classes result = instance.getClasse(sigleRech);
        assertEquals("Récuperation", expResult, result);
    }

    /**
     * Test of modifNom method, of class Modele.
     */
    @Test
    public void testModifNom() {
        System.out.println("modifNom");
        Enseignant e = new Enseignant("A1B2", "Smith", "John");
        String nom = "Dupont";
        Modele instance = new Modele();
        String expResult = "Changement de nom effectué";
        String result = instance.modifNom(e, nom);
        assertEquals("Modification", expResult, result);
    }

    /**
     * Test of modifPrenom method, of class Modele.
     */
    @Test
    public void testModifPrenom() {
        System.out.println("modifPrenom");
        Enseignant e = new Enseignant("A1B2", "Smith", "John");
        String prenom = "Thierry";
        Modele instance = new Modele();
        String expResult = "Changement de prénom effectué";
        String result = instance.modifPrenom(e, prenom);
        assertEquals("Modification", expResult, result);
    }

    /**
     * Test of modifIdProf method, of class Modele.
     */
    @Test
    public void testModifIdProf() {
        System.out.println("modifIdProf");
        Enseignant e = new Enseignant("A1B2", "Smith", "John");
        String id_prof = "EZ21";
        Modele instance = new Modele();
        String expResult = "Changement de d'id effectué";
        String result = instance.modifIdProf(e, id_prof);
        assertEquals("Modification", expResult, result);
    }

    /**
     * Test of modifSigle method, of class Modele.
     */
    @Test
    public void testModifSigle() {
        System.out.println("modifSigle");
        Classes c = new Classes("F23", "informatique", 2);
        String sigle = "EZ1";
        Modele instance = new Modele();
        String expResult = "Changement du sigle effectué";
        String result = instance.modifSigle(c, sigle);
        assertEquals("Modification", expResult, result);
    }

    /**
     * Test of modifOrientation method, of class Modele.
     */
    @Test
    public void testModifOrientation() {
        System.out.println("modifOrientation");
        Classes c = new Classes("F23", "informatique", 2);
        String orientation = "Sciences";
        Modele instance = new Modele();
        String expResult = "Changement de l'orientation effectué";
        String result = instance.modifOrientation(c, orientation);
        assertEquals("Modification",expResult, result);
    }

    /**
     * Test of modifAnnee method, of class Modele.
     */
    @Test
    public void testModifAnnee() {
        System.out.println("modifAnnee");
        Classes c = new Classes("F23", "informatique", 2);
        int annee = 0;
        Modele instance = new Modele();
        String expResult = "Changement de l'année effectuée";
        String result = instance.modifAnnee(c, annee);
        assertEquals("Modification", expResult, result);
    }

    /**
     * Test of supprClasse method, of class Modele.
     */
    @Test
    public void testSupprClasse() {
        System.out.println("supprClasse");
        Classes c = new Classes("F23", "informatique", 2);
        Modele instance = new Modele();
        String expResult = "Classe introuvable ou impossible à supprimer";
        String result = instance.supprClasse(c);
        assertEquals("Suppression", expResult, result);
    }

    /**
     * Test of supprEnseignant method, of class Modele.
     */
    @Test
    public void testSupprEnseignant() {
        System.out.println("supprEnseignant");
        Enseignant e = new Enseignant("A1B2", "Smith", "John");
        Modele instance = new Modele();
        String expResult = "Enseignant introuvable ou impossible à supprimer";
        String result = instance.supprEnseignant(e);
        assertEquals("Suppression", expResult, result);
    }
    
}