
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
class Oval implements GraphicObject{ 
 
    int x, y, width, height; 
 
    @Override 
    public void draw(Graphics graphics) { 
        graphics.drawOval(x, y, width, height); 
    } 
    @Override 
    public void resize(int scale) { 
        System.out.println("Mastelis sėkmingai pakeistas"+scale); 
    } 
 
    @Override 
    public void moveTo(int x, int y) { 
        System.out.println("Ovalas sėkmingai perkeltas į: x"+x+" y:"+y); 
    } 
} 
