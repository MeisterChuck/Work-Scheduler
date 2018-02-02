package Controllers;

import Worker.Employee;
import Data.EmployeeList;
import Worker.Worker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

// Attempt to rewrite the check fields for ease of read and maintainability

public class HireWindowController implements Initializable {
    private EmployeeList employeeList = EmployeeList.getSoleEmployeeListInstance();
    private Worker newHire;

    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField salaryTextField;
    @FXML private CheckBox managerCheckBox;
    @FXML private DatePicker dateOfHirePicker;
    @FXML private Button hireButton;
    @FXML private Button cancelButton;

    private final String checkFirstNameMessage = "Please Enter a First Name";
    private final String checkLastNameMessage = "Please Enter a Last Name";
    private final String checkSalaryMessage = "Please Enter a Salary";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dateOfHirePicker.setValue(LocalDate.now());
    }

    public void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void hire(){

        if(checkFields()) {
            newHire = new Employee(firstNameTextField.getText(), lastNameTextField.getText());
            newHire.setSalary(Double.parseDouble(salaryTextField.getText()));
            newHire.setManager(managerCheckBox.isSelected());
            newHire.setHireDate(dateOfHirePicker.getValue());

            employeeList.hire(newHire);

            System.out.println("Hire HireWindowStage EmployeeList " + employeeList.getWorkerList());
            System.out.println("Hire HireWindowStage workerObservableList " + employeeList.getWorkerObservableList() + "\n");

            Stage stage = (Stage) hireButton.getScene().getWindow();
            stage.close();
        }
    }

    private Boolean checkFields() {
        if(checkField(firstNameTextField, checkFirstNameMessage) &&
           checkField(lastNameTextField, checkLastNameMessage) &&
           checkField(salaryTextField, checkSalaryMessage)) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean checkField(TextField field, String messageToPrint) {
        if(field.getText() == null || field.getText().trim().isEmpty()) {
            field.setPromptText(messageToPrint);
            return false;
        } else {
            return true;
        }
    }
}
