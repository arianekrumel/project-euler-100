package org.geeksforgeeks;


public class ReverseALinkedList {
	public static void main(String[] args)
	{
		System.out.println("ReverseLinkedList with LinkedList");
		
		// case 1
		LinkedList ll = new LinkedList();
		LinkedListNode fourth = new LinkedListNode(4, null);
		LinkedListNode third = new LinkedListNode(3, fourth);
		LinkedListNode second = new LinkedListNode(2, third);
		LinkedListNode head = new LinkedListNode(1, second);
		ll.setHead(head);
		
		System.out.println(ll.retrieveList(head));
		ll.reverseList(head);
		System.out.println(ll.retrieveList(head));
		System.out.println("");
		
		// case 2
		ll = new LinkedList();
		fourth = new LinkedListNode(1, null);
		third = new LinkedListNode(2, fourth);
		second = new LinkedListNode(3, third);
		head = new LinkedListNode(4, second);
		ll.setHead(head);
		
		System.out.println(ll.retrieveList(head));
		ll.reverseList(head);
		System.out.println(ll.retrieveList(head));
		System.out.println("");
		
		// case 3
		ll = new LinkedList();
		LinkedListNode fifth = new LinkedListNode(1, null);
		fourth = new LinkedListNode(2, fifth);
		third = new LinkedListNode(3, fourth);
		second = new LinkedListNode(4, third);
		head = new LinkedListNode(5, second);
		ll.setHead(head);
		
		System.out.println(ll.retrieveList(head));
		ll.reverseList(head);
		System.out.println(ll.retrieveList(head));
		System.out.println("");
		System.out.println("");
		
		// case 4
		ll = new LinkedList();
		
		System.out.println(ll.retrieveList(head));
		ll.reverseList(head);
		System.out.println(ll.retrieveList(head));
		System.out.println("");
		
		// case 5
		ll = new LinkedList();
		head = new LinkedListNode(1, null);
		ll.setHead(head);
		
		System.out.println(ll.retrieveList(head));
		ll.reverseList(head);
		System.out.println(ll.retrieveList(head));
		System.out.println("");
	}
}
