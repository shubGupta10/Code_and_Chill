public class RemoveConsequtive_Characters {
    public static void main(String[] args) {
        System.out.println(RemoveConsequentChar("aabb")); 
        System.out.println(RemoveConsequentChar("aabbaa"));
        System.out.println(RemoveConsequentChar("abc")); 
    }

    public static String RemoveConsequentChar(String s){
        if(s.length() == 0){
            return "";
        }


        StringBuilder result = new StringBuilder();
        char prevChar = s.charAt(0);
        result.append(prevChar);


        for(int i=1; i<s.length();  i++){
            char currentChar = s.charAt(i);

            if(currentChar != prevChar){
                result.append(currentChar);
                prevChar = currentChar;
            }
        }
        return result.toString();
    }
    
}
