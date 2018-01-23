package Stages;

import java.io.IOException;

public class HireStage extends ChangeStage {

    public HireStage(String stageAddress, String stageName) throws IOException {
        super(stageAddress, stageName);
        super.setResizable(false);
    }
}
