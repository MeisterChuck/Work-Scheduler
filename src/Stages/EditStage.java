package Stages;

import Data.EmployeeList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class EditStage extends Stage{
    private Parent root;
    EmployeeList employeeList = EmployeeList.getInstance();


    public EditStage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Windows/EditWindow.fxml"));

        this.setTitle("Edit");
        this.setScene(new Scene(root));
        //this.setResizable(false);
        this.show();
    }
}
