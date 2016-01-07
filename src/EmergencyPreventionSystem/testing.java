package EmergencyPreventionSystem;


public class testing {
    public  static void main(String[]args){

        Area my = new Area(9,7);
        Locator l = new Locator();

        my.setPeople();
        my.draw();
        my.drawStatus();
        System.out.println();
        System.out.println(l.start(my.get()));
    }
}
