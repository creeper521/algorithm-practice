package hot100;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}

public class t27 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)return null;
        if(list1 == null)return list2;
        if(list2 == null)return list1;

        ListNode head = list1.val >= list2.val ? list2 : list1;
        ListNode cur1 = head.next, cur2 = head == list1 ? list2 : list1, trans = head;
        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                trans.next = cur1;
                cur1 = cur1.next;
            }else{
                trans.next = cur2;
                cur2 = cur2.next;
            }
            trans = trans.next;
        }
        trans.next = cur1 == null ? cur2 : cur1;
        return head;
    }
}
