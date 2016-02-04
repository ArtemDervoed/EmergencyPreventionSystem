package Input;

import java.io.*;

import org.apache.commons.cli.*;

import java.text.ParseException;

public final class Parser {
    private static int row;
    private static int grid;

    public void input(String[] args) throws ParseException, IOException, org.apache.commons.cli.ParseException {
        row = 0;
        grid = 0;
        Options option = new Options();
        option.addOption("r", "rowArgs", true, "rowOperand");
        option.addOption("g", "gridArgs", true, "gridOperand");
        CommandLineParser parser = new GnuParser();
        CommandLine line = parser.parse(option, args);
        try {
            args = line.getOptionValues("r");
            setRow(Integer.parseInt(args[0]));
            args = line.getOptionValues("g");
            setGrid(Integer.parseInt(args[0]));
        } catch (IllegalArgumentException e) {
            setRow(0);
            setGrid(0);
        }
    }

    private void setRow(int inputRow) {
        row = inputRow;
    }

    private void setGrid(int inputGrid) {
        grid = inputGrid;
    }

    public int getRow() {
        return row;
    }

    public int getGrid() {
        return grid;
    }
}
