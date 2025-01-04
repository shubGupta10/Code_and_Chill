package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "a green apple";
        int index = findFirstNonRepeatingChar(str);
        if (index != -1) {
            System.out.println("First non-repeating character: " + str.charAt(index));
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static int findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (freqMap.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
