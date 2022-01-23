import java.util.ArrayList;
import java.util.Random;

public class Sim {

    public static void main(String[] args){
        Random rand = new Random();

        int number_of_People = rand.nextInt(10)+300;
        int age;
        int experience_index;
        Person[] osoby = new Person[number_of_People];
        String[] experience_tab = {"basic", "average", "good", "expert", "mastermind"};

        for(int i = 0; i < number_of_People; i++){
            age = rand.nextInt(45)+18;
            experience_index = rand.nextInt(experience_tab.length);
            osoby[i] = new Worker(age, experience_tab[experience_index]);
        }

        //wyswietlam osoby z listy
        System.out.println("Array of length: " + number_of_People + "\n");
        for(Person o : osoby){
            System.out.println(o);
        }

        //System.out.println("\nThe oldest one is " + findOldestPerson(osoby));

        Finder f = new Finder();
        ArrayList<Person> oldestWorkers = f.findWorker(osoby);
        System.out.println("\nHere are " + oldestWorkers.size() + " oldest workers: ");
        for(Person p : oldestWorkers){
            System.out.println(p);
        }
    }

    static Person findOldestPerson(Person[] tab){
        Person person = tab[0];
        for(Person o : tab){
            if (person.getWiek() < o.getWiek()){
                person = o;
            }
        }
        return person;
    }
}
