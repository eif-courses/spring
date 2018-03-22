/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Point;

/**
 *
 * @author Marius
 */
class Line extends GraphicObject{ 
 
    int startx, starty, endx, endy; 

    public Line(String name) {
        super(name);
    }
 
    @Override 
    void draw(Position position) { 
 
        // Analogiškai kaip ir Circle klasėje yra apibrėžiami metodai draw ir resize 
        // pagal tam objektui būdingas savybes. 
 
        Point point = new Point(); 
        point.setLocation(startx, starty); 
    } 
 
    @Override 
    void resize() { 
        Resize resize = new Resize(); 
        resize.resizeObject(startx, starty); 
    } 
} 
