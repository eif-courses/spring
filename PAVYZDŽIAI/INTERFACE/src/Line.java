
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marius
 */
    // Klasė Tiesė 
class Line implements GraphicObject{ 
  
    int x1,x2,y1,y2; 
    @Override 
    public void draw(Graphics graphics) { 
        graphics.drawLine(x1,y1,x2,y2); 
    } 
    @Override 
    public void resize(int scale) { 
        System.out.println("Mastelis sėkmingai pakeistas"+scale); 
    } 
    @Override 
    public void moveTo(int x, int y) { 
        System.out.println("Tiesė sėkmingai perkelta į: x"+x+" y:"+y); 
    } 
} 
