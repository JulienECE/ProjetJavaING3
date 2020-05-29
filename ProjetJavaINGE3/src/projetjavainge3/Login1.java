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
        private JLabel messageAge;
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
        }
        
      public void actionPerformed(ActionEvent e)
      {
         // Set the panel's background to red.
        JPanel panelLogin;
         loginWindow = new JFrame();
        loginWindow.setTitle("Welcome Back");
        loginWindow.setLocation(800,400);
        loginWindow.setSize(200,150);
        loginWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
     
         messageUser = new JLabel("Username");
         messagePass = new JLabel("Password");
         messageAge = new JLabel("Age");
         username = new JTextField(10);
         password = new JTextField(10);
         age = new JTextField(10);
         login2Button = new JButton("Login");
         registerButton = new JButton("Register");
              
         panelLogin = new JPanel();
         panelLogin.add(messageUser);
         panelLogin.add(username);
         panelLogin.add(messagePass);
         panelLogin.add(password);
         if(type==false){
             panelLogin.add(login2Button);
         }
          if(type==true){
              panelLogin.add(messageAge);
              panelLogin.add(age);
              panelLogin.add(registerButton);
         }
         
         loginWindow.add(panelLogin);
         loginWindow.setVisible(true);
         
         //DISPLAY LOGIN WINDOW
         
         if(test==true){
         //login2Button.addActionListener(new Login2(username,password,loginWindow,window,page));
         //registerButton.addActionListener(new Login2(username,password,loginWindow,window,page));
         }
         
         //DISPLAY THE REGISTER WINDOW
         
         if(test==false){
         
        // login2Button.addActionListener(new Register(username,password,loginWindow,window,page,age));
       //  registerButton.addActionListener(new Register(username,password,loginWindow,window,page,age));
         }
      }
}
