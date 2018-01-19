package Stages;

import Data.EmployeeList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginStage extends ChangeStage {

    public LoginStage(String stageAddress, String stageName) throws IOException {
        super(stageAddress, stageName);
        super.setResizable(false);
    }
}
