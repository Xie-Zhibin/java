import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MyJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a button and place it in the scene
        // Button btOK = new Button("OK");
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the statge
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
