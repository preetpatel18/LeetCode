package Medium;

public class AddTwoNumbers {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;
            int carSum = l1_val + l2_val + carry;
            carry = carSum / 10;
            int lastD = carSum % 10;
            ListNode nNode = new ListNode(lastD);
            l3.next = nNode;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            l3 = l3.next;
        }
        if (carry > 0) {
            ListNode nNode = new ListNode(carry);
            l3.next = nNode;
        }
        return dummy.next;
    }
}
