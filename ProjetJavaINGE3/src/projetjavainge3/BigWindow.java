/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Asus
 */
public class BigWindow {
      private final int screenWidth=1200;
  private final int screenHigh=900;
  
//BUTTON LOG REG 
  
  private JButton loginButton;
  private JButton registerButton;
  private JButton next;
  private JButton previous;
  private JButton basket;
  private JButton buy1;
  private JButton buy2;
  private JButton buy3;
  
  //BUTTON ADMIN

  ArrayList<ArrayList<String>> cars = new ArrayList<ArrayList<String>>();
  ArrayList<JButton> tab = new ArrayList<JButton>();
  
  //
  
  private JButton delete1;
  private JButton delete2;
  private JButton delete3;
  
  private JButton addmovie;
  private JButton modifier;
  private JButton ajouter;
  private JButton supprimer;
  
//USE FOR IMAGE  
 
  private ImageIcon image1;
  private ImageIcon image2;
  private JLabel labelf;
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel basketmessage;
  
//NAME OF MOVIE
  
  private String movie1="STAR WARS";
  private String movie2="ASTERIX ET OBELIX";
  private String movie3="AVATAR";
  
//DESCRIPTION OF EACH MOVIE 
  
  private JLabel des1;
  private JLabel des2;
  private JLabel des3;
  private JLabel wmessage;
  
  private JFrame mainWindow;
  private Image scaleImage;
  
  private String username;
  private int page=0;
  private int type;
  private int nbp;
  private int nbf;
  private int r;
  
