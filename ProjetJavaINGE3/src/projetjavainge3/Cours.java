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
 * @author Asus
 */
public class Cours implements ActionListener {
        private int id;
        private String nom;
        private JLabel messageUser;
      
        
        private JTextField prenom;
      
        private JFrame coursWindow;
        private JFrame mainWindow;
       
     
        private JButton modifier;
        private JButton deplacer;
        private JButton supprimer;
    
    public Cours(int id, String nom){
        this.id=id;
        this.nom=nom;   
    }
    
    public Cours(JFrame m){
        mainWindow=m;
        
    }
    public void actionPerformed(ActionEvent e)
      {
           JPanel panelCours= new JPanel();
        coursWindow = new JFrame();
        coursWindow.setTitle("Cours");
        coursWindow.setLocation(800,400);
        coursWindow.setSize(300,100);
        coursWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
     
        messageUser = new JLabel("Email");
         
        modifier = new JButton("Modifier");
        deplacer = new JButton("Deplacer");
        supprimer = new JButton("Supprimer");
              
         
         
         
      
         panelCours.add(modifier);
         panelCours.add(deplacer);
         panelCours.add(supprimer);
         
         
         coursWindow.add(panelCours);
         coursWindow.setVisible(true);
         modifier.addActionListener(new Modif(mainWindow));
         //deplacer.addActionListener(new Cours());
         //supprimer.addActionListener(new Cours());
      }
}
