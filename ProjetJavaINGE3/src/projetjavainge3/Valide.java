/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class Valide extends AbstractAction{
    private Fenetre fenetre;
    private String b;
    private Admin admin;
    private JFrame mainWindow;
    private int page;
    private String name;
 
	public Valide(Fenetre aThis, String texte, String b,Admin admin,JFrame mainWindow,int page,String name){
		super(texte);
                this.b=b;
                this.mainWindow=mainWindow;
                this.page=page;
                this.name=name;
                this.admin=admin;
		this.fenetre = aThis;
	}


    @Override
    public void actionPerformed(ActionEvent e) {
        Object selected = fenetre.getListe1().getSelectedItem();
        String a=(String) selected;
        if(a!=b)
        {System.out.println("t'es bien rentree1");
            for(int i = 0; i < admin.getTab().size(); i++) 
            {
                System.out.println("la sortie:"+a.substring(0,1));
                System.out.println("la sortie2:"+String.valueOf(admin.getTab().get(i).getid()).substring(0,1));
                System.out.println("a"+ a.substring(0,1)+" autre"+String.valueOf(admin.getTab().get(i).getid()).substring(0,1));
                if(a.substring(0,1)=="1"){
                    System.out.println("la sortie:");
                }
                if(String.valueOf(admin.getTab().get(i).getid()).substring(0,1)==a.substring(0,1))
                {
                    System.out.println("t'es bien rentree3");
                    new BigWindow(mainWindow,3,name,page,admin.getTab().get(i));
                }
            }
        }
    }
}