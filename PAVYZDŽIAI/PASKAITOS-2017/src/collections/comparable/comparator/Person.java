package collections.comparable.comparator;

import java.util.Comparator;

/**
 * Created by Marius on 1/29/2017.
 */
public class Person implements Comparator<Person>, Comparable<Person>{
    private String name;
    private double salary;

    public Person() {
    }

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
    @Override public int compare(Person o1, Person o2) {
        return (int)o1.getSalary() - (int)o2.getSalary();
    }

    public static Comparator<Person> nameComparator = new Comparator<Person>() {
        @Override public int compare(Person e1, Person e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    public static Comparator<Person> salaryComparator = new Comparator<Person>() {
        @Override public int compare(Person e1, Person e2) {
            return (int)e1.getSalary() - (int)e2.getSalary();
        }
    };

}
