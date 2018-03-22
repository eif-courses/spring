/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

/**
 *
 * @author Marius
 */
public class Darbuotojas {
    private String vardas, pavarde;
    private int id;

    public Darbuotojas(String vardas, String pavarde, int id) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Darbuotojas{" + "vardas=" + vardas + ", pavarde=" + pavarde + ", id=" + id + '}';
    }
    
    
    
}
