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
public abstract class Darbuotojas implements DarbuotojasI{

    String vardas;
    String pavarde;
    String pareigos;
    
    public Darbuotojas(String vardas, String pavarde, String pareigos){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pareigos = pareigos;
    } 

    @Override
    public String toString() {
        return "Darbuotojas{" + "vardas=" + vardas + ", pavarde=" + pavarde + ", pareigos=" + pareigos + '}';
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPareigos() {
        return pareigos;
    }

    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }
    
    
    
    
    
   
    
}
