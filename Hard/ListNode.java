// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode result = new ListNode();
        ListNode current = result;


        for (ListNode list : lists) {
            ListNode ptr = list;

            while(ptr != null){
                current = result;
                ListNode newNode = new ListNode(ptr.val);

                while (current.next != null && current.next.val < newNode.val) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                ptr = ptr.next;
            }
        }
        return result.next;
    }

}