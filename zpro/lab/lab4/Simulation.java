public class Simulation {
    public static void main(String[] args) {
        Pojazd p1 = new Pojazd();
        Pojazd p2 = new Pojazd("rower");

        Auto a1 = new Auto();
        Silnik s = new Silnik();
        Auto a2 = new Auto("fiat", s);

        Turbo t1 = new Turbo();
        Silnik s2 = new Silnik();
        AutoTerenowe a3 = new AutoTerenowe();
    }
}
