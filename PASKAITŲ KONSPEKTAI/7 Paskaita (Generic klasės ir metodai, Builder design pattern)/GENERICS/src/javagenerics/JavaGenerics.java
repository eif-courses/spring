/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;


import java.util.*;


/**
 *
 * @author User
 */
public class JavaGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle("Trikampis", 200, 400));
        
        List<Square> squares = new ArrayList<>();
        squares.add(new Square("Kvadratas", 100, 300));
        
        ShapeList.anyList(triangles);
        ShapeList.anyList(squares);
        
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle("Daugiakampis", 100, 200));
        ShapeList.shapeList(rectangles);
        
        
        //Negalimas panaudojimas kadangi Circle klase nepaveldi Shape klases
       // List<Circle> circles = new ArrayList<>();
       //   ShapeList.shapeList(circles);
        
        List<BoxShapes> boxShapeses = new ArrayList<>();
        boxShapeses.add(new BoxShapes("Viršutinė klasė",9000 , 18000));
        ShapeList.shapeSubtype(boxShapeses);
        
        
        GenericsType<Shape> sGenericsType = new GenericsType<>();
        sGenericsType.set(new Triangle("a",1,1));
        System.out.println(""+sGenericsType.get());
        
        GenericsType<Shape> triangle = new GenericsType<>();
        triangle.set(new Shape("a",1,1));
        System.out.println(""+triangle.get());
        
        GenericsType<String> s1 = new GenericsType<>();
        s1.set("a");
        GenericsType<String> s2 = new GenericsType<>();
        s2.set("a");
        System.out.println(""+GenericsType.isEqual(s1, s2));
        System.out.println(""+GenericsType.isEqual(triangle, sGenericsType));
        
      List<String> a = new ArrayList<>();
        
      List<String> syncal = 
         Collections.synchronizedList(a);
   
    
    a.add("vvv");
    a.add("ccc");
    System.out.println("Iterating synchronized ArrayList:");
       synchronized(syncal) {
       Iterator<String> iterator = syncal.iterator(); 
       while (iterator.hasNext())
          System.out.println(iterator.next());
       }
       
       
    }
}
