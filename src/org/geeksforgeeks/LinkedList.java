package org.geeksforgeeks;

import java.util.Stack;

public class LinkedList {
	
	LinkedListNode head;
	
	public LinkedList()
	{
		head = null;
	}
	
	protected void setHead(LinkedListNode head)
	{
		this.head = head;
	}
	
	protected String printList()
	{
		if(this.head == null) return "NULL";
		
		String ret = "";
		ret += head.data + "->";
		LinkedListNode next = head.next;
		while(next != null)
		{
			ret += next.data + "->";
			next = next.next;
		}
		ret += "NULL";
		return ret;
	}
	
	protected void reverseList()
	{
		// Base case: no head
		if(this.head == null) return;
		// Create stack to remember nodes in order
		// use a stack, last in, last out to save nodes
		Stack<LinkedListNode> s = new Stack<LinkedListNode>();
		
		// get head node, add to stack with altered next
		LinkedListNode nodeForStack = this.head;
		LinkedListNode next = this.head.next;
		nodeForStack.next = null;
		s.add(nodeForStack);
		
		// get saved next node, add to stack with altered next
		while(next != null)
		{
			nodeForStack = next;
			next = next.next;
			nodeForStack.next = s.peek();
			s.add(nodeForStack);
		}
		
		// find the leaf of the list
		// make it the new head
		this.head = s.pop();
		
	}

}
