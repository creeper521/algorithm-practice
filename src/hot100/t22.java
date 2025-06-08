package hot100;

import java.util.*;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//      val = x;
//      next = null;
//    }
//}
public class t22 {

    //额外哈希表存储
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> visited = new HashSet<ListNode>();
//        ListNode temp = headA;
//        while (temp != null) {
//            visited.add(temp);
//            temp = temp.next;
//        }
//        temp = headB;
//        while (temp != null) {
//            if (visited.contains(temp)) {
//                return temp;
//            }
//            temp = temp.next;
//        }
//        return null;
//    }
    //双指针优化（这个模拟一下确实优雅）
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null)return null;
//        ListNode cura = headA, curb = headB;
//        while(cura != curb){
//            cura = cura != null ? cura.next : headB;
//            curb = curb != null ? curb.next : headA;
//        }
//        return cura;
//    }
}
