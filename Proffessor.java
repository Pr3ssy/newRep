package Assignment_2;

public class Proffessor extends Staff {
    String specialization;
    String courseTaught;

    public Proffessor(String specialization, String courseTaught, String name, String id, int age, String department) {
        super(department, name, id, age);
        this.specialization = specialization;
        this.courseTaught = courseTaught;
    }

    @Override
    public void describe() {
        System.out.println("Specialization: " + specialization + "," + " Course Taught: " + courseTaught);
        super.describe();// printed twice (2) under sout and this info
    }
}
