package Interface;

import mano.*;
import java.io.IOException;
import javax.swing.JFrame;

public class Main
{

    public static void main(String[] args) throws IOException, InvalidSchoolboyDataException
	{

        //-------------------------Darbuotoju masyvas---------------------------

        Darbuotojas darbuotojai[] = {new Darbuotojas("Jonas", " Jonaitis",
                                    "Lietuviu kalbos " +"mokytojas", 2300, 8),
                                    new Darbuotojas("Jonas", " Petraitis",
                                    "Lietuviu kalbos " + "mokytojas", 1400, 8)};

        //-------------------------Mokytoju masyvas-----------------------------

        Mokytojas mokytojai[] = {new Mokytojas(" Antanas","Antanaitis ",
                                "matematikos mokytojas ", 2500, 8),
                                new Mokytojas("Petras","Petraitis",
                                "Lietuviu mokytojas " ,1750, 8)};

        //-------------------------Mokiniu masyvas------------------------------

        Mokinys mokiniai[] = {new Mokinys ("Andrius","Petravicius",9,5),
                             new Mokinys ("Andrius","Petravicius",9,6) };

        //-------------------------Tvarkarascio masyvas-------------------------

        String tvarkarastis[] = {"Anglu", "lietuviu", "kuno k.", "Matematika", "Tikyba",
                                "Anglu", "lietuviu", "kuno k.", "Matematika", "Tikyba",
                                "Anglu", "lietuviu", "kuno k.", "Matematika", "Tikyba",
                                "Anglu", "lietuviu", "kuno k.", "Matematika", "Tikyba",
                                "Anglu", "lietuviu", "kuno k.", "Matematika", "Tikyba"};

        Tvarkarastis tvark = new Tvarkarastis();
        Mokykla mokykla = new Mokykla("Lama");
        
        //-------------------Ciklai apdoroti duomenis---------------------------

        for(int i = 0; i < tvarkarastis.length; i++)
        {
           tvark.addLesson(new Integer((int)((i/5)+1)), tvarkarastis[i]);
        }
        for(int i = 0; i < darbuotojai.length; i++)
        {
        mokykla.addWorker(darbuotojai[i]);
        }
        for(int i = 0; i < mokytojai.length; i++)
        {
            mokykla.addTeacher(mokytojai[i]);         
        }
        for(int i = 0; i < mokiniai.length; i++)
        {
            mokykla.addSchoolboy(mokiniai[i]);
        }
        
        //---------------Abstract klase-----------------------------------------

        Mokytojas mokyt = new Mokytojas("ss","ss","ssds",222,8);
        Mokinys mokinukas = new Mokinys(" 1 1 ","1 1 ",1,7);
        /*mokyt.information(1);
        System.out.println(mokyt.perDayTime()+ " valandos");
        System.out.println(mokyt.perWeekTime()+ " valandu");
        mokinukas.information(2);
        System.out.println(mokinukas.perDayTime()+ " valandos");
        System.out.println(mokinukas.perWeekTime()+ " valandos");
        mokinukas.information(3);*/
        
        //-------------------------Grafinis interfeisas-------------------------
        Dialog frame = new Dialog(mokykla, tvark);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 190);
        frame.setVisible(true);
        

       

        //----------------------------------------------------------------------
    }

}

 










