// find first unique string
public class FirstUniqueString {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (arr[ch - 'a'] == 1) {
                return i;
            }
        }

        //if none found
        return -1;
    }

//    main function
    public static void main(String[] args) {
        FirstUniqueString sol = new FirstUniqueString();
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        //print the output
        System.out.println("First unique character index in 'leetcode': " + sol.firstUniqChar(s1));
        System.out.println("First unique character index in 'loveleetcode': " + sol.firstUniqChar(s2));
        System.out.println("First unique character index in 'aabb': " + sol.firstUniqChar(s3));
    }
}
