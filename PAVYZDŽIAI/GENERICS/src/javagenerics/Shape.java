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
public class Shape extends BoxShapes{

    public Shape(String name, double area, double perimeter) {
        super(name, area, perimeter);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getArea() {
        return area;
    }
    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" + "name=" + name + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
    
    
}
