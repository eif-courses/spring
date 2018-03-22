
package arraylist;

/**
 *
 * @author Marius
 */

public class ARRAYLIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Sukuriamas Person objekto masyvas užpildomas testiniais duomenimis
        Person[] person = {new Person(22, "Jonas", "Vilnius", "Jonaitis"),
                new Person(34, "Petras", "Kaunas", "Jonaitis"),
                new Person(28, "Kazimieras", "Alytus", "Kazimieraitis"),
                new Person(92, "Ona", "Vilnius", "Onaityte"),

        };
        Person p = new Person();
        // Idėtas objektu Person masyvas i sarasa
        p.pushArrayToList(person);
        Thread.sleep(1);
        
        // Ideti masyvo sudaryto is Person objektu elementu i sarasa
        p.pushArrayElementsToList(person);
        Thread.sleep(1);
        
        // Atspausdintas visu zmoniu esanciu sarase miestai
        p.getPersonAddress(person);
    }
}