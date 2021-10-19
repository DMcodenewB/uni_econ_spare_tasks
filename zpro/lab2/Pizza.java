public class Pizza {

    private String nazwa;
    private int cena;
    private int size;

    public Pizza(){
        this.size = 30;
    }
    public Pizza(String nazwa, int cena, int size){
        this.nazwa = nazwa;
        this.cena = cena;
        this.size = size;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }
}
