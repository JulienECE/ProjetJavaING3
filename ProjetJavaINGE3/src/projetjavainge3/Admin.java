/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Admin extends Utilisateur {

    private ArrayList<Utilisateur> tab_user =null;
    
    public Admin(int id,String mail,String passwd,String nom,String prenom,int droit,ArrayList<Utilisateur> tab)
    {
        super(id, mail, passwd, nom, prenom, droit);
        this.tab_user=tab;
    }  
    public Admin()
    {
        adduser();
    } 
    
    public void adduser(){

         DAOFactory inter1 = new DAOFactory();
         Utilisateur user = new Utilisateur();
         DAO<Utilisateur> util1DAO;
         ArrayList<Utilisateur> tab_temp =null;
         this.tab_user=inter1.getall();
    }
    
    public ArrayList<Utilisateur> getTab(){
        return tab_user;
    }
}
