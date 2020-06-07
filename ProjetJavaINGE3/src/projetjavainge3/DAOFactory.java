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
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
  
  public ArrayList <String> getnom(int id_cours,int id){
     ArrayList <String> a= new ArrayList();
     System.out.print("OE"); 
      try{
          System.out.print("OE"); 
      ResultSet result = this.conn.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from cours where ID = '"+id_cours+"'");

      if(result.first())
      {
          System.out.print("OE:"+id); 
          String b = result.getString(2);
          System.out.print("OE:"+result.getString(2));
          a.add(b);
          System.out.print("OE:"); 
      }
      System.out.print("OE:"); 
        ResultSet resulta = this.conn.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("select * from seance_enseignants where ID_SEANCE = '"+id+"'");
        System.out.print("OE:"+id); 
        if(resulta.first())
        {
            System.out.print("OE:"+resulta.getInt(2)); 
            ResultSet resultat = this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY).executeQuery("select * from utilisateur where ID = '"+resulta.getInt(2)+"'");
                if(resultat.first())
            {
                System.out.print("oui:"+resultat.getString(4)); 
                System.out.print("oui:"+resultat.getString(5)); 
                a.add(resultat.getString(4));
                a.add(resultat.getString(5));
            }
        } 
      }catch(SQLException e) {
           System.out.print("n'a pas recup le bon nom de cours"); 
    }
     return a;
      
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
          if(result.getInt(6)==1||result.getInt(6)==2){
              return new UtilisateurDAO(conn,result);
          }
      }
      
      }catch(SQLException e) {
          return new UtilisateurDAO(conn);
    }
    return new UtilisateurDAO(conn);
      
  }
  public void modifSeance(int id,int s, int d, int hd, int hf, int et){


         String query1 ="select * from seance where date="+d;

         String query2 = "update seance set semaine=?,date=?,heure_debut=?,heur_fin=?,etat=? where id="+id;

         PreparedStatement pst2;
         int rowCount = 0;
         boolean libre=true;
         int hdd=0;
         int hff=0;
      try{
          Statement st= conn.createStatement();
          ResultSet rs = st.executeQuery(query1);


          rs.last(); //make cursor to point to the last row in the ResultSet object
          rowCount = rs.getRow();
          rs.beforeFirst(); //make cursor to point to the front of the ResultSet object, just before the first row.

          System.out.println("Total number of rows in ResultSet object = "+rowCount);
          while(rs.next()){
                System.out.print("HD: "+rs.getInt("HEURE_DEBUT")+", ");
                System.out.print("HF: "+rs.getInt("HEUR_FIN")+", ");
                hdd=rs.getInt("HEURE_DEBUT");
                hff=rs.getInt("HEUR_FIN");
                if( ((hd>hdd)&&(hd<hff)) || ((hf>hdd)&&(hf<hff)) ){
                    libre=false;

                }

          }
          if(libre==false){
              JOptionPane.showMessageDialog(null, "PLAGE HORAIRE OCCUPEE");
          }
          if(libre==true){
                pst2 = conn.prepareStatement(query2);
                pst2.setInt(1, s);
                pst2.setInt(2, d);
                pst2.setInt(3, hd);
                pst2.setInt(4, hf);
                pst2.setInt(5, et);

                pst2.executeUpdate();


                JOptionPane.showMessageDialog(null, "SEANCE MODIFIE AVEC SUCCES" );
          }






      }catch(SQLException e) {
          System.out.println(e);
    }


  }
  
  public void suppSeance(int id){



         String query2 = "delete from seance where ID="+id;

         PreparedStatement pst2;
      try{

          pst2 = conn.prepareStatement(query2);


          pst2.executeUpdate();


          JOptionPane.showMessageDialog(null, "SEANCE SUPPRIME AVEC SUCCES");


      }catch(SQLException e) {
          System.out.println(e);
    }


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

