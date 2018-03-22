package pirmoji_paskaita;

/**
 * Created by Marius on 1/19/2017.
 */
public abstract class Gyvunas {

    int amzius;
    private String pavadinimas;
    public static final String PLANETA = "Marsas";

    public Gyvunas(int amzius, String pavadinimas) {
        this.amzius = amzius;
        this.pavadinimas = pavadinimas;
    }
    public Gyvunas(int amzius) {
        this.amzius = amzius;
    }

    abstract void skleistiGarsa();

    public int getAmzius() {
        return amzius;
    }
    public int getAmzius(String pavadinimas){

        if(pavadinimas.equals("Lape")){

            return 25;
        }

        return amzius;
    }
    public int getAmzius(int index){

        if(pavadinimas.equals("Lape")){

            return 25;
        }

        return amzius;
    }



    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public String toString() {
        return "Gyvunas{" +
                "amzius=" + amzius +
                ", pavadinimas='" + pavadinimas + '\'' +
                '}';
    }
}
