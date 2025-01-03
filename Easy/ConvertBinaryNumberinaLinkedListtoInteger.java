package Easy;

public class ConvertBinaryNumberinaLinkedListtoInteger {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public int getDecimalValue(ListNode head) {
        int n = 0;
        while(head != null){
            n = (n*2) + head.val;
            head = head.next;
        }
        return n;
    }
}
