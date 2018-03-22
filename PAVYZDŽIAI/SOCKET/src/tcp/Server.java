/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Date;

/**
 *
 * @author Marius
 */
public class Server {
    
    public static void main(String [] args) throws IOException{
    
        ServerSocket serverSocket = new ServerSocket(4444);
        
        try{
           while(true){
               Socket socket = serverSocket.accept();
               try{
                   PrintWriter output =
                   new PrintWriter(socket.getOutputStream(), true);
                   output.println(new Date().toString());
                   System.out.println("Server done");
               }finally{
                   socket.close();
               }
           }
        }
        finally{
          serverSocket.close();
        }
    
    }
}

