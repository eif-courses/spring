/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Marius
 */
public class Client {
    
    public static void main (String [] args) throws IOException{
    
        String serverAdress = JOptionPane.showInputDialog("aa"+"aa");
        Socket socket = new Socket(serverAdress, 4444);
        BufferedReader input =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String answer = input.readLine();
        JOptionPane.showMessageDialog(null, answer);
        System.exit(0);
    }
}
