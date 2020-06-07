/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Asus
 */
public class Fenetre extends JFrame{
    
     Admin admin= new Admin();
     private JComboBox liste1;
     private Utilisateur user;
     private JFrame mainWindow;
     private int page;
     private String name;
     
     public Fenetre(Utilisateur user,JFrame mainWindow,int page,String name){
         this.user=user;
         this.mainWindow=mainWindow;
         this.page=page;
         this.name=name;

     }
     public JPanel addpanel(){
          
      JPanel deroul = new JPanel();
        deroul.setLayout(new FlowLayout());
           deroul.setBackground(Color.red);

        deroul.setSize(1920,30);
        deroul.setLocation(0,50);

           
       String[] tabs = new String[admin.getTab().size()];
       
        for(int i = 0; i < admin.getTab().size(); i++) {
                tabs[i] = String.valueOf(admin.getTab().get(i).getid()+" "+admin.getTab().get(i).getprenom()+" "+admin.getTab().get(i).getnom());
        }
        String d=String.valueOf(this.user.getid());
        liste1 = new JComboBox(tabs);
        JButton bouton = new JButton(new Valide(this,"Valider",d,admin,mainWindow,page,name));
        System.out.print("OE:"+this.user.getid());
        bouton.setActionCommand(String.valueOf(this.user.getid()));
        
        deroul.add(liste1);
        deroul.add(bouton);
        return deroul;
}
     public JComboBox getListe1(){
		return liste1;
	}
}