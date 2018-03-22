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
public class BoxShapes {
    protected String name = "Default";
    protected double area = 200.0;
    protected double perimeter = 400.0;

    public BoxShapes(String name, double area, double perimeter) {
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "BoxShapes{" + "name=" + name + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
    

  
     
    

    

    
    
}
