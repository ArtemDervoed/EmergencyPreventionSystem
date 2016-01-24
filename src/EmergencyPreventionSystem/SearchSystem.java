package EmergencyPreventionSystem;


public class SearchSystem {
    public Locator getLocator() {
        return locator;
    }

    public void setLocator(Locator locator) {
        this.locator = locator;
    }

    int test;
    Locator locator;
    Area area;

    public SearchSystem(Area input) {
        locator = new Locator();
        area = input;
        test = 0;
    }

    public int start() {
        int result = 1;
        int danger = 0;
        for (int i = 1; i < area.get().length; i++) {
            for (int j = 0; j < area.get()[0].length; j++) {
                if (area.get()[i][j].getPeople() == "|x|") {
                    count(i, j);
                    locator.dangerSort(test);
                    test = 0;
                    result++;
                }
            }
        }
        return result;
    }
    private void count(int i, int j) {
        if (i < area.get().length && j < area.get()[0].length) {
            if (area.get()[i][j].getPeople() != "|x|") {
                return;
            }
            test++;
            area.get()[i][j].setPeople("|-|");
            if (i < area.get().length) {
                count(i + 1, j);
            }
            if (i > 0) {
                count(i - 1, j);
            }
            if (j < area.get()[0].length) {

                count(i, j + 1);
            }
            if (j > 0) {
                count(i, j - 1);
            }
        }
    }

    private static boolean isEmpty(Human[][] inData) {
        for (int i = 0; i < inData.length; i++) {
            for (int j = 0; j < inData[0].length; j++) {
                if (inData[i][j].getPeople() == "|-|") {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static void delete(Human vertex) {
        vertex.setCheck(true);
        vertex.setPeople("|-|");
    }

    private static boolean inVertex(Human vertex) {
        if (vertex.getPeople() == "|x|") {
            return true;
        } else {
            return false;
        }

    }

}
