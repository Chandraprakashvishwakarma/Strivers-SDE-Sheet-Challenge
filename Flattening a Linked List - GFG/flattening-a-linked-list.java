//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class Flatttening_A_LinkedList
{	
    Node head;
	
	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;	
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
				
			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);
		
		t--;
		}
	}	
}
// } Driver Code Ends

/*
Q. no. 36: Flattening a Linked List
*/
class GfG
{
    Node flatten(Node root)
    {
	    if(root.next==null) return root;
	    
	    Node newRoot = flatten(root.next);
	    return merge(root,root.next);
    }
    
    Node merge(Node l1,Node l2){
        Node temp = new Node(-1);
        Node head = temp;
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                temp.bottom = l1;
                l1=l1.bottom;
            }
            else{
                temp.bottom = l2;
                l2=l2.bottom;
            }
            temp = temp.bottom;
        }
        if(l2!=null) temp.bottom=l2;
        if(l1!=null) temp.bottom=l1;
        return head.bottom;
    }
    
}

/*
Codding Ninjas: 

public class Solution {
    public static Node flattenLinkedList(Node head) {
        Node temp = new Node(-1);
        Node res = temp;
        if(head == null || head.next == null) return head;
        
        Node l2 = flattenLinkedList(head.next);
        Node l1 = head;
        l1.next = null;
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data) {temp.child = l1;l1=l1.child;}
            else {temp.child = l2;l2= l2.child;}
            temp = temp.child;
        }
        if(l1!=null) temp.child = l1;
        if(l2!=null) temp.child = l2;
        return res.child;
    }
}

*/