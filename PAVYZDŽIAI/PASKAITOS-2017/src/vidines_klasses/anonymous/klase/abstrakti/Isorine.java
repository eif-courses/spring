package vidines_klasses.anonymous.klase.abstrakti;

/**
 * Created by Marius on 1/25/2017.
 */
abstract class Gyvunas{
    abstract void valgo();
}
class Main {
    public static void main(String args[]){
        Gyvunas lape = new Gyvunas() {
            @Override void valgo() {System.out.println("Lape valgo");}
        };
        lape.valgo();
    }
}