package com.hcf.head.first.design.pattern.chapter12.mvc.control;

public interface ControllerInterface {

    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
