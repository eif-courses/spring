package eif.viko.lt.programavimas.java2017.pavasaris.pirmoji.paskaita;

import javax.swing.*;
import java.util.ArrayList;
import static java.lang.Math.*;

/**
 * Created by Marius on 1/23/2017.
 */
public abstract class Automobilis implements AutoInterfeisas{





    static {

        double rez = sqrt(44);
        //JOptionPane.showMessageDialog(null,"As statinis laukas:"+"Saknis 44"+"="+rez);
    }
    static {

        //JOptionPane.showMessageDialog(null,"As 2 statinis laukas");
    }


    private String pavadinimas;
    private int greitis;
    private String modelis;
    private static int kiekAutomobiliu;



    public Automobilis(String pavadinimas, int greitis, String modelis) {
        this.pavadinimas = pavadinimas;
        this.greitis = greitis;
        this.modelis = modelis;
        kiekAutomobiliu++;
    }

    public abstract void vaziuoti();

    public void info(){
        System.out.println("Kiek automobiliu:"+kiekAutomobiliu);
    }
    public void skristi(){
        System.out.println("Skrendu");

    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", greitis=" + greitis +
                ", modelis='" + modelis + '\'' +
                '}';
    }

    int skaiciuojamVariklioTuri(int a, int b, int c){

        return a*b+c;
    }
}
