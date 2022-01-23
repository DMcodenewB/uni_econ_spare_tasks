public class DocumentReader extends Player{

    public void play(File plik){

        if(plik instanceof DocumentFile) {
            super.play(plik);
            System.out.println(", rozmiar: " + ((DocumentFile) plik).getSize());
        }
        else System.out.println("Niewlasciwy format pliku, podano " + plik.getClass().getName() + ", oczekiwano DocumentFile");
    }
}
