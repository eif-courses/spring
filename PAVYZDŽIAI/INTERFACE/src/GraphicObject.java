
import java.awt.Graphics;

/**
 *
 * @author Marius
 */
public interface GraphicObject {
    // Interfeisas Grafinis objektas 

    void draw(Graphics graphics); 
    void resize(int scale); 
    void moveTo(int x, int y); 

}
