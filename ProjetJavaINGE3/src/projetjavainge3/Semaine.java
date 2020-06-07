/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class Semaine implements ActionListener{

    private Utilisateur util;
    private int page,type;
    private String username;
    private JFrame window;
    
    public Semaine(Utilisateur util,String username,int page,JFrame e){
        this.util=util;
        this.username=username;
        this.page=page;
        this.window=e;
        this.type=type;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       ArrayList<Seance> tab=null;
       String num_semaine = e.getActionCommand();
       System.out.println(num_semaine);
       DAOFactory f = new DAOFactory();
       DAO<Utilisateur> user =f.getUtilisateurDAO();
       util.setTab(user.getcours(util,Integer.parseInt(num_semaine),0));
       System.out.println("UYBUYGY8UB:"+util.getdroit());
       new BigWindow(window,util.getdroit(),username,page,util);
       
    }
}
