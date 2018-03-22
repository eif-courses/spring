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
public class SingletonKlase {
    
    private SingletonKlase() {
    }
    
    public static SingletonKlase getInstance() {
        return SingletonKlaseHolder.INSTANCE;
    }
    private static class SingletonKlaseHolder {
        private static final SingletonKlase INSTANCE = new SingletonKlase();
    }
}
