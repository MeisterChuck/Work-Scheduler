package Controllers;

import Worker.Worker;

import Data.EmployeeList;
import Stages.EditStage;
import Stages.HireStage;
import Stages.LoginStage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable{
    private Stage stage;
    private EmployeeList employeeList = EmployeeList.getSoleEmployeeListInstance();

    @FXML private Button logoutButton;
    @FXML private Button hireButton;
    @FXML private Button editButton;
    @FXML private Label nameLabel;
    @FXML private Label salaryLabel;
    @FXML private Label managerLabel;
    @FXML private Label dateOfHireLabel;
    @FXML private ListView<Worker> employeeListView;

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
        System.out.println("Hire MainWindowStage EmployeeList " + employeeList.getWorkerList());
        System.out.println("MainWindowController workerObservableList " + employeeList.getWorkerObservableList());
    }

    public void edit() throws IOException {
        stage = (Stage) editButton.getScene().getWindow();

        new EditStage("/Windows/EditWindow.fxml", "Edit");
    }

    public void select() throws IOException {
        Worker selectedWorker = employeeListView.getSelectionModel().getSelectedItem();

        nameLabel.setText(selectedWorker.getLastName() + ", " + selectedWorker.getFirstName());
        salaryLabel.setText(selectedWorker.printSalary());
        managerLabel.setText(selectedWorker.getManager().toString());
        dateOfHireLabel.setText(selectedWorker.getDateOfHire().toString());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        employeeListView.setItems(employeeList.getWorkerObservableList());
    }
}
