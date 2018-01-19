package Controllers;

import Data.EmployeeList;
import Stages.EditStage;
import Stages.HireStage;
import Stages.LoginStage;
import Worker.Worker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController {
    private Stage stage;

    EmployeeList employeeList = EmployeeList.getInstance();
    private ObservableList<Worker> observableEmployeeList = FXCollections.observableArrayList(employeeList.getWorkerList());

    @FXML private Button logoutButton;
    @FXML private Button hireButton;
    @FXML private Button editButton;
    @FXML private Label nameLabel;

    public void logout() throws IOException {
        // Closes Login Window Stage
        stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();

        // Opens new Main Program Stage
        new LoginStage("/Windows/LoginWindow.fxml", "Login");
    }

    public void hire() throws IOException {
        stage = (Stage) hireButton.getScene().getWindow();

        new HireStage("/Windows/HireWindow.fxml", "Hire");
    }

    public void edit() throws IOException {
        stage = (Stage) editButton.getScene().getWindow();

        new EditStage("/Windows/EditWindow.fxml", "Edit");
    }
}
