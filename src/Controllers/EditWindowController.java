package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EditWindowController {
    @FXML private Button editButton;
    @FXML private Button cancelButton;

    public void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void edit() {
        Stage stage = (Stage) editButton.getScene().getWindow();
        stage.close();
    }
}
