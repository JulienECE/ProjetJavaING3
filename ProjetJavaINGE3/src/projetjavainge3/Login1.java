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
public class Login1 implements ActionListener{
        private JLabel messageUser;
        private JLabel messagePass;
        private JLabel messageMail;
        private JLabel messageDroit;
        private JLabel messageNom;
        private JTextField email;
        private JTextField nom;
        private JTextField prenom;
        private JTextField droit;
        private JTextField username;
        private JTextField password;
        private JTextField age;
         private JFrame loginWindow;
        private JButton login2Button;
        private JButton registerButton;
        private boolean test;
        private JFrame window;
        private String names;
        private int page;
        private boolean type;
        
        public Login1(boolean f,JFrame m,String username,int pages,boolean t){
            page=pages;
            test=f;
            window=m;
            names=username;
            type=t;
            System.out.print("g_yuh");
        }
        
      public void actionPerformed(ActionEvent e)
      {
          System.out.print("L'utilisateur n'est pas trouvé!");
         // Set the panel's background to red.
        JPanel panelLogin;
        loginWindow = new JFrame();
        loginWindow.setTitle("Welcome Back");
        loginWindow.setLocation(800,400);
        loginWindow.setSize(150,320);
        loginWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
     
         messageMail = new JLabel("Email");
         messagePass = new JLabel("Password");
         messageNom = new JLabel("Nom");
         messageUser = new JLabel("Prenom");
         messageDroit = new JLabel("Droit");
         email = new JTextField(10);
         password = new JTextField(10);
         nom = new JTextField(10);
         prenom = new JTextField(10);
         droit = new JTextField(10);
         age = new JTextField(10);
         login2Button = new JButton("Login");
         registerButton = new JButton("Register");
              
         panelLogin = new JPanel();
         panelLogin.add(messageNom);
         panelLogin.add(nom);
         panelLogin.add(messageUser);
         panelLogin.add(prenom);
         panelLogin.add(messagePass);
         panelLogin.add(password);
         panelLogin.add(messageMail);
         panelLogin.add(email);
         panelLogin.add(messageDroit);
         panelLogin.add(droit);
         
         if(type==false){
             panelLogin.add(login2Button);
         }
         
          if(type==true){
              panelLogin.add(messageMail);
              panelLogin.add(age);
              panelLogin.add(registerButton);
         }
          
         System.out.print("g_yuh");
         loginWindow.add(panelLogin);
         loginWindow.setVisible(true);
         
         
         
         
         //DISPLAY LOGIN WINDOW
         if(test==true){ 
         login2Button.addActionListener(new Login2(nom,password,prenom,loginWindow,window,page,names,test,type));
         registerButton.addActionListener(new Login2(nom,password,prenom,loginWindow,window,page,names,test,type));
         }
         
         //DISPLAY THE REGISTER WINDOW
         
         if(test==false){
         
         login2Button.addActionListener(new Register(username,password,loginWindow,window,page,age));
         registerButton.addActionListener(new Register(username,password,loginWindow,window,page,age));
         }
      }
}
