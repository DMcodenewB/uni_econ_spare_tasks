import java.util.ArrayList;

public class WeatherStation implements Observable {

    private ArrayList<Observer> observers;
    private int temp;

    WeatherStation(){
        this.observers = new ArrayList<>();
    }

    void setTemperature(int temp){
        this.temp = temp;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        if(observers.contains(o)) observers.remove(o);
        else System.out.println("No Observer in list!");
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temp);
        }
    }
}
