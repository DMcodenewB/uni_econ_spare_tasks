public class MainClass {

    public static void main(String[] args){
        Laptop lap = new Laptop(new Os());

        lap.turnOn();
        lap.turnOff();
        lap.saveOnDisc();
        System.out.println();

        lap.setSystem(new Linux());
        lap.turnOn();
        lap.turnOff();
        lap.saveOnDisc();
        System.out.println();

        lap.setSystem(new Windows());
        lap.turnOn();
        lap.turnOff();
        lap.saveOnDisc();
    }
}
