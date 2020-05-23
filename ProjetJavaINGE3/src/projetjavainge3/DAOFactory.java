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
  
protected static final Connection conn = null;   

    
 public DAOFactory(){
        
        Connection conn = null;
try {
    String url       = "jdbc:mysql://localhost/edt";
    String user      = "root";
    String password  = "root";
  
    conn = DriverManager.getConnection(url, user, password);
    
} catch(SQLException e) {
   System.out.println(e.getMessage());
} finally {
    try{
           if(conn != null)
             conn.close();
    }catch(SQLException ex){
           System.out.println(ex.getMessage());
    }
}
   
}
    
    
      
  public static DAO getCoursDAO(){
    return new CoursDAO(conn);
  }
  
  public static DAO getGroupeDAO(){
    return new GroupeDAO(conn);
  }
  
  public static DAO getPromotionDAO(){
    return new PromotionDAO(conn);
  }
  
  public static DAO getSalleDAO(){
    return new SalleDAO(conn);
  }   
  
  public static DAO getSeanceDAO(){
    return new SeanceDAO(conn);
  } 
  
  public static DAO getSiteDAO(){
    return new SiteDAO(conn);
  } 
  
  public static DAO getType_coursDAO(){
    return new Type_coursDAO(conn);
  } 
  
  public static DAO getUtilisateurDAO(){
    return new UtilisateurDAO(conn);
  } 
}
