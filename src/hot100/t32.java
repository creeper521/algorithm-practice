package hot100;

import java.util.HashMap;
import java.util.Map;

//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}


public class t32 {
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//
//        // Step 1: Create a mapping from original nodes to new nodes
//        Map<Node, Node> nodeMap = new HashMap<>();
//        Node curr = head;
//        while (curr != null) {
//            nodeMap.put(curr, new Node(curr.val));
//            curr = curr.next;
//        }
//
//        // Step 2: Connect the next and random pointers using the map
//        curr = head;
//        while (curr != null) {
//            nodeMap.get(curr).next = nodeMap.get(curr.next);
//            nodeMap.get(curr).random = nodeMap.get(curr.random);
//            curr = curr.next;
//        }
//
//        // Step 3: Return the new head of the copied list
//        return nodeMap.get(head);
//    }

}
