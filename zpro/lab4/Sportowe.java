public class Sportowe extends AutoTerenowe{
    private String numer;
    private CB radio;

    public Sportowe(){
        super();
    }

    public Sportowe(String model, Silnik s, Turbo t, String numer, CB radio){
        super(model, s, t);
        this.numer = numer;
        this.radio = radio;
    }
}
