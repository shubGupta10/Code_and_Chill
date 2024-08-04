import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args){
        ValidAnagram va = new ValidAnagram();
        String s = "cat";
        String t = "rat";

        System.out.println(va.CheckValidAnagram(s, t));
    }

    public static boolean CheckValidAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();


        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
