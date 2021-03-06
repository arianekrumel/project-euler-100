package org.geeksforgeeks;

public class LinkedListNode {
	public int data;
	public LinkedListNode next;
	
	public LinkedListNode()
	{
		this.data = 0;
		this.next = null;
	}
	
	public LinkedListNode(int data, LinkedListNode next)
	{
		this.data = data;
		this.next = next;
	}
	
	protected void setData(int data)
	{
		this.data = data;
	}
	
	protected void setNext(LinkedListNode next)
	{
		this.next = next;
	}
}