import java.util.Stack;

public class ValidParenthesis {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            return stack.isEmpty();
        }

    //main function
    public static void main(String[] args) {
        ValidParenthesis validator = new ValidParenthesis();

        System.out.println(validator.isValid("()"));
        System.out.println(validator.isValid("()[]{}"));
        System.out.println(validator.isValid("(]"));
        System.out.println(validator.isValid("([)]"));
        System.out.println(validator.isValid("{[]}"));
        System.out.println(validator.isValid(""));
    }
    }

