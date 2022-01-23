public class Auto
{
    //samochód domyślnie jedzie z prędkością 50km/h

    private Silnik silnik;
    private Bak bak;

    public Auto(){
        this.silnik = new Silnik();
        this.bak = new Bak();
        System.out.println("Samochód jedzie z prędkością 50km/h");
    }
    public Auto(Silnik silnik, Bak bak){
        this.silnik = silnik;
        this.bak = bak;
        System.out.println("Samochód jedzie z prędkością 50km/h");
    }

    public void zatankuj(double ilosc){
        bak.tankuj(ilosc);
    }

    public void dystans(){
        double zuzycie = silnik.getZuzyciePaliwa(); //[litry/h]
        double predkosc = 50;
        double zasieg = (bak.getIloscPaliwa()/zuzycie)*predkosc; //[(litry/(litry/h))*km/h] = [km]
        System.out.println("W baku jest " + bak.getIloscPaliwa() + " litrów, silnik ma zużycie " + zuzycie + " litrów/h");
        System.out.println("Zasięg samochodu wynosi " + zasieg + " km");
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public Bak getBak() {
        return bak;
    }

}


