package WorkerSystem;


import emergencypreventionsystem.Area;
import emergencypreventionsystem.Human;
import emergencypreventionsystem.SearchSystem;

import java.util.Random;

public final class Apparate {
    Area toAnalyzeField;
    SearchSystem searcher;

    public Apparate(int hieght, int width) {
        toAnalyzeField = new Area(hieght, width);
        searcher = new SearchSystem(toAnalyzeField);
    }

    public void searchDanger() {
        searcher.start();
    }

    public void printLokatorsData() {
        searcher.getLocator().drawStatus();
    }

    public void generatePeople() {
        for (int x = 0; x < toAnalyzeField.getCountRow(); x++) {
            for (int y = 0; y < toAnalyzeField.getCountGrid(); y++) {
                if (new Random().nextBoolean()) {
                    toAnalyzeField.setSubject(new Human(), x, y);
                }
            }
        }
    }

    public void draw() {
        divaded();
        if (toAnalyzeField.getCountRow() != 0) {
            for (int k = 0; k < toAnalyzeField.getCountGrid() + 1; k++) {
                System.out.print(k + "  ");
            }
            System.out.println();
            for (int i = 0; i < toAnalyzeField.getCountRow(); i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < toAnalyzeField.getCountGrid(); j++) {
                    System.out.print(toAnalyzeField.getSubject(i, j));
                }
                System.out.println();
            }
        } else return;
        divaded();
    }

    private void divaded() {
        if (toAnalyzeField.getCountRow() != 0) {
            for (int row = 0; row < toAnalyzeField.getCountGrid() + 1; row++) {
                System.out.print("===");
            }
            System.out.println();
        } else return;
    }

    public Area getToAnalyzeField() {
        return toAnalyzeField;
    }

    //функция запускает все что нужно для анализа поля и вывода двнных в консоль
    public void startAll() {
        generatePeople();
        draw();
        searcher.start();
        searcher.getLocator().drawStatus();
    }
}
