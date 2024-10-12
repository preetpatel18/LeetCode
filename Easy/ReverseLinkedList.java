package Easy;

public class ReverseLinkedList {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode newNode = new ListNode(head.val);
        ListNode current = head.next;
        while(current!=null){
            ListNode ln = current.next;
            current.next = newNode;
            newNode = current;
            current = ln;
        }
        return newNode;
    }
}
