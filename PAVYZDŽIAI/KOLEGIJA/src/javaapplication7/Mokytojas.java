/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Qic
 */
public class Mokytojas extends Darbuotojas{

    public Mokytojas(String vardas, String pavarde, String pareigos) {
        super(vardas, pavarde, pareigos);
    }
    
    @Override
    public double alga(int pajamos) {
        return pajamos - pajamos * 0.5 - pajamos * MOKESTIS; 
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
