public class Singer extends Poet{
    public Singer(String name, int energy){
        super(name, energy);
    }

    @Override
    public void makePoem(){
        System.out.print("Spiewak wywoluje metode Poety makePoem(): ");
        super.makePoem();
    }
}
