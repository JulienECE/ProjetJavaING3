/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;

/**
 *
 * @author Gauthier
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gauthier
 */
public class Supp implements ActionListener {
    
    private int id;
    
    public Supp(int i){
        id=i;
    }

     public void actionPerformed(ActionEvent e)
      {
         DAOFactory dao = new DAOFactory();
         dao.suppSeance(id);
      }

}