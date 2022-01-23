public class Bak {
    private double pojemnosc;
    private double iloscPaliwa;

    public Bak(){
        this.pojemnosc = 20.0;
        this.iloscPaliwa = 10.0;
    }
    public Bak(double pojemnosc){
        this.pojemnosc = pojemnosc;
        this.iloscPaliwa = pojemnosc/2.0;
    }

    protected void tankuj(double ilosc){
        if (iloscPaliwa+ilosc > pojemnosc){
            double reszta = pojemnosc - iloscPaliwa;
            setIloscPaliwa(pojemnosc);
            System.out.println("Bak pełny, dolano " + reszta + " litrów paliwa");
        }
        else{
            setIloscPaliwa(ilosc+iloscPaliwa);
            System.out.println("Zatankowano " + ilosc + " litrów, stan baku: " + getIloscPaliwa() + " litrów.");
        }
    }

    private void setIloscPaliwa(double iloscPaliwa){
        this.iloscPaliwa = iloscPaliwa;
    }
    protected double getIloscPaliwa(){
        return this.iloscPaliwa;
    }
}
