public class Dog extends Animal implements StickThrowing{

    Dog(){}

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }

    @Override
    public void move() {
        System.out.println("Pies chodzi");
    }

    @Override
    public void runAfterStick() {
        System.out.println("Pies biega za patykiem");
    }
}
