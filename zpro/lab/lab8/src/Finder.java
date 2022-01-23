import java.util.ArrayList;

public class Finder {

    ArrayList<Person> findWorker(Person[] tab){
        int max_age = Integer.MIN_VALUE;
        int wiek;
        ArrayList<Person> oldestWorkers = new ArrayList<>();

        for(Person p : tab){
            wiek = p.getWiek();
            if(p.getWiek() > max_age){
                max_age = wiek;
            }
        }
        for(Person p : tab){
            if(p.getWiek() == max_age){
                oldestWorkers.add(p);
            }
        }
        return oldestWorkers;
    }
}
