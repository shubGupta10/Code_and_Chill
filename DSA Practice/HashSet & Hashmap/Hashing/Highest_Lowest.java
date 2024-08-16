import java.util.HashMap;
import java.util.Map;

public class Highest_Lowest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 4};
        highest(arr);
    }

    static void highest(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length; // Number of elements in the array

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = n;  // We start by assuming the highest frequency is 0 and the lowest is the number of elements 'n'.
        int maxEle = 0, minEle = 0;    // We haven't found the elements yet, so we set them to 0.

        // We look at each number in our list and see how many times it appears.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();   // Here, we're counting how many times a number appears.
            int element = entry.getKey();   // This tells us which number we're looking at.

            // If we find a number that appears more times than the one we thought was the most frequent,
            // we update our records to show this new number as the most frequent.
            if (count > maxFreq) {
                maxEle = element;   // This is the number we found most often.
                maxFreq = count;    // This tells us how many times it appeared.
            }

            // Similarly, if we find a number that appears fewer times than the one we thought was the least frequent,
            // we update our records to show this new number as the least frequent.
            if (count < minFreq) {
                minEle = element;   // This is the number we found least often.
                minFreq = count;    // This tells us how many times it appeared.
            }
        }

        // Now, we can print out the highest and lowest frequency elements.
        System.out.println("Highest Frequency Element: " + maxEle);
        System.out.println("Lowest Frequency Element: " + minEle);
    }
}
