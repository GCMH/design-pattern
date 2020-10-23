package com.hcf.head.first.design.pattern.chapter12.mvc.model;

public interface BeatModelInterface {

    void init();

    void on();

    void off();

    void setBPM(int value);

    int getBPM();

    void registerObserver(BeatObserver beatObserver);
    void removeObserver(BeatObserver beatObserver);

    void registerObserver(BPMObserver beatObserver);
    void removeObserver(BPMObserver beatObserver);
}
