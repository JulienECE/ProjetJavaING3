/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Asus
 */
public class CoursDAO extends DAO<Cours>{

    public CoursDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Cours obj) {
        return false;   
    }

    @Override
    public boolean delete(Cours obj) {
        return false;  
    }

    @Override
    public boolean update(Cours obj) {
        return false;  
    }

    @Override
    public Cours find(int id) {
        Cours cours = new Cours();      
      
    try {
      ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM eleve WHERE elv_id = " + id);
      if(result.first())
        cours = new Cours(result.getInt("elv_nom"),result.getString("elv_prenom"));         
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return cours;
  }
}