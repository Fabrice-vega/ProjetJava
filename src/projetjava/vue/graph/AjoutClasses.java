/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava.vue.graph;

import java.awt.Color;
import javax.swing.JOptionPane;
import projetjava.modele.Classes;
import projetjava.modele.Modele;

/**
 *
 * @author Fabrice
 */
public class AjoutClasses extends javax.swing.JPanel {
    private Modele m;
    /**
     * Creates new form ajoutClasse
     */
    public AjoutClasses() {
        initComponents();
    }
    
    public void setModele(Modele m){
       this.m = m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lSigle = new javax.swing.JLabel();
        tfSigle = new javax.swing.JTextField();
        lAnnee = new javax.swing.JLabel();
        tfAnnee = new javax.swing.JTextField();
        lOrientation = new javax.swing.JLabel();
        tfOrientation = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(4, 2, 2, 2));

        lSigle.setText("Sigle :");
        add(lSigle);
        lSigle.getAccessibleContext().setAccessibleName("lSigle");

        add(tfSigle);
        tfSigle.getAccessibleContext().setAccessibleName("tfSigle");

        lAnnee.setText("Année :");
        add(lAnnee);
        lAnnee.getAccessibleContext().setAccessibleName("lAnnee");

        add(tfAnnee);
        tfAnnee.getAccessibleContext().setAccessibleName("tfAnnee");

        lOrientation.setText("Orientation :");
        add(lOrientation);
        lOrientation.getAccessibleContext().setAccessibleName("lOrientation");

        add(tfOrientation);
        tfOrientation.getAccessibleContext().setAccessibleName("tfOrientation");

        btnOk.setLabel("OK");
        btnOk.setVerifyInputWhenFocusTarget(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        add(btnOk);
        btnOk.getAccessibleContext().setAccessibleName("btnOk");

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });
        add(btnAnnuler);
        btnAnnuler.getAccessibleContext().setAccessibleName("btnAnnuler");
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        tfSigle.setBackground(Color.white);
        tfAnnee.setBackground(Color.white);
        tfOrientation.setBackground(Color.white);
        boolean erreur=false;
        
        String sigle=tfSigle.getText();
        if (sigle.trim().equals("")) {
            erreur =true;
            tfSigle.setBackground(Color.red);
        }
        
        String orientation=tfOrientation.getText();
        if (orientation.trim().equals("")) {
            erreur =true;
            tfOrientation.setBackground(Color.red);
        }
        
        String annees = tfAnnee.getText();
        int annee = 0;
        
        try{
           annee=Integer.parseInt(annees);
        }
        catch(NumberFormatException e){
            erreur =true;
            tfAnnee.setBackground(Color.red);
        }       
       
       if(!erreur) {
           Classes c = new Classes(sigle,orientation,annee);
           String msg = m.ajoutClasses(c);
             JOptionPane.showMessageDialog(this, msg, "Résultat", JOptionPane.INFORMATION_MESSAGE);
       }       
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        tfSigle.setText("");
        tfAnnee.setText("");
        tfOrientation.setText("");
        tfSigle.setBackground(Color.white);
        tfAnnee.setBackground(Color.white);
        tfOrientation.setBackground(Color.white);
    }//GEN-LAST:event_btnAnnulerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lAnnee;
    private javax.swing.JLabel lOrientation;
    private javax.swing.JLabel lSigle;
    private javax.swing.JTextField tfAnnee;
    private javax.swing.JTextField tfOrientation;
    private javax.swing.JTextField tfSigle;
    // End of variables declaration//GEN-END:variables
}
