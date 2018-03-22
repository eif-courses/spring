/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_modifikatorius;

/**
 *
 * @author Marius
 */

import static static_modifikatorius.Skaiciuokle.*;
import static static_modifikatorius.Skaiciuokle.kiekObjektuSukureme;
import static static_modifikatorius.Skaiciuokle.skaiciuotiSuma;

public class StatinisImportavimas {
    
    void skaiciuoti(){
        System.out.println("Statinis importas:"+KONSTANTA);
        skaiciuotiSuma(99, 99);
        kiekObjektuSukureme += 10;
    }
    
}
