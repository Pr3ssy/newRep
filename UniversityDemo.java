package Assignment_2;

public class UniversityDemo {
    public static void main(String[] args) {
        Person person = new Person("Oluwakamiye P. Adenle", "22216003", 20);
        person.describe();

        Staff staff = new Staff("ITC", "Precious Adenle", "22216001", 24);
        staff.describe();

        Student student = new Student("Cs", 3, "Clara", "22216003", 20);
        student.describe();

        Proffessor prof = new Proffessor("Full-Stack Dev", "web programming", "Grace Adenle", "2221600", 24, "SITC");
        prof.describe();

        AdminStaff AS = new AdminStaff("SITC-HOD", "Information System", "Pendo Adenle", "222222222", 28);
        AS.describe();

        Undergraduate ug = new Undergraduate("Oluwakamiye P. Adenle", "22216003", 20, "Computer Science", 3);
        ug.describe();

        Graduate grad = new Graduate("Quantom Computing", "Pressy", "2222111", 30);
        grad.describe();

    }
}
