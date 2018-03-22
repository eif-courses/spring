/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikojavaprogramavimas;

import java.util.List;

/**
 *
 * @author Marius
 */
public class VikoJavaProgramavimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Klientas k = new Klientas("TOmas", "Tomaitis");
        Klientas k2 = new Klientas("MArius", "htfgfg");
        Uzsakymas uzsakymas = new Uzsakymas(44545454, k);
        Uzsakymas uzsakymas2 = new Uzsakymas(999999999, k2);
        
        Darbuotojas betkas = new Buhalteris();
        

       
       
       new Thread(new Pardavejas("Paulius")).start();
      
       
            
        
        
        
        // TODO code application logic here
    }
    
}
