package eif.viko.lt.programavimas.java2017.pavasaris.pirmoji.paskaita;

import pirmoji_paskaita.Auditorija;

/**
 * Created by Marius on 1/23/2017.
 */
public class Opel extends Automobilis{


    public Opel(String pavadinimas, int greitis, String modelis) {
        super(pavadinimas, greitis, modelis);
    }

    @Override
    public void sustoti() {

        Tuningas.a = 100;
    }
    @Override
    public void vaziuoti() {

    }

    private static class Tuningas{

       Opel opel = new Opel("awea",55,"awe");


       static int a;
    }


}
