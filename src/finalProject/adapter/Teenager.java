package finalProject.adapter;

public class Teenager {
    private int age;
    private boolean birthCertificate;
    private String name;
    public Teenager(int age, String name) {
        this.age = age;
        this.birthCertificate = true;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public boolean hasBirthCertificate() {
        return birthCertificate;
    }

    public String getName() {
        return name;
    }
}
