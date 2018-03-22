package generics.database.connection.generics.vaisiai;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marius on 1/31/2017.
 */
public class Lapavaisis {

    private String pavadinimas;
    private double svoris;
    private int amzius;
    private double aukstis;



    public Lapavaisis(String pavadinimas, double svoris, int amzius, double aukstis) {
        this.pavadinimas = pavadinimas;
        this.svoris = svoris;
        this.amzius = amzius;
        this.aukstis = aukstis;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public double getSvoris() {
        return svoris;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public double getAukstis() {
        return aukstis;
    }

    public void setAukstis(double aukstis) {
        this.aukstis = aukstis;
    }



    @Override
    public String toString() {
        return "Lapavaisis{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", svoris=" + svoris +
                ", amzius=" + amzius +
                ", aukstis=" + aukstis +
                '}';
    }
}
