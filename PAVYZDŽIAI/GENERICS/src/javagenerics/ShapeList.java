/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

import java.util.List;


public class ShapeList{
    // Bet kokio tipo sarasas
    public static String anyList(List<?> list){
        list.stream().forEach(System.out::println);
        return "";
    }
    // Visos klases paveldejusios Shape klase
    public static String shapeList(List<? extends Shape> list){
        list.stream().forEach(System.out::println);
        return "";
    }
    // Visos klases auksciau uz Shape klase 
    public static String shapeSubtype(List<? super Shape> list){
        list.stream().forEach(System.out::println);
        return "";
    }
    @Override
    public String toString() {
        return "ShapeList{" + '}';
    }

    
}
