/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gauthier
 */
public class AjouterCours implements ActionListener {
    
    private JLabel msemaine;
     private JLabel mhd;
     private JLabel mhf;
     private JLabel mdate;
     private JLabel metat;
     private JLabel mmatiere;
     private JLabel mtype;
     private JLabel mprof;
     private JLabel mgrp;
      
        
     private JTextField semaine;
     private JTextField hd;
     private JTextField hf;
     private JTextField date;
     private JTextField etat;
     private JTextField matiere;
     private JTextField type;
     private JTextField prof;
     private JTextField grp;
      
     private JFrame ajouterWindow;
     private JFrame mainWindow;
     
    
       
     
     private JButton ajouter;
    
    public void actionPerformed(ActionEvent e)
      {
         JPanel panelAjouter= new JPanel();
        ajouterWindow = new JFrame();
        ajouterWindow.setTitle("Cours");
        ajouterWindow.setLocation(800,400);
        ajouterWindow.setSize(150,600);
        ajouterWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
     
        msemaine = new JLabel("Semaine");
        mdate = new JLabel("Date");
        mhd = new JLabel("Heure de début");
        mhf = new JLabel("Heure de fin");
        metat = new JLabel("Etat");
        mmatiere= new JLabel("Matiere");
        mtype = new JLabel("Type");
        mprof = new JLabel("Enseignant");
        mgrp = new JLabel("Groupe");
        
        semaine = new JTextField(10);
        hd = new JTextField(10);
        hf = new JTextField(10);
        date = new JTextField(10);
        etat = new JTextField(10);
        matiere = new JTextField(10);
        type = new JTextField(10);
        prof = new JTextField(10);
        grp = new JTextField(10);
         
        ajouter = new JButton("Ajouter");
        
              
         
         panelAjouter.add(mdate);
         panelAjouter.add(date);
         panelAjouter.add(mhd);
         panelAjouter.add(hd);
         panelAjouter.add(mhf);
         panelAjouter.add(hf);
         panelAjouter.add(metat);
         panelAjouter.add(etat);
         panelAjouter.add(mmatiere);
         panelAjouter.add(matiere);
         panelAjouter.add(mtype);
         panelAjouter.add(type);
         panelAjouter.add(mprof);
         panelAjouter.add(prof);
         panelAjouter.add(mgrp);
         panelAjouter.add(grp);
         
         
      
         panelAjouter.add(ajouter);
        
         
         
         ajouterWindow.add(panelAjouter);
         ajouterWindow.setVisible(true);
         ajouter.addActionListener(new TraitAjout(date,hd,hf,etat,ajouterWindow,mainWindow,matiere,type,prof,grp));
      }
    
}
