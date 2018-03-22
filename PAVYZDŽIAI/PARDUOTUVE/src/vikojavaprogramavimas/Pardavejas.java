/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikojavaprogramavimas;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Marius
 */
public class Pardavejas extends JFrame implements Skaiciavimas, Runnable{
    
    private ArrayList<Uzsakymas> uzsakymai;
    private Uzsakymas uzsakymas;
    
    public Pardavejas(String vardas){
        super(vardas);
        
    }
    public Pardavejas(){
        
    }
   

    public ArrayList<Uzsakymas> getUzsakymai() {
        return uzsakymai;
    }

    public void setUzsakymai(ArrayList<Uzsakymas> uzsakymai) {
        this.uzsakymai = uzsakymai;
    }

    public Uzsakymas getUzsakymas() {
        return uzsakymas;
    }

    public void setUzsakymas(Uzsakymas uzsakymas) {
        this.uzsakymas = uzsakymas;
    }

    
    

    @Override
    public void skaiciuoju() {
        
        System.err.println("As pardavejas skaiciuoju");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        
        setVisible(true);
        setSize(600, 500);
        System.err.println("Atskirtas pardavejo procesas paleistas");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
