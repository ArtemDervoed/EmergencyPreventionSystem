package EmergencyPreventionSystem;

public class Locator {
    private int intermediate;
    private int none;
    private int minor;
    private int normal;
    private int major;
    private int critical;

    public Locator() {
        intermediate = 0;
        none = 0;
        minor = 0;
        normal = 0;
        major = 0;
        critical = 0;
    }

    private void dangerSort(int counter) {
        if (counter <= 2) {
            none = counter;
        }
        if (counter > 2 && counter <= 4) {
            minor = counter;
        }
        if (counter > 4 && counter <= 7) {
            normal = counter;
        }
        if (counter > 7 && counter <= 13) {
            major = counter;
        }
        if (counter > 13) {
            critical = counter;
        }
    }

    public int start(Human[][] data) {
        Human[][] worker = data;
        int count = 0;
        int startIndex = 0;
        int endIndex = worker.length;
        for (int i = 0; i < worker.length; i++) {
            for (int j = 0; j < worker[i].length; j++) {
                if ((startIndex <= j) && (endIndex >= j)) {
                    if ((i < worker.length) && (worker[i][j].getPeople() == "|x|")) {
                        count++;
                        startIndex = j;
                    }
                }
            }
        }
        return count;
    }
}

