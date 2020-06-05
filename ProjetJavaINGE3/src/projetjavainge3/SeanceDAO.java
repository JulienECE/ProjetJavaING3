/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.sql.Connection;

/**
 *
 * @author Asus
 */
public class SeanceDAO extends DAO<Seance>{

    private int id;
    private int semaine,  date,  heur_debut, heur_fin, etat, id_cours, id_type;
    
    public SeanceDAO(Connection conn) {
        super(conn);
    }
    public SeanceDAO(Connection conn,int id,int semaine, int date, int heur_debut,int heur_fin,int etat,int id_cours,int id_type) {
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

    public Seance create() {
        Seance S = new Seance(id,semaine,  date,  heur_debut, heur_fin, etat, id_cours, id_type);
        return S;
    }

    @Override
    public boolean delete(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
