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

    public void dangerSort(int counter) {
        if (counter <= 2) {
            none++;
        }
        if (counter > 2 && counter <= 4) {
            minor++;
        }
        if (counter > 4 && counter <= 7) {
            normal++;
        }
        if (counter > 7 && counter <= 13) {
            major++;
        }
        if (counter > 13) {
            critical++;
        }
    }

    public void drawStatus() {
        System.out.println();
        System.out.println("1.\tNONE " + none);
        System.out.println("2.\tMINOR " + minor);
        System.out.println("3.\tNORMAL " + normal);
        System.out.println("4.\tMAJOR " + major);
        System.out.println("5.\tCRITICAL " + critical);
        System.out.print("===");
    }
}



