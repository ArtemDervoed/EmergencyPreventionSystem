package EmergencyPreventionSystem;


public class testing {
    public  static void main(String[]args){

        Area my = new Area(4,9);
        SearchSystem ss = new SearchSystem(my);
        my.setPeople();
        my.draw();
        System.out.println();
       ss.start();
        ss.locator.drawStatus();
        my.draw();
    }
}
