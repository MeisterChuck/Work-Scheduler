package Stages;

import Data.EmployeeList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainStage extends Stage{
    private Parent root;
    EmployeeList employeeList = EmployeeList.getInstance();

    public MainStage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Windows/MainWindow.fxml"));

        this.setTitle("Scheduler");
        this.setScene(new Scene(root));
        this.setMinHeight(430);
        this.setMinWidth(800);
        this.show();
    }
}