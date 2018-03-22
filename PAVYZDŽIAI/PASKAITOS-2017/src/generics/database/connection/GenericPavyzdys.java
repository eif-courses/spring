package generics.database.connection;

import eif.viko.lt.programavimas.java2017.pavasaris.pirmoji.paskaita.Automobilis;

import java.util.Comparator;

/**
 * Created by Marius on 2/28/2017.
 */
public class GenericPavyzdys<T extends Automobilis & Comparable<T> & Comparator<T>, V> implements Comparable<T>, Comparator<T>{
    private T t;
    private V v;

    public GenericPavyzdys() {
    }

    public  void spausdinti(){
       t.vaziuoti();
    }
    public GenericPavyzdys(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    @Override
    public int compare(T o1, T o2) {

        return 0;
    }
}
