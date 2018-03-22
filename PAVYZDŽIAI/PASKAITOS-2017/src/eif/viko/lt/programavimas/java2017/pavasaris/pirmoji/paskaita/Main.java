package eif.viko.lt.programavimas.java2017.pavasaris.pirmoji.paskaita;

// Bibliotekų klasių importavimas
import pirmoji_paskaita.Auditorija;
import pirmoji_paskaita.Bebras;
import pirmoji_paskaita.Gyvunas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {





        new Thread(new PirmasProcesas()).start();
        new AntrasProcesas().start();
        new Thread(new PirmasProcesas()).start();
        new AntrasProcesas().start();
        new Thread(new PirmasProcesas()).start();
        new AntrasProcesas().start();

        Opel opel = new Opel("Opel", 280, "Corsa");
        Automobilis opel2 = new Opel("Opel", 280, "Corsa");
        Automobilis opel3 = new Opel("Opel", 280, "Corsa");

        Garazas garazas = new Garazas();

        AutoInterfeisas audi = Garazas.getAudi();
        audi.sustoti();

        opel.info();



















        //System.out.println(auditorija.getPavadinimas());





    }
}
