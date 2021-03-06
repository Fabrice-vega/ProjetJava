/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava.vue.graph;

import java.awt.CardLayout;
import projetjava.modele.Modele;
/**
 *
 * @author Fabrice
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TestAjoutClasses
     */
    public MenuPrincipal() {
        initComponents();
        Modele m = Modele.getInstance();
        c1.setModele(m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new projetjava.vue.graph.AjoutClasses();
        ajoutEnseignant1 = new projetjava.vue.graph.AjoutEnseignant();
        ajoutClasses1 = new projetjava.vue.graph.AjoutClasses();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAjouter = new javax.swing.JMenu();
        AjoutClasses = new javax.swing.JMenuItem();
        ajoutEnseignant = new javax.swing.JMenuItem();
        menuRechercher = new javax.swing.JMenu();
        menuModifier = new javax.swing.JMenu();
        menuSupprimer = new javax.swing.JMenu();
        menuListes = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        c1.setName("c1"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(ajoutEnseignant1, "cardAjoutEnseignant");
        getContentPane().add(ajoutClasses1, "cardAjoutClasses");

        menuAjouter.setText("Ajouter");

        AjoutClasses.setText("Ajouter une classe");
        AjoutClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutClassesActionPerformed(evt);
            }
        });
        menuAjouter.add(AjoutClasses);

        ajoutEnseignant.setText("Ajouter un enseignant");
        ajoutEnseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutEnseignantActionPerformed(evt);
            }
        });
        menuAjouter.add(ajoutEnseignant);

        jMenuBar1.add(menuAjouter);

        menuRechercher.setText("Rechercher");
        jMenuBar1.add(menuRechercher);
        menuRechercher.getAccessibleContext().setAccessibleName("");

        menuModifier.setText("Modifier");
        jMenuBar1.add(menuModifier);

        menuSupprimer.setText("Supprimer");
        jMenuBar1.add(menuSupprimer);

        menuListes.setText("Listes");
        jMenuBar1.add(menuListes);

        jMenu5.setText("Attribution");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjoutClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutClassesActionPerformed
        CardLayout cl = (CardLayout)getContentPane().getLayout();
        cl.show(this.getContentPane(), "cardAjoutClasses");
    }//GEN-LAST:event_AjoutClassesActionPerformed

    private void ajoutEnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutEnseignantActionPerformed
        CardLayout cl = (CardLayout)getContentPane().getLayout();
        cl.show(this.getContentPane(), "cardAjoutEnseignant");
    }//GEN-LAST:event_ajoutEnseignantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AjoutClasses;
    private projetjava.vue.graph.AjoutClasses ajoutClasses1;
    private javax.swing.JMenuItem ajoutEnseignant;
    private projetjava.vue.graph.AjoutEnseignant ajoutEnseignant1;
    private projetjava.vue.graph.AjoutClasses c1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAjouter;
    private javax.swing.JMenu menuListes;
    private javax.swing.JMenu menuModifier;
    private javax.swing.JMenu menuRechercher;
    private javax.swing.JMenu menuSupprimer;
    // End of variables declaration//GEN-END:variables
}
