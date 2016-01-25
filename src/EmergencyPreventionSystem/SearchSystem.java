package EmergencyPreventionSystem;


public class SearchSystem {
    private int dangerLevel;
    private Locator locator;
    private Area area;
    public SearchSystem(Area input) {
        locator = new Locator();
        area = input;
        dangerLevel = 0;
    }
    public int start() {
        int result = 0;
        for (int row = 0; row < area.getArea().length; row++) {
            for (int grid = 0; grid < area.getArea()[0].length; grid++) {
                if (area.getArea()[row][grid].getPeople() == "|x|") {
                    count(row, grid);
                    locator.dangerSort(dangerLevel);
                    dangerLevel = 0;
                    result++;
                }
            }
        }
        return result;
    }
    private void count(int i, int j) {
        if (i < area.getArea().length && j < area.getArea()[0].length) {
            if (area.getArea()[i][j].getPeople() != "|x|") {
                return;
            }
            dangerLevel++;
            area.getArea()[i][j].setPeople("|-|");
            if (i < area.getArea().length) {
                count(i + 1, j);
            }
            if (i > 0) {
                count(i - 1, j);
            }
            if (j < area.getArea()[0].length) {

                count(i, j + 1);
            }
            if (j > 0) {
                count(i, j - 1);
            }
        }
    }
    public Locator getLocator() {
        return locator;
    }


}
