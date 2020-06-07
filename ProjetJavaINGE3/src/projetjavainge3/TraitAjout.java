/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Gauthier
 */
public class TraitAjout implements ActionListener{
    
    private JTextField semaine1;
    private JTextField date1;
    private JTextField hd1;
    private JTextField hf1;
    private JTextField etat1;
    private JTextField matiere;
    private JTextField type;
    private JTextField prof;
    private JTextField groupe;
    private JFrame test;
    private JFrame main;
   
    
    public TraitAjout( JTextField d,JTextField hdd,JTextField hff,JTextField e,JFrame t,JFrame m,JTextField mm,JTextField tt,JTextField pp, JTextField gg){
        
        date1=d;
        hf1=hff;
        hd1=hdd;
        etat1=e;
        test=t;
        main=m;
        matiere=mm;
        type=tt;
        prof=pp;
        groupe=pp;
        
    }
    
    
    @Override
     public void actionPerformed(ActionEvent e)
      {
         //int semaine=Integer.parseInt(semaine1.getText());
          int semaine;
         String date=date1.getText();
         int datess=Integer.parseInt(date1.getText());
         String hd=hd1.getText();
         String hf=hf1.getText();
         int etat=Integer.parseInt(etat1.getText());
         int m=Integer.parseInt(matiere.getText());
         int t=Integer.parseInt(type.getText());
         int p=Integer.parseInt(prof.getText());
         int g=Integer.parseInt(groupe.getText());
         
        int year;
        int month;
        int day;
        
        year = Integer.parseInt(date.substring(0,4));
        month = Integer.parseInt(date.substring(4,6));
        day = Integer.parseInt(date.substring(6,8));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        java.util.Date dates = cal.getTime();
        DateFormat format = new SimpleDateFormat("ww");
        String dayFound = format.format(dates);
        System.out.println("la semaine est: " + dayFound);

         semaine=Integer.parseInt(dayFound);
         test.setVisible(false);
         DAOFactory dao = new DAOFactory();
         dao.addCours(semaine, datess, hd, hf,etat,m,t,p,g);
         
         
      }
}
