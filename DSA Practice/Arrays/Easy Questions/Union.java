import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6 };
        int[] b = { 2, 3, 5 };

        List<Integer> union = UnionofArrays(a, b);
        System.out.println(union);
    }

    static List<Integer> UnionofArrays(int[] a, int[] b) {
        int i = 0, j = 0;

        List<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else {
                result.add(b[j]);
                j++;
            }
        }

        // add remaining elem from a
        while (i < a.length) {
            result.add(a[i]);
            i++;
        }

        // add remanining elem from b
        while (j < b.length) {
            result.add(b[j]);
            j++;
        }
        return result;

    }

}
