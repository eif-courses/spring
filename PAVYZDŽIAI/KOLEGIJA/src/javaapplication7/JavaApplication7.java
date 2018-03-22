/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import javax.swing.JOptionPane;

/**
 *
 * @author Qic
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
        Darbuotojas mok = new Mokytojas("Tomas", "Tomaitis", "Asist.");
        
    
       
       Mokytojas [] mokytojai = {
           new Mokytojas("Tomas", "Tomaitis", "Asist."),
           new Mokytojas("Ona", "Onaitiene", "Lekt."),
           new Mokytojas("Rokas", "Tomaitis", "Doc."),
           new Mokytojas("Birute", "Birutiene", "Asist.")
       }; 
       
       Kolegija vilniaus = new Kolegija();
       vilniaus.sudarytiSarasa(mokytojai);
       
      // Mokytojas [] mokyt =  vilniaus.grazitiMokSarasa();
       
       for(int i=0; i < vilniaus.grazitiMokSarasa().length; i++ ){
       
          // System.out.println(""+vilniaus.grazitiMokSarasa()[i].getVardas());
       }
       
       Auditorija [] auditorijos = {
       
           new Auditorija("210","Komp"),
           new Auditorija("104","Teor"),
           new Auditorija("104a","Komp"),
           new Auditorija("105", "Kitas"),
           new Auditorija("205","Nera")
       };
       
       vilniaus.setAuditorijos(auditorijos);
       
       Auditorija [] temp = vilniaus.getAuditorijos();
       
       
        for (int i = 0; i < temp.length; i++) {
            System.err.println(""+temp[i].getNumeris());
        }
       
        
       
       
        
        
        
        
        // TODO code application logic here
    }
    
}
