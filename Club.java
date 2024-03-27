import java.util.ArrayList;
import java.util.List;

class Club {
    protected String name; // club name
    protected List<String> memberList;

    Club(String name, List<String> memberList) {
        this.name = name;
        this.memberList = new ArrayList<>();
    }

    void hostEvent() {
        System.out.println("Event: " + name + " Club");
    }

    // for club
    void setname(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addMember(String memberName) {
        memberList.add(memberName);
        System.out.println(memberName + " is Now a member of " + name + " Club");
    }
}
