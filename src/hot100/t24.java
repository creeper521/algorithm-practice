package hot100;

import java.util.*;

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }


public class t24 {
    //用数组做一遍
//    public boolean isPalindrome(ListNode head) {
//        List<Integer> list = new ArrayList<>();
//        while(head != null){
//            list.add(head.val);
//            head = head.next;
//        }
//        int l = 0, r = list.size() - 1;
//        while(l <= r){
//            if(list.get(l) != list.get(r))return false;
//            l++;
//            r--;
//        }
//        return true;
//    }

    //用压栈做一遍
//    public boolean isPalindrome(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        ListNode cur = head;
//        while(cur != null){
//            stack.push(cur.val);
//            cur = cur.next;
//        }
//        cur = head;
//        while(cur != null){
//            if(cur.val != stack.peek())return false;
//            stack.pop();
//            cur = cur.next;
//        }
//        return true;
//    }
}
