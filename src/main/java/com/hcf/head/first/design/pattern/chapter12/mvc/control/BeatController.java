package com.hcf.head.first.design.pattern.chapter12.mvc.control;

import com.hcf.head.first.design.pattern.chapter12.mvc.model.BeatModelInterface;
import com.hcf.head.first.design.pattern.chapter12.mvc.view.DJView;

public class BeatController implements ControllerInterface {

    private BeatModelInterface model;

    private DJView djView;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        this.djView = new DJView(this, model);
        djView.createView();
        djView.createControls();
        djView.enableStartMenuItem();
        djView.disenableStartMenuItem();
        model.init();
    }

    @Override
    public void start() {
        model.on();
        djView.disenableStartMenuItem();
        djView.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        djView.enableStartMenuItem();
        djView.disenableStopMenuItem();
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm) {
        System.out.println("controller: setBPM：" + bpm);
        model.setBPM(bpm);
    }
}
