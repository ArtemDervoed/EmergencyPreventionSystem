
package emergencypreventionsystem;

public class Area {
    private String[][] field;

    public Area(int countRow, int countGrid) {
        field = new String[countRow][countGrid];
        clear(field);
    }

    public void clear(String[][] area) {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                field[i][j] = "|-|";
            }
        }
    }

    public void killPeople(int x, int y) {
        if (field[x][y] == new Human().getPeople()) {
            field[x][y] = "|-|";
        }
    }

    public String[][] getAllField() {
        return field.clone();
    }

    public String getSubject(int x, int y) throws ArrayIndexOutOfBoundsException {
        try {
            return field[x][y];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Координаты вне поля");
        }
        return field[0][0];
    }

    public void setSubject(Human people, int x, int y) {
        field[x][y] = people.getPeople();
    }

    public int getCountRow() {
        return field.length;
    }

    public int getCountGrid() {
        return field[0].length;
    }

}

