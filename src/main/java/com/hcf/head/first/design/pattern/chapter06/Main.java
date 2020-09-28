package com.hcf.head.first.design.pattern.chapter06;

import com.hcf.head.first.design.pattern.chapter06.command.Command;
import com.hcf.head.first.design.pattern.chapter06.command.impl.*;
import com.hcf.head.first.design.pattern.chapter06.control.RemoteControl;
import com.hcf.head.first.design.pattern.chapter06.entity.CeilingFan;
import com.hcf.head.first.design.pattern.chapter06.entity.Light;
import com.hcf.head.first.design.pattern.chapter06.entity.Stereo;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command onLight = new LightOnCommand(light);
        Command offLight = new LightOffCommand(light);
        remoteControl.setCommand(0, onLight, offLight);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undo();


        Stereo stereo = new Stereo();
        Command onStereo = new StereoOnWithCDCommand(stereo);
        Command offStereo = new StereoOffWithCDCommand(stereo);
        remoteControl.setCommand(1, onStereo, offStereo);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undo();

        CeilingFan ceilingFan = new CeilingFan();
        Command celingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command celingFanHgihtCommand = new CeilingFanHightCommand(ceilingFan);
        remoteControl.setCommand(2, celingFanHgihtCommand, celingFanOffCommand);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undo();


        Command[] onCommands = {onLight, onStereo};
        Command[] offCommands = {offLight, offStereo};

        Command ons = new MacroCommand(onCommands);
        Command offs = new MacroCommand(offCommands);

        remoteControl.setCommand(3, ons, offs);

        remoteControl.onButtonWasPushed(3);
        remoteControl.undo();

    }
}
