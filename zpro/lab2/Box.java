public class Box {

    private boolean size;
    private Pizza pizza;

    public Box(){
        this.size = false;
    }
    public Box(boolean size) {
        this.size = size;
    }

    public boolean getSize(){
        return size;
    }

    public void setPizza(Pizza p){
        this.pizza = p;
    }
    public Pizza getPizza(){
        return pizza;
    }

}
