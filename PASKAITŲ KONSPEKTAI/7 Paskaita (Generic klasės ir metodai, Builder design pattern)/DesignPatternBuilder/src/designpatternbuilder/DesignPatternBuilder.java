/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternbuilder;

import designpatternbuilder.Dog.Type;
import javax.swing.JOptionPane;

/**
 *
 * @author Marius
 */
public class DesignPatternBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dog dog = new Dog.Builder()
                .name("Fido")
                .age(2)
                .type(Type.CORGI)
                .owner("Marius")
                .build();
        Dog dog2 = new Dog.Builder()
                .name("Fido")
                .age(4)
                .type(Type.PUG)
                .owner("Paulius")
                .build();
        System.out.println(dog);
        System.err.println(dog2);
    }

}
