/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marius
 */
public class Autoparkas {
    private String pav;
    private ArrayList<Automobilis> automobiliai = new ArrayList<>();
    private ArrayList<Klientas> klientai = new ArrayList<>();
    private ArrayList<Darbuotojas> darbuotojai = new ArrayList<>();

    
    
    public Autoparkas(String pav) {
        
        for (int i = 0; i < 5; i++) {
             automobiliai.add(new Automobilis("Opel", 1986 + i));
             klientai.add(new Klientas("Jonas", "Jonatis", i));
             darbuotojai.add(new Darbuotojas("Petras", "Petraitis", i));
        }
        this.pav = pav;
    }

 /**
 * <h1>Kliento objekto aprašymas</h1>
 * @param klientas perduodamas kliento objektas
 */
    public void pridetiKlienta(Klientas klientas){
        klientai.add(klientas);
    }
    public void istrintiKlientaPagalId(int id){
    
        for (Klientas k : klientai) {
            
            if(k.getId() == id){
                klientai.remove(k);
                break;
            }
            
            
        }
        
    }
    
    
    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }

    public ArrayList<Automobilis> getAutomobiliai() {
        return automobiliai;
    }

    public void setAutomobiliai(ArrayList<Automobilis> automobiliai) {
        this.automobiliai = automobiliai;
    }

    public ArrayList<Klientas> getKlientai() {
        return klientai;
    }

    public void setKlientai(ArrayList<Klientas> klientai) {
        this.klientai = klientai;
    }

    public ArrayList<Darbuotojas> getDarbuotojai() {
        return darbuotojai;
    }

    public void setDarbuotojai(ArrayList<Darbuotojas> darbuotojai) {
        this.darbuotojai = darbuotojai;
    }
    
    
    

}