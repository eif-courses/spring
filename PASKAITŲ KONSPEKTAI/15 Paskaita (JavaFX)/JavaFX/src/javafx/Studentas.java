/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

/**
 *
 * @author Marius
 */
public class Studentas {
    
    private String vardas;
    private String pavarde;
    private int balas;
    private int amzius;
    
    public Studentas(String vardas, String pavarde, int balas, int amzius) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.balas = balas;
        this.amzius = amzius;
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

    public int getBalas() {
        return balas;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    @Override
    public String toString() {
        return "Studentas{" + "vardas=" + vardas + ", pavarde=" + pavarde + ", balas=" + balas + ", amzius=" + amzius + '}';
    }
    
    
    
    
    
}
