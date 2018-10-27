package Hackerrank;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
	
}

public class Day24_LinkedListDeletion {
	
	public static Node removeDuplicates(Node head) {
	    //Write your code here
		Node current = head ;
        while ( head != null && current.next != null  ) {
            if ( current.next.data == current.data ) {
                current.next = current.next.next; // duplicate: remove and stay on this node
            } else { 
                current = current.next;     // not duplicate: move to next node
            }
        }
        return head;
	}
	
	public static  Node insert(Node head,int data) {
        Node p=new Node(data);			
        
        if (head==null) {
            head=p;
        } else if (head.next==null) {
            head.next=p;
        } else {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;
        }
        return head;
   }
	
   public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data+" ");
            start=start.next;
        }
   }
   
   public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Node head=null;
        int T = scan.nextInt();
        
        while(T-->0) {
            int ele = scan.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
        scan.close();
      }

}
