import java.util.*;

public class Reverse {
    
        public static void PushtheAtBotton(int  data, Stack<Integer> s){
           // base case
           if(!s.isEmpty()){
              s.push(data);
              return;
           }

           int top = s.pop();
           PushtheAtBotton(data, s);
           s.push(top);
        }


        public static void reverse(Stack<Integer> s){
            if (s.isEmpty()) {
                return;
            }

            int top = s.pop();
            reverse(s);
            PushtheAtBotton(top, s);
        }
        
        public static void main(String[] args){
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            PushtheAtBotton(5, s);

            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
        
    }
    