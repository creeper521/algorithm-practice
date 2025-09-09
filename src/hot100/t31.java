package hot100;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next;
//    }
//}
public class t31 {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode hair = new ListNode(0);//创建虚拟头节点
//        hair.next = head;
//
//        ListNode pre = hair;
//
//        while(head != null){
//
//            ListNode tail = pre;
//
//            for(int i = 0;i < k;i++){
//                tail = tail.next;
//
//                if(tail == null){
//                    return hair.next;
//                }
//            }
//            ListNode nex = tail.next;//用于记录下一段即将处理的节点
//
//            ListNode[] reverse = myReverse(head, tail);//翻转
//
//            //得到反转后的头尾节点
//            head = reverse[0];
//            tail = reverse[1];
//
//            //放入原链表
//            pre.next = head;
//            tail.next = nex;
//
//            //更新
//            pre = tail;
//            head = tail.next;
//        }
//        return hair.next;
//    }
//
//    private ListNode[] myReverse(ListNode head, ListNode tail) {
//        ListNode prev = tail.next;//记录翻转节点
//
//        ListNode p = head;//记录遍历的每个节点
//
//        while(prev != tail){
//            ListNode nex = p.next;
//            p.next = prev;
//            prev = p;
//            p = nex;
//        }
//        return new ListNode[]{tail, head};
//    }
}
