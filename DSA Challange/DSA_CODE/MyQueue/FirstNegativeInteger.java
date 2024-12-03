package MyQueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeInteger {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        List<Integer> result = findFirstNegativeInteger(arr, k);
        System.out.println(result);
    }

    public static List<Integer> findFirstNegativeInteger(int [] arr, int K){
        List<Integer> result = new ArrayList<Integer>();
        Deque<Integer> deque = new LinkedList<Integer>();

        //Initialise for first window
        for(int i=0; i<K; i++){
            if(arr[i] < 0){
                deque.addLast(i);
            }
        }

        //Add result for the first window
        if(!deque.isEmpty()){
            result.add(arr[deque.peekFirst()]);
        }else{
            result.add(0);
        }

        //process for the rest of the windows
        for(int i=K; i<arr.length; i++){
            if (!deque.isEmpty() && deque.peekFirst() < K) {
                deque.pollFirst();
            }

            if (arr[i] < 0) {
                deque.addLast(i);
            }

            // Add result for the current window
            if (!deque.isEmpty()) {
                result.add(arr[deque.peekFirst()]);
            } else {
                result.add(0);
            }
        }

        return result;
        }
    }
