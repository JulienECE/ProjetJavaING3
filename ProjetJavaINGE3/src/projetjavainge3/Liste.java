/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
