/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 931701915
 */
public class Login2 implements ActionListener
   {
        private JTextField username1;
        private JTextField prenom1;
        private JTextField password1;
        private JFrame window;
        private JFrame mainWindow;
        private boolean admin;
        private boolean valide=false;
        private int page;
        private String name;
        private boolean tests;
        private boolean types;
        
        public Login2(JTextField u, JTextField p,JTextField prenom, JFrame w,JFrame m,int pages,String names,boolean test,boolean type){
             name=names;
             page=pages;
             username1=u;
             this.prenom1=prenom;
             password1=p;
             window=w;
             mainWindow=m;
         }
      @Override
      public void actionPerformed(ActionEvent e)
      {
         String name;
         String mdp;
         String prenom;
         boolean check= false;
         DAOFactory inter1 = new DAOFactory();
         Utilisateur user = new Utilisateur();
         DAO<Utilisateur> util1DAO;

        
         name=username1.getText();
         mdp=password1.getText();
         prenom=prenom1.getText();
         
         util1DAO=inter1.getuser(name,prenom, mdp);
         user = util1DAO.getuser();
         user.affiche();
         
         
        if(user.getid()!=0){
            System.out.println("OUI C BN GG");
            //Etudiant etudiant = user.isEtudiant();
            //Enseignant enseignant = user.isEnseignant();
            //etudiant.affichecours();
            
            //System.out.println(etudiant.getid());
            System.out.println(user.getdroit());
            if(user.getdroit()==1){
            
             new Login1(tests,window,name,page,types);
               new BigWindow(mainWindow,1,name,page,user);
               window.setVisible(false);
               //mainWindow.setVisible(false);
            }
            
            if(user.getdroit()==2){
               new BigWindow(mainWindow,2,name,page,user);
               window.setVisible(false);
               //mainWindow.setVisible(false);
            }
            
            if(user.getdroit()==3){
               new BigWindow(mainWindow,3,name,page,user);
               window.setVisible(false);
               //mainWindow.setVisible(false);
            }
            
        }
        
        else{
            System.out.println("NOPE");
            window.setVisible(false);
            
            new Login1(tests,window,name,page,types);
        }
      }
   }  
