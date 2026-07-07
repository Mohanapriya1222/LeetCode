/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode result = null;
        Deque<ListNode> nodes = new ArrayDeque<>();

        while (head != null) {
            nodes.push(head);

            head = head.next;
        }

        int idx = 0;

        while (nodes.size() > 0) {
            ListNode node = nodes.pop();
            idx++;
            
            if (idx == n) {
                continue;
            }

            if (result == null) {
                node.next = null;
                result = node;

            } else if (result != null) {
                node.next = result;
                result = node;
            }
        }

        return result;
    }
} 
    
