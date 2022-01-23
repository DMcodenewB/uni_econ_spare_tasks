public class FishToy extends Toy{
    FishToy(){}

    @Override
    public void giveVoice() {
        System.out.println("---beep---");
    }

    @Override
    public void move() {
        System.out.println("Ryba-zabawka pływa");
    }
}
