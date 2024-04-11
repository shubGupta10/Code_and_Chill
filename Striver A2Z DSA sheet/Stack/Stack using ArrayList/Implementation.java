import java.util.ArrayList;

public class Implementation{
    public class Stack{
        private ArrayList<Integer> list = new ArrayList<>();
        
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public int pop(){
            if (isEmpty()) {
                return -1; // Stack is empty, return -1
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
       
    }
    public static void main(String[] args){
        Implementation imp = new Implementation();
        Stack s = imp.new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
