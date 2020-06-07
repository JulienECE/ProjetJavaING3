/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class Liste  implements ActionListener{
   

  private int type, num_page;
  private String name;
  private Utilisateur user;
  
  private JComboBox liste2;
    
    private JFrame mainWindow;
    
    public Liste(JFrame mainWindow,int types,String name,int num_page,Utilisateur user){
        this.mainWindow=mainWindow;
        this.type=types;
        this.name=name;
        this.num_page=num_page;
        this.user=user;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        mainWindow.getContentPane().removeAll();


        mainWindow.setLayout(new BorderLayout());  
        mainWindow.setTitle("MAIN WINDOW");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLocation(0,0);

       
         // JLabel labelf =new JLabel();
         // JPanel panelcentre=new JPanel();  
        int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHigh = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
         int gridw = screenWidth-(screenWidth/8)+(screenWidth/10);
           int gridh=(screenHigh-(screenHigh/7)+(screenHigh/7));
        mainWindow.setSize(screenWidth,screenHigh);
        
        JPanel panel = new JPanel();
        
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(1, 2));
        
        //panelcentre.setBackground(Color.white);
        //panelcentre.setSize(screenWidth/2,screenHigh/2);
        //panelcentre.setLocation(screenWidth/4,screenHigh/4);
        panel.setBackground(Color.decode("#fecc00"));
        panel.setSize(screenWidth,screenHigh);
        panel.setLocation(0,0);
        
        menu.setSize(screenWidth,((gridh-(screenHigh/4))/28));
        menu.setLocation(0,0);

        
        JButton but = new JButton("Planning");
        JButton but1 = new JButton("Liste");
        
        ArrayList<Seance> tab=null;
       DAOFactory f = new DAOFactory();
       DAO<Utilisateur> util =f.getUtilisateurDAO();
       user.setTab(util.getcours(user,0,1));
       System.out.println("id:");
       System.out.println("id:"+user.getabcours().get(0).getnom());
       
       for(int j = 0; j < user.getabcours().size(); j++) {
           
           JPanel deroul = new JPanel();
        deroul.setLayout(new FlowLayout());
           deroul.setBackground(Color.decode("#fecc00"));
           int temp=0;
        deroul.setSize(screenWidth,30);
        deroul.setLocation(0,((gridh-(screenHigh/4))/20)*(j+1));
        
        for(int i = 0; i < user.getab().size(); i++) {
            if(user.getab().get(i).getid_cours()== user.getabcours().get(j).getid()){
                temp++;
            }
        }
           System.out.println("temp:"+temp);
       String[] tabs = new String[temp+1];
       
       tabs[0] = user.getabcours().get(j).getnom();
       System.out.println("nom:"+user.getabcours().get(j).getnom());
       temp=0;
        for(int i = 0; i < user.getab().size(); i++) {
            
            if(user.getab().get(i).getid_cours()== user.getabcours().get(j).getid()){
                temp++;
                tabs[temp] = "Jours: " + String.valueOf(user.getab().get(i).getdate()).substring(6,8)+"/"+String.valueOf(user.getab().get(i).getdate()).substring(4,6)+"/"+String.valueOf(user.getab().get(i).getdate()).substring(0,4)+" Semaine: "+String.valueOf(user.getab().get(i).getsemaine())+" Heur debut: "+user.getab().get(i).getheure_debut().substring(0,2)+":"+user.getab().get(i).getheure_debut().substring(2,4)+" Heur fin: "+user.getab().get(i).getheure_fin().substring(0,2)+":"+user.getab().get(i).getheure_fin().substring(2,4)+" Type:"+String.valueOf(user.getab().get(i).getType());
            }
        }
        
        JComboBox liste1 = new JComboBox(tabs);

        deroul.add(liste1);
        
        mainWindow.add(deroul);
        }
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
                   // j=0;
                    JLabel a = new JLabel("Lundi:");
                    
                break;
            }
            switch(jour){
                case "mardi":
                //    j=1;
                break;
            }
            switch(jour){
                case "mercredi":
                 //   j=2;
                break;
            }
            switch(jour){
                case "jeudi":
                  //  j=3;
                    
                    
                break;
            }
            switch(jour){
                case "vendredi":
                  //  j=4;
                break;
            }
            switch(jour){
                case "samedi":
                 //   j=5;
                break;
            }       
        }
        
        
       // but.setActionCommand();
        
        ActionListener actionListener = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        new BigWindow(mainWindow,type,name,num_page,user);
    }
};
        System.out.println(type);
        but.addActionListener(actionListener);
        
        menu.add(but);
        menu.add(but1);
        
        
        mainWindow.add(menu);
        mainWindow.add(panel);
        
        mainWindow.getContentPane().revalidate();
        mainWindow.getContentPane().repaint();
        mainWindow.setVisible(true);
    }
}
