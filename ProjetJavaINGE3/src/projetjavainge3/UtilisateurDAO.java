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
    
    
    
}
