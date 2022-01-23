public class Student {
    private String imie;
    private String id;
    private double srednia;

    String getImie() {
        return imie;
    }

    void setImie(String imie) {
        this.imie = imie;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    double getSrednia(){
        return srednia;
    }

    void setSrednia(double srednia){
        if(srednia >= 2.0 && srednia <= 5.0) {
            this.srednia = srednia;
        }else{
            System.out.println("Podaj srednia pomiedzy 2.0 a 5.0!");
        }
    }

    void oStudencie(){
        System.out.println("Imie: " + imie + ",\tID: " + id);
    }
}
