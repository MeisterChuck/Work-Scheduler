import Stages.LoginStage;
import Data.EmployeeList;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        new LoginStage("/Windows/LoginWindow.fxml", "Login");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
