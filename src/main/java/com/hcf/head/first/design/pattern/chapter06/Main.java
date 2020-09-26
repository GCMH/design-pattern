package com.hcf.head.first.design.pattern.chapter06;

import com.hcf.head.first.design.pattern.chapter06.command.Command;
import com.hcf.head.first.design.pattern.chapter06.command.impl.LightOffCommand;
import com.hcf.head.first.design.pattern.chapter06.command.impl.LightOnCommand;
import com.hcf.head.first.design.pattern.chapter06.command.impl.StereoOffWithCDCommand;
import com.hcf.head.first.design.pattern.chapter06.command.impl.StereoOnWithCDCommand;
import com.hcf.head.first.design.pattern.chapter06.control.RemoteControl;
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
    }
}
