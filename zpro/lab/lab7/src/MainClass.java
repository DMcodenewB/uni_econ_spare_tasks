import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Fish());

        animals.add(new DogToy());
        animals.add(new CatToy());
        animals.add(new FishToy());


        for(Animal an : animals){
            System.out.println("Obiekt klasy " + an.getClass().getName() + ":");
            an.giveVoice();
            an.move();
            System.out.println();
        }
        System.out.println("=============\n");

        Laptop l = new Laptop(new Window());
        l.turnOn();
        l.turnOff();
        l.saveOnDisc();

        l.setSystem(new Linux());
        l.turnOn();
        l.turnOff();

        l.setSystem(new Os());
        System.out.println("System: " + l.getSystem().getClass().getName());
        l.saveOnDisc();
    }
}
