package problem_012;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Problem #12
 * 06/28/2020 
 * 42 minutes
 * @author arianekrumel
 */
public class HighlyDivisbleTriangularNumber {

	public static void main(String[] args) {
		System.out.println("HighlyDivisbleTriangularNumber");
		
		int triangleNumber = 33272403;//1;
		int triangleNumberIndex = 8157;//1;
		int numberOfDivisors = 0;
		int limit = 500;
		//while(triangleNumberIndex<15)
		while(numberOfDivisors<limit)
		{
			// generate triangle numbers with nth triangle number = n+n-1+n-2...
			triangleNumberIndex++;
			triangleNumber += triangleNumberIndex;
			System.out.print(triangleNumberIndex);
			System.out.println(". Triangle Number: "+triangleNumber);
			
			// until find triangle number with 5 divisors (28), then switch to 500 divisors
			// search divisor and increment a count
			// save as list for verification
			ArrayList<Integer> divisors = new ArrayList<Integer>();
			for(int i=0; i<triangleNumber; i++)
			{
				if(triangleNumber%(i+1) == 0)
				{
					divisors.add(i);
				}
			}
			numberOfDivisors = divisors.size();
			System.out.println("Number of divisors: "+numberOfDivisors);
		}
		System.out.println("Triangle Number: "+triangleNumber);
	}

}
