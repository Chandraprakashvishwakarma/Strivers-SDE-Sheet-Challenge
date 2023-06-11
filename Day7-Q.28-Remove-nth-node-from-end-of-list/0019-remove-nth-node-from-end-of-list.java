/*
Q. no. 28: Remove Nth Node From End of List
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int K) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode slow = temp,fast = temp;
        while(K>0){
            fast=fast.next;K--;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
}

/*
Codding Ninjas: 

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        Node temp = new Node(-1);
        temp.next = head;
        Node slow = temp,fast = temp;
        while(K>0){
            fast=fast.next;K--;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
}

*/