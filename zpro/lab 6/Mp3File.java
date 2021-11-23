public class Mp3File extends MusicFile{

    int time;

    Mp3File(String nazwaPliku, String extension, String songTitle, int time){
        super(nazwaPliku, extension, songTitle);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
