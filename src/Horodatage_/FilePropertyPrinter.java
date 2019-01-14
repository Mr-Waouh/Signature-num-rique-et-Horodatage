/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Horodatage_;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author Estébane
 */
public class FilePropertyPrinter {
    private ScanFile f=null;
    public FilePropertyPrinter(ScanFile input){
        this.f=input;
    }
    
public String retour(){
    String sortie = new String("");
   
    sortie = "Nom du Ficgier:  " + f.getName();
    sortie += "\nDate de cr�ation:  " + f.getCreatedDate();
    sortie += "\nLast Access Date:  " + f.getLastAccesDate();
    sortie += "\nLast Modified Date:  " + f.getLastModifiedDate();
    
    return sortie;
}

    public void console(){
        System.out.println("Nom du fichier: "+f.getName());
        System.out.println("Chemin absolue: "+f.getPath());
        System.out.println("Date de création: "+f.getCreatedDate());
        System.out.println("Last Acces Date: "+f.getLastAccesDate());
        System.out.println("Last Modified Date: "+f.getLastModifiedDate());
    }
    public void drawBox(){
       JFrame fenetre=new JFrame("Horodateur_Fenêtre");
       //fenetre.setTitle("Ma première fenêtre Java");
       fenetre.setSize(800, 500);
       fenetre.setLocationRelativeTo(null);
       fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       String str="###";
       JLabel texte=new JLabel(str);
       //JLabel texte2=new JLabel(str+"**"); fenetre.add(texte2,JLabel.LEFT);
       fenetre.add(texte,JLabel.CENTER);
       fenetre.setVisible(true);
           }
}
