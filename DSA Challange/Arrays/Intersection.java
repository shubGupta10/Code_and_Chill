import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {
        Intersection intersectionFinder = new Intersection();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersectionFinder.findIntersection(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}
