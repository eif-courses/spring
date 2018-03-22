package generics.database.connection.generics.vaisiai;


import generics.database.connection.generics.vaisiai.Kriause;
import generics.database.connection.generics.vaisiai.Lapavaisis;
import generics.database.connection.generics.vaisiai.Obuolys;
import generics.database.connection.generics.vaisiai.Vaisius;
import generics.database.connection.generics.*;

import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        Vaisius<Lapavaisis> vaisius = new Vaisius<>();

        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));
        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));
        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));
        vaisius.addVaisius(new Obuolys("Ziemine aukse", 2.25, 15, 3.2));
        vaisius.addVaisius(new Kriause("Gaivioji kriause", 2.33, 10, 2.4));

        Collections.sort(vaisius.getLapavaisiai(), new Vaisius<Lapavaisis>());

        for (Lapavaisis ll: vaisius.getLapavaisiai()) {
            System.out.println(ll);
        }

        //Vaisius<Citrusinis> citrusinisVaisius = new Vaisius<>();






    }
}
