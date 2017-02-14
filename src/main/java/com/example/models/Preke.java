package com.example.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Marius on 2/12/2017.
 */
@Data
@Entity
public class Preke {
    private @Id @GeneratedValue Integer id;
    private String pavadinimas;
    private String kaina;

    protected Preke() {/*JPA REIKIA BE ARGUMENTU KONSTRUKTORIAUS*/}

    public Preke(String pavadinimas, String kaina) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
    }
}
