import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        StackUsingQueues obj = new StackUsingQueues();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.top());    // Output: 2
        System.out.println(obj.pop());    // Output: 2
        System.out.println(obj.empty());  // Output: false
    }
}
