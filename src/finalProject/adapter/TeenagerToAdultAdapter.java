package finalProject.adapter;

public class TeenagerToAdultAdapter extends Adult{
    private Teenager teenager;

    public TeenagerToAdultAdapter(Teenager teenager){
        this.teenager = teenager;
    }

    @Override
    public int getAge() {
        return teenager.getAge() + (18 - teenager.getAge());
    }

    @Override
    public boolean hasID() {
       return teenager.hasBirthCertificate() ? true:false;

    }

    @Override
    public String getName() {
        return teenager.getName();
    }
}
