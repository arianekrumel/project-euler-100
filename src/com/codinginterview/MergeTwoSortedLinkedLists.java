package com.codinginterview;

import org.geeksforgeeks.LinkedList;
import org.geeksforgeeks.LinkedListNode;

public class MergeTwoSortedLinkedLists {
	public static void main(String[] args)
	{
		System.out.println("MergeTwoSortedLinkedLists");
		
		LinkedList ll = new LinkedList();
		LinkedListNode fourth = new LinkedListNode(19, null);
		LinkedListNode third = new LinkedListNode(15, fourth);
		LinkedListNode second = new LinkedListNode(8, third);
		LinkedListNode head = new LinkedListNode(4, second);
		ll.setHead(head);
		
		LinkedList ll2 = new LinkedList();
		fourth = new LinkedListNode(16, null);
		third = new LinkedListNode(10, fourth);
		second = new LinkedListNode(9, third);
		head = new LinkedListNode(7, second);
		ll2.setHead(head);
		
		System.out.println(ll.retrieveList(ll.head));
		System.out.println(ll.retrieveList(ll2.head));
		
		// create third list
		// scan list 1 and get first node
		// scan list 2 and get second node
		// whichever is smaller, add to third list and get another node
		// keep going until both lists are empty
		LinkedList ll3 = new LinkedList();
		ll3.head = mergeListsIterative(ll.head, ll2.head);
		
		System.out.println(ll.retrieveList(ll3.head));
	}
	
	public static LinkedListNode mergeListsIterative(LinkedListNode headA, LinkedListNode headB) {
		// If both lists are null, merged list is also null
	    if (headA == null && headB == null) return null;
	    // If one of the lists are null, merged list is just the other list
	    else if (headA == null) return headB;
	    else if (headB == null) return headA;
	    
	    // Ensure that list A starts with the smaller number
	    if (headA.data > headB.data) {
	    	LinkedListNode tmp = headB;
	        headB = headA;
	        headA = tmp;
	    }
	    LinkedListNode listHead = headA;
	    
	    while(headB != null)
	    {
	    	while (headA.next != null && headB.data > headA.next.data) {
	             headA = headA.next;
	         }

	         // Insert current node in list B into list A
	    	LinkedListNode nextB = headB.next;
	        headB.next = headA.next;
	        headA.next = headB;
	        headB = nextB;
	    }
	    return listHead;
	}
	
	public static LinkedListNode mergeListsRecursive2(LinkedListNode headA, LinkedListNode headB) {
		// If both lists are null, merged list is also null
	    if (headA == null && headB == null) return null;
	    // If one of the lists are null, merged list is just the other list
	    else if (headA == null) return headB;
	    else if (headB == null) return headA;
	    
	    // Head A will be the resulting head list, if its bigger than head b switch using temp
	    if(headA.data >= headB.data) {
	    	LinkedListNode temp = headB;
	        headB = headB.next;
	        temp.next = headA;
	        headA = temp;
	    }
	    headA.next = mergeListsRecursive2(headA.next,headB);
	    return headA;
	}
	
	public static LinkedListNode mergeListsRecursive(LinkedListNode headA, LinkedListNode headB) {
		// If both lists are null, merged list is also null
	    if (headA == null && headB == null) return null;
	    // If one of the lists are null, merged list is just the other list
	    else if (headA == null) return headB;
	    else if (headB == null) return headA;
	    
	    // Select which one of the heads is the top of this list
	    // Use recursion to get the rest of the merged list and attach to next
	    if(headA.data <= headB.data)
	    	// if a is smaller, choose that as head and sort rest of list
	        headA.next = mergeListsRecursive(headA.next, headB);
	    else {
	    	// if b is smaller, switch heads then sort rest of list
	    	LinkedListNode temp = headB;
	        headB = headB.next;
	        temp.next = headA;
	        headA = temp;
	        headA.next = mergeListsRecursive(headA.next, headB);
	    }
	    return headA;
	}
}
