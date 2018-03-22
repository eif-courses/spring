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
public class Skaiciuokle {

    static {
        System.out.println("Statinis blokas įvykdytas");
    }

    static {
        System.out.println("Įvykdytas antras");
    }

    static {
        System.out.println("Įvykdytas trecias");
    }
    public static final int KONSTANTA = 59545;
    static int bendras;
    int lokalus;
    static int kiekObjektuSukureme;

    public Skaiciuokle() {
        kiekObjektuSukureme++;
        System.out.println("Konstruktorius egzempliorių skaičius: " + kiekObjektuSukureme);
    }

    public void sumuoti() {
        bendras += 10;
        lokalus += 10;
    }

    public int getKiekObjektuSukureme() {
        System.err.println("Sukureme: " + kiekObjektuSukureme);
        return kiekObjektuSukureme;
    }

    public int getLokalus() {
        System.out.println("Lokalus: " + lokalus);
        return lokalus;
    }

    public static void skaiciuotiSuma(int a, int b) {

        System.err.println("Suma: " + (a + b));
    }

    public static void pakeltiKvadratuSuma() {
        Skaiciuokle skaiciuokle = new Skaiciuokle();
        skaiciuokle.getBendras();
        skaiciuotiSuma(32, 65); 
              
    }

    public int getBendras() {
        System.err.println("Bendras" + bendras);
        return bendras;
    }

}
