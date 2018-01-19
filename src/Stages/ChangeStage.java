package Stages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextFormatter;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class ChangeStage extends Stage{
    private Parent root;

    public ChangeStage(String stageAddress, String stageName) throws IOException{
        root = FXMLLoader.load(getClass().getResource(stageAddress));

        this.setTitle(stageName);
        this.setScene(new Scene(root));
        this.show();
    }
}
