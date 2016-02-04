package emergencypreventionsystem;


import java.util.HashMap;
import java.util.Map;

public class Locator {


    private Map<String, Integer> data = new HashMap<>();

    public Locator() {
        data.put("None", 0);
        data.put("Minor", 0);
        data.put("Normal", 0);
        data.put("Major", 0);
        data.put("Critical", 0);
    }

    public void dangerSort(int counter) {
        if (counter <= 2) {
            data.put("None", data.get("None") + 1);
        }
        if (counter > 2 && counter <= 4) {
            data.put("Minor", data.get("Minor") + 1);
        }
        if (counter > 4 && counter <= 7) {
            data.put("Normal", data.get("Normal") + 1);
        }
        if (counter > 7 && counter <= 13) {
            data.put("Major", data.get("Major") + 1);
        }
        if (counter > 13) {
            data.put("Critical", data.get("Critical") + 1);
        }
    }

    public Map getStatus() {
        return data;
    }

    public void drawStatus() {
        System.out.println();
        System.out.println("1.\tNONE " + data.get("None"));
        System.out.println("2.\tMINOR " + data.get("Minor"));
        System.out.println("3.\tNORMAL " + data.get("Normal"));
        System.out.println("4.\tMAJOR " + data.get("Major"));
        System.out.println("5.\tCRITICAL " + data.get("Critical"));
    }
}



