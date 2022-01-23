public class AllPlayer extends Player{

    public void play(File plik){

        if(plik instanceof MovieFile) {
            super.play(plik);
            System.out.println(", rok: " + ((MovieFile) plik).getYear());
        }
        else if(plik instanceof DocumentFile) {
            super.play(plik);
            System.out.println(", rozmiar: " + ((DocumentFile) plik).getSize());
        }
        else if(plik instanceof MusicFile) {
            super.play(plik);
            System.out.print(", tytul piosenki: " + ((MusicFile) plik).getSongTitle());
            if(plik instanceof Mp3File){
                System.out.print(", czas trwania: " + ((Mp3File) plik).getTime());
            }
            System.out.println();
        }
        else System.out.println("Niewlasciwy typ pliku, podano " + plik.getClass().getName() + ", oczekiwano jednego z: {MovieFile, DocumentReader, MusicFile}");
    }
}