    public BigWindow(int types,String name,int num_page)
    {
      type=types;
    page=num_page;
    username=name;
    mainWindow= new JFrame();  
    mainWindow.setLayout(new BorderLayout());  
    mainWindow.setTitle("MAIN WINDOW");
    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainWindow.setLocation(0,0);
    int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int screenHigh = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    mainWindow.setSize(screenWidth,screenHigh);
    
    //RECUP MOVIES URL AND NAMES
    
    //Mysqlc ms = new Mysqlc();
    //cars=ms.displaymovies();
     
    //nbf=cars.size();
    
    r=nbf%3;
    //System.out.println(nbf);
    //System.out.println(r);
    if(nbf%3==0){
        nbp=nbf/3;
        //System.out.println(nbp);
    }
    else if(nbf!=0){
        nbp=((nbf-r)/3)+1;
        System.out.println(nbp);
        
    }
     // CREAT A BLACK BACKGROUND
     
     JPanel panel7 = new JPanel();
     panel7.setBackground(Color.black);
     mainWindow.add(panel7);

      // INITIALISE LOG BUTTON
      
      loginButton = new JButton("Login");
      modifier = new JButton("Modifier");
      ajouter = new JButton("Ajouter");
      supprimer = new JButton("Supprimer");
      registerButton = new JButton("Register");
      buy1 = new JButton("Buy");
      buy2 = new JButton("Buy");
      buy3 = new JButton("Buy");
      next = new JButton("next");
      previous = new JButton("previous");
      
      delete1 = new JButton("Delete");
      delete2 = new JButton("Delete");
      delete3 = new JButton("Delete");  
      
      basket = new JButton("Basket");
      
      addmovie = new JButton("ADD MOVIE");
     /* int j=0;
      
      for(int i=0;i<3;i++){
      if(cars.get(i).get(0)!=null){
          j++;
      }
      }*/
      
     // buy1.addActionListener(new buy(cars.get(0).get(1),username,mainWindow,page));
      //buy2.addActionListener(new buy(cars.get(1).get(1),username,mainWindow,page));
      //buy3.addActionListener(new buy(cars.get(2).get(1),username,mainWindow,page));
      
      //delete1.addActionListener(new Delete(cars.get(0).get(1),mainWindow,username,page));
      //delete2.addActionListener(new Delete(cars.get(1).get(1),mainWindow,username,page));
      //delete3.addActionListener(new Delete(cars.get(2).get(1),mainWindow,username,page));
      
      //basket.addActionListener(new Basket(username));
      
      //addmovie.addActionListener(new Addmovie(mainWindow,username,page));
      
      loginButton.addActionListener(new Login1(true,mainWindow,username,page,false));
      //registerButton.addActionListener(new Login1(false,mainWindow,username,page,true));
       
      //if(nbp!=page+1){
      //next.addActionListener(new Page(type,1,page,mainWindow,username));
      //}
      
       //if(page!=0){
      //previous.addActionListener(new Page(type,0,page,mainWindow,username));
       //}
       
      // CREATE PANELS
      
      JPanel panellog = new JPanel();
      JPanel welcomepanel = new JPanel();
      
      panellog.setLayout(new GridLayout(2, 1));
      JPanel panelreg = new JPanel();
      JPanel panelnext = new JPanel();
      JPanel panelprevious = new JPanel();
      JPanel paneldes1 = new JPanel();
      JPanel paneldes3 = new JPanel();
      JPanel paneldes2 = new JPanel();
      JPanel panelentete = new JPanel();
      JPanel panelgauche = new JPanel();
      JPanel paneldroite = new JPanel();
      JPanel panelfilm = new JPanel();
      JPanel panelbot = new JPanel();
      JPanel panel = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      JPanel basketpanel = new JPanel();
      
      //PANEL BUTTON BUY
      
      JPanel buypanel1 = new JPanel();
      JPanel buypanel2 = new JPanel();
      JPanel buypanel3 = new JPanel();
      JPanel modif = new JPanel();
      JPanel add = new JPanel();
      JPanel supp = new JPanel();
      
      //ADDLOG PUTTON TO PANEL
      modif.add(modifier);
      add.add(ajouter);
      supp.add(supprimer);
      panelnext.add(next);
      panelprevious.add(previous);
      panellog.add(loginButton);
      panellog.add(registerButton);
      /*if(cars.get(0).get(1)!=null){
      buypanel1.add(buy1);
      }
      if(cars.get(1).get(1)!=null){
      buypanel2.add(buy2);
      }
      if(cars.get(2).get(1)!=null){
      buypanel3.add(buy3);
      }
      
      if(type==2){
      buypanel1.add(delete1);
      buypanel2.add(delete2);
      buypanel3.add(delete3);
      panelentete.add(addmovie);
      }*/
      //SET BACKGROUND COLOR FOR EACH PANELS
      
      panellog.setBackground(Color.yellow);
      panelnext.setBackground(Color.decode("#fecc00"));
      modif.setBackground(Color.decode("#fecc00"));
      add.setBackground(Color.decode("#fecc00"));
      supp.setBackground(Color.decode("#fecc00"));
      panelprevious.setBackground(Color.decode("#fecc00"));
      //panelreg.setBackground(Color.blue);
      panelentete.setBackground(Color.decode("#fecc00"));
      panelgauche.setBackground(Color.decode("#f5f2ce"));
      paneldroite.setBackground(Color.decode("#f5f2ce"));
      //panelfilm.setBackground(Color.magenta);
      //panelbot.setBackground(Color.red);
      panel.setBackground(Color.white);
      //panel2.setBackground(Color.black);
      //panel3.setBackground(Color.white);
      //paneldes1.setBackground(Color.white);
      //paneldes2.setBackground(Color.white);
      //paneldes3.setBackground(Color.white);
      buypanel1.setBackground(Color.black);
      buypanel2.setBackground(Color.black);
      buypanel3.setBackground(Color.black);
      
      //SIZE OF ALL PANELS
      panelnext.setSize(100, 35);
      modif.setSize(100, 35);
      add.setSize(100, 35);
      supp.setSize(100, 35);
      panelprevious.setSize(85, 35);
      panellog.setSize(screenWidth/8, screenHigh/7);
      welcomepanel.setSize(screenWidth/5, screenHigh/5);
      panelfilm.setSize(screenWidth-screenWidth/5, screenHigh-2*(screenHigh/5));
      panelreg.setSize(screenWidth/8, screenHigh/7);
      panelentete.setSize(screenWidth, screenHigh/7);
      panelgauche.setSize(screenWidth/8, screenHigh-(screenHigh/7));
      //paneldroite.setSize(screenWidth/6, screenHigh-2*(screenHigh/5));
      panelbot.setSize(screenWidth,screenHigh/10);
      basketpanel.setSize(100,100);
      int numx=12;
      int numy=6;
      
      panel.setLayout(new GridLayout(numx,numy));
      Border blackline = BorderFactory.createLineBorder(Color.black,1);
      for(int i = 0; i<numx-1;i++)
      {
            JLabel ptest = new JLabel();
            ptest.setBorder(blackline);
            panelgauche.add(ptest);
      }
      for(int i = 0; i<numx*numy;i++)
        {
            JPanel ptest = new JPanel();
            ptest.setBorder(blackline);
            panel.add(ptest);
        }
           int gridw = screenWidth-(screenWidth/8)+(screenWidth/10);
           int gridh=(screenHigh-(screenHigh/7)+(screenHigh/7));
            //IMAGES
            
            panel.setSize(gridw-(screenWidth/8),gridh-(screenWidth/7));
            panel2.setSize(screenWidth,screenHigh);
            panel3.setSize(3*(screenHigh-2*(screenHigh/5))/12, (screenHigh-2*(screenHigh/5))/3);
        
            //DESCRIPTION OF IMAGES
        
            paneldes1.setSize((screenWidth-(2*screenWidth/6))-(3*(screenHigh-2*(screenHigh/5))/12), (screenHigh-2*(screenHigh/5))/4);
            paneldes2.setSize((screenWidth-(2*screenWidth/6))-(3*(screenHigh-2*(screenHigh/5))/12), (screenHigh-2*(screenHigh/5))/4);
            paneldes3.setSize((screenWidth-(2*screenWidth/6))-(3*(screenHigh-2*(screenHigh/5))/12), (screenHigh-2*(screenHigh/5))/4);
            
            //PANEL SIZE BUY BUTTON
            
            buypanel1.setSize((screenWidth-(2*screenWidth/6))-(3*(screenHigh-2*(screenHigh/5))/12), (screenHigh-2*(screenHigh/5))/12);
            buypanel2.setSize((screenWidth-(2*screenWidth/6))-(3*(screenHigh-2*(screenHigh/5))/12), (screenHigh-2*(screenHigh/5))/12);
            buypanel3.setSize((screenWidth-(2*screenWidth/6))-(3*(screenHigh-2*(screenHigh/5))/12), (screenHigh-2*(screenHigh/5))/12);
            
      
      //POSITION OF EACH PANEL  
            panelnext.setLocation((screenWidth-(screenWidth/6))-60, (screenHigh/5)-35);
            modif.setLocation((screenWidth/8),(screenHigh/7)-35);
            add.setLocation((screenWidth/8)+110,(screenHigh/7)-35);
            supp.setLocation((screenWidth/8)+220,(screenHigh/7)-35);
            panelprevious.setLocation((screenWidth-(screenWidth/6))-60-85, (screenHigh/5)-35);
            panellog.setLocation(0, 0);
            welcomepanel.setLocation(0, 0);
            panelfilm.setLocation(screenWidth/5, screenHigh/5);
            panelentete.setLocation(0, 0);
            panelgauche.setLocation(0, screenHigh/7);
            paneldroite.setLocation(screenWidth-(screenWidth/10), screenHigh/5);
            panelbot.setLocation(0, (screenHigh-screenHigh/10)-7);
            basketpanel.setLocation(70,70);
      
            //IMAGES
      
            panel.setLocation(screenWidth/8,screenHigh/7);
            panel2.setLocation(0,0);
            panel3.setLocation(screenWidth/6,(screenHigh/5)+2*(screenHigh-2*(screenHigh/5))/3);
            
            //DESCRIPTION
            
            paneldes1.setLocation((screenWidth/6)+(3*(screenHigh-2*(screenHigh/5))/12),screenHigh/5);
            paneldes2.setLocation((screenWidth/6)+(3*(screenHigh-2*(screenHigh/5))/12),(screenHigh/5)+(screenHigh-2*(screenHigh/5))/3);
            paneldes3.setLocation((screenWidth/6)+(3*(screenHigh-2*(screenHigh/5))/12),(screenHigh/5)+2*(screenHigh-2*(screenHigh/5))/3);
            
            //PANEL WITH BUY BUTTON
            buypanel1.setLocation(((screenWidth/6)+(3*(screenHigh-2*(screenHigh/5))/12)),(screenHigh/5)+((screenHigh-2*(screenHigh/5))/4));
            buypanel2.setLocation(((screenWidth/6)+(3*(screenHigh-2*(screenHigh/5))/12)),((screenHigh/5)+(screenHigh-2*(screenHigh/5))/3)+((screenHigh-2*(screenHigh/5))/4));
            buypanel3.setLocation(((screenWidth/6)+(3*(screenHigh-2*(screenHigh/5))/12)),((screenHigh/5)+2*(screenHigh-2*(screenHigh/5))/3)+((screenHigh-2*(screenHigh/5))/4));


     //TEST DESCRIPTION - AFFICHAGE       
            
     des1 = new JLabel("Incroyable");
     des2 = new JLabel("insane");
     des3 = new JLabel("Dammmmn les gens c'est tibo inshape");
     wmessage = new JLabel("Welcome back "+username);
      
     //INITIALISATION OF EACH IMAGES
      /*
      image1= new ImageIcon(getClass().getResource("FOND.png"));
      scaleImage = image1.getImage().getScaledInstance((3*screenWidth)/2, (screenHigh/6),Image.SCALE_DEFAULT);
      image2 = new ImageIcon(scaleImage);
      labelf = new JLabel(image2);
      
      if(0+(3*page)<cars.size()){
      image1= new ImageIcon(getClass().getResource(cars.get(0+3*page).get(1)));
      scaleImage = image1.getImage().getScaledInstance(3*(screenHigh-2*(screenHigh/5))/12, (screenHigh-2*(screenHigh/5))/3,Image.SCALE_DEFAULT);
      image2 = new ImageIcon(scaleImage);
      label1 = new JLabel(image2);
      }
      
      if(1+(3*page)<cars.size()){
      image1= new ImageIcon(getClass().getResource(cars.get(1+3*page).get(1)));
      scaleImage = image1.getImage().getScaledInstance(3*(screenHigh-2*(screenHigh/5))/12, (screenHigh-2*(screenHigh/5))/3,Image.SCALE_DEFAULT);
      image2 = new ImageIcon(scaleImage);
      label2 = new JLabel(image2);
        }
      if(2+(3*page)<cars.size()){
      image1= new ImageIcon(getClass().getResource(cars.get(2+3*page).get(1)));
      scaleImage = image1.getImage().getScaledInstance(3*(screenHigh-2*(screenHigh/5))/12, (screenHigh-2*(screenHigh/5))/3,Image.SCALE_DEFAULT);
      image2 = new ImageIcon(scaleImage);
      label3 = new JLabel(image2);
      }
      
      //ADD IMAGES AND DESCRIPYION TO EACH PANELS
      
      if(0+(3*page)<cars.size()){
      panel.add(label1,BorderLayout.EAST);
      }
      if(1+(3*page)<cars.size()){
      panel2.add(label2,BorderLayout.EAST);
      }
      if(2+(3*page)<cars.size()){
      panel3.add(label3,BorderLayout.EAST);
      }*/
      
      //panelbot.add(labelf);
      paneldes1.add(des1);
      paneldes2.add(des2);
      paneldes3.add(des3);
      welcomepanel.add(wmessage);
      basketpanel.add(basket);

     //AFFICHAGE PANELS

     mainWindow.add(panel);
     mainWindow.add(panelgauche);  
     mainWindow.add(paneldroite); 
     mainWindow.add(panelnext); 
     mainWindow.add(modif);
     mainWindow.add(add);
     mainWindow.add(supp);
     mainWindow.add(panelprevious);
     mainWindow.add(panelbot);
     
     //mainWindow.add(buypanel1);  
     //mainWindow.add(buypanel2);  
     //mainWindow.add(buypanel3);  
     
     //mainWindow.add(panel2);
     //mainWindow.add(panel3);
     //mainWindow.add(paneldes1);
     //mainWindow.add(paneldes2);
     //mainWindow.add(paneldes3);
     if(type==0){
         mainWindow.add(panellog);  
     }
      if(type==1){
          mainWindow.add(basketpanel);
        mainWindow.add(welcomepanel);  
     }
      if(type==2){
         mainWindow.add(basketpanel);
         mainWindow.add(welcomepanel);  
     }
     
     
    // mainWindow.add(panelreg); 
     mainWindow.add(panelentete);  
     
     
     
    // mainWindow.add(panelbot);
    // mainWindow.add(panelfilm); 
     
       
     
    // Display the window.
      
    mainWindow.setVisible(true);
    }
}
