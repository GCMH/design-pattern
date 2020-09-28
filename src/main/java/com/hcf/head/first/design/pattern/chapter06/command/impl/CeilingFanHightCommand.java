package com.hcf.head.first.design.pattern.chapter06.command.impl;

import com.hcf.head.first.design.pattern.chapter06.command.Command;
import com.hcf.head.first.design.pattern.chapter06.entity.CeilingFan;

public class CeilingFanHightCommand implements Command {

    private CeilingFan ceilingFan;

    private int preSpeed;

    public CeilingFanHightCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.hight();
    }

    @Override
    public void undo() {
        switch (preSpeed) {
            case CeilingFan.HIGHT:
                ceilingFan.hight();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.log();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
            default:
                throw new IllegalArgumentException("错误");
        }
    }
}
