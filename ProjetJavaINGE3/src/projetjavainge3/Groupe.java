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
public class Groupe {
    private int id;
    private String nom;
    private int id_promotion;
    
    public Groupe(int id,String nom,int id_promotion){
        this.id=id;
        this.nom=nom;
        this.id_promotion=id_promotion;     
    }
    public Groupe(){
        
    }
}
