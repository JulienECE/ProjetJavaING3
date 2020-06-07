/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavainge3;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 931701915
 */
public class Register implements ActionListener{
 
    private JTextField username1;
        private JTextField password1;
        private JTextField age;
        private JFrame window;
        private JFrame mainWindow;
        private boolean admin;
        private boolean valide=false;
        private int page;
        
         public Register(JTextField u, JTextField p, JFrame w,JFrame m,int pages,JTextField a){
             page=pages;
             username1=u;
             password1=p;
             window=w;
             mainWindow=m;
             age=a;
         }
    
 public void actionPerformed(ActionEvent e)
      {
         String name;
         String mdp;
         int agee=0;
         boolean check= false;
          
         name=username1.getText();
         mdp=password1.getText();
         agee=Integer.parseInt(age.getText());
         
         System.out.println(name+"\n"+mdp);

         if(check==true){
             new BigWindow(mainWindow,1,name,page,null);
            window.setVisible(false);
            mainWindow.setVisible(false);
         }
                 
         if(check==false){
               new BigWindow(mainWindow,1,name,page,null);
            window.setVisible(false);
            mainWindow.setVisible(false);
         }
         
      }
}
