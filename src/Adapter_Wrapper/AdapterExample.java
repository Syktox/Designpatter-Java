package Adapter_Wrapper;


interface MediaPlayer {
    void play(String audioType, String fileName);
}

class SimpleMediaPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing anb " + audioType + " (" + fileName + ") on a SimpleMediaPlayer!");
    }
}

class AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(AdvancedMediaPlayer advancedMusicPlayer){
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}


class Stereo  {
    private final MediaPlayer player;

    Stereo(MediaPlayer player) {
        this.player = player;
    }

    public void playAwesomeMusic() {
        player.play("mp4", "alle_meine_entchen.mp4");
    }
}


public class AdapterExample {
    public static void main(String[] args) {
        Stereo s = new Stereo(new SimpleMediaPlayer());
        Stereo s2 = new Stereo(new MediaAdapter(new AdvancedMediaPlayer()));
        s.playAwesomeMusic();
        s2.playAwesomeMusic();
    }
}
