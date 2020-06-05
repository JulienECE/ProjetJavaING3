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
    
    public ArrayList<Seance> getcours(Etudiant user){
      
      try{
      ResultSet result = this.connect.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from etudiant where ID_UTILISATEUR = '"+user.getid()+"'");
      int id_groupe = result.getInt(3);
      result = this.connect.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("select * from seance_groupes where ID_GROUPE = '"+id_groupe+"'");
      while(result.next())
      {
          ResultSet resultat = this.connect.createStatement(
          ResultSet.TYPE_SCROLL_INSENSITIVE,
          ResultSet.CONCUR_READ_ONLY).executeQuery("select * from seance where ID = '"+result.getInt(1)+"'");
          SeanceDAO seanceDAO = new SeanceDAO(this.connect,resultat.getInt(1),resultat.getInt(2),resultat.getInt(3),resultat.getInt(4),resultat.getInt(5),resultat.getInt(6),resultat.getInt(7),resultat.getInt(8));
          Seance seance = seanceDAO.create();
          tab.add(seance);     
      }
      }catch(SQLException e){
          System.out.println("ERREUR");
      }
      return tab;
  }
}