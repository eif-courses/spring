/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikojavaprogramavimas;

/**
 *
 * @author Marius
 */
public class Klientas implements Skaiciavimas{
    private String vardas, pavarde;

    private int id, amzius;
    
    public Klientas(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    
    
    @Override
    public String toString() {
        return "Klientas{" + "vardas=" + vardas + ", pavarde=" + pavarde + '}';
    }

    @Override
    public void skaiciuoju() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
