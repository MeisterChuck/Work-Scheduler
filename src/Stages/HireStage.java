package Stages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HireStage extends Stage{
    private Parent root;

    public HireStage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/Windows/HireWindow.fxml"));

        this.setTitle("Hire");
        this.setScene(new Scene(root));
        //this.setResizable(false);
        this.show();
    }
}
