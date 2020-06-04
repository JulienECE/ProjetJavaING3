/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

/**
 *
 * @author Asus
 */
public class Utilisateur {
    private int id;
    private String mail;
    private String passwd;
    private String nom;
    private String prenom;
    private int droit;
    
    public Utilisateur(int id,String mail,String passwd,String nom,String prenom,int droit){
        this.id=id;
        this.mail=mail;
        this.nom=nom;
        this.passwd=passwd;
        this.prenom=prenom;
        this.droit=droit;        
    }
    public Utilisateur(){
        
    }
    public void affiche(){
        System.out.println("id: "+id+" mail: "+mail+" password"+passwd+" nom: "+nom+"prenom: "+prenom+" droit: "+droit+"");
    }
    public int getid(){
        return id;
    }
    public int getdroit(){
        return droit;
    }
}
