package pirmoji_paskaita;

/**
 * Created by Marius on 1/16/2017.
 */
public class Auditorija {

    private int nr;
    private String pavadinimas;

    public Auditorija(int nr, String pavadinimas) {
        this.nr = nr;
        this.pavadinimas = pavadinimas;
    }
    public Auditorija() {
    }

    public int getNr() {
        return nr;
    }

    public void skaiciuotiPerimetra(int a, int b) {

        System.out.println(""+(a+b));
    }

    public void skaiciuotiPerimetra(int c){
        System.out.println(""+(c));
    }
    public void skaiciuotiPerimetra(int ... d){

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

    }



    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    @Override
    public String toString() {
        return "Auditorija{" +
                "nr=" + nr +
                ", pavadinimas='" + pavadinimas + '\'' +
                '}';
    }

}
