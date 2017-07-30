package mvc.heart_view;

import mvc.heart_view.controller.ControllerInterface;
import mvc.heart_view.controller.HeartController;
import mvc.heart_view.model.HeartModel;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
