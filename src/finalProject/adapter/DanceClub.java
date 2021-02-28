package finalProject.adapter;

public class DanceClub {
    private int ageLimit;

    public DanceClub(int ageLimit){
        this.ageLimit = ageLimit;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public boolean isCustomerOldEnough(Adult adult){
        return this.ageLimit<=adult.getAge() && adult.hasID();
    }

    @Override
    public String toString() {
        return "This DanceClub accepts customers over " +
                "ageLimit=" + ageLimit ;
    }
}
