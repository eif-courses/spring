 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.ArrayList;

/**
 *
 * @author Marius
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Autoparkas autoparkas = new Autoparkas("Auto Rojus");
        
        autoparkas.pridetiKlienta(new Klientas("Tomas", "TOmaitis", 58));
        
      for (Klientas klientas : autoparkas.getKlientai()) {
            System.out.print(""+klientas.getVardas());
        }
        System.out.println("\n");
        autoparkas.istrintiKlientaPagalId(58);
        for (Klientas klientas : autoparkas.getKlientai()) {
            System.out.print(""+klientas);
        }
        
        ArrayList<Darbuotojas> darbuotojai = new ArrayList<>();
        
        darbuotojai.add(new Buhalteris("Ona", "Onaitiene", 35));
        darbuotojai.add(new Administratorius("Petras", "Petraitis", 47));
        
        Administratorius aa = new Administratorius("Petras", "Petraitis", 47);
        
        aa.setValue(59, 98, 58, 77, 87, 98, 87);
        
      
      
       
        
        
        
        
    }
    
}
