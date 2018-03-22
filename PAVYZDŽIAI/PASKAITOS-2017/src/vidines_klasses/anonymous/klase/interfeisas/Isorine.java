package vidines_klasses.anonymous.klase.interfeisas;

/**
 * Created by Marius on 1/25/2017.
 */
interface Gyvunas{
    void valgo();
}
class Main {
    public static void main(String args[]){
        Gyvunas lape = new Gyvunas() {
            @Override public void valgo() {System.out.println("Lape valgo");}
        };
        lape.valgo();
    }
}