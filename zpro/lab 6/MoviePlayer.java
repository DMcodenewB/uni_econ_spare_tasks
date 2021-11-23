public class MoviePlayer extends Player{

    public void play(File plik){

        if(plik instanceof MovieFile) {
            super.play(plik);
            System.out.println(", rok: " + ((MovieFile) plik).getYear());
        }
        else System.out.println("Niewlasciwy format pliku, podano " + plik.getClass().getName() + ", oczekiwano MovieFile");
    }
}
