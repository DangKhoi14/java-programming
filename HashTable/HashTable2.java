package HashTable;
// Switch the state lookup example so that it maps state abbreviations

// to full state names, instead of the other way around.

import java.util.HashMap;
import java.util.Map;

public class HashTable2 {
    public static void printStates(Map<String, String> arrMap, String... array) {
        for (String arr : array) {
            System.out.println("Key: " + arr + " Name: " + arrMap.get(arr));
        }
    }

    public static void main(String[] args) {
        Map<String, String> arrMap = new HashMap<>();
        String[][] array = {
                { "AL", "Alabama" },
                { "AK", "Alaska" },
                { "AR", "Arkansas" },
                { "AZ", "Arizona" },
                { "CA", "California" },
                { "CO", "Colorado" },
                { "FL", "Florida" },
        };

        for (String[] c : array) {
            arrMap.put(c[0], c[1]);
        }

        printStates(arrMap, "AL", "AZ", "FL");
    }
}
