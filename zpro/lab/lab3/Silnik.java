public class Silnik {

    //domyslna predkosc samochodu to 50km/h

    private double zuzyciePaliwa;    //[litry/h]

    public Silnik(){
        this.zuzyciePaliwa = 3.0;
    }
    public Silnik(double zuzyciePaliwa){
        this.zuzyciePaliwa = zuzyciePaliwa;
    }

    protected double getZuzyciePaliwa(){
        return this.zuzyciePaliwa;
    }

}
