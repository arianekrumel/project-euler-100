package com.codinginterview;

public class LinkedListWithArbitaryPointer {

	public static void main(String[] args) {
		System.out.println("CodingInterviewLinkedListWithArbitaryPointer");
		LinkedListWithArbitary list = new LinkedListWithArbitary();
		
		LinkedListNodeWithArbitary third = new LinkedListNodeWithArbitary(21, null, null);
		LinkedListNodeWithArbitary second = new LinkedListNodeWithArbitary(14, third, null);
		LinkedListNodeWithArbitary first = new LinkedListNodeWithArbitary(7, second, third);
		third.arbitary = first;
		list.head = first;
		
		System.out.println(list.retrieveList(first));
	}

}
