public class Poet extends Figure{
    public void makePoem(){
        System.out.println("Poeta tworzy wiersz");
    }
    Poet(){}
    public Poet(String name, int energy){
        super(name, energy);
    }
}
