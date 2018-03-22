package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by Marius on 11/14/2015.
 */
public class Tvarkarastis {

    List<Filmas[]> sarasas = new ArrayList<>();

    Filmas[] filmuTvarkarastis(SavaitesDiena savaitesDiena, Filmas [] film) throws FileNotFoundException {

        Collections.shuffle(Arrays.asList(film));
        sarasas.add(film);
        try {
            // SUKURIAMAS HTML FORMATO FAILA ATVAIZDUOTI FILMU SARASUI
            BufferedWriter out = new BufferedWriter(new FileWriter("index.html",true));
            System.out.println("______________________________________________________________________________");
            System.out.println("" + savaitesDiena.name());
            System.out.println("______________________________________________________________________________");
            out.write(""+savaitesDiena.name());
                out.write("<ul>");
                for (Filmas[] f : sarasas) {

                    for (int i = 0; i < f.length; i++) {
                        out.write("<li>");
                        out.write("" + (i + 1) + " " + f[i]);
                        out.write("</li>");
                        System.out.println(" "+f[i]);
                    }
                }

            out.write("</ul>");

            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception ");
        }

    return film;
    }
    static void isvalytiFaila(){
        BufferedWriter clean = null;
        try {
            clean = new BufferedWriter(new FileWriter("index.html"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            clean.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                clean.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
