package generics.database.connection.generics.vaisiai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Marius on 1/30/2017.
 */
public class Vaisius <T extends Lapavaisis> implements Comparator<T>{

    private T t;

    private List<T> lapavaisiai = new ArrayList<T>();

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

    public List<T> getLapavaisiai() {
        return lapavaisiai;
    }
    public void setLapavaisiai(List<T> lapavaisiai) {
        this.lapavaisiai = lapavaisiai;
    }
    public void addVaisius(T t){
        lapavaisiai.add(t);
    }
    @Override
    public String toString() {
        return t.toString();
    }

    @Override
    public int compare(T o1, T o2) {
        return o1.getPavadinimas().compareTo(o2.getPavadinimas());
    }
}
