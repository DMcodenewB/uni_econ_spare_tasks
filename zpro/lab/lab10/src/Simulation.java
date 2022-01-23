public class Simulation {

    public static void main(String[] args) {
        Radio r1 = new Radio();
        Radio r2 = new Radio();
        SmartWatch s1 = new SmartWatch();

        WeatherStation w = new WeatherStation();
        w.addObserver(r1);
        w.addObserver(r2);
        w.addObserver(s1);
        w.setTemperature(10);

        r1.displayTemp();
        r2.displayTemp();
        s1.displayTemp();

        w.setTemperature(12);

        r1.displayTemp();
        r2.displayTemp();
        s1.displayTemp();
    }
}
