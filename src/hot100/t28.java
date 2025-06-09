package hot100;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class t28 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ans = null, cur = null;
//        int num = 0;//记录进位
//        while(l1 != null || l2 != null){
//            int sum = 0;
//            int value = 0;
//
//            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + num;
//            value = sum % 10;
//            num = sum / 10;
//
//            if(ans == null){
//                ans = new ListNode(value);
//                cur = ans;
//            }else{
//                cur.next = new ListNode(value);
//                cur = cur.next;
//            }
//            l1 = l1 == null ? null : l1.next;
//            l2 = l2 == null ? null : l2.next;
//        }
//        if(num == 1){
//            cur.next = new ListNode(1);
//        }
//        return ans;
//    }
}
