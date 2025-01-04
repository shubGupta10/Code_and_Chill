package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatedChar {
    public static void main(String[] args) {
        String str = "a green apple";
        int index = findFirstRepeatedChar(str);
        if (index != -1) {
            System.out.println("First repeated character: " + str.charAt(index));
        } else {
            System.out.println("No repeated character found.");
        }
    }

    public static int findFirstRepeatedChar(String str) {
        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        // step1 is populate the freqMap
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        //step2 is find the first repeated character
        for (int i = 0; i < str.length(); i++) {
            if (freqMap.get(str.charAt(i)) > 1) {
                return i;
            }
        }
        return -1;
    }
}