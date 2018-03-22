/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambdas;

import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import javafx.concurrent.Task;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import javax.swing.WindowConstants;

/**
 *
 * @author User
 */


public class House {
   
    private int area;
    private String address;
    private int price;
    private String currency;
    private static final List<House> houses = new ArrayList<>();

    public House(int area, String address, int price, String currency) {
        this.area = area;
        this.address = address;
        this.price = price;
        this.currency = currency;
    }
    static final JFrame frameHouse = new JFrame("House List");
    static final JTextArea textHouse = new JTextArea(20,40);
    static{
        
        houses.add(new House(15, "USA", 100000, "$"));
        houses.add(new House(35, "USA", 200000, "$"));
        houses.add(new House(45, "USA", 300000, "$"));
        houses.add(new House(55, "USA", 400000, "$"));
        
    
        houses.stream().forEach((s)->textHouse.append("\n"+s));
        frameHouse.add(textHouse);
        frameHouse.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frameHouse.setSize(600, 400);
        frameHouse.pack();
        frameHouse.setLayout(new GridLayout(1,1));
        frameHouse.setVisible(true);

    }
    
    
    public static void main (String [] args) throws IOException{
       
        
        houses.stream().forEach((namas->System.out.println(""+namas)));
        //GENERIC LIST
        MixedList<String> mixedList = new MixedList<>();
        mixedList.add("Labas");
        System.err.println(""+mixedList.get());
        //Generic method
        
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        
        MixedList.printGeneric(intArray);
        MixedList.printGeneric(doubleArray);
        MixedList.printGeneric(charArray);
        System.out.println("");
        Streams s = new Streams();
       
        textHouse.append("\n"+s.printOpenTaskList());
        textHouse.append("\n"+s.printParralelTaskList());
        textHouse.append("\n"+s.orderByTask());
        textHouse.append("\n"+s.calculateTaskWeight());
        //Streamai IO
        final Path path = new File( "2.txt" ).toPath();
        try( Stream< String > lines = Files.lines( path, StandardCharsets.UTF_8 ) ) {
           lines.onClose( () -> System.out.println("Done!") ).forEach( System.out::println );
        }
    }
    
    @Override
    public String toString() {
        return "House{" + "area=" + area + ", address=" + address + ", price=" + price + ", currency=" + currency + '}';
    }
    
}
