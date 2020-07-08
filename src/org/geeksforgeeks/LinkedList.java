package org.geeksforgeeks;

public class LinkedList {
	
	LinkedListNode head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void setHead(LinkedListNode h)
	{
		this.head = h;
	}
	
	public String retrieveList(LinkedListNode head2)
	{
		String ret = "";
		while(head2 != null)
		{
			ret += head2.data + "->";
			head2 = head2.next;
		}
		ret += "NULL";
		return ret;
	}
	
	public void reverseList(LinkedListNode node)
	{
		// Base case: no head
		if(this.head == null) return;
		
		// get head node, add to stack with altered next
		LinkedListNode prev = null;
		LinkedListNode current = node;
		LinkedListNode next = node.next;
		current.next = prev;
		
		// get saved next node, add to stack with altered next
		while(next != null)
		{
			prev = current;
			current = next;
			next = next.next;
			current.next = prev;
		}
		
		// find the leaf of the list
		// make it the new head
		this.head = current;
		
	}

}
