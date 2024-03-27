package Assignment_2;

public class Staff extends Person {
    String department;

    public Staff(String department, String name, String id, int age) {
        super(name, id, age);
        this.department = department;
    }

    @Override
    public void describe() {
        System.out.println("Department: " + department);
        super.describe(); // printed under sout

    }

}
