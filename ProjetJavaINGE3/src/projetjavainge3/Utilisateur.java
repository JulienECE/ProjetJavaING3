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
    private String droit;
    
    public Utilisateur(int id,String mail,String passwd,String nom,String prenom,String droit){
        this.id=id;
        this.mail=mail;
        this.nom=nom;
        this.passwd=passwd;
        this.prenom=prenom;
        this.droit=droit;        
    }
    public Utilisateur(){
        
    }
}
