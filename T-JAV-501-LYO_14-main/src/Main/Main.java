package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Set up the window size
        primaryStage.setWidth(1000);
        primaryStage.setHeight(800);
        primaryStage.setTitle("Epitemon Adventure");

        // Create the game screen
        GameScreen gameScreen = new GameScreen();

        Scene scene = new Scene(gameScreen, 800, 600); 

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        gameScreen.startGameTime();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
