package lab3.challenge6Builder;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("Alex")
                .setDrivingLicense(true)
                .setUniversity("GAD").build();
        System.out.println("Person{" +
                "name='" + p1.getName() + '\'' +
                ", job='" + p1.getJob() + '\'' +
                ", university='" + p1.getUniversity() + '\'' +
                ", drivingLicense=" + p1.hasDrivingLicense() +
                ", isMarried=" + p1.isMarried() +
                '}');
    }
}
