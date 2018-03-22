/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marius
 */
class Person {

    private int age;
    private String name;
    private String address;
    private String lastname;

    public Person(int age, String name, String address, String lastname) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.lastname = lastname;
    }

    public Person() {}


    void pushArrayToList(Person [] person){
        // #1 BŪDAS
        // Sukuriamas Person objekto sąrašas į kurį bus talpinami šio tipo masyvai
        List<Person[]> persons = new ArrayList<>();
        // Idedamas į sąrašą Person objekto masyvas
        persons.add(person);
        // Kadangi sąraše yra masyvas duomenims pasiekti prireikia dvigubo ciklo
        // Pirmasis ciklas pereina visus sąrašo elementus
        // Antrasis ciklas pereina visus sąraše esančius masyvo person elementus

        for(Person [] p : persons){
            for(int i=0; i < p.length; i++){
                System.out.println("id:"+i+p[i]);
            }
        }
    }

    void pushArrayElementsToList(Person [] person){

        // #2 BŪDAS
        // Turime sąrašą zmones į kurį bus dedami Person tipo objektų egzemplioriai
        List<Person> zmones = new ArrayList<>();

        // Iš masyvo person išrenkame visus elementus ir patalpiname sąraše žmones
        for(int j =0; j < person.length; j++){
            zmones.add(person[j]);
        }
        // Duomenų išvedimas konsolėje sąrašo zmones
        for(Person p: zmones){
            System.out.println(""+p);
        }
    }
    void getPersonAddress(Person [] person){
        List<Person> zmones = new ArrayList<>();
        // Iš masyvo person išrenkame visus elementus ir patalpiname sąraše žmones
        for(int j =0; j < person.length; j++){
            zmones.add(person[j]);
        }
        // Duomenų išvedimas konsolėje sąrašo zmones
        for(Person p: zmones){
            System.out.println(""+p.getAddress());
        }
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "|" + "Amžius : " + age + "|" + " Vardas : " + name + "|" + " Adresas : " + address + "|" + " Pavardė : " + lastname + "|";
    }
}
