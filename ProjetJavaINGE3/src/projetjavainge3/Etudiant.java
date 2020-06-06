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
    public Etudiant(Utilisateur user,int id){
        this.user=user;
        this.id_utilisateur=id;
        System.out.println("AH");
        Calendar cal = Calendar.getInstance();
        int semaine = cal.get(Calendar.WEEK_OF_YEAR);
        this.addcours(semaine);
        System.out.println("AH");
        
    }
    
    public Etudiant(){
        
    }
    
    public int getid(){
        return this.id_utilisateur;
    }
    
    public ArrayList<Seance> getab(){
        return this.tab;
    }
    
    public void setTab(ArrayList<Seance> tab){
        this.tab=tab;
    }
    
    public void affichecours(){
        System.out.println("tab:"+tab.size());
        for(int i=0; i<tab.size();i++){
            System.out.println(tab.get(i).getid());
            System.out.println(tab.get(i).getsemaine());
        }
    }
    
    public void addcours(int semaine){     
        DAOFactory f = new DAOFactory();
        System.out.println("c:"+id_utilisateur);
        DAO<Etudiant> e =f.getEtudiantDAO();
        System.out.println("d");
        this.tab=e.getcours(this,semaine);
        System.out.println("AH");
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
}
