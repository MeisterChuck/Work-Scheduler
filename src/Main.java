import Stages.LoginStage;
import Data.EmployeeList;
import javafx.application.Application;
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
