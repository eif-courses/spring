/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marius
 */
// Klasė apskritimas 
class Circle extends GraphicObject{ 
 
    private int x, y; 
    private int radius; 
    private int width, height; 

    public Circle(String name) {
        super(name);
    }
 
    @Override 
    void draw(Position position){ 
        // Metodas naudojamas iš abstrakčios klasės skirtas perkelti obektą i tam tikrą poziciją 
        
        moveTo(x, y); 
        // Alternatyvus sprendimo būdas naudojantis klasės Position metodais 
        position.setPosition(this.x, this.y); 
    } 
    @Override 
    void resize(){ 
        // Sukuriamas klasės Resize objektas 
        Resize resize = new Resize(); 
 
        // Panaudotas Resize klasės metodas pakeisti paveikslėlio dydį 
        resize.resizeObject(width, height); 
    } 
} 
