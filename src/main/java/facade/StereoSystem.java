package facade;

import static utils.Messages.printMessage;

public class StereoSystem {
    private String description;
    private String trackTitle;
    private int volume;

    public StereoSystem() {
        this.description = "StereoSystem";
        this.volume = 50;
    }

    void on() {
        printMessage(this.description + " is on");
    }

    void off() {
        printMessage(this.description + " is off");
    }

    void playTrack(String title) {
        this.trackTitle = title;
        printMessage(this.trackTitle + " is playing");
    }

    public void pause() {
        printMessage("Track '" + trackTitle + "' were paused");
    }

    public String getTrackTitle() {
        return ("The current track is: \"" + trackTitle + "\"");
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else this.volume = Math.max(volume, 0);
    }

    public int getVolume() {
        return this.volume;
    }
}
