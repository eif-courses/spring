 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikojavaprogramavimas;

import java.util.ArrayList;

/**
 *
 * @author Marius
 */
public abstract class Darbuotojas {
    
    private String vardas;

    public Darbuotojas() {
        System.err.println("Beargumentis konstruktorius sukurtas");
    }

    public Darbuotojas(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    abstract int alga();
    
    abstract int atsostoguTrukme();
    
    @Override
    public String toString() {
        return "Darbuotojas{" + "vardas=" + vardas + '}';
    }

   
    

    
    
    
    
}
