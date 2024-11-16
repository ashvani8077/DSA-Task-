class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int a = count - n + 1;

        if (a == 1) {
            head = head.next;
            return head;
        }

        temp = head;
        int currentPos = 1;
        while (temp != null && currentPos < a - 1) {
            temp = temp.next;
            currentPos++;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}
