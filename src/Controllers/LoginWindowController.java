package Controllers;

import Stages.MainStage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginWindowController {
    @FXML private Button loginButton;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label wrongCredentials;

    @FXML
    public void login() throws IOException {
        if(usernameField.getText().equals("manager") && passwordField.getText().equals("manager")) {
            // Closes Login Window Stage
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();

            // Opens new Main Program Stage
            new MainStage("/Windows/MainWindow.fxml", "Scheduler");
        } else {
            wrongCredentials.setText("Wrong Credentials");
        }
    }
}
