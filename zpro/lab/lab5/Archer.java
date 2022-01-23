public class Archer extends Warrior{

    private Arch arch;
    private Arrow arrow;

    public void shot(){
        System.out.println("Archer strzela");
    }
    public Archer(Arch arch, Arrow arrow, int power, Sword sword, String name, int energy){
        super(power, sword, name, energy);
        this.arch = arch;
        this.arrow = arrow;

    }

    @Override
    public void fight(){
        System.out.print("Archer wywoluje metode Warriora fight(): ");
        super.fight();
    }

}
