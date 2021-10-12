public class Main {

    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();

        stud1.setImie("Dawid");
        stud2.setImie("Maciej");
        stud3.setImie("Błażej");

        stud1.setId("123445");
        stud2.setId("123446");
        stud3.setId("123447");

        stud1.oStudencie();
        stud2.oStudencie();
        stud3.oStudencie();

        stud1.setSrednia(4.6);
        stud2.setSrednia(5.1);

        double sr1 = stud1.getSrednia();
        double sr2 = stud2.getSrednia();

        if(sr1 > sr2){
            System.out.println("Student 1 ma wyzsza srednia");
        }else if(sr1 == sr2){
            System.out.println("Student 1 i Student 2 maja taka sama srednia");
        }else{
            System.out.println("Student 2 ma wyzsza srednia");
        }
    }
}
