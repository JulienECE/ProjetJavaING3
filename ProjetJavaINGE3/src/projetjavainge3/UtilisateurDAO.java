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
public class UtilisateurDAO extends DAO<Utilisateur>{
    
    protected ResultSet result=null;
    ArrayList<Seance> tab =new ArrayList<Seance>();
    
    public UtilisateurDAO(Connection conn) {
        super(conn);
    }
    public UtilisateurDAO(Connection conn,ResultSet result) {
        super(conn);
        this.result=result;
        this.getuser();
    }

    @Override
    public boolean create(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Utilisateur find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Utilisateur getuser() {
        Utilisateur user = new Utilisateur();      

        try {
            System.out.println("sex");
            if(this.result!=null){
                if(this.result.first()){
                    System.out.println("sex");
                  user = new Utilisateur(this.result.getInt(1),this.result.getString(2),this.result.getString(3),this.result.getString(4),this.result.getString(5),this.result.getInt(6));   
                }
            }
          else{
              System.out.println("uhvuybiubib");
           user = new Utilisateur();
          }
        } catch (SQLException e) {
            System.out.println("uhvuybiubib");
           user = new Utilisateur();
        }
        return user;
    }
    
    public ArrayList<Seance> getcours(Utilisateur user, int semaine){
      System.out.println("taille"+user.getid());
      System.out.println(user.getid());
      System.out.println(user.getdroit());
      int id_groupe = 0;
      try{
          if(user.getdroit()==1){
      ResultSet result = this.connect.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from etudiant where ID_UTILISATEUR = '"+user.getid()+"'");
          

      System.out.println("dedans1");
      if(result.first())
      {
          System.out.println(result.getInt(3)); 
      }
      id_groupe = result.getInt(3);
      }

      if(user.getdroit()==1){
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
      }
      System.out.println("dedans");
      if(user.getdroit()==2){
      result = this.connect.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from seance_enseignants where ID_ENSEIGNANT = '"+user.getid()+"'");

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
      }
      }catch(SQLException e){
          System.out.println("ERREUR");
      }
      return tab;
  }
    
}
