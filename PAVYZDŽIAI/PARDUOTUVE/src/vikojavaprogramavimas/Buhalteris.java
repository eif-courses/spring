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
public class Buhalteris extends Darbuotojas implements Skaiciavimas{
    
    private int alga;
    public Buhalteris(String vardas) {
        super(vardas);
    }

    public Buhalteris() {
    }

    @Override
    int alga() {
        return 300 * 999;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int atsostoguTrukme() {
    
        return 12;
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void skaiciuoju() {
        
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
