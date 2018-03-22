package vidines_klasses.local.klase;

/**
 * Created by Marius on 1/25/2017.
 */
public class Main{
    private int duomenys = 99;
    void atvaizduoti(){
        class Lokali{
            void zinute(){System.out.println("Zinute:"+duomenys);}
        }
        Lokali lokali = new Lokali();
        lokali.zinute();
    }
    public static void main(String args[]){
        Main obj = new Main();
        obj.atvaizduoti();
    }
}

