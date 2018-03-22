/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marius
 */
public class ABSTRACTCLASS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sukuriamas Circle klases egzempliorius
        GraphicObject graphicObject = new Circle("Apskritimas");
        graphicObject.moveTo(0, 0);
        // Sukuriamas Line klases egzempliorius
        graphicObject = new Line("Tiese");
        graphicObject.moveTo(0, 11);
        // Sukuriamas Rectangle klases egzempliorius
        graphicObject = new Rectangle("Daugiakampis");
        graphicObject.moveTo(0, 44);
    }
    
}
