package src.combine_mvc;

import src.combine_mvc.controller.BeatController;
import src.combine_mvc.controller.ControllerInterface;
import src.combine_mvc.model.BeatModel;
import src.combine_mvc.model.BeatModelInterface;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
