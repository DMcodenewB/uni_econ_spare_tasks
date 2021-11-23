public class Player {

    public void play(File plik){
        System.out.print("Nazwa pliku: " + plik.getNazwaPliku() + ", rozszerzenie: " + plik.getExtension());
    }

}
