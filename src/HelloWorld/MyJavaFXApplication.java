package HelloWorld;
 
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class MyJavaFXApplication extends Application {
       
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);

        scene.setFill(Color.color(0.502, 0.502, 1));

        Rectangle body = new Rectangle(75, 100, 150, 40);
        body.setFill(Color.WHITE);
        Polygon head = new Polygon();
        head.getPoints().addAll(new Double[]{
            225.0, 100.0,
            225.0, 140.0,
            250.0, 120.0
        });
        head.setFill(Color.ORANGE);

        Ellipse tailPartMiddle = new Ellipse(92,120, 20,2);
        tailPartMiddle.setFill(Color.ORANGE);

        Polygon tailPartUpper = new Polygon();
        tailPartUpper.getPoints().addAll(new Double[]{
                75.0, 80.0,
                105.0, 80.0,
                110.0, 100.0,
                80.0, 100.0,
        });
        tailPartUpper.setFill(Color.ORANGE);


        Polygon tailPartLower = new Polygon();
        tailPartLower.getPoints().addAll(new Double[]{
                75.0, 160.0,
                105.0, 160.0,
                110.0, 140.0,
                80.0, 140.0,
        });
        tailPartLower.setFill(Color.ORANGE);
        
        root.getChildren().addAll(body, head, tailPartMiddle, tailPartUpper, tailPartLower);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
