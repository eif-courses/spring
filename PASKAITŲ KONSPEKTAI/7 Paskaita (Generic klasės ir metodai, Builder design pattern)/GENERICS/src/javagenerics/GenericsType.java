/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

/**
 *
 * @author User
 */
public class GenericsType <T>{

   
    private T t;
     
    public T get(){
        return this.t;
    }
     
    public void set(T t1){
        this.t=t1;
    }
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.get().equals(g2.get());
    }
    @Override
    public String toString() {
        return "GenericsType{" + "t=" + t + '}';
    }
    
}
