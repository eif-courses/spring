/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicktowin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author Marius
 */
public class ClickToWin extends Application {

    private Parent creatContent() {
        Pane root = new Pane();
        root.setPrefSize(800, 800);
        root.setBackground(new Background(new BackgroundFill(
    Color.BLACK,
    null,
    null)));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Tile tile = new Tile();
                tile.setTranslateY(j * 100);
                tile.setTranslateX(i * 200);
                root.getChildren().add(tile);
            }
        }

        return root;
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Mini game");
        primaryStage.setScene(new Scene(creatContent()));
        
        primaryStage.show();
    }

    private static final class Tile extends StackPane {

        private static int score = 0;
        private static int count = 0;
        private final ImageView imageView = new ImageView(new Image("http://i0.wp.com/forever.ultimacodex.com/files/2012/07/virtue-tarot-card-back.jpg"));
        
        public Tile() {
            piesiamLenta();
        }

        void piesiamLenta() {


            //imagePattern = new ImagePattern(image);
          
           // imageView = new ImageView(image);
            
         imageView.setFitWidth(180);
         
         imageView.setPreserveRatio(true);
         imageView.setSmooth(true);
         imageView.setCache(true);
 
         getChildren().addAll(imageView);
            
            EventHandler<MouseEvent> eventHandler;
            eventHandler = new EventHandler<MouseEvent>() {
                
                @Override
                public void handle(MouseEvent e) {

                    if (e.getButton() == MouseButton.PRIMARY) {

                        int r = new Random().nextInt(255);
                        int g = new Random().nextInt(255);
                        int b = new Random().nextInt(255);
                        
                        if(r > 100 && g > 100 && b > 100){
                            score +=100;
                        }
                        else{
                            score+=350;
                        }

                        
                        int depth = 70;
                        DropShadow borderGlow= new DropShadow();
                        borderGlow.setOffsetY(0f);
                        borderGlow.setOffsetX(0f);
                        borderGlow.setColor(Color.rgb(r, g, b));
                        borderGlow.setWidth(depth);
                        borderGlow.setHeight(depth);

                        imageView.setEffect(borderGlow);
                        //rectangle.setStroke(Color.BLUE);
                        //rectangle.setFill(Color.YELLOW);
                        if (e.getClickCount() == 2) {
                            count++;
                            
                            FadeTransition ft = new FadeTransition(Duration.millis(3000), imageView);
                            ft.setFromValue(1.0);
                            ft.setToValue(0.1);
                            ft.setCycleCount(1);
                            ft.setAutoReverse(true);
                            ft.play();
                            Path path = new Path();
                            path.getElements().add(new MoveTo(20, 20));
                            path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
                            // path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
                            PathTransition pathTransition = new PathTransition();
                            pathTransition.setDuration(Duration.millis(4000));
                            pathTransition.setPath(path);
                            pathTransition.setNode(imageView);
                            pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
                            pathTransition.setCycleCount(1);
                            pathTransition.setAutoReverse(true);
                            pathTransition.play();
                            System.out.println("" + count);
                            
                            
                            //http://www.freesfx.co.uk/rx2/mp3s/2/14272_1459958515.mp3
                            AudioClip plonkSound = null;
                            try{
                                plonkSound = new AudioClip("http://www.sounddogs.com/previews/108/mp3/947134_SOUNDDOGS__fo.mp3");
                                plonkSound.setCycleCount(1);
                                plonkSound.play();
                                
                            }
                            catch(Exception ee){
                                ee.printStackTrace();
                            }
                            
                               if(count >= 3){        
                        Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("GAME OVER");
		alert.setHeaderText("YOUR SCORE:"+score);
//		alert.setGraphic(new ImageView(ImageCache.getInstance().get("/images/gallio/gallio-"
//				+ comics[RandomUtils.nextInt(0, 3)] +
//				".png")));
                    alert.setGraphic(new ImageView("https://cdn0.iconfinder.com/data/icons/flat-football/100/589356-football_trophy-512.png"));
                    alert.getGraphic().setLayoutX(100);
                    alert.getGraphic().setLayoutY(100);
                    alert.showAndWait();
                     //imageView.removeEventHandler(MouseEvent.MOUSE_CLICKED, this);
                       
                          
                    }
                        }

                    }
                    if(count >= 3){
                        imageView.removeEventHandler(MouseEvent.MOUSE_CLICKED, this);
                       
                    }
                    
                        //count = 5;
              
                
                  
                  
                     
                }
              
            };
          
            
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
             
            
            //Registering the event filter 
            

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
