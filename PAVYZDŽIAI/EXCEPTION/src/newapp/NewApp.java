/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newapp;

/**
 *
 * @author Marius
 */


public class NewApp{

    /**
     * @param args the command line arguments
     * @throws newapp.AppException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws AppException, InterruptedException{
        // TODO code application logic here
        
        Test test = new Test();
        
        int i = 0;

        try{

            Test.compute ( 5 );
            Thread.sleep(2000);
            Test.compute( 1 ); 
            Thread.sleep(2000);
            String ID = test.getID(i);

        }catch(AppException e ){
            System.err.println( "ERROR:9x00094. " + e);
        }
    }
}
