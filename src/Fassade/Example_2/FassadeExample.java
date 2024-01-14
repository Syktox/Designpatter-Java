package Fassade.Example_2;

class Playlist {
    public void play() {
        // Code zum Starten der Wiedergabe
    }
    public void stop() {
        // Code zum Stoppen der Wiedergabe
    }
    public void nextTrack() {
        // Code zum Wechseln zum nächsten Track
    }
    // weitere Methoden
}
class Equalizer {
    public void setBass(int level) {
        // Code zum Einstellen des Basspegels
    }
    public void setTreble(int level) {
        // Code zum Einstellen des Höhenpegels
    }
    // weitere Methoden
}
class Lautstaerkeregler {
    public void setVolume(int level) {
        // Code zum Einstellen der Lautstärke
    }
    // weitere Methoden
}
class MusikspielerFassade {
    private Playlist playlist;
    private Equalizer equalizer;
    private Lautstaerkeregler volume;
    public MusikspielerFassade(Playlist playlist, Equalizer equalizer, Lautstaerkeregler volume) {
        this.playlist = playlist;
        this.equalizer = equalizer;
        this.volume = volume;
    }
    public void play() {
        playlist.play();
    }
    public void stop() {
        playlist.stop();
    }
    public void setRockMusicMode() {
        equalizer.setBass(50);
        equalizer.setTreble(60);
        volume.setVolume(100);
    }
    public void setClassicMusicMode() {
        equalizer.setBass(20);
        equalizer.setTreble(50);
        volume.setVolume(100);
    }
}
public class FassadeExample {
    public static void main(String[] args) {
        MusikspielerFassade musikspieler = new MusikspielerFassade(new Playlist(), new Equalizer(), new Lautstaerkeregler());
    }
}
