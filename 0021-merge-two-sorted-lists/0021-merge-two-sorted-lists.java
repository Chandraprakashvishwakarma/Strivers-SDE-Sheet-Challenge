/*
Q. no. 27 : Merge Two Sorted Lists
*/
class Solution {
    public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(p1!=null && p2!=null){
            if(p1.val<=p2.val){
                cur.next = p1;
                p1=p1.next;
            }
            else{
                cur.next = p2;
                p2=p2.next;
            }
            cur=cur.next;
        }
        if(p1!=null) cur.next=p1;
        else if(p2!=null) cur.next = p2;
        return head.next;
    }
}

/*
Codding Ninjas: 

import java.io.*;
import java.util.* ;

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		
        if(first==null) return second;
        if(second==null) return first;
        LinkedListNode temp = new LinkedListNode(-1);
        LinkedListNode cur = temp;
        temp.next = cur;
        while(first!=null && second!=null){
            if(first.data<=second.data){
                cur.next = first;
                first = first.next;
            }
            else {
                cur.next = second;
                second = second.next;
            }
            cur = cur.next;
        }
        if(first!=null) cur.next = first;
        else if(second!=null) cur.next = second;
        return temp.next;
	}
}

*/