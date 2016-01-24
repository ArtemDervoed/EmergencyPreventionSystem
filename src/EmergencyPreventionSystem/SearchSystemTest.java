package EmergencyPreventionSystem;

import org.junit.*;



public class SearchSystemTest  {

    @Test
    public void testStart() throws Exception {

    }
    @Test
    public void testEmpty()  {
       Area area = new Area(5,6);
        for (int i = 0; i < area.get().length; i++) {
            for (int j = 0; j < area.get()[i].length; j++) {
                area.get()[i][j].setPeople("|-|");
            }
        }

    }
}