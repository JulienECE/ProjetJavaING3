/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 *
 * @author Asus
 */
public class SdzConnection {
//CTRL + SHIFT + O pour générer les imports
      //URL de connexion
      private String url = "jdbc:postgresql://localhost:5432/Ecole";
      //Nom du user
      private String user = "postgres";
      //Mot de passe de l'utilisateur
      private String passwd = "postgres";
      //Objet Connection
      private static Connection connect;

      //Constructeur privé
      private SdzConnection(){
        try {
          connect = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }

      //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
public static Connection getInstance(){
  if(connect == null){
    new SdzConnection();
    System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
  }
  else{
    System.out.println("CONNEXION SQL EXISTANTE ! ");
  }
  return connect;   
}
    }