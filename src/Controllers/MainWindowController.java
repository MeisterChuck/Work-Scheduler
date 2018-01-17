package Controllers;

import Stages.EditStage;
import Stages.HireStage;
import Stages.LoginStage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
    @FXML private Button logoutButton;
    @FXML private Button hireButton;
    @FXML private Button editButton;
    @FXML private Label nameLabel;

    private Stage stage;

    public void logout() throws IOException {
        // Closes Login Window Stage
        stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();

        // Opens new Main Program Stage
        new LoginStage();
    }

    public void hire() throws IOException {
        stage = (Stage) hireButton.getScene().getWindow();

        new HireStage();
    }

    public void edit() throws IOException {
        stage = (Stage) editButton.getScene().getWindow();

        new EditStage();
    }
}
