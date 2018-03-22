package com.company;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by Marius on 11/14/2015.
 */
public abstract class KinoTeatras {

    private String pavadinimas;

    public KinoTeatras(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
    protected abstract Filmas[] sudarytiFilmuSarasa(SavaitesDiena savaitesDiena, Filmas [] filmai);


    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

}
