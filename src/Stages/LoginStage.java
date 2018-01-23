package Stages;

import java.io.IOException;

public class LoginStage extends ChangeStage {

    public LoginStage(String stageAddress, String stageName) throws IOException {
        super(stageAddress, stageName);
        super.setResizable(false);
    }
}
