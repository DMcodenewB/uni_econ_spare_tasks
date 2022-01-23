public class SmartWatch implements Observer{

    private int temp;
    @Override
    public void update(int temp) {
        this.temp = temp;
    }

    public void displayTemp(){
        System.out.println("Smartwatch pokazuje temperaturę: " + temp + " stopni.");
    }
}
