package Week_3.Day_2;

public class Task2 {

    class Solution {

        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode slow = dummy;
            ListNode fast = dummy;

            // Move fast n steps ahead
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;

            return dummy.next;
        }
    }

}
