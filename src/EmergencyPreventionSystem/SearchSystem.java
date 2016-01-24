package EmergencyPreventionSystem;


public class SearchSystem {
    
    public int start(Human[][] data) {
        int count = 0;
        if(!isEmpty(data)) {
            Human[][] worker = data;
            for (int i = 0; i < worker.length; i++) {
                for (int j = 0; j < worker[0].length; j++) {
                    if (inVertex(worker[i][j])) {
                        count++;
                        delete(worker[i][j]);
                    } else {
                        break;
                    }
                }
            }
            return start(worker);
        } else {
            return 0;
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

    private static boolean checkLeft(Human[][] inData, int inRow, int inGrid) {
        if (inData[inRow][inGrid - 1].getPeople() == "|x|") {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkRight(Human[][] inData, int inRow, int inGrid) {
        if (inData[inRow][inGrid + 1].getPeople() == "|x|") {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkUp(Human[][] inData, int inRow, int inGrid) {
        if (inData[inRow - 1][inGrid].getPeople() == "|x|") {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkDawn(Human[][] inData, int inRow, int inGrid) {
        if (inData[inRow + 1][inGrid].getPeople() == "|x|") {
            return true;
        } else {
            return false;
        }
    }
}
