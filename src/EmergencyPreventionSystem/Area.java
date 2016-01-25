
package EmergencyPreventionSystem;

import java.util.IllegalFormatException;
import java.util.Random;

public class Area {
    private Human[][] area;

    public Area(int rowCount, int gridCount) {
        try {
            area = new Human[rowCount][gridCount];
        } catch (IllegalFormatException e) {
            throw new RuntimeException("Illegal argument.");
        }

    }

    public Human[][] getArea() {
        return area.clone();
    }

    public void set(Human[][] data) {
        area = data;
    }

    public void draw() {
        divaded();
        if (area.length != 0) {
            for (int k = 0; k < area[0].length + 1; k++) {
                System.out.print(k + "  ");
            }
            System.out.println();
            for (int i = 0; i < area.length; i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < area[i].length; j++) {
                    area[i][j].print();
                }
                System.out.println();
            }
        } else return;
        divaded();
    }

    private void divaded() {
        if (area.length != 0) {
            for (int row = 0; row < area.length + 1; row++) {
                System.out.print("===");
            }
            System.out.println();
        } else return;
    }
    public void generatePeople() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                area[i][j] = new Human(new Random().nextBoolean());
            }
        }
    }
}

