public class Windows implements OperationSystem{

    @Override
    public void turnOn() {
        System.out.println("Windows się włącza...");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows się wyłącza...");
    }

    @Override
    public void save() {
        System.out.println("Windows zapisuje dane");
    }
}
