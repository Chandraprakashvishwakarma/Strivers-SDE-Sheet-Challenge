/*
Q. no. 33: Reverse Nodes in k-Group
*/
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head== null || k==1 ) return head;
        ListNode cur = head;
        int len=0;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
        ListNode temp = new ListNode(-1); 
        temp.next = head;
        ListNode pre = temp,nxt = temp;
        while(len>=k){
            cur = pre.next;
            nxt = cur.next;
            for(int i=1;i<k;i++){
                cur.next = nxt.next;
                nxt.next = pre.next;
                pre.next = nxt;
                nxt = cur.next;
            }
            pre = cur;
            len-=k;
        }
        return temp.next;
    }
}

/*
Codding Ninjas:

Problem:

You are given a Singly Linked List of integers and an integer array 'B' of size 'N'. Each element in the array 'B' represents a block size. Modify the linked list by reversing the nodes in each block whose sizes are given by the array 'B'.

Note:
1. If you encounter a situation when 'Bri' is greater than the number of remaining nodes in the list, then simply reverse the remaining nodes as a block and ignore all the block sizes from 'Brit'
2. All block sizes are contiguous i.e. suppose that block 'B[i]' ends at a node cur, then the block 'Bli+1]' starts from the node just after the node cur.


import java.io.*;
import java.util.*;
public class Solution {
    private static int findLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
        if (head == null || head.next == null) return head;
        int length = findLength(head);
        Node dummyHead = new Node(0);
        dummyHead.next = head;
        Node pre = dummyHead;
        Node cur;
        Node nex;
        for (int i = 0; i < n; i++) {
            if (length == 0) break;
            if (b[i] == 0) continue;
            cur = pre.next;
            nex = cur.next;
            for (int j = 1; j < Math.min(b[i], length); j++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            length = length - Math.min(b[i], length);
            pre = cur;
        }
        return dummyHead.next;
    }
}
*/
