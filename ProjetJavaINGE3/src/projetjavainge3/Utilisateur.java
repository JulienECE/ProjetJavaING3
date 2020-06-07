/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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
    ArrayList<Seance> tab =null;
    
    public Utilisateur(int id,String mail,String passwd,String nom,String prenom,int droit){
        this.id=id;
        this.mail=mail;
        this.nom=nom;
        this.passwd=passwd;
        this.prenom=prenom;
        this.droit=droit;      
        Calendar cal = Calendar.getInstance();
        int semaine = cal.get(Calendar.WEEK_OF_YEAR);
        this.addcours(semaine);
        System.out.println("AH");
        System.out.println("d");
    }
    
    public void setTab(ArrayList<Seance> tab){
        this.tab=tab;
    }
    public ArrayList<Seance> getab(){
        return this.tab;
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
    
    public String jours(String date) {

        int year;
        int month;
        int day;
        
        year = Integer.parseInt(date.substring(0,4));
        month = Integer.parseInt(date.substring(4,6));
        day = Integer.parseInt(date.substring(6,8));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        java.util.Date dates = cal.getTime();
        DateFormat format = new SimpleDateFormat("EEEEEEEEE");
        String dayFound = format.format(dates);
        System.out.println("le jour est: " + dayFound);
        return dayFound;

    }
    
    public void addcours(int semaine){ 
        System.out.println("d");
        DAOFactory f = new DAOFactory();
        DAO<Utilisateur> e =f.getUtilisateurDAO();
        System.out.println("d");
        this.tab=e.getcours(this,semaine);
        System.out.println("AH");
    } 
    
    public Etudiant isEtudiant(){
        System.out.println("id:"+id);
        Etudiant e =new Etudiant(this,id);
        
        return e;
    }
    
    public Enseignant isEnseignant(){
        Enseignant e =new Enseignant();
        
        return e;
    }
}
