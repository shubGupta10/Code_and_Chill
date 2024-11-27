package MyStack;

import java.util.*;

public class reverse {

        // Helper method to insert an element at the bottom of the stack
        public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
            if (st.isEmpty()) {
                st.push(x);
                return st;
            }

            int num = st.pop();
            st = insertAtBottom(st, x);
            st.push(num);

            return st;
        }

        // Method to reverse a stack
        static void reverse(Stack<Integer> s) {
            if (s.isEmpty()) return;

            int num = s.pop(); // Remove the top element
            reverse(s); // Recursively reverse the remaining stack
            insertAtBottom(s, num); // Insert the removed element at the bottom
        }
    }

