/*
Q. no. 38: Copy List with Random Pointer
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node cur = head;
        Node nex = head;
        while(cur!=null){
            nex = cur.next;
            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = nex;
            cur = cur.next.next;
        }
        
        cur = head;
        while(cur!=null){
            if(cur.random!=null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        Node nHead = new Node(0);
        nHead.next = head.next;
        cur = head;
        while(cur!=null){
            nex = cur.next;
            Node temp = cur.next.next;
            cur.next = temp;
            if(temp!=null) nex.next = temp.next;
            cur = cur.next;
        }
        return nHead.next;
    }
}

/*

Codding Ninjas:

import java.io.*;
import java.util.* ;
public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		if(head ==null) return null;
		LinkedListNode cur = head;
		LinkedListNode nex = head;
		while(cur!=null){
			nex = cur.next;
			LinkedListNode copy = new LinkedListNode(cur.data);
			cur.next = copy;
			copy.next = nex;
			cur = cur.next.next;
		}
		cur = head;
		while(cur!=null){
			if(cur.random != null){
				cur.next.random = cur.random.next;
			}
			cur = cur.next.next;
		}
		
		LinkedListNode newHead = new LinkedListNode(0);
		newHead.next = head.next; 
		cur = head;
		
		while(cur!=null){
			nex = cur.next;
			LinkedListNode temp = cur.next.next;
			cur.next = temp;
			if(temp!=null) nex.next = temp.next;
			cur = temp;
		}
		return newHead.next;
	}
}
*/