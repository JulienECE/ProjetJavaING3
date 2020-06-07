/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class DAO<T> {
    ArrayList<Seance> tab =new ArrayList<Seance>();
   protected Connection connect = null;
   
  public DAO(Connection conn){
    this.connect = conn;
  }
  
  public abstract boolean create(T obj);
  public abstract boolean delete(T obj);
  public abstract boolean update(T obj);
  public abstract T find(int id); 

    Utilisateur getuser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<Seance> getcours(Utilisateur user,int semaine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



 

}
