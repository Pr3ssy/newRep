package Assignment_2;

public class Student extends Person {
    String major;
    int year;

    public Student(String major, int year, String name, String id, int age) {
        super(name, id, age);
        this.major = major;
        this.year = year;
    }

    @Override
    public void describe() {
        System.out.println("Major: " + major + "," + " Year: " + year);
        super.describe(); // printed under sout

    }
}
