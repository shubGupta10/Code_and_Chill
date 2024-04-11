import java.util.Stack;

public class PushAtBottom {

    public static void PushElemAtBottom(int data, Stack<Integer> s){
        //base condition
        if (!s.empty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        PushElemAtBottom(data, s); // data aur stack
        s.push(top);
        return;


    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        PushElemAtBottom(5, s);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
