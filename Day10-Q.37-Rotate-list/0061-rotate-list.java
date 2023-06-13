/*
Q. no. 37: Rotate Linked List
*/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
        return head;
        }
    ListNode p = head;
    int len =1;
    while(p.next!=null){
        p=p.next;
        len++;
    }
    k%=len;
    p.next = head;
    for(int i=0;i<len-k;i++){
        p = p.next;
    }
    head = p.next;
    p.next = null;
    return head;
    }
}

/*
Codding Ninjas:

public class Solution {
    public static Node rotate(Node head, int k) {
        Node p = head;
        int length=1;
        while(p.next != null) {p = p.next;length++;}
        p.next = head;
        k = k%length;
        for(int i=0;i<length-k;i++) {p = p.next;}
        head = p.next;
        p.next= null;
        return head;
    }
}
*/