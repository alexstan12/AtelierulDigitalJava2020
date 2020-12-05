package lab3.challenge4Observer;

public class Student implements Observer {
    private String message;
    private String name;
    private ObservedSubject teacher;

    public Student(String name){
        this.name = name;

    }

    public void update(String message){
        this.message = message;
        System.out.println("Student " + this.name + " learned about " + this.message);
    }

    public void listenTo(ObservedSubject teacher){
        this.teacher = teacher;
        teacher.register(this);
    }

}
