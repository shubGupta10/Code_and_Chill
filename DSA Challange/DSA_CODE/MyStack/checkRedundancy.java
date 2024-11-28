package MyStack;

import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class checkRedundancy {
    class Solution {
        public static int checkRedundancy(String s) {
            Stack<Character> stack = new Stack<>();
            List<Character> operators = Arrays.asList('=', '-', '*');

            for (char ch : s.toCharArray()) {
                if (ch == '(' || operators.contains(ch)) {
                    stack.push(ch);
                } else if (ch == ')') {
                    char top = stack.pop();

                    // If no operator between parentheses, it's redundant
                    if (!operators.contains(top)) return 1;

                    // Remove all operators until '('
                    while (!stack.isEmpty() && operators.contains(stack.peek())) {
                        stack.pop();
                    }
                    stack.pop(); // Remove '('
                }
            }
            return 0; // No redundancy found
        }
    }
}
