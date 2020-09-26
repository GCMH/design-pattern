package com.hcf.head.first.design.pattern.chapter06.control;

import com.hcf.head.first.design.pattern.chapter06.command.Command;

public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
