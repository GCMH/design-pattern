package com.hcf.head.first.design.pattern.chapter12.mvc.model;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    private Sequencer sequencer;

    private List<BeatObserver> beatObservers = new ArrayList<>();

    private List<BPMObserver> bpmObservers = new ArrayList<>();

    private Sequence sequence;

    private Track track;

    private int bpm = 90;

    @Override
    public void init() {
        setUpMidi();
        buildTrackAndStart();
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTrack(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));

        try {
            sequencer.setSequence(sequence);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent midiEvent = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            midiEvent = new MidiEvent(a, tick);
        } catch (Exception e) {

        }
        return midiEvent;
    }

    private void makeTrack(int[] trackList) {
        for (int i = 0; i < trackList.length; i++) {
            int key = trackList[i];

            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }


    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int value) {
        this.bpm = value;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    private void notifyBPMObservers() {
        for (BPMObserver bpmObserver : bpmObservers) {
            bpmObserver.updateBPM();
        }
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        beatObservers.add(beatObserver);
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        beatObservers.remove(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver beatObserver) {
        bpmObservers.add(beatObserver);
    }

    @Override
    public void removeObserver(BPMObserver beatObserver) {
        bpmObservers.add(beatObserver);
    }

    @Override
    public void meta(MetaMessage meta) {
        notifyBeatObservers();
    }

    private void notifyBeatObservers() {
        for (BeatObserver beatObserver : beatObservers) {
            beatObserver.updateBPM();
        }
    }
}
