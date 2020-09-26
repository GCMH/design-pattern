package com.hcf.head.first.design.pattern.chapter06.command.impl;

import com.hcf.head.first.design.pattern.chapter06.entity.Stereo;
import com.hcf.head.first.design.pattern.chapter06.command.Command;

public class StereoOffWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
