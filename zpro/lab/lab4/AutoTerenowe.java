public class AutoTerenowe extends Auto {
    private Turbo t;

    public AutoTerenowe(){
        super();
    }
    public AutoTerenowe(String model, Silnik s, Turbo t){
        super(model, s);
        this.t = t;
    }
}
