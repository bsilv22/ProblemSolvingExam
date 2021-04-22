



package circleproblemexam;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CircleProblemExam extends Application {

    
    public static void main(String[] args) {
        launch(args);
    }
    
    private final double radius = 10;
  private final Circle[] circle = {new Circle(40, 40, 10)};
  
  
  private final Circle crl1 = new Circle(200, 125, 100);
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {  
    Pane pane = new Pane();    
   
    pane.getChildren().addAll(crl1, circle[0]);
    //
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 400, 250);
    primaryStage.setTitle("Week 9 Lab Assignment"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage 
    circle[0].setFill(Color.RED);
    
    crl1.setFill(Color.TRANSPARENT);
    crl1.setStroke(Color.BLACK);
    crl1.setStrokeWidth(2);
    
    
   setRandomLocation( circle[0], crl1);
    
    circle[0].setOnMouseDragged(e -> { 
      
      double radian = Math.atan2(e.getY() - crl1.getCenterY(), e.getX() - crl1.getCenterX());
                double x = crl1.getCenterX() + crl1.getRadius() * Math.cos(radian);
                double y = crl1.getCenterY() + crl1.getRadius() * Math.sin(radian);
                circle[0].setCenterX(x);
                circle[0].setCenterY(y);
                
    });
    }
   private void setRandomLocation(Circle tPoint, Circle c) {

        double angle = Math.random() * 360;
        double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
        double y = c.getCenterY() + c.getRadius() * Math.sin(Math.toRadians(angle));
        tPoint.setCenterX(x);
        tPoint.setCenterY(y);
        
  }
}
 
    
    


  
  
   

    

