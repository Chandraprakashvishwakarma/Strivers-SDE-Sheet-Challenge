/*
Q. no. 31: Intersection of Two Linked Lists
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA,b=headB;
        while(a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
}

/*

Codding Ninjas: 

public class Solution {
    public static int findIntersection(Node l1, Node l2) {
        Node a = l1;
        Node b = l2;
        while(l1!=l2){
            l1 = l1==null?b:l1.next;
            l2 = l2==null?a:l2.next;
        }
        return l1==null?null:l1.data;
    }
}
*/