public class Warrior extends Figure{

    int power;
    Sword sword;

    Warrior(int power, Sword sword, String name, int energy){
        super(name, energy);
        this.power = power;
        this.sword = sword;
    }

    public void fight(){
        System.out.println("Warrior walczy");
    }

}
