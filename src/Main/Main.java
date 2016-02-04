package Main;

import Input.Parser;
import WorkerSystem.Apparate;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, org.apache.commons.cli.ParseException, IOException {
        Parser input = new Parser();
        try {
            input.input(args);
        } catch (NullPointerException e){
            System.out.println("error input data");
        } catch (ParseException e ){
            System.out.println("Parse error");
        }
        Apparate apparate = new Apparate(input.getRow(), input.getGrid());
        apparate.startAll();
    }
}
