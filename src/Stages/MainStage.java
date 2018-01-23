package Stages;

import java.io.IOException;

public class MainStage extends ChangeStage {

    public MainStage(String stageAddress, String stageName) throws IOException {
        super(stageAddress, stageName);
        super.setMinHeight(430);
        super.setMinWidth(800);
    }
}
