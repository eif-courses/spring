package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marius on 11/14/2015.
 */
public class ForumCinemas extends KinoTeatras{

    public ForumCinemas(String pavadinimas) {
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
