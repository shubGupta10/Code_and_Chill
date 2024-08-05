public class Convert_Sentence_Into_Numeric {
    public static void main(String[] args) {
        String sentence1 = "GEEKSFORGEEKS";
        String sentence2 = "HELLO WORLD";

        System.out.println("Input: " + sentence1);
        System.out.println("Output: " + convertToKeypadSequence(sentence1));
    }

    public static String convertToKeypadSequence(String S){
        String[] keypadMapping = {
                "2", "22", "222",    // A, B, C
                "3", "33", "333",    // D, E, F
                "4", "44", "444",    // G, H, I
                "5", "55", "555",    // J, K, L
                "6", "66", "666",    // M, N, O
                "7", "77", "777", "7777", // P, Q, R, S
                "8", "88", "888",    // T, U, V
                "9", "99", "999", "9999" // W, X, Y, Z
        };

        StringBuilder result = new StringBuilder();

        for(char ch: S.toCharArray()){
            if(ch == ' '){
                result.append('0');
            }else{
                ch = Character.toUpperCase(ch);

                int index = ch - 'A';
                result.append(keypadMapping[index]);
            }
        }
        return result.toString();
    }
}
