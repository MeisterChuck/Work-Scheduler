package Stages;

import Data.EmployeeList;
import Worker.Worker;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainStage extends ChangeStage {

    public MainStage(String stageAddress, String stageName) throws IOException {
        super(stageAddress, stageName);
        super.setMinHeight(430);
        super.setMinWidth(800);
    }
}
