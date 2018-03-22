package com.company;

/**
 * Created by Marius on 11/14/2015.
 */
public class Filmas {

    String pavadinimas;
    String zanras;

    public Filmas(String pavadinimas, String zanras) {
        this.pavadinimas = pavadinimas;
        this.zanras = zanras;
    }
    public Filmas() {

    }
    public String getZanras() {
        return zanras;
    }

    public void setZanras(String zanras) {
        this.zanras = zanras;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public String toString() {
        return ""+pavadinimas+",                          "+zanras;
    }
}
