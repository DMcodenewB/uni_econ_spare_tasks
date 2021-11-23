public class MusicFile extends File{

    String songTitle;

    MusicFile(String nazwaPliku, String extension, String songTitle){
        super(nazwaPliku, extension);
        this.songTitle = songTitle;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
}
