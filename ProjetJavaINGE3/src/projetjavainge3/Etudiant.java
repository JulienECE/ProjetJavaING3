/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.util.ArrayList;

/**vbriubvuehbvr
 *
 * @author Asus
 */
public class Etudiant {
    private Utilisateur user;
    private int id_utilisateur;
    private int numero;
    private int id_groupe;
    private ArrayList<Seance> tab=null;
    
    public Etudiant(int id_utilisateur,int numero,int id_groupe){
        this.id_utilisateur=id_utilisateur;
        this.id_groupe=id_groupe;
        this.numero=numero;     
    }
    public Etudiant(Utilisateur user){
        this.user=user;
        System.out.println("AH");
        this.addcours();
        System.out.println("AH");
    }
    
    public Etudiant(){
        
    }
    
    public int getid(){
        return this.id_utilisateur;
    }
    
    public void addcours(){
        System.out.println("b");
        DAOFactory f = new DAOFactory();
        System.out.println("c");
        DAO<Etudiant> e =f.getEtudiantDAO();
        System.out.println("d");
        this.tab=e.getcours(this);
        System.out.println("AH");
    }        
}
