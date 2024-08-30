import java.util.*;

public class Implementation_Using_Arrays {

    int [] arr;
    int capacity;
    int rear;

    //Constructor
    public Implementation_Using_Arrays(int capacity) {
        capacity = n;
        arr = new int[capacity];
        rear = -1;
    }

    //EnQueue Operation
    public void enQueue(int data) {
        if(rear == capacity-1){
            throw new Exception();
        }
        rear++;
        arr[rear] = data;
    }


    //DeQueue Operation
    public int deQueue() {
        if(rear == -1){
            throw new Exception();
        }
        int result = arr[rear];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i-1];
        }
        rear--;
        return result;
    }


    //PeeK Operation
    public int peek() {
        if(rear == -1){
            throw new Exception();
        }
        return arr[0];
    }


    public static void main(String[] args) {

    }

}