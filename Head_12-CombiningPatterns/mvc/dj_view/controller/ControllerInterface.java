package mvc.dj_view.controller;

//Контролер
//Методы контролера, которые могут вызыватся представлением
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
}
