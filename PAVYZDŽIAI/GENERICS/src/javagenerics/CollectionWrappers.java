/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

import java.util.*;

/**
 *
 * @author Marius
 */
public class CollectionWrappers {
    //Synchronized collection Wrappers
    public static <T> Collection<T> synchronizedCollection(Collection<T> c){return c;}
    public static <T> Set<T> synchronizedSet(Set<T> s){return s;}
    public static <T> List<T> synchronizedList(List<T> list){return list;}
    public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m){return m;}
    public static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s){return s;}
    public static <K,V> SortedMap<K,V> synchronizedSortedMap(SortedMap<K,V> m){return m;}
    
    //Read only access collection 
  /*  
    public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c){return c;}
    public static <T> Set<T> unmodifiableSet(Set<? extends T> s){return s;}
    public static <T> List<T> unmodifiableList(List<? extends T> list){return list;}
    public static <K,V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m){return m;}
    public static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<? extends T> s){return s;}
    public static <K,V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> m){return m;}
    */
}
