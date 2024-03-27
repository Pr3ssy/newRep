abstract class UniversityMember {
    protected String name;
    protected int id;
    protected String email;

    UniversityMember(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    void login() {
        System.out.println("Log in with Email : " + email);
    }

    abstract void work();
}
