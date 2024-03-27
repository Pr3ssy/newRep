import java.util.ArrayList;
import java.util.List;

class Professors extends UniversityMember implements Advisable {
    protected List<String> teachingCourse;

    Professors(String name, int id, String email, List<String> teachingCourse) {
        super(name, id, email);
        this.teachingCourse = new ArrayList<>();
    }

    void giveLecture(String courseName) {
        teachingCourse.add(courseName);
        System.out.println("Lecturing:  " + courseName);
    }

    void gradeAssignment() {
        System.out.println(name + "," + " student id " + id + "," + " Check Portal for the Assignment grade");
    }

    @Override
    public void giveAdvice() {
        System.out.println(
                "Advice: As a lecturer, make sure to complete at least 75% of the course outline, and make sure the delivering is well delievered and students are able to understand the lecture");
    }

    @Override
    void work() {
        System.out.println("Lecturer's Work: Lecture");
    }
}
