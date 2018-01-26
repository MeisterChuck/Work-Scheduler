package Stages;

import java.io.IOException;

public class EditStage extends ChangeStage{
    public EditStage(String stageAddress, String stageName) throws IOException {
        super(stageAddress, stageName);
        super.setResizable(false);
    }
}
