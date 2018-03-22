package raktinis_zodis_final;

/**
 * Created by Marius on 1/25/2017.
 */
public class Parduotuve {

    private String pavadinimas;
    private String adresas;

    public static final int KONSTANTA = 333;
    private final String SAVININKAS = "Lietuvos bankas";
    private final int ID;

    public static final int MAGIC;
    static{MAGIC = 99;}

    public Parduotuve(String pavadinimas, String adresas, int ID) {
        this.pavadinimas = pavadinimas;
        this.adresas = adresas;
        this.ID = ID;
    }
    public String getSavininkas(){
        return SAVININKAS+"Konstanta: "+KONSTANTA;
    }


    public final int galutinisMetodas(){
        return 50;
    }

    public String getPavadinimas() {
        galutinisMetodas();
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public static int getKONSTANTA() {
        return KONSTANTA;
    }

    public static int getMAGIC() {
        return MAGIC;
    }

    public int getId() {
        return ID;
    }

    @Override
    public String toString() {
        return "Parduotuve{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", adresas='" + adresas + '\'' +
                ", savininkas='" + SAVININKAS + '\'' +
                ", id=" + ID +
                '}';
    }
}
