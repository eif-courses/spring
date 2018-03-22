package pirmoji_paskaita;

/**
 * Created by Marius on 1/19/2017.
 */
public interface GyvunasInterface {

    void skleistiGarsa();

    default void c(){

    }
    static void skaiciuoti(int a, int b){
        System.out.println(a+b);
    }


}
