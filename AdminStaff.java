package Assignment_2;

public class AdminStaff extends Staff {
    String role;

    public AdminStaff(String role, String department, String name, String id, int age) {
        super(department, name, id, age);
        this.role = role;
    }

    @Override
    public void describe() {

        System.out.println("Role: " + role);
        super.describe();// printed twice (2) under sout and this info
    }
}
