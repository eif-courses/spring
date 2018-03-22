
import java.awt.Graphics;
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
// Klasė kvadratas 
 
class Square implements GraphicObject { 
    int bound; 
 
    @Override 
    public void draw(Graphics graphics) { 
        Polygon polygon = new Polygon(); 
        polygon.addPoint(bound, bound); 
        graphics.drawPolygon(polygon); 
        System.out.println("Kvadratas sėkmingai nupieštas"); 
    } 
 
    @Override 
    public void resize(int scale) { 
        int result = getSquareSize() * scale; 
        System.out.println(result); 
    } 
 
    @Override 
    public void moveTo(int x, int y) { 
        moveSquare(x, y); 
    } 
 
    int getSquareSize() { 
        int size = 10; 
        for (int i = 0; i < 10; i++) { 
            size += i; 
        } 
        return size; 
    } 
 
    void moveSquare(int x, int y) { 
        System.out.println("Kvadratas sėkmingai perkeltas: " + x + " " + y); 
    } 
} 