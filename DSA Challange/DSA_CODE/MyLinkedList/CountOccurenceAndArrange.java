package MyLinkedList;

public class CountOccurenceAndArrange {
    public static ListNode segregate(ListNode head) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;


        ListNode current = head;

        while(current != null){
            if(current.data == 0){
                count0++;
            } else if(current.data == 1){
                count1++;
            }else{
                count2++;
            }
            current = current.next;
        }

        current = head;

        for(int i = 0; i< count0; i++){
            current.data = 0;
            current = current.next;
        }


        for(int i = 0; i< count1; i++){
            current.data = 1;
            current = current.next;
        }


        for(int i = 0; i< count2; i++){
            current.data = 2;
            current = current.next;
        }

        return head;
    }
}
