package soundsystem;

import java.util.List;

import soundsystem.CompactDisc;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void playTrack(int trackNo) {
//        System.out.println("Playing " + title + " by " + artist);
        String track = tracks.get(trackNo);
        System.out.println("-Track: " + track);
    }
}
