package problem_004;

/**
 * Problem #4
 * 06/21/2020 
 * 27 minutes
 * @author arianekrumel
 */

public class LargestPalindromeProduct {
	public static void main(String[] args)
	{
		System.out.println("LargestPalindromeProduct");
		//System.out.println("test: " + isPalindrome(10001));
		// largest product possible is 998001, int OK
		int palindrome = 0;
		int testCase = 0;
		
		// go over all possible products until both are four digit numbers
		// iterative approach
		for(int x1 = 100; x1 < 1000; x1++)
		{
			// internal loop to increment second term
			for(int x2 = 100; x2 < 1000; x2++)
			{
				testCase = x1*x2;
				//System.out.println("testCase: " + testCase + " = " + x1 + " " + x2);
				if(isPalindrome(testCase) && testCase > palindrome)
				{
					System.out.println(testCase + " is larger palindrome" + " = " + x1 + " " + x2);
					palindrome = testCase;
				}
			}
		}
		
		System.out.println("palindrome: " + palindrome);
	}
	
	public static boolean isPalindrome(int x)
	{
		// base case
		//if(x < 10)
		//{
			//return true;
		//}
		
		// smallest possible is 10000
		// largest product possible is 998001
		String xString = String.valueOf(x);
		int lenght = xString.length();
		int start = 0;
		int end = lenght-1;
		while(start != end && start < end)
		{
			if(xString.charAt(start)!=xString.charAt(end))
			{
				return false;
			}
			start++;
			end--;
			//System.out.println(start + " " + end);
		}
		
		return true;
	}
}
