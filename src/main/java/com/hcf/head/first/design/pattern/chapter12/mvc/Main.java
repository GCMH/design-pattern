package com.hcf.head.first.design.pattern.chapter12.mvc;

import com.hcf.head.first.design.pattern.chapter12.mvc.control.BeatController;
import com.hcf.head.first.design.pattern.chapter12.mvc.control.ControllerInterface;
import com.hcf.head.first.design.pattern.chapter12.mvc.model.BeatModel;
import com.hcf.head.first.design.pattern.chapter12.mvc.model.BeatModelInterface;

public class Main {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        model.init();
        ControllerInterface controller = new BeatController(model);
    }
}
