import java.util.ArrayList;
import java.util.List;

class Students extends UniversityMember implements ClubMember {
    protected List<String> courseList;

    Students(String name, int id, String email, List<String> courseList) {
        super(name, id, email);
        this.courseList = new ArrayList<>();
    }

    void attendClass(String courseName) {
        courseList.add(courseName);

        System.out.println("student id: " + id + "," + " Attended Lecture: " + courseName);
    }

    void submitAssignment(String courseName) {
        courseList.add(courseName);
        System.out.println("student id: " + id + "," + " Submit Assignment: " + courseName);
    }

    @Override
    void work() {
        System.out.println("Students' Work: Attend Lecture");
    }

    @Override
    public void joinClub() {
        System.out.println(name + "," + " Weclome to the Club");
    }

    @Override
    public void addEvent() {
        System.out.println(name + " Attended this Event");
    }
}