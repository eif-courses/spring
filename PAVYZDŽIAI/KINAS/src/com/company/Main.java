package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        KinoTeatras forumCinemas = new ForumCinemas("Forum Cinemas");
        KinoTeatras multikino = new Multikino("Multikino");
        Filmas[] filmai = {new Filmas("Pjuklas","Siaubo"),
                new Filmas("Galutinis tikslas","Fantastinis"),
                new Filmas("Guliverio keliones","Fantastinis"),
                new Filmas("Ledynmetis 2","Animacinis"),
                new Filmas("Kelione i pasaulio centra","Drama"),
                new Filmas("30 tamsos dienu","Siaubo"),
                new Filmas("Galutinis tikslas","Fantastinis"),
                new Filmas("Guliverio keliones","Fantastinis"),
                new Filmas("Ledynmetis 2","Animacinis"),
                new Filmas("Kelione i pasaulio centra","Drama"),
                new Filmas("30 tamsos dienu","Siaubo")
        };
        Tvarkarastis.isvalytiFaila();
        System.out.println("___________________________________________________________");
        System.out.println("" + forumCinemas.getPavadinimas());
        System.out.println("___________________________________________________________");

        for(SavaitesDiena savaitesDiena: SavaitesDiena.values()) {
            forumCinemas.sudarytiFilmuSarasa(savaitesDiena, filmai);
        }

        System.out.println("___________________________________________________________");
        System.out.println("" + multikino.getPavadinimas());
        System.out.println("___________________________________________________________");
        for(SavaitesDiena savaitesDiena: SavaitesDiena.values()) {
            multikino.sudarytiFilmuSarasa(savaitesDiena, filmai);
        }
    }





}
