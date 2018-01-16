import Controllers.LoginWindowController;
import Stages.LoginStage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Create GIT before proceeding with project

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        new LoginStage();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
