package com.codinginterview;

public class LinkedListWithArbitary {
	
	public LinkedListNodeWithArbitary head;
	
	public LinkedListWithArbitary()
	{
		head = null;
	}
	
	public void setHead(LinkedListNodeWithArbitary h)
	{
		this.head = h;
	}
	
	public String retrieveList(LinkedListNodeWithArbitary head2)
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
	
	public void reverseList(LinkedListNodeWithArbitary node)
	{
		// Base case: no head
		if(this.head == null) return;
		
		// get head node, add to stack with altered next
		LinkedListNodeWithArbitary prev = null;
		LinkedListNodeWithArbitary current = node;
		LinkedListNodeWithArbitary next = node.next;
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
