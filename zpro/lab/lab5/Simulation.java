public class Simulation {

    public static void main(String[] args) {
        Archer a1 = new Archer(new Arch(), new Arrow(), 5, new Sword(), "Adam", 0);
        Singer s1 = new Singer("Klaudiusz", 10);

        s1.makePoem();
        a1.shot();
        a1.fight();
    }
}
