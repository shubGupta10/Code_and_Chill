class ImplementQueueUsingStack {
    public Stack<Integer> input;
    public Stack<Integer> output;

    public ImplementQueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if(output.empty())
            while(!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Pop: " + queue.pop());

        System.out.println("Peek: " + queue.peek());

        System.out.println("Pop: " + queue.pop());

        System.out.println("Is empty: " + queue.empty());

        System.out.println("Pop: " + queue.pop());

        System.out.println("Is empty: " + queue.empty());
    }
}