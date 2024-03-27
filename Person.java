package Assignment_2;

public class Person {
    String name;
    int age;
    String id;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void describe() {
        System.out.println("Name: " + name + "," + " ID: " + id + "," + " Age: " + age);
    }
}
