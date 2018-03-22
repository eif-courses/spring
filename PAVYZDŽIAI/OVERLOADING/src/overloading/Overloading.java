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
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----------------------------Overloading 1 būdas--------------------------");
       
        System.out.println("Metodas set kviečiamas dinamiškai pagal perduodamų parametrų skaičių ir tipą.");       
       
        Examples.set(55);

        Examples.set(3.0);
 
        Examples.set(2.0, "double");

        System.out.println("----------------------------Overloading 2 būdas-----------------------");
        
        System.out.println("Antras būdas metodas parameters, taip pat yra overloading pavyzdys, "
                + "\n" +"bet priklausomas nuo perduodamų parametrų tipo, privalumas tame,"
                +"\n"+ "kad nereikia atkartoti šio metodo realizuojant klasę daug kartų."+"\n");
        
        int [] masyvas = {20, 6, 7, 9};
        
        System.out.println("Su masyvu:");
        Examples.parameters(masyvas);
        
        System.out.println("\n"+"3 parametrai:");
        Examples.parameters(2, 4, 6);
        
        System.out.println("\n"+"1 parametras:");
        Examples.parameters(999);
        
        System.out.println("----------------------------Overloading 3 būdas-----------------------");
        
        System.out.println("Trečias būdas pateikiamas keletos skirtingų konstruktorių perkrovimo (angl. Overloading) pavyzdys.");
        
        Examples e = new Examples("Petras");
        System.out.println(""+e);
        
        Examples e1 = new Examples("Petras", 21);
        System.out.println(""+e1);
        
        Examples e2 = new Examples("Petras", 21, 62);
        System.out.println(""+e2);
    }
    
    
}
