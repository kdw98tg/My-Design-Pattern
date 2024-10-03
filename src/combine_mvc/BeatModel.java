package src.combine_mvc;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable {

    private List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    private List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    private int bpm = 90;
    private Thread thread;
    private Clip clip;
    private boolean stop = false;

    @Override
    public void initialize() {
        try {
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
        } catch (Exception ex) {
            System.out.println("Error: Can't load clip");
            System.out.println(ex);
        }
    }

    @Override
    public void on() {
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;
    }

    @Override
    public void setBPM(int _bpm) {
        this.bpm = _bpm;
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver _observer) {
        beatObservers.add(_observer);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    public void notifyBeatObservers() {
        for (BeatObserver beatObserver : beatObservers) {
            ((BeatObserver) beatObserver).updateBeat();
        }
    }

    @Override
    public void registerObserver(BPMObserver _observer) {
        for (BPMObserver bpmObserver : bpmObservers) {
            ((BPMObserver) bpmObserver).updateBPM();
        }
    }

    @Override
    public void removeObserver(BPMObserver _observer) {
        int i = bpmObservers.indexOf(_observer);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

    public void notifyBPMObservers() {
        for (BPMObserver bpmObserver : bpmObservers) {
            bpmObserver.updateBPM();
        }
    }

    @Override
    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000 / getBPM());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    public void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }
}
