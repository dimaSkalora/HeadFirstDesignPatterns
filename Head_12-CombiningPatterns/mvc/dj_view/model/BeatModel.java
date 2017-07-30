package mvc.dj_view.model;
  
import mvc.dj_view.model.observer.BPMObserver;
import mvc.dj_view.model.observer.BeatObserver;

import javax.sound.midi.*;
import java.util.*;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    //Генератор ритма
	Sequencer sequencer;
	ArrayList<BeatObserver> beatObservers = new ArrayList();
	ArrayList<BPMObserver> bpmObservers = new ArrayList();
    int bpm = 90;
    Sequence sequence;
    Track track;

    //Настраивает генератор и готовит музыку для воспроизведения
    @Override
	public void initialize() {
        setUpMidi();
        buildTrackAndStart();
	}

	//Запускает генератор и устанавливает частоту по умолчанию(90 ВРМ)
	@Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    //Останавливает генератор и задает частоту равной 0
	@Override
    public void off() {
		setBPM(0);
		sequencer.stop();
    }

    //Используется контроллерпом для управления ритмом. Он выполняет три операции
	@Override
    public void setBPM(int bpm) {
		this.bpm = bpm;
		//Запрос к генератору на изменение частоты
		sequencer.setTempoInBPM(getBPM());
		//Оповещение всех ВРМ-наблюдателей об изменение частоты
		notifyBPMObservers();
    }

	@Override
	public int getBPM() {
		return bpm;
	}

	//Оповещает всех наблюдателей BeatObserver
	void beatEvent() {
		notifyBeatObservers();
	}

	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}


	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}
	@Override
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}


	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}

	@Override
	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}


	@Override
	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}


    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
			beatEvent();
        	sequencer.start();
        	setBPM(getBPM());
        }
    }

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch(Exception e) {
				e.printStackTrace();
		}
    } 

     public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};
    
        sequence.deleteTrack(null);
        track = sequence.createTrack();

      	makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));      
	 	try {
			sequencer.setSequence(sequence);                    
		} catch(Exception e) {
			e.printStackTrace();
		}
    } 
            
    public void makeTracks(int[] list) {        
       
       for (int i = 0; i < list.length; i++) {
          int key = list[i];

          if (key != 0) {
             track.add(makeEvent(144,9,key, 100, i));
             track.add(makeEvent(128,9,key, 100, i+1));
          }
       }
    }
        
    public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
            
        } catch(Exception e) {
			e.printStackTrace(); 
		}
        return event;
    }
}
