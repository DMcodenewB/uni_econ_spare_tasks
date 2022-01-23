public class Person {

    private int age;

    Person(){}
    Person(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "age = " + age;
    }
}
