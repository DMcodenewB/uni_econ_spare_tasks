public class Fish extends Animal{

    Fish(){}

    @Override
    public void giveVoice() {
        System.out.println("---");
    }

    @Override
    public void move() {
        System.out.println("Ryba pływa");
    }
}
