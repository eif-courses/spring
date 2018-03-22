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
public class Uzsakymas {
    
    private int nr;
    private Klientas klientas;

    public Uzsakymas(int nr, Klientas klientas) {
        this.nr = nr;
        this.klientas = klientas;
    }

    @Override
    public String toString() {
        return "Uzsakymas{" + "nr=" + nr + ", klientas=" + klientas + '}';
    }
 
    
    
 
    
  
    
    
}
