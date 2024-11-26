package MyStack;

import java.util.EmptyStackException;

public class MyStack {
    private int size;
    private int top;
    private int[] items;

    public MyStack(int size) {
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }

    public void push(int value) {
        if(top == size) throw new StackOverflowError();
        this.items[this.top] = value;
        this.top++;
    }

    public int size(){
        return top;
    }

    public int pop(){
        if(top == 0) throw new EmptyStackException();
        this.top--;
        int value = items[top];
        items[top] = 0;
        return value;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int Peek(){
      if(isEmpty()){
          throw new IllegalStateException("Can't peek is element out, stack is empty bruhh");
      }
      return items[top -1];
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = size-1; i >= 0; i--){
            builder.append(items[i]).append(" , ");
        }
        return builder.toString();
    }
}
