
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

/**
 *
 * @author Asus
 */
public class ProjetJavaINGE3 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
    Connection conn = null;
    boolean check=false;
    
    try {
    // db parameters - ptest is the name of the database
    String url       = "jdbc:mysql://localhost:3306/edt";
    String user      = "root";
    String password  = "root";
   
    // create a connection to the database
    conn = DriverManager.getConnection(url, user, password);
    // more processing here
    // ...   
    Statement stmt=conn.createStatement(); 
ResultSet rs=stmt.executeQuery("select * from users"); 
    
    
   
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
}
