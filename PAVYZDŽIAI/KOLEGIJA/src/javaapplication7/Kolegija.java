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
public class Kolegija {
    protected String adresas;
    protected String pavadinimas;
    
    private Auditorija [] auditorijos;
    private Mokytojas [] mokytojai;
    private Studentas [] studentai;
    
    public void sudarytiSarasa(Mokytojas [] mok){
        this.mokytojai = mok;
    }
    public Mokytojas [] grazitiMokSarasa(){
        return mokytojai;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Auditorija[] getAuditorijos() {
        return auditorijos;
    }

    public void setAuditorijos(Auditorija[] auditorijos) {
        this.auditorijos = auditorijos;
    }

    public Studentas[] getStudentai() {
        return studentai;
    }

    public void setStudentai(Studentas[] studentai) {
        this.studentai = studentai;
    }
    
  
    
    
}
