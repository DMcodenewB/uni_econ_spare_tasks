public class DogToy extends Toy implements StickThrowing,ClimbingTree{
    DogToy(){}

    @Override
    public void giveVoice() {
        System.out.println("Robotyczne hau hau");
    }

    @Override
    public void move() {
        System.out.println("Pies-zabawka chodzi");
    }

    @Override
    public void climbOnTree() {
        System.out.println("Pies-zabawka wchodzi na drzewo");
    }

    @Override
    public void runAfterStick() {
        System.out.println("Pies-zabawka biega za patykiem");
    }
}
