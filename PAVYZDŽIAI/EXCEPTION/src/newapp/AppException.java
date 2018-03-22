/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newapp;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;



/**
 *
 * @author Marius
 */
public class AppException extends Exception{
    
    int objectID;
    
    public AppException(int ID){
        this.objectID = ID;
    }
    public AppException(String message, int ID){
        super(message);
        this.objectID = ID;
    }
    public AppException(){}
    public AppException(String message){       
        super(message);
      
    }
    public AppException(Throwable cause){
        super(cause);
    }
    public AppException(String message, Throwable cause){       
        super(message,cause);
        
    }

    /**
     *
     * @return
     */
    /*@Override
    public String toString(){
    
       
       return "Įvestas skaičius = "+objectID+", prašome įvesti kitą skaičių.";
   }*/
    
}
