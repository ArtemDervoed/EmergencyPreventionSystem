package WorkerSystem;


import EmergencyPreventionSystem.Area;
import EmergencyPreventionSystem.SearchSystem;
import Input.Parser;

import java.io.IOException;
import java.text.ParseException;

public final class System {
    public static void startAllSystems(String[] args) throws ParseException, org.apache.commons.cli.ParseException, IOException {
        Parser input = new Parser();
        Area square;
        input.input(args);
        square = new Area(input.getRow(), input.getGrid());
        square.generatePeople();
        SearchSystem analyzer = new SearchSystem(square);
        square.draw();
        analyzer.start();
        analyzer.getLocator().drawStatus();
    }

}
