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
public class Modif implements ActionListener {
    
     private JLabel msemaine;
     private JLabel mhd;
     private JLabel mhf;
     private JLabel mdate;
     private JLabel metat;
      
        
     private JTextField semaine;
     private JTextField hd;
     private JTextField hf;
     private JTextField date;
     private JTextField etat;
      
     private JFrame modifWindow;
     private JFrame mainWindow;
     
     private int id;
       
     
     private JButton modifier2;
     public Modif(JFrame m,int i){
         mainWindow=m;
         id=i;
     }
    
    
    
    
    
    public void actionPerformed(ActionEvent e)
      {
        
          
        JPanel panelModif= new JPanel();
        modifWindow = new JFrame();
        modifWindow.setTitle("Cours");
        modifWindow.setLocation(800,400);
        modifWindow.setSize(150,400);
        modifWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
     
        msemaine = new JLabel("Semaine");
        mdate = new JLabel("Date");
        mhd = new JLabel("Heure de début");
        mhf = new JLabel("Heure de fin");
        metat = new JLabel("Etat");
        
        semaine = new JTextField(10);
        hd = new JTextField(10);
        hf = new JTextField(10);
        date = new JTextField(10);
        etat = new JTextField(10);
         
        modifier2 = new JButton("Modifier");
        
              
         panelModif.add(msemaine);
         panelModif.add(semaine);
         panelModif.add(mdate);
         panelModif.add(date);
         panelModif.add(mhd);
         panelModif.add(hd);
         panelModif.add(mhf);
         panelModif.add(hf);
         panelModif.add(metat);
         panelModif.add(etat);
         
         
      
         panelModif.add(modifier2);
        
         
         
         modifWindow.add(panelModif);
         modifWindow.setVisible(true);
         modifier2.addActionListener(new TraitModif(semaine,date,hd,hf,etat,modifWindow,mainWindow,id));
         
         
         
      }
    
    
}
