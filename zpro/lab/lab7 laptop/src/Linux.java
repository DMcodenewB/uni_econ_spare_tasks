public class Linux implements OperationSystem{
    @Override
    public void turnOn() {
        System.out.println("Linux się włącza...");
    }

    @Override
    public void turnOff() {
        System.out.println("Linux się wyłącza...");
    }

    @Override
    public void save() {
        System.out.println("Linux zapisuje dane");
    }
}
