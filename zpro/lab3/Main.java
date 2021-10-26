public class Main {

    public static void main(String[] args){
        System.out.println("Auto 1");
        Bak bak1 = new Bak(35);
        Silnik silnik1 = new Silnik(6.0);
        Auto auto1 = new Auto(silnik1, bak1);

        auto1.zatankuj(4);
        auto1.dystans();

        System.out.println("\n=====\nAuto2");

        Auto auto2 = new Auto();
        auto2.zatankuj(5);
        auto2.dystans();

    }

}
