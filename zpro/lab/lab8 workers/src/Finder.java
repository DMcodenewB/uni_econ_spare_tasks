import java.util.ArrayList;

public class Finder {

    ArrayList<Worker> findOldestWorker(Person [] tab){
        ArrayList<Worker> workers = new ArrayList<Worker>();
        ArrayList<Worker> oldest = new ArrayList<Worker>();
        int maxExperience = -1;
        int experience;
        for(Person p : tab){
            if(p instanceof Worker){
                workers.add((Worker) p);
                experience = ((Worker) p).getExperience();
                if(experience > maxExperience){
                    maxExperience = experience;
                }
            }
        }
        for(Worker w : workers){
            if(w.getExperience() == maxExperience){
                oldest.add(w);
            }
        }
        return oldest;
    }
}
