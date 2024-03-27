import java.util.ArrayList;
import java.util.List;

class AdministrativeStaff extends UniversityMember implements Advisable {
    List<String> department;

    AdministrativeStaff(String name, int id, String email, List<String> department) {
        super(name, id, email);
        this.department = new ArrayList<>();

    }

    void organizeEvent(String dep) {
        department.add(dep);
        System.out.println("Event for " + dep);
    }

    void manageBudget() {
        System.out.println("Amount: D20,000: ");
    }

    @Override
    public void giveAdvice() {
        System.out.println(
                "Advice: As a member of the Administrative team, you're to keep records of events from each department in the University");

    }

    @Override
    void work() {
        System.out.println("Work: Managing.");
    }
}
