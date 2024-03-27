package Assignment_2;

public class Undergraduate extends Student {
    public Undergraduate(String name, String id, int age, String major, int year) {
        super(major, year, name, id, age);

    }

    @Override
    public void describe() {
        System.out.println("Undergraduate Student" + "," + " " + major + "," + " Year: " + year);
        super.describe();// printed under sout
    }
}
