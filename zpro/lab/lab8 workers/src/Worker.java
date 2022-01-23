public class Worker extends Person{

    private int experience; //lata pracy

    Worker(){}
    Worker(int age, int experience){
        super(age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Worker: " +
                "age = " + getAge() +
                ", experience = " + experience;
    }
}
