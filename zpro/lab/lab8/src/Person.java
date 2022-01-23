public class Person {
    int wiek;

    public Person(){}

    public Person(int wiek){
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public String toString(){
        return "Person of age " + wiek;
    }
}
