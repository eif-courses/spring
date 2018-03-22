/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spriteanimations;

/**
 *
 * @author Marius
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SandboxFX extends Application {

    private static final Image IMAGE = new Image("https://upload.wikimedia.org/wikipedia/commons/7/73/The_Horse_in_Motion.jpg");

    private static final int COLUMNS = 6;
    private static final int COUNT = 6;
    private static final int OFFSET_X = 6;
    private static final int OFFSET_Y = 0;
    private static final int WIDTH = 1536 / 6;
    private static final int HEIGHT = 256;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        String path = "C:\\Users\\Marius\\Documents\\NetBeansProjects\\SpriteAnimations\\src\\spriteanimations\\spritestrip.png";
        primaryStage.setTitle("The Horse in Motion");

        String keliasIkiFailo = "C:\\Users\\Marius\\Documents\\NetBeansProjects\\SpriteAnimations\\src\\spriteanimations\\spritestrip2.png";

        final ImageView imageView = new ImageView(new Image(new FileInputStream(new File(path))));

        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));

        Scene scene = new Scene(new Group(imageView));

        final Animation animation = new SpriteAnimation(
                imageView,
                Duration.millis(1000),
                COUNT, COLUMNS,
                OFFSET_X, OFFSET_Y,
                WIDTH, HEIGHT
        );
        animation.setCycleCount(Animation.INDEFINITE);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            int posX = 0, posY = 0;

            @Override
            public void handle(KeyEvent ke) {
                
                if (ke.getCode().equals(KeyCode.RIGHT)) {
                    posX += 10;
                    imageView.setX(posX);
                    imageView.setScaleX(1);
                    animation.play();
                }
                if (ke.getCode().equals(KeyCode.LEFT)) {
                    posX -= 10;
                    imageView.setX(posX);
                    imageView.setScaleX(-1);
                    animation.play();
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.RIGHT)) {
                    animation.pause();
                }
                if (event.getCode().equals(KeyCode.LEFT)) {
                    animation.pause();
                }
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
