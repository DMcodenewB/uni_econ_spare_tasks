public class CatToy extends Toy implements ClimbingTree{
    CatToy(){}

    @Override
    public void giveVoice() {
        System.out.println("Robotyczne miau miau");
    }

    @Override
    public void move() {
        System.out.println("Kot-zabawka chodzi");
    }

    @Override
    public void climbOnTree() {
        System.out.println("Kot-zabawka wspina się na drzewo");
    }
}
