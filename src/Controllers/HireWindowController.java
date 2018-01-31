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

    public void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void hire(){

        if(checkField(firstNameTextField, checkFirstNameMessage) &&
                checkField(lastNameTextField, checkLastNameMessage) &&
                checkField(salaryTextField, checkSalaryMessage)) {
             newHire = new Employee(firstNameTextField.getText(),
                     lastNameTextField.getText(),
                     Double.parseDouble(salaryTextField.getText()),
                     managerCheckBox.isSelected(),
                     dateOfHirePicker.getValue());

            employeeList.hire(newHire);
            System.out.println("Hire HireWindowStage EmployeeList " + employeeList.getWorkerList());
            System.out.println("Hire HireWindowStage workerObservableList " + employeeList.getWorkerObservableList() + "\n");

            Stage stage = (Stage) hireButton.getScene().getWindow();
            stage.close();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dateOfHirePicker.setValue(LocalDate.now());
    }

    private Boolean checkField(TextField field, String messageToPrint) {
        Boolean check = true;

        if(field.getText() == null || field.getText().trim().isEmpty()) {
            field.setPromptText(messageToPrint);
            return check = false;
        } else {
            return check;
        }
    }
}
