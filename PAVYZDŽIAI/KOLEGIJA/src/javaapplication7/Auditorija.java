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
public class Auditorija {
    
    String numeris;
    String tipas;
    String aukstas;
    String vietos;

    public Auditorija(String numeris) {
        this.numeris = numeris;
    }

    public Auditorija(String numeris, String tipas) {
        this.numeris = numeris;
        this.tipas = tipas;
    }

    public Auditorija(String numeris, String tipas, String aukstas, String vietos) {
        this.numeris = numeris;
        this.tipas = tipas;
        this.aukstas = aukstas;
        this.vietos = vietos;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public String getAukstas() {
        return aukstas;
    }

    public void setAukstas(String aukstas) {
        this.aukstas = aukstas;
    }

    public String getVietos() {
        return vietos;
    }

    public void setVietos(String vietos) {
        this.vietos = vietos;
    }

    @Override
    public String toString() {
        return "Auditorija{" + "numeris=" + numeris + ", tipas=" + tipas + ", aukstas=" + aukstas + ", vietos=" + vietos + '}';
    }
    
    public void skaiciuoti(){
        for (int i = 0; i < 10; i++) {
            if(numeris.equals("205")){
                System.err.println("Antras aukstas");
            }
        }
        
    }
    
    
    
}
