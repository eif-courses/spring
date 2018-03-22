package collections.comparable.comparator;

/**
 * Created by Marius on 1/29/2017.
 */
public class Deze implements Comparable<Deze>{

    private String tipas;
    private int svoris;

    public Deze(String tipas, int svoris) {
        this.tipas = tipas;
        this.svoris = svoris;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public int getSvoris() {
        return svoris;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    @Override
    public int compareTo(Deze o) {
        return (this.svoris - o.getSvoris());
    }




    @Override
    public String toString() {
        return "Deze{" +
                "tipas='" + tipas + '\'' +
                ", svoris=" + svoris +
                '}';
    }
}
