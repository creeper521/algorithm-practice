package hot100;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class t29 {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head.next == null)return null;
//        ListNode left = head, right = head;
//        while(n != 0){
//            right = right.next;
//            n--;
//        }
//        if(right == null)return head.next;
//        while(right.next != null){
//            left = left.next;
//            right = right.next;
//        }
//        left.next = left.next.next;
//        return head;
//    }
}
