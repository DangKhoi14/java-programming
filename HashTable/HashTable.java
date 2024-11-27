package HashTable;


import java.util.HashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        // Create a HashMap to map number-word pairs
        Map<Integer, String> numberToWord = new HashMap<>();

        // Populate the map with some number-word pairs
        numberToWord.put(1, "one");
        numberToWord.put(2, "two");
        numberToWord.put(3, "three");
        numberToWord.put(4, "four");
        numberToWord.put(5, "five");
        numberToWord.put(6, "six");
        numberToWord.put(7, "seven");
        numberToWord.put(8, "eight");
        numberToWord.put(9, "nine");

        // //Test the map by printing out some values
        // int[] testNumbers = {1, 3, 2, 4, 6, 5, 7, 8, 10};

        // for (int num : testNumbers) {
        //     String word = numberToWord.get(num);
        //     if (word != null) {
        //         System.out.println(num + ": " + word);
        //     } else {
        //         System.out.println("Num " + num + " not found");
        //     }
        // }

        int random;
        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * 10);
            System.out.println("Num " + random + ": " + numberToWord.get(random));
        }
    }
}
