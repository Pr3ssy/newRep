import java.util.ArrayList;
import java.util.List;

public class TesterClass {
    public static void main(String[] args) {

        List<String> courses = new ArrayList<>();
        courses.add("Advance Programing");
        courses.add("Automata and Language");
        courses.add("Computational Math");
        courses.add("Internet and Web 2");
        courses.add("Advance Programing");
        courses.add("Computer Logic and Distric Language");
        courses.add("DSA");

        System.out.println("STUDENTS");
        Students student = new Students("Oluwakamiye p. Adenle", 22216003, "oa22216003@utg.edu.gm",
                courses);

        student.login();
        student.attendClass("0");
        student.submitAssignment("DSA");
        student.work();
        student.joinClub();
        student.addEvent();

        System.out.println();
        System.out.println("PROFESSORS");

        Professors proffessor = new Professors("Precious Adenle", 22211111, "pl293933@utg.edu.gm", courses);
        proffessor.login();
        proffessor.giveLecture("Advance Programming");
        proffessor.gradeAssignment();
        proffessor.giveAdvice();
        proffessor.work();

        System.out.println();
        System.out.println("ADMINISTRATIVE STAFFS");

        List<String> dep = new ArrayList<>();
        dep.add("ITC");
        dep.add("ART & SCIENCE");
        dep.add("EDUCATION");
        dep.add("BUSINESS PUBLIC ADMIN");
        dep.add("LAW");
        dep.add("JOURNALISM");
        dep.add("MEDCINE");

        AdministrativeStaff admin = new AdministrativeStaff("Grace", 11111110, "jdj029@utg.edu.gm", dep);
        admin.login();
        admin.organizeEvent("ITC");
        admin.manageBudget();
        admin.giveAdvice();
        admin.work();

        System.out.println();
        System.out.println("CLUBS");

        ArrayList<String> name = new ArrayList<>();
        name.add("robotics");
        name.add("coding");
        name.add("Drama");
        name.add("Basktball");
        name.add("Art");
        name.add("Math");
        name.add("Science");

        Club club = new Club("Coding", name);
        club.hostEvent();
        club.addMember("Goodnews");
        club.setname("BascketBall ");
    }
}
