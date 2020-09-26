package com.hcf.head.first.design.pattern.chapter06.command.impl;

import com.hcf.head.first.design.pattern.chapter06.entity.Stereo;
import com.hcf.head.first.design.pattern.chapter06.command.Command;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
