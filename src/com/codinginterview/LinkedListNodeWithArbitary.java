package com.codinginterview;

public class LinkedListNodeWithArbitary {
	int data;
	LinkedListNodeWithArbitary next;
	LinkedListNodeWithArbitary arbitary;
	
	public LinkedListNodeWithArbitary()
	{
		this.data = 0;
		this.next = null;
		this.arbitary = null;
	}
	
	public LinkedListNodeWithArbitary(int data, LinkedListNodeWithArbitary next, LinkedListNodeWithArbitary arbitary)
	{
		this.data = data;
		this.next = next;
		this.arbitary = arbitary;
	}
	
	protected void setData(int data)
	{
		this.data = data;
	}
	
	protected void setNext(LinkedListNodeWithArbitary next)
	{
		this.next = next;
	}
	
	protected void setArbitary(LinkedListNodeWithArbitary arbitary)
	{
		this.arbitary = arbitary;
	}
}
