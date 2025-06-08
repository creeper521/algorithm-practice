package hot100;

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//
public class t23 {
//    //迭代
//    public ListNode reverseList(ListNode head) {
//        if(head == null)return null;
//
//        ListNode cur = head;
//        ListNode pre = null;
//        while(cur != null){
//            ListNode trans = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = trans;
//        }
//        return pre;
//    }
//
//    //递归（还没理清楚）
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
}