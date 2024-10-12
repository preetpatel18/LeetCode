package Easy;
import java.util.*;
public class RemoveDuplicatesfromSortedList {
    // Definition for singly-linked list.
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        recur(head, result);
        System.out.println(result);
        return createLinkedList(result, 0);
    }
    public ListNode createLinkedList(ArrayList<Integer> values, int index) {
        if (index == values.size()) {
            return null;
        }
        return new ListNode(values.get(index), createLinkedList(values, index + 1));
    }
    public void recur(ListNode head, ArrayList<Integer> num){
        if(head.next != null){
            if(!num.contains(head.val)) num.add(head.val);
            recur(head.next, num);
        }else{
            if(!num.contains(head.val)) num.add(head.val);
        }
    }
}
}
