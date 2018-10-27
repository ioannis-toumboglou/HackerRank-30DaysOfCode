package Hackerrank;

import java.util.Scanner;

class LinkedListNode {
	int data;
	LinkedListNode next;
	LinkedListNode(int d) {
        data = d;
        next = null;
    }
}


public class Day15_LinkedList {
	
	 public static LinkedListNode insert(LinkedListNode head, int data) {
		 LinkedListNode newNode = new LinkedListNode(data);
		 
		 // Check if there is a head in the list and in case there is, if it has a next node
		 if (head == null) {
			 return newNode;
		 } else if (head.next == null) {
			 head.next = newNode;
		 } else {
			 insert(head.next, data);
		 }
		 		 
		 return head;
	 }

	public static void display(LinkedListNode head) {
        LinkedListNode start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        LinkedListNode head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}
