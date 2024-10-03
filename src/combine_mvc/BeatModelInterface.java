package src.combine_mvc;

public interface BeatModelInterface {
    public void initialize();
    public void on();
    public void off();
    public void setBPM(int _bpm);
    public int getBPM();
    public void registerObserver(BeatObserver _observer);
    public void removeObserver(BeatObserver _observer);
    public void registerObserver(BPMObserver _observer);
    public void removeObserver(BPMObserver _observer);
}
