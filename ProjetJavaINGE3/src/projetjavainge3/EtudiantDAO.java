/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Asus
 */
public class EtudiantDAO extends DAO<Etudiant>{

    private int id;
    private int semaine,  date,  heur_debut, heur_fin, etat, id_cours, id_type;
    ArrayList<Seance> tab =new ArrayList<Seance>();
    
    public EtudiantDAO(Connection conn) {
        super(conn);
    }
    public EtudiantDAO(Connection conn,int id,int semaine, int date, int heur_debut,int heur_fin,int etat,int id_cours,int id_type) {
        super(conn);
        this.id=id;
        this.semaine=semaine;
        this.date=date;
        this.heur_debut=heur_debut;
        this.heur_fin=heur_fin;
        this.etat=etat;
        this.id_cours=id_cours;
        this.id_type=id_type;
    }

    @Override
    public boolean create(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Etudiant find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Seance> getcours(Etudiant user, int semaine){
      System.out.println("taille"+user.getid());
      try{
      ResultSet result = this.connect.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from etudiant where ID_UTILISATEUR = '"+user.getid()+"'");
      System.out.println("dedans1");
      if(result.first())
      {
          System.out.println(result.getInt(3)); 
      }
      int id_groupe = result.getInt(3);
      System.out.println("dedans1");
      System.out.println(id_groupe);
      result = this.connect.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from seance_groupes where ID_GROUPE = '"+id_groupe+"'");
      System.out.println("dedans");
      result.beforeFirst();
      /*if(result.first())
      {
           System.out.println("a lint1");
          ResultSet resultat = this.connect.createStatement(
          ResultSet.TYPE_SCROLL_INSENSITIVE,
          ResultSet.CONCUR_READ_ONLY).executeQuery("select * from seance where ID = '"+result.getInt(1)+"'");
          if(resultat.first())
      {
          
      }
          SeanceDAO seanceDAO = new SeanceDAO(this.connect,resultat.getInt(1),resultat.getInt(2),resultat.getInt(3),resultat.getString(4),resultat.getString(5),resultat.getInt(6),resultat.getInt(7),resultat.getInt(8));
          Seance seance = seanceDAO.create();
          tab.add(seance);   
      }*/
        
      while(result.next())
      {
        Calendar cal = Calendar.getInstance();
        if(semaine==0){
           semaine = cal.get(Calendar.WEEK_OF_YEAR);
        }
        
          System.out.println("alint 2");
          ResultSet resultat = this.connect.createStatement(
          ResultSet.TYPE_SCROLL_INSENSITIVE,
          ResultSet.CONCUR_READ_ONLY).executeQuery("select * from seance where ID = '"+result.getInt(1)+"' AND SEMAINE = '"+semaine+"'");
         if(resultat.first())
      {
           System.out.println("alint 3: "+this.connect+""+resultat.getInt(1)+""+resultat.getInt(2)+""+resultat.getInt(3)+""+resultat.getString(4)+""+resultat.getString(5)+""+resultat.getInt(6)+""+resultat.getInt(7)+""+resultat.getInt(8));
          SeanceDAO seanceDAO = new SeanceDAO(this.connect,resultat.getInt(1),resultat.getInt(2),resultat.getInt(3),resultat.getString(4),resultat.getString(5),resultat.getInt(6),resultat.getInt(7),resultat.getInt(8));
          System.out.println("alint 2");
          Seance seance = seanceDAO.create();
          tab.add(seance); 
      }
             
      }
      }catch(SQLException e){
          System.out.println("ERREUR");
      }
      return tab;
  }
}