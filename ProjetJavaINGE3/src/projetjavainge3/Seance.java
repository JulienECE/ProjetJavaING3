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
public class Seance {
    private int id;
    private int semaine;
    private int date;
    private String heure_debut;
    private String heure_fin;
    private int etat;
    private int id_cours;
    private int id_type;
    
    public Seance(int id,int semaine,int date,String heure_debut,String heure_fin,int etat,int id_cours,int id_type){
    this.id=id;
    this.semaine=semaine;
    this.date=date;
    this.heure_debut=heure_debut;
    this.heure_fin=heure_fin;
    this.etat=etat;
    this.id_cours=id_cours;
    this.id_type=id_type;
    }
    
    public Seance(){
        
    }
    public int getid(){
        return this.id;
    }
    
    public int getsemaine(){
        return this.semaine;
    }
    
    public int getdate(){
        return this.date;
    }
    
    public int getid_cours(){
        return this.id_cours;
    }
    
    public String getheure_debut(){
        return this.heure_debut;
    }
    public int getType(){
        return this.id_type;
    }
    
    public String getheure_fin(){
        return this.heure_fin;
    }
    
    public int getetat(){
        return this.etat;
    }
    public void setid(int ide){
        this.id=ide;
    }
    
    public void setsemaine(int sem){
        this.semaine=sem;
    }
    
    public void setdate(int d){
         this.date=d;
    }
    
    public void setheure_debut(String hd){
        this.heure_debut=hd;
    }
    
    public void setheure_fin(String hf){
         this.heure_fin=hf;
    }
    
    public void setetat(int e){
         this.etat=e;
    }
}
