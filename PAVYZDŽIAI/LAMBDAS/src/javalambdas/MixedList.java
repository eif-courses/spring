/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marius
 */
public class MixedList <T> {
    
    private final List<T> mixedList = new ArrayList<>();
    
    T type;
    public void add(T t){
        mixedList.add(t);
        this.type = t;
    }
    public T get(){
        return type;
    }
    public static <E> void printGeneric(E [] e){
        for (E e1 : e) {
            System.out.print(""+e1);
        }
    }
}
