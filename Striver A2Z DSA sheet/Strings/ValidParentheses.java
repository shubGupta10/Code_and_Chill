public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(CheckValidParentheses("()"));       
        System.out.println(CheckValidParentheses("()[]{}"));   
        System.out.println(CheckValidParentheses("(]"));        
        System.out.println(CheckValidParentheses("([)]"));      
        System.out.println(CheckValidParentheses("{[]}"));     
    }   
    
    public static boolean CheckValidParentheses(String s){
        char[] stack = new char[s.length()];
        int top = -1;

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack[++top] = c;
            } else {
                if(top == -1){
                    return false;
                }

                char topChar = stack[top--];
                if ((c == ')' && topChar != '(') ||
                    (c == '}' && topChar != '{') ||
                    (c == ']' && topChar != '[')) {
                    return false;
                }
            }
        }
        return top == -1;
    }
}
