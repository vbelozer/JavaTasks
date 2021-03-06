package main;

import main.abstracts.Media;
import main.interfaces.IPlayable;

public class Video extends Media implements IPlayable {

    private boolean soundOn;

    public Video(String author, String date, String message, PostTypes type, boolean soundOn) {
        super(author, date, message, type);
        this.extensions = new String[]{"avi", "mov", "mpg"};
        this.soundOn = soundOn;
    }

    public boolean getSoundOn() {
        return soundOn;
    }

    public void changeSoundToOff() {
        if (getSoundOn()) {
            soundOn = false;
            System.out.println("Sound was deactivated for " + this.getMessage());
        }
    }

    @Override
    public String[] getExtensions() {
        return extensions;
    }

    @Override
    public int getMaxRecordSize() {
        return this.maxSize + 70;
    }

    public void play() {
        System.out.println("Play: " + getExtensions());
    }
}
