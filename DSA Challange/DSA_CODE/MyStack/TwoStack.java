package MyStack;

    class twoStacks {

        private int[] items;
        private int top1;
        private int top2;
        private int size;
        int num;

        twoStacks(int s) {
            this.size = 0;
            this.items = new int[s];
            this.top1 = 0;
            this.top2 = s-1;
        }

        // Function to push an integer into the stack1.
        void push1(int x) {
            if(top1 > top2) return;

            items[top1] = num;
            top1++;
        }

        // Function to push an integer into the stack2.
        void push2(int x) {
            if(top1 > top2) return;

            items[top2] = num;
            top2--;
        }

        // Function to remove an element from top of the stack1.
        int pop1() {
            if(top1 == 0) return -1;
            top1--;

            return items[top1];
        }

        // Function to remove an element from top of the stack2.
        int pop2() {
            if(top2 == size-1) return -1;
            top2++;
            return items[top2];
        }
    }


