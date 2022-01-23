import java.util.Random;
import java.util.ArrayList;

public class Sim {

    public static void main(String[] args){
        Random r = new Random();

        //prawdopodobieństwo na to że Person jest Workerem
        double prob_worker = 0.7;
        int array_size = r.nextInt(20)+25; //rozmiar listy testowej

        Person[] persons = new Person[array_size];

        for(int i = 0; i < array_size; i++){
            if(r.nextDouble() < prob_worker){
                persons[i] = new Worker(r.nextInt(47)+18, r.nextInt(20));
            }
            else{
                persons[i] = new Person(r.nextInt(90));
            }
        }

        for(Person p : persons){
            System.out.println(p.toString());
        }

        System.out.println("\nZnajdowanie najstarszych pracowników: ");

        Finder f = new Finder();

        ArrayList<Worker> oldest = f.findOldestWorker(persons);
        for(Worker w : oldest){
            System.out.println(w.toString());
        }
    }
}
