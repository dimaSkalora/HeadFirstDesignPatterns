package mvc.heart_view.model;

import mvc.heart_view.model.observer.BPMObserver;
import mvc.heart_view.model.observer.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
