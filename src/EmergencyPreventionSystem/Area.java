
package EmergencyPreventionSystem;

import java.util.Random;

public class Area {
    private Human[][] area;

    public Area(int row, int grid) {
        area = new Human[row][grid];
    }

    public Human[][] get() {
        return area.clone();
    }

    public void draw() {
        for (int k = 0; k < area[0].length + 1; k++) {
            System.out.print("---");
        }
        System.out.println();
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
        for (int k = 0; k < area[0].length + 1; k++) {
            System.out.print("===");
        }
    }

    public void drawStatus() {
        System.out.println();
        System.out.println("1.\tNONE");
        System.out.println("2.\tMINOR");
        System.out.println("3.\tNORMAL");
        System.out.println("4.\tMAJOR");
        System.out.println("5.\tCRITICAL");
        for (int k = 0; k < area[0].length + 1; k++) {
            System.out.print("===");
        }
    }

    public void setPeople() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                area[i][j] = new Human(new Random().nextBoolean());
            }
        }
    }
}

