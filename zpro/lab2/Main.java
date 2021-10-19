public class Main {

    public static void main(String[] args){
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza("Margeritha", 25, 35);
        Box b1 = new Box();
        Box b2 = new Box(true);

        p1.setNazwa("Vesuvia");
        p1.setCena(27);

        b1.setPizza(p1);
        b2.setPizza(p2);

        p1=null;
        p2=null;

        p1= b1.getPizza();
        b1.setPizza(b2.getPizza());
        b2.setPizza(p1);
        p1 = null;
    }

}
