package helperfunctions;

import java.util.ArrayList;

/*
 * Note that every third fibbonnaci number is even
 * Fibonnacci equation first 10 terms: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * fn = f(n-1)+f(n-2) where f0=1, f1=2
 */
public class Fibonnaci {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> ans = getFibonacciSequence(4000000);
		System.out.println("Fibonacci Sequence: "+ ans); //4613732
	}
	
	public static ArrayList<Integer> getFibonacciSequence(int limit)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int firstTerm = 1, secondTerm = 2;
		int term = 3;
		
		while(term <= limit)
		{
			term = firstTerm;
			firstTerm = secondTerm;
			secondTerm += term;
			
			list.add(term);
			//System.out.println("Current: "+ term);
		}
		return list;
		 
	}
}
