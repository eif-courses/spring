/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stiliauskeitimasfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author Marius
 */
public class StiliausKeitimasFX extends Application {
    
    
    
    
     private String theme1Url = getClass().getResource("stilius.css").toExternalForm();
    private String theme2Url = getClass().getResource("stilius2.css").toExternalForm(); 
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        String path = "C:\\Users\\Marius\\Documents\\NetBeansProjects\\StiliausKeitimasFX\\src\\stiliauskeitimasfx\\css\\stilius.css";
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        
       
        
       scene.setOnKeyPressed((KeyEvent ke) -> {
           if (ke.getCode().equals(KeyCode.F1)) {
               
                 scene.getStylesheets().remove(theme2Url);
                 if(!scene.getStylesheets().contains(theme1Url)) {
                     scene.getStylesheets().add(theme1Url);
                 }
            
           }
           if (ke.getCode().equals(KeyCode.F2)) {
               scene.getStylesheets().remove(theme1Url);
                 if(!scene.getStylesheets().contains(theme2Url)) {
                     scene.getStylesheets().add(theme2Url);
                 }
           }
           
        });
         
        
        
        //Scene scene = new Scene(new Group(), 500, 400);
        //scene.getStylesheets().add(path);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
