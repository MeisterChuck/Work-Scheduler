package Stages;

import Data.EmployeeList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HireStage extends ChangeStage {

    public HireStage(String stageAddress, String stageName) throws IOException {
        super(stageAddress, stageName);
        super.setResizable(false);
    }
}
