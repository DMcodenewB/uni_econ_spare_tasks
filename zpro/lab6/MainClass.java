public class MainClass {

    public static void main(String[] args){
        MovieFile movie1 = new MovieFile("Film1", ".avi", (short) 1990);
        DocumentFile doc1 = new DocumentFile("Dokument2", ".txt", 242);
        MusicFile music1 = new MusicFile("Piosenka3", ".flac", "Not Afraid");
        MusicFile music2 = new Mp3File("Piosenka4", ".mp3", "Higher", 250);
        File aFile = new File("plik4", ".rtt");

        MusicPlayer musplayer1 = new MusicPlayer();
        DocumentReader dreader1 = new DocumentReader();
        MoviePlayer movplayer1 = new MoviePlayer();
        AllPlayer aplayer1 = new AllPlayer();

        System.out.println();
        movplayer1.play(movie1);
        movplayer1.play(music1);
        dreader1.play(doc1);
        dreader1.play(movie1);
        musplayer1.play(music1);
        musplayer1.play(doc1);
        musplayer1.play(music2);

        System.out.println();
        aplayer1.play(movie1);
        aplayer1.play(doc1);
        aplayer1.play(music1);
        aplayer1.play(aFile);
        aplayer1.play(music2);
    }
}
