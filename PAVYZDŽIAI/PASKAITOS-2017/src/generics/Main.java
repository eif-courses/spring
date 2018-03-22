package generics;

import java.util.ArrayList;
import java.util.*;
/**
 * Created by Marius on 2/28/2017.
 */
public class Main {

    int a;
    float c = 2.5f;
    double dd = 5.0d;
    char ll='a';
    boolean ff= false;
    String aa;

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Labas");
        list.add(new Integer(5));
        String a = (String) list.get(1);

      //  Kitas<String, Integer> aa = new ArrayList<String>();




        List<String> suGeneric = new ArrayList<String>();
        //suGeneric.add(new Integer(5));



    }

    /**
     * Created by Marius on 2/28/2017.
     */
    static interface  Kitas<E, C> extends List<E>{
    }
}
