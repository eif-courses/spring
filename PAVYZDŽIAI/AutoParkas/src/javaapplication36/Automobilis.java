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
public class Automobilis {
    private String marke;
    private int metai;

    public Automobilis(String marke, int metai) {
        this.marke = marke;
        this.metai = metai;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    @Override
    public String toString() {
        return "Automobilis{" + "marke=" + marke + ", metai=" + metai + '}';
    }
    
    
    
           
}
