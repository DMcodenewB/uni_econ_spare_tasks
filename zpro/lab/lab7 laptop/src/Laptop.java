public class Laptop {

    OperationSystem system;

    Laptop(OperationSystem system){
        this.system = system;
    }

    public OperationSystem getSystem() {
        return system;
    }

    public void setSystem(OperationSystem system) {
        this.system = system;
    }

    public void turnOn(){
        system.turnOn();
    }
    public void turnOff(){
        system.turnOff();
    }
    public void saveOnDisc(){
        system.save();
    }

}
