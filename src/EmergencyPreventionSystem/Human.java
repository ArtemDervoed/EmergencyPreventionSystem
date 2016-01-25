package EmergencyPreventionSystem;

public class Human {
    private String people;
    private boolean checed;
    private boolean isThere;

    public Human(boolean isThere) {
        this.isThere = isThere;
        checed = false;
        if (isThere) {
            people = "|x|";
        } else {
            people = "|-|";
        }
    }
    public void setPeople(String in){
        people = in;
    }
    public String getPeople() {
        return people;
    }
    public void print() {
        System.out.print(people);
    }
}
