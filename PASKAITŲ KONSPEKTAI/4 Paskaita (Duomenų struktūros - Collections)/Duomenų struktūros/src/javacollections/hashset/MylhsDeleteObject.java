/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections.hashset;

/**
 *
 * @author User
 */
import java.util.HashSet;
 
public class MylhsDeleteObject {
 
    public static void main(String a[]){
         
        HashSet<Price> lhs = new HashSet<Price>();
        lhs.add(new Price("Banana", 20));
        lhs.add(new Price("Apple", 40));
        lhs.add(new Price("Orange", 30));
        for(Price pr:lhs){
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("deleting key from set...");
        lhs.remove(key);
        System.out.println("Elements after delete:");
        for(Price pr:lhs){
            System.out.println(pr);
        }
    }
}
 
