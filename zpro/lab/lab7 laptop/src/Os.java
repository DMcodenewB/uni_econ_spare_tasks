public class Os implements OperationSystem{

    @Override
    public void turnOn() {
        System.out.println("Os się włącza...");
    }

    @Override
    public void turnOff() {
        System.out.println("Os się wyłącza...");
    }

    @Override
    public void save() {
        System.out.println("Os zapisuje dane");
    }
}
