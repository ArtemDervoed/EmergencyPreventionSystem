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

    public boolean getCheck() {
        return checed;
    }

    public void setCheck(boolean in) {
        checed = in;
    }

    public String getPeople() {
        return people;
    }

    public void print() {
        System.out.print(people);
    }
}
