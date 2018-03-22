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
public class Static_modifikatorius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Skaiciuokle.skaiciuotiSuma(20, 45); // A + B REZULTATAS = 65

        Skaiciuokle sk = new Skaiciuokle();
        Skaiciuokle sk2 = new Skaiciuokle();

        sk.sumuoti();
        sk2.sumuoti();

        sk.getBendras(); // REIKŠMĖ BENDRAS = 20
        sk.getLokalus(); // REIKŠMĖ LOKALUS = 10
        sk.getKiekObjektuSukureme(); // REIKMŠMĖ 
        //KIEKOBJEKTUSUKUREME = 2
        StatinisImportavimas statinisImportavimas = new StatinisImportavimas();
        statinisImportavimas.skaiciuoti();
        

    }

}
