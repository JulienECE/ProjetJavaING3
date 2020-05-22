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
public class Salle {
    private int id;
    private String nom;
    private int capacite;
    private int id_site;
    
    public Salle(int id,String nom,int capacite,int id_site){
        this.id=id;
        this.nom=nom;
        this.capacite=capacite;     
        this.id_site=id_site;  
    }
    public Salle(){
        
    }
}
