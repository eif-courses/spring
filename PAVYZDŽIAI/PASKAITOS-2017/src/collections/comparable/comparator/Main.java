package collections.comparable.comparator;


import java.util.*;

class Main {
    public static void main(String args[]){

        Deze deze = new Deze("Auksinė", 111);
        Deze deze2= new Deze("Stiklinė", 599);
        Deze deze3 = new Deze("Plastikinė", 33);
        Deze deze4 = new Deze("Celofaninė", 11);
        Deze deze5 = new Deze("Medinė", 68);
        List<Deze> dezes = new ArrayList<>();
        dezes.add(deze);
        dezes.add(deze2);
        dezes.add(deze3);
        dezes.add(deze4);
        dezes.add(deze5);

        Comparator<Deze> dezesSvoris = new Comparator<Deze>() {
            @Override
            public int compare(Deze e1, Deze e2) {
                return (e1.getSvoris() - e2.getSvoris());
            }
        };
        Comparator<Deze> dezesTipas = new Comparator<Deze>() {
            @Override
            public int compare(Deze e1, Deze e2) {
                return e1.getTipas().compareTo(e2.getTipas());
            }
        };

        Collections.sort(dezes, dezesTipas);
        System.out.println("PAGAL DEZES TIPA");
        for (Deze elem: dezes) {
            System.out.println(elem);
        }

        Collections.sort(dezes, dezesSvoris);
        System.out.println("PAGAL DEZES SVORI");
        for (Deze elem: dezes) {
            System.out.println(elem);
        }


        List<Person> people = new ArrayList<>();
        people.add(new Person("Darius", 2200));
        people.add(new Person("Marius", 1500));
        people.add(new Person("Paulius", 1582));
        people.add(new Person("Andrius", 1888));
        people.add(new Person("Tomas", 1500));
        people.add(new Person("Arnas", 1500));
        people.add(new Person("Paulius", 1582));
        people.add(new Person("Marius", 1500));
        people.add(new Person("Tomas", 4444));

        //people.sort(new Person());

        for (Person elem: people) {
          //  System.out.println(elem);
        }

        people.sort(new PersonComparatorBySalaryAndName());
        for (Person elem: people) {
            System.out.println(elem);
        }







    }
}