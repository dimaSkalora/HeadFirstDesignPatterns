package mvc.dj_view.controller;

import mvc.dj_view.model.BeatModelInterface;
import mvc.dj_view.view.DJView;

public class BeatController implements ControllerInterface {
	//Контролдер получает обьекты модели и представление и связывает их воедино
	BeatModelInterface model;
	DJView view;

	//Контролер получает модель в конструкторе и создает представление
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}

	//Контролер активизирует модель и изменяет пользовательский интерфейс:
	//Команда Start блокируется, а команда Stop становится доступной
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	//Контролер получается текущую частоту от модели,
	//увеличиввает ее на 1 и задает резултат как новое значение частоты
	public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
	}

	//Уменшает частоту на 1
	public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
  	}

  	//Есдли пользщователь ввел произвольную частоту, контролер приказывает модели перейти на новое значение
 	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
