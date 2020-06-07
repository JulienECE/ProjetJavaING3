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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
  
  private JLabel heure1;
  private JLabel heure2;
  private JLabel heure3;
  private JLabel heure4;
  private JLabel heure5;
  private JLabel heure6;
  private JLabel heure7;
  private JLabel heure8;
  private JLabel heure9;
  private JLabel heure10;
  private JLabel heure11;
  private JLabel heure12;
  
  private JFrame mainWindow;
  private Image scaleImage;
  
  private String username;
  private int page=0;
  private int type;
  private int nbp;
  private int nbf;
  private int r;
  private Etudiant etudiant;
  private Enseignant enseignant;
  
    public BigWindow(JFrame mainWindow,int types,String name,int num_page,Utilisateur user)
    {
        System.out.println("entrer");
    this.mainWindow=mainWindow;
    mainWindow.getContentPane().removeAll();
    type=types;
    page=num_page;
    username=name;
    
    
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

     
     String debut = "0830";
     int nombre_semaine = 30;
     
      // INITIALISE LOG BUTTON
      
      loginButton = new JButton("Login");
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
      
      heure1 = new JLabel("8h30");
       heure2 = new JLabel("9h30");
       heure3 = new JLabel("10h30");
       heure4 = new JLabel("11h30");
       heure5 = new JLabel("12h30");
       heure6 = new JLabel("13h30");
       heure7 = new JLabel("14h30");
       heure8 = new JLabel("15h30");
       heure9 = new JLabel("16h30");
       heure10 = new JLabel("17h30");
       heure11 = new JLabel("18h30");
       heure12 = new JLabel("19h30");
     /* int j=0;
      System.out.println("entrer");
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
      
       
      //if(nbp!=page+1){
      //next.addActionListener(new Page(type,1,page,mainWindow,username));
      //}
      
       //if(page!=0){
      //previous.addActionListener(new Page(type,0,page,mainWindow,username));
       //}
       
      // CREATE PANELS
      System.out.println("entrer1");
      JPanel panellog = new JPanel();
      JPanel welcomepanel = new JPanel();
      
      panellog.setLayout(new GridLayout(1, 1));
      JPanel panelreg = new JPanel();
      JPanel panelnext = new JPanel();
      JPanel panelprevious = new JPanel();
      JPanel paneldes1 = new JPanel();
      JPanel paneldes3 = new JPanel();
      JPanel paneldes2 = new JPanel();
      JPanel panelentete = new JPanel();
      JPanel paneladd = new JPanel();
      JPanel panelgauche = new JPanel();
      
      JPanel panelgauche1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche6 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche7 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche8 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche9 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche10 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche11 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      JPanel panelgauche12 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      
      JPanel paneldroite = new JPanel();
      JPanel panelfilm = new JPanel();
      JPanel panelbot = new JPanel();
      JPanel panel = new JPanel();
      JPanel semaine = new JPanel();
      JPanel menu = new JPanel();
      semaine.setLayout(new GridLayout(1, nombre_semaine));
      menu.setLayout(new GridLayout(1, nombre_semaine));
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      JPanel basketpanel = new JPanel();
      
      //PANEL BUTTON BUY
      
      JPanel buypanel1 = new JPanel();
      JPanel buypanel2 = new JPanel();
      JPanel buypanel3 = new JPanel();
      JPanel add = new JPanel();
      JPanel supp = new JPanel();
      
      //ADDLOG PUTTON TO PANEL
      add.add(ajouter);
      supp.add(supprimer);
      panelnext.add(next);
      panelprevious.add(previous);
      panellog.add(loginButton);
      JButton ajout = new JButton("Ajouter");
        
        ajout.addActionListener(new AjouterCours());
        paneladd.add(ajout);
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
      add.setBackground(Color.decode("#fecc00"));
      supp.setBackground(Color.decode("#fecc00"));
      panelprevious.setBackground(Color.decode("#fecc00"));
      //panelreg.setBackground(Color.blue);
      panelentete.setBackground(Color.decode("#fecc00"));
      paneladd.setBackground(Color.decode("#fecc00"));
      panelgauche.setBackground(Color.decode("#f5f2ce"));
      
      panelgauche1.setBackground(Color.decode("#fecc00"));
      panelgauche2.setBackground(Color.decode("#fecc00"));
      panelgauche3.setBackground(Color.decode("#fecc00"));
      panelgauche4.setBackground(Color.decode("#fecc00"));
      panelgauche5.setBackground(Color.decode("#fecc00"));
      panelgauche6.setBackground(Color.decode("#fecc00"));
      panelgauche7.setBackground(Color.decode("#fecc00"));
      panelgauche8.setBackground(Color.decode("#fecc00"));
      panelgauche9.setBackground(Color.decode("#fecc00"));
      panelgauche10.setBackground(Color.decode("#fecc00"));
      panelgauche11.setBackground(Color.decode("#fecc00"));
      panelgauche12.setBackground(Color.decode("#fecc00"));
      
      paneldroite.setBackground(Color.decode("#f5f2ce"));
      //panelfilm.setBackground(Color.magenta);
      //panelbot.setBackground(Color.red);
      panel.setBackground(Color.decode("#fecc00"));
      semaine.setBackground(Color.decode("#fecc00"));
      menu.setBackground(Color.decode("#fecc00"));
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
      add.setSize(100, 35);
      supp.setSize(100, 35);
      panelprevious.setSize(85, 35);
      panellog.setSize(screenWidth/8, screenHigh/14);
      welcomepanel.setSize(screenWidth/5, screenHigh/5);
      panelfilm.setSize(screenWidth-screenWidth/5, screenHigh-2*(screenHigh/5));
      panelreg.setSize(screenWidth/8, screenHigh/7);
      panelentete.setSize(screenWidth, screenHigh/7);
      paneladd.setSize(screenWidth, 100);
      panelgauche.setSize(screenWidth/8, screenHigh-(screenHigh/7));
      
      panelgauche1.setSize(screenWidth/8, 850/12);
      panelgauche2.setSize(screenWidth/8, 850/12);
      panelgauche3.setSize(screenWidth/8, 850/12);
      panelgauche4.setSize(screenWidth/8, 850/12);
      panelgauche5.setSize(screenWidth/8, 850/12);
      panelgauche6.setSize(screenWidth/8, 850/12);
      panelgauche7.setSize(screenWidth/8, 850/12);
      panelgauche8.setSize(screenWidth/8, 850/12);
      panelgauche9.setSize(screenWidth/8, 850/12);
      panelgauche10.setSize(screenWidth/8, 850/12);
      panelgauche11.setSize(screenWidth/8, 850/12);
      panelgauche12.setSize(screenWidth/8, 850/12);
      
      //paneldroite.setSize(screenWidth/6, screenHigh-2*(screenHigh/5));
      panelbot.setSize(screenWidth,screenHigh/10);
      basketpanel.setSize(100,100);
      int numx=12;
      int numy=6;
      
      panel.setLayout(new GridLayout(numx,numy));
      Border blackline = BorderFactory.createLineBorder(Color.black,1);
      for(int i = 0; i<numx-1;i++)
      {
           panelgauche1.add(heure1);
            panelgauche2.add(heure2);
            panelgauche3.add(heure3);
            panelgauche4.add(heure4);
            panelgauche5.add(heure5);
            panelgauche6.add(heure6);
            panelgauche7.add(heure7);
            panelgauche8.add(heure8);
            panelgauche9.add(heure9);
            panelgauche10.add(heure10);
            panelgauche11.add(heure11);
            panelgauche12.add(heure12);
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
            
            panel.setSize(gridw-(screenWidth/8),gridh-(screenHigh/4));
            semaine.setSize(gridw-(screenWidth/8),((gridh-(screenHigh/4))/28));
            menu.setSize(screenWidth,((gridh-(screenHigh/4))/28));
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
            add.setLocation((screenWidth/8)+110,(screenHigh/7)-35);
            supp.setLocation((screenWidth/8)+220,(screenHigh/7)-35);
            panelprevious.setLocation((screenWidth-(screenWidth/6))-60-85, (screenHigh/5)-35);
            panellog.setLocation(0, 0);
            welcomepanel.setLocation(0, 0);
            panelfilm.setLocation(screenWidth/5, screenHigh/5);
            panelentete.setLocation(0, 0);
            paneladd.setLocation(0, 200);
            panelgauche.setLocation(0, screenHigh/7);
            
            panelgauche1.setLocation(0, (screenHigh/7)-2);
            panelgauche2.setLocation(0, (screenHigh/7)+(67*1)-5);
            panelgauche3.setLocation(0, (screenHigh/7)+(67*2)-5);
            panelgauche4.setLocation(0, (screenHigh/7)+(67*3)-5);
            panelgauche5.setLocation(0, (screenHigh/7)+(67*4)-5);
            panelgauche6.setLocation(0, (screenHigh/7)+(67*5)-5);
            panelgauche7.setLocation(0, (screenHigh/7)+(67*6)-5);
            panelgauche8.setLocation(0, (screenHigh/7)+(67*7)-5);
            panelgauche9.setLocation(0, (screenHigh/7)+(67*8)-5);
            panelgauche10.setLocation(0, (screenHigh/7)+(67*9)-5);
            panelgauche11.setLocation(0, (screenHigh/7)+(67*10)-5);
            panelgauche12.setLocation(0, (screenHigh/7)+(67*11)-5);
            
            paneldroite.setLocation(screenWidth-(screenWidth/10), screenHigh/5);
            panelbot.setLocation(0, (screenHigh-screenHigh/10)-7);
            basketpanel.setLocation(70,70);
      
            //IMAGES
      
            panel.setLocation(screenWidth/8,screenHigh/7);
            semaine.setLocation(screenWidth/8,(screenHigh/7)-((gridh-(screenHigh/4))/28));
            menu.setLocation(0,0);
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
      

     if(type==0){
         //mainWindow.add(panellog);  
     }
      if(type==1||type==2){
          System.out.println("entrer");
          //mainWindow.add(basketpanel);
        //mainWindow.add(welcomepanel);  
        int j=0;
        System.out.println("cours:"+user.getab().size());
        for(int i=0;i<user.getab().size();i++)
        {
            
            String date_etudiant = String.valueOf(user.getab().get(i).getdate());
            String jour = user.jours(date_etudiant);
            int numseance=0;
            int idseance=0;
            numseance=user.getab().get(i).getid_cours();
            idseance=user.getab().get(i).getid();
            System.out.println("le jour est: " + jour);
            switch(jour){
                case "lundi":
                    j=0;
                    
                    addpanel( user,  i ,  debut ,  gridh, gridw, j,screenWidth,screenHigh,numseance,idseance);
                    
                break;
            }
            switch(jour){
                case "mardi":
                    j=1;
                    addpanel( user,  i ,  debut ,  gridh, gridw, j,screenWidth,screenHigh,numseance,idseance);
                break;
            }
            switch(jour){
                case "mercredi":
                    j=2;
                    addpanel( user,  i ,  debut ,  gridh, gridw, j,screenWidth,screenHigh,numseance,idseance);
                break;
            }
            switch(jour){
                case "jeudi":
                    j=3;
                    
                    addpanel( user,  i ,  debut ,  gridh, gridw, j,screenWidth,screenHigh,numseance,idseance);
                    
                break;
            }
            switch(jour){
                case "vendredi":
                    j=4;
                    addpanel( user,  i ,  debut ,  gridh, gridw, j,screenWidth,screenHigh,numseance,idseance);
                break;
            }
            switch(jour){
                case "samedi":
                    addpanel( user,  i ,  debut ,  gridh, gridw, j,screenWidth,screenHigh,numseance,idseance);
                    j=5;
                break;
            }       
        }
     }
      if(type==2){
         //mainWindow.add(basketpanel);
        // mainWindow.add(welcomepanel);  
     }
     
     
      //panelbot.add(labelf);
      paneldes1.add(des1);
      paneldes2.add(des2);
      paneldes3.add(des3);
      welcomepanel.add(wmessage);
      basketpanel.add(basket);
      
      for(int i=0;i<nombre_semaine;i++){
        String a=String.valueOf(i+1);
        JButton but = new JButton(a);
        but.addActionListener(new Semaine(user,username,page,mainWindow));
        but.setActionCommand(a);
        
        semaine.add(but);
      }
      
      if(type!=0){
        JButton but = new JButton("Planning");
        JButton but1 = new JButton("Liste");
        
        but1.addActionListener(new Liste(mainWindow,type,username,page,user));
       // but.setActionCommand();
        
        menu.add(but);
        menu.add(but1);
      }
      
      
      if(type==3){
      JPanel deroul = new JPanel();
     
        deroul.setLayout(new FlowLayout());
           deroul.setBackground(Color.red);

        deroul.setSize(screenWidth,30);
        deroul.setLocation(0,((gridh-(screenHigh/4))/20));
           
       String[] tabs = new String[user.getab().size()+1];
       
       
       
       //tabs[0] = user.getabcours().get(j).getnom();
        //for(int i = 0; i < user.getab().size(); i++) {
        //    if(user.getab().get(i).getid_cours()== user.getabcours().get(j).getid()){
        //        tabs[i+1] = "Jours: " + String.valueOf(user.getab().get(i).getdate()).substring(6,8)+"/"+String.valueOf(user.getab().get(i).getdate()).substring(4,6)+"/"+String.valueOf(user.getab().get(i).getdate()).substring(0,4)+" Semaine: "+String.valueOf(user.getab().get(i).getsemaine())+" Heur debut: "+user.getab().get(i).getheure_debut().substring(0,2)+":"+user.getab().get(i).getheure_debut().substring(2,4)+" Heur fin: "+user.getab().get(i).getheure_fin().substring(0,2)+":"+user.getab().get(i).getheure_fin().substring(2,4)+" Type:"+String.valueOf(user.getab().get(i).getType());
       //     }
       // }
        
        JComboBox liste1 = new JComboBox(tabs);

        //deroul.add(liste1);
        
        mainWindow.add(deroul);
        mainWindow.add(ajouter);
      
      }
      
     //AFFICHAGE PANELS
      
     mainWindow.add(semaine);
     mainWindow.add(panel);
     mainWindow.add(menu);
     
     mainWindow.add(panelgauche1);  
     mainWindow.add(panelgauche2);
     mainWindow.add(panelgauche3);  
     mainWindow.add(panelgauche4);
     mainWindow.add(panelgauche5);  
     mainWindow.add(panelgauche6);
     mainWindow.add(panelgauche7);  
     mainWindow.add(panelgauche8);
     mainWindow.add(panelgauche9);  
     mainWindow.add(panelgauche10);
     mainWindow.add(panelgauche11);  
     mainWindow.add(panelgauche12);
     mainWindow.add(paneldroite); 
     mainWindow.add(panelbot);
     
     //mainWindow.add(buypanel1);  
     //mainWindow.add(buypanel2);  
     //mainWindow.add(buypanel3);  
     
     //mainWindow.add(panel2);
     //mainWindow.add(panel3);
     //mainWindow.add(paneldes1);
     //mainWindow.add(paneldes2);
     //mainWindow.add(paneldes3);
      
     // mainWindow.add(panelreg); 
     
     mainWindow.add(panelentete);  
     mainWindow.add(paneladd);  
        
     // mainWindow.add(panelbot);
     // mainWindow.add(panelfilm); 
     
     // Display the window.
    mainWindow.getContentPane().revalidate();
    mainWindow.getContentPane().repaint();
    mainWindow.setVisible(true);
    }
    
    public void addpanel(Utilisateur user, int i , String debut , int gridh,int gridw,int j,int screenWidth, int screenHigh,int numseance,int id){
        
        String heur_deb =user.getab().get(i).getheure_debut();
            String heur_fin =user.getab().get(i).getheure_fin();
            int temps;
            int minute_deb;
            int minute_fin;
            int total;
            int heur=0;
            ArrayList <String> ab;
            String h1;
            h1 = heur_deb.substring(2,4);
            minute_deb =60- Integer.parseInt(String.valueOf(heur_deb).substring(2,4));
            minute_fin =Integer.parseInt(String.valueOf(heur_fin).substring(2,4));
            total=minute_deb+minute_fin;

            SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
            float nbHeures = 0;
            float nbHeuresdebut = 0;
            try {
            Date debinit = sdf.parse(debut);
            Date deb = sdf.parse(heur_deb);
            Date fin = sdf.parse(heur_fin);
            long diff =  fin.getTime() - deb.getTime();
            long difference = deb.getTime() - debinit.getTime();
            nbHeures = diff / 3600000.0f;
            nbHeuresdebut = difference / 3600000.0f;
            System.out.println("diff" + diff );
            System.out.println("temps ecouler debut = :" + nbHeuresdebut );
            System.out.println("temps ecouler = :" + heur_deb );
            System.out.println("temps ecouler = :" + heur_fin );
            System.out.println("temps ecouler = :" + nbHeures );
            }
            catch (ParseException ex) {
            }
            JButton a = new JButton("oui");
            DAOFactory f = new DAOFactory();
            
            System.out.print("OE"); 
            ab=f.getnom(numseance,id);
            if(ab!=null)
            {
                 a = new JButton("<html>"+ab.get(0)+"<br>"+ab.get(1)+"<br>"+ab.get(2)+"</html>");
            }
            if(ab==null)
            {
                 a = new JButton("oui");
            }
            if(  (user.getdroit()==3)){

                a.addActionListener(new Cours(mainWindow,id));

            }
            //a.addActionListener(new Cours(mainWindow,id));
            JPanel panelcours = new JPanel();
            System.out.println("screenWidth/8 = :" + screenWidth/8 );
            System.out.println("(screenHigh/7) = :" + (screenHigh/7) );
            System.out.println("heur = :" + minute_deb );
            System.out.println("heur = :" + minute_fin );
            //System.out.println("heur = :" + temps );
            System.out.println("heur = :" + heur );
            System.out.println("minute = :" + (((gridh-(screenHigh/7))/12)*( ( Math.round(nbHeuresdebut*2) )/2 )));
            System.out.println("screen width = :" + screenWidth );
            System.out.println("taille case = :" + ((gridh-(screenHigh/7))/12) );
            System.out.println("cours loc = :" + ((screenHigh/7)+(((gridh-(screenHigh/7))/12)*( ( Math.round(nbHeures*2) )/2 ))));
            System.out.println("cours size = :" + (((gridh-(screenHigh/7))/12)*( ( Math.round(nbHeures*2) )/2 )));
           // nbHeuresdebut=1;
            int ax,bx,cx;
            ax=(gridh-(screenHigh/4));
            bx=ax/12;
            System.out.println("taille screen carre = :" + bx );
            System.out.println("taille screen  = :" + ax );
            System.out.println("loc screen  = :" + screenHigh/4 );
            System.out.println("nb h screen  = :" + ( ( Math.round(nbHeures*2) )/2 ));
            panelcours.setLocation((screenWidth/8)+((gridw-(screenWidth/8))/6)*j, ((screenHigh/7)+ Math.round(((float)((gridh-(screenHigh/4))/12)*( nbHeuresdebut ))))+3);
            panelcours.setSize((gridw-(screenWidth/8))/6, Math.round(((float)((gridh-(screenHigh/4))/12)*(nbHeures))));
            panelcours.setLayout(new GridLayout(1, 1));
            panelcours.add(a);
            panelcours.setBackground(Color.yellow);
            mainWindow.add(panelcours);
            System.out.println("afficher");
        
    }
}
