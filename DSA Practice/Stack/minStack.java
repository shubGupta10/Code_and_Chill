import java.util.Stack;

public class minStack {
        public Stack<Integer> stack;
        public Stack<Integer> minStack;

        public void MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);

            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if(!stack.isEmpty()){
                int poppedVal = stack.pop();

                if(poppedVal == minStack.peek()){
                    minStack.pop();
                }
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

        //main function
    public static void main(String[] args) {
        minStack minStack = new minStack();

        minStack.MinStack();

        minStack.push(3);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.push(5);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.push(2);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.push(1);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}


