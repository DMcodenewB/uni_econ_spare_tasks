public class Auto extends Pojazd{
    private Silnik s;

    public Auto() {
        super();
    }

    public Auto(String model, Silnik s) {
        super(model);
        this.s = s;
    }
}
