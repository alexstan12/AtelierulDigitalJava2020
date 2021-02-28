package finalProject.adapter;

public class Adult {
    private int age;
    private boolean id;
    private String name;
    public Adult(int age, String name){
        if(age < 18){
            this.age = 18;
        }else{
            this.age = age;
        }
        this.id = true;
        this.name = name;
    }

    public Adult() {
    }

    public int getAge() {
        return age;
    }

    public boolean hasID(){
        return id;
    }

    public String getName() {
        return name;
    }
}
