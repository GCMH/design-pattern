package com.hcf.head.first.design.pattern.chapter12.mvc.view;

import com.hcf.head.first.design.pattern.chapter12.mvc.control.ControllerInterface;
import com.hcf.head.first.design.pattern.chapter12.mvc.model.BPMObserver;
import com.hcf.head.first.design.pattern.chapter12.mvc.model.BeatModelInterface;
import com.hcf.head.first.design.pattern.chapter12.mvc.model.BeatObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
    private BeatModelInterface model;
    private ControllerInterface controller;
    private JFrame viewFrame;
    private JPanel viewPanel;
    private BeatBar beatBar;
    private JLabel bpmOutputLabel;

    private JFrame controlFrame;
    private JPanel controlPanel;

    private JLabel bpmLabel;
    private JTextField bpmTextField;
    private JButton setBPMButton;
    private JButton increaseBPMButton;
    private JButton decreaseBPMButton;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;

    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));

        controlPanel = new JPanel(new GridLayout(1, 2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJ Control");
        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener((event) -> controller.start());

        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem);
        stopMenuItem.addActionListener((event) -> controller.stop());

        JMenuItem exit = new JMenuItem("Quit");
        exit.addActionListener((event) -> System.exit(0));
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        menu.add(exit);
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
        setBPMButton = new JButton("Set");
        setBPMButton.setSize(new Dimension(10, 40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");
        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

        buttonPanel.add(decreaseBPMButton);
        buttonPanel.add(increaseBPMButton);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);
        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPMButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);
    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disenableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disenableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    public DJView(ControllerInterface collection, BeatModelInterface model) {
        this.controller = collection;
        this.model = model;
        model.registerObserver((BPMObserver) this);
        model.registerObserver((BeatObserver) this);
    }

    public void createView() {
        viewFrame = new JFrame("View");
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100, 80));
        bpmOutputLabel = new JLabel("offLine", SwingConstants.CENTER);

        beatBar = new BeatBar();
        beatBar.setValue(0);

        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);
        viewPanel.add(bpmPanel);

        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
    }

    @Override
    public void updateBPM() {
        int bpm = model.getBPM();
        bpmTextField.setText(String.valueOf(bpm));
        if (bpm == 0) {
            bpmOutputLabel.setText("offline");
        } else {
            bpmOutputLabel.setText("Current BPM:" + model.getBPM());
        }
    }

    public void updateBeat() {
        if (beatBar != null) {
            beatBar.setValue(100);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == setBPMButton) {
            System.out.println("setBPM");
            controller.setBPM(Integer.valueOf(bpmTextField.getText()));
        } else if (e.getSource() == increaseBPMButton) {
            System.out.println("increaseBPM");
            controller.increaseBPM();
        } else if (e.getSource() == decreaseBPMButton) {
            System.out.println("decreaseBPM");
            controller.decreaseBPM();
        }
    }
}
