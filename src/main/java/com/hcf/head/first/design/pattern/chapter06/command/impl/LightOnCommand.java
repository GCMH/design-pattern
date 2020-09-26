package com.hcf.head.first.design.pattern.chapter06.command.impl;

import com.hcf.head.first.design.pattern.chapter06.entity.Light;
import com.hcf.head.first.design.pattern.chapter06.command.Command;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
