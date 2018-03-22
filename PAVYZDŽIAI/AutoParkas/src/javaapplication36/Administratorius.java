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
public class Administratorius extends Darbuotojas implements DarbuotojasInterface, Runnable{
    
    public Administratorius(String vardas, String pavarde, int id) {
        super(vardas, pavarde, id);
    }
 
    public void setValue(){}
    public void setValue(int a){}
    public void setValue(double b){}
    public void setValue(int a, double c){}
    
    public void setValue(int ... a){
        
        for (int i = 0; i < a.length; i++) {
            System.err.println(""+a[i]);
        }
    }

    @Override
    public void alga() {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        
        System.err.println("PROCESAS");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
