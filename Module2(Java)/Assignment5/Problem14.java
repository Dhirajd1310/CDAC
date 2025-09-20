import java.util.*;

class Problem14 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<String, Integer>();

        grades.put("Rohan", 78);

        grades.put("Rohan", 88);

        System.out.println("Updated Grade: " + "Rohan" + ": " + grades.get("Rohan"));
    }
}
