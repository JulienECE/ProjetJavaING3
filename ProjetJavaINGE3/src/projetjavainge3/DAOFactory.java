/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class DAOFactory {
  
protected Connection conn = null;  
protected Statement stmt;

    
 public DAOFactory(){
        System.out.print("L'utilisateur n'est pas trouvé!");
try {
    String url       = "jdbc:mysql://localhost/edt";
    String user      = "root";
    String password  = "";
  
    conn = DriverManager.getConnection(url, user, password);
} catch(SQLException e) {
    System.out.print("CEST LE PB");
   System.out.println(e.getMessage());
}  
}
    
    
      
  public  DAO getCoursDAO(){
    return new CoursDAO(conn);
  }
  
  public  DAO getGroupeDAO(){
    return new GroupeDAO(conn);
  }
  
  public  DAO getPromotionDAO(){
    return new PromotionDAO(conn);
  }
  
  public  DAO getSalleDAO(){
    return new SalleDAO(conn);
  }   
  
  public  DAO getSeanceDAO(){
    return new SeanceDAO(conn);
  } 
  
  public  DAO getEtudiantDAO(){
    return new EtudiantDAO(conn);
  } 
  
  public  DAO getSiteDAO(){
    return new SiteDAO(conn);
  } 
  
  public  DAO getType_coursDAO(){
    return new Type_coursDAO(conn);
  } 
  
  public  DAO getUtilisateurDAO(){
    return new UtilisateurDAO(conn);
  } 
  
  public DAO getuser(String name,String prenom,String mdp){
      
      try{
          System.out.print("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      ResultSet result = this.conn.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from utilisateur where NOM = '"+name+"' AND PRENOM = '"+prenom+"' AND PASSWD = '"+mdp+"' ");
      System.out.print("bbbbbbbbbbbbbbbbb");
      System.out.print("select * from utilisateur where NOM = '"+name+"' AND PRENOM = '"+prenom+"' AND PASSWD = '"+mdp+"' ");
      if(!result.next())
      {
          System.out.println("cest noooooooooon");
      }

      if(result.first())
      {
          System.out.println(result.getInt(6)); 
          if(result.getInt(6)==0){
              return new UtilisateurDAO(conn,result);
          }
          if(result.getInt(6)==1){
              return new UtilisateurDAO(conn,result);
          }
      }
      
      }catch(SQLException e) {
          return new UtilisateurDAO(conn);
    }
    return new UtilisateurDAO(conn);
      
  }
  
  
  public  boolean checkadmin(String mdp) throws SQLException
  {
      Statement stmt=conn.createStatement();
      ResultSet rs=stmt.executeQuery("select * from utilisateur where PASSWD = "+mdp+" "); 
      while(rs.next())
      {
          if(rs.getInt(6)==0)
          {
            return false;
          }
          
          if(rs.getInt(6)==1)
          {
            return true;
          }
          
      }
    return false;
  }
  
  //public Enseignant getcours(Enseignant user){

   // return new SalleDAO(conn);
  //}
  
}

