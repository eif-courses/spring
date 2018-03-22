/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization.via.proxy;

/**
 *
 * @author Marius
 */
import java.io.IOException;
import seriazibleandDesiarizable.SerializationUtil;

public class SerializationProxyTest {
 
    public static void main(String[] args) {
        String fileName = "data.ser";
         
        Data data = new Data("Pankaj");
         
        try {
            SerializationUtil.serialize(data, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        try {
            Data newData = (Data) SerializationUtil.deserialize(fileName);
            System.out.println(newData);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
 
}
