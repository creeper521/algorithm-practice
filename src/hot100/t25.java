package hot100;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//      val = x;
//      next = null;
//    }
//}

public class t25 {
    //哈希表
//    public boolean hasCycle(ListNode head) {
//        HashSet<ListNode> set = new HashSet<>();
//        ListNode cur = head;
//        while(cur != null){
//            if(set.contains(cur))return true;
//            set.add(cur);
//            cur = cur.next;
//        }
//        return false;
//    }

    //快慢指针
//    public boolean hasCycle(ListNode head) {
//        if(head == null || head.next == null)return false;
//        ListNode curFast = head.next, curSlow = head;
//        while(curFast != curSlow){
//            if(curFast == null || curFast.next == null)return false;
//            curFast = curFast.next.next;
//            curSlow = curSlow.next;
//        }
//        return true;
//    }
//    public boolean hasCycle(ListNode head) {
//        if (head == null) return false;
//        ListNode slow = head;       // 慢指针从head开始
//        ListNode fast = head;       // 快指针从head开始
//        while (fast != null && fast.next != null) {
//            slow = slow.next;          // 慢指针移动一步
//            fast = fast.next.next;     // 快指针移动两步
//            if (slow == fast) return true; // 相遇表示有环
//        }
//        return false; // 快指针到达null，无环
//    }
}
