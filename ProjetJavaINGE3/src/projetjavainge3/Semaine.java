/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Semaine implements ActionListener{

    private Etudiant etudiant;
    
    public Semaine(Etudiant etudiant){
        this.etudiant=etudiant;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       ArrayList<Seance> tab=null;
       String num_semaine = e.getActionCommand();
       System.out.println(num_semaine);
       DAOFactory f = new DAOFactory();
       DAO<Etudiant> user =f.getEtudiantDAO();
       etudiant.setTab(user.getcours(etudiant,Integer.parseInt(num_semaine)));
    }
    
}
