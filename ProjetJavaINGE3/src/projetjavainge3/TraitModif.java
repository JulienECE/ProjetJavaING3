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
public class TraitModif implements ActionListener {
   
    
    private JTextField semaine1;
    private JTextField date1;
    private JTextField hd1;
    private JTextField hf1;
    private JTextField etat1;
    private JFrame test;
    
    public TraitModif(JTextField s, JTextField d,JTextField hdd,JTextField hff,JTextField e,JFrame t){
        semaine1=s;
        date1=d;
        hf1=hff;
        hd1=hdd;
        etat1=e;
        test=t;
        
    }
    
    
     public void actionPerformed(ActionEvent e)
      {
         int semaine=Integer.parseInt(semaine1.getText());
         int date=Integer.parseInt(date1.getText());
         int hd=Integer.parseInt(hd1.getText());
         int hf=Integer.parseInt(hf1.getText());
         int etat=Integer.parseInt(etat1.getText());
         
         DAOFactory dao = new DAOFactory();
         dao.modifSeance(1,semaine,date,hd,hf,etat);
         test.setVisible(false);
      }
}
