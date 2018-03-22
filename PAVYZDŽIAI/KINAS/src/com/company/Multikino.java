package com.company;

import java.io.FileNotFoundException;

/**
 * Created by Marius on 11/14/2015.
 */
public class Multikino extends KinoTeatras{

    public Multikino(String pavadinimas) {
        super(pavadinimas);
    }

    @Override
    protected Filmas[] sudarytiFilmuSarasa(SavaitesDiena savaitesDiena, Filmas [] filmai) {

        try {
            Tvarkarastis tvarkarastis = new Tvarkarastis();
            tvarkarastis.filmuTvarkarastis(savaitesDiena, filmai);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return filmai;
    }

}
