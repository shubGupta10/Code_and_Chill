public class twoSum{
    public static void main(String[] args) {
        int [] book = {4, 1, 2, 3, 1};
        int n = book.length;
        int target = 5;
        String result = read(book, target, n);
        System.out.println(result);
    }

    static String read(int[] book, int target, int n){
         n = book.length;
         for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(book[i] + book[j] == target){
                    return "YES";
                }
            }
         }
         return "NO";
    }
}