package mvc.dj_view.model;

import mvc.dj_view.model.observer.BPMObserver;
import mvc.dj_view.model.observer.BeatObserver;

public interface BeatModelInterface {
	//---Методы используемые контроллером для управления моделью на оснований действий пользователя---
	//Вызывается после создание экземпляра BeatModel
	void initialize();
  	//Методы запуска и остановки ритма
	void on();
  
	void off();
  	//Метод задает частоту ритма(удары в минуту) Частота изменяется сразу же после его вызова
    void setBPM(int bpm);

    //---Методы при помощи которых представление и контролер получают информацию---
	//---состояния и изменяют свой статус наблюдателя ---
  	//Возвращает текущую частоту или 0 если генератор отключен
	int getBPM();
  	//Оповещаются о каждом ударе
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  	//Оповещаются об изменениях частоты
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
}
