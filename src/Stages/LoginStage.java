package Stages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginStage extends Stage{
    private Parent root;

    public LoginStage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Windows/LoginWindow.fxml"));

        this.setTitle("Scheduler Login");
        this.setScene(new Scene(root));
        this.setResizable(false);
        this.show();
    }
}
