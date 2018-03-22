package generics.database.connection.paprastas.pavyzdys.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Marius on 1/31/2017.
 */
public class Namas {
    private Object objektas;

    public Object getObjektas() {
        return objektas;
    }
    public void setObjektas(Object objektas) {
        this.objektas = objektas;
    }
}
class NamasGeneric<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <E> void append(List<E> list) {
        //E elem = new E();  // compile-time error
        // list.add(elem);
    }

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {


        List listas = new ArrayList();
        listas.add("abc");
        listas.add(5); //OK

        for(Object obj : list){
            //type casting leading to ClassCastException at runtime
            String str=(String) obj;
        }

        E elem = cls.newInstance();   // OK
        list.add(elem);
        NamasGeneric<String> namas = new NamasGeneric<>();
        List<String> ls = new ArrayList<>();
        append(ls, String.class);


    }
}