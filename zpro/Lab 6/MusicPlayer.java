public class MusicPlayer extends Player{

    @Override
    public void play(File plik){

        if(plik instanceof MusicFile) {
            super.play(plik);
            System.out.print(", tytul piosenki: " + ((MusicFile) plik).getSongTitle());
            if(plik instanceof Mp3File){
                System.out.print(", czas trwania: " + ((Mp3File) plik).getTime());
            }
            System.out.println();
        }
        else System.out.println("Niewlasciwy format pliku, podano " + plik.getClass().getName() + ", oczekiwano MusicFile");
    }

}
