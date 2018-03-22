/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Marius
 */
public class Examples {
    
    String name;
    int age;
    int weight;

    public Examples(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Examples(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Examples(String name) {
        this.name = name;
    }
    
    /**
    * @since Metodų perkrovimo pavyzdys, su int tipo reikšmėmis, 
    * kur parametrų kiekis yra nurodomas kviečiant metodą pavyzdžiui: parameters(<b color="blue">elem_1, elem_2, elem_3,...,elem_n</b>) arba parameters(<b color="blue">int [] masyvas</b>).
    * @param param parametrų sąrašas, galime pateikti keletą parametrų arbą masyvą.
    */
    public static void parameters(int... param){
    
        for (int i = 0; i < param.length; i++) {
            System.out.println("Parametrai: " + param[i]);
        }
        
    }
    /**
    * @since metodas skirtas priskirti int tipo reikšmę.
    * 
    * @param param sveikojo tipo reikšmė.
    */
    public static void set(int param){
        System.out.println("Rezultatas: " + param);
    }
    
    /**
    * @since metodas skirtas priskirti double tipo reikšmę.
    * 
    * @param param slankiojio kablelio tipo reikšmė.
    */
    public static void set(double param){
        System.out.println("Rezultatas: " + param);
    }
    
      /**
    * @since metodas skirtas priskirti double tipo reikšmę ir tipo pavadinimą.
    * 
    * @param param slankiojio kablelio tipo reikšmė.
    * @param typeName perduodamo parametro tipo pavadinimas. 
    */
    public static void set(double param, String typeName){
        System.out.println("Rezultatas: " + param +" - "+typeName);
    }

    @Override
    public String toString() {
        return "Examples{" + "name=" + name + ", age=" + age + ", weight=" + weight + '}';
    }

}
