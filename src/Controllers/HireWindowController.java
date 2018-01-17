package Controllers;

import Worker.Employee;
import Data.EmployeeList;
import Worker.Worker;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HireWindowController {
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField salaryTextField;
    @FXML private Button hireButton;
    @FXML private Button cancelButton;

    public void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void hire() {
        Worker newHire = new Employee(firstNameTextField.getText(),
                lastNameTextField.getText(),
                Double.parseDouble(salaryTextField.getText()));
        System.out.println(newHire);

        Stage stage = (Stage) hireButton.getScene().getWindow();
        stage.close();
    }
}
