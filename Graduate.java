package Assignment_2;

public class Graduate extends Student {
    String researchTopic;

    public Graduate(String researchTopic, String name, String id, int age) {
        super(researchTopic, age, name, id, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public void describe() {
        System.out.println("Research topic: " + researchTopic);
        super.describe();// printed under sout

    }
}
