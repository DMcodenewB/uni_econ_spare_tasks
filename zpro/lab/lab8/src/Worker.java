public class Worker extends Person {
    String experience;

    Worker(){
        super();
    }
    Worker(int wiek, String experience){
        super(wiek);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Worker of age " + wiek +
                ", experience = " + experience;
    }
}
