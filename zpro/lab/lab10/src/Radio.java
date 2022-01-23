public class Radio implements Observer{

    private int temp;

    @Override
    public void update(int temp) {
        this.temp = temp;
    }

    public void play(){
        System.out.println("Radio gra.");
    }

    public void displayTemp(){
        System.out.println("Temperatura: " + temp + " stopni.");
    }
}
