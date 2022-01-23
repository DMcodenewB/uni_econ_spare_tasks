public class Cat extends Animal implements CatchingMouse, ClimbingTree{

    Cat(){}

    @Override
    public void giveVoice() {
        System.out.println("Miau miau");
    }

    @Override
    public void move() {
        System.out.println("Kot chodzi");
    }

    @Override
    public void catchMouse() {
        System.out.println("Kot łapie mysz");
    }

    @Override
    public void climbOnTree() {
        System.out.println("Kot sie wspina");
    }
}
