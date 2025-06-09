package hot100;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}

public class t26 {
    //哈希表改造
//    public ListNode detectCycle(ListNode head) {
//        ListNode pos = head;
//        Set<ListNode> visited = new HashSet<ListNode>();
//        while (pos != null) {
//            if (visited.contains(pos)) {
//                return pos;
//            } else {
//                visited.add(pos);
//            }
//            pos = pos.next;
//        }
//        return null;
//    }
    //先确定是否存在环，再寻找开始节点（下午再来一遍）
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
