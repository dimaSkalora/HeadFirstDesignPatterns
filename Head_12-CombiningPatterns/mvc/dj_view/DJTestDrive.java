package mvc.dj_view;

import mvc.dj_view.controller.BeatController;
import mvc.dj_view.controller.ControllerInterface;
import mvc.dj_view.model.BeatModel;
import mvc.dj_view.model.BeatModelInterface;

//MVC DJ
public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
