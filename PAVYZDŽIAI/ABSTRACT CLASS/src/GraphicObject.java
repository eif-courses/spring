/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marius
 */
// SVARBU Kiekviena klasė pagal JAVA taisykles yra apibrėžiama naujame faile 
 
// Abstrakti klasė skirta apibrėžti grafinį objektą 
public abstract class GraphicObject{ 
 
    // Koordinatės x ir y 
    int x, y; 
    String name;

    public GraphicObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    // Metodas skirtas perkelti objektą į kitą vietą 
    void moveTo(int x, int y){ 
        System.out.println("Objektas: "+getName()+" sekmingai perkeltas i: "+"["+x+","+y+"]"); 
    } 
 
    // Metodas draw skirtas nupiešti tam tikrą objektą plokštumoje 
    abstract void draw(Position position); 
 
    // Metodas skirtas pakeisti objekto dydį 
    abstract void resize(); 
} 
