/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_modifikatorius;

/**
 *
 * @author Marius
 */
public class Pagrindine {
    int id = 50;
    void spausdintiID(){
        // Objekto kurimas kitose klasėse 
        // jeigu leisime pasiekti iš išorės
        Pagrindine.Vidine vidine = new Pagrindine.Vidine();
        vidine.grazinti_id();
        // Tik tuo atveju kai yra kviečiame Tėvynėje klasėje 
        Vidine v = new Vidine();
        v.grazinti_id();
    }
    static class Vidine{
        int id = 90;   
        public int grazinti_id(){return id;}
    } 
}
