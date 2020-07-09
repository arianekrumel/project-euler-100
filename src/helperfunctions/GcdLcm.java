package helperfunctions;

public class GcdLcm {
	public static void main (String[] args)
	{		
		int a = 15, b = 20; 
        System.out.println("LCM of " + a +" and " + b + " is " + lcm(a, b));
        System.out.println("LCM of 15 and 20 is " + lcmLargerSet(new int[]{ 15, 20 }));
        System.out.println("LCM of 1-20 is " + lcmLargerSet(new int[]{ 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 }));
        // 232792560
		System.out.println("");

        System.out.println("GCD of 15, 20, 35 is " + gcdLargerSet(new int[]{ 15, 20, 35 }));
	}

	// greatest common divisor
	// the largest positive integer that divides each of the integers
	// For example, the gcd of 8 and 12 is 4.
	public static int gcdByEuclidsRecursive(int a, int b) 
    { 
		// uses euclid's algorithm that gcd of 2 numbers also divides their difference
		/*
		 * To compute gcd(48,18), divide 48 by 18 to get a quotient of 2 and a remainder of 12. 
		 * Then divide 18 by 12 to get a quotient of 1 and a remainder of 6. 
		 * Then divide 12 by 6 to get a remainder of 0, which means that 6 is the gcd.
		 * We ignored the quotient in each step except to notice when the remainder reached 0, 
		 * signalling that we had arrived at the answer. 
		 */
	    if (a == 0) 
	        return b;  
	    return gcdByEuclidsRecursive(b % a, a);  
    } 
	
	private static int gcdByEuclidsIterative(int a, int b)
	{
	    while (a > 0)
	    {
	        int temp = a;
	        a = b % a; // % is remainder
	        b = temp;
	    }
	    return b;
	}
	
	private static int gcdLargerSet(int[] input)
	{
	    int result = input[0];
	    for(int i = 1; i < input.length; i++) result = gcdByEuclidsIterative(result, input[i]);
	    return result;
	}

	// least common multiple: 
	// the lowest quantity that is a multiple of two or more given quantities 
	// (e.g. 12 is the lowest common multiple of 2, 3, and 4)
	public static int lcm(int a, int b) 
    { 
		// this is the definition of least common multiple
		return (a*b)/gcdByEuclidsIterative(a, b); 
    } 
	
	private static long lcmLargerSet(int[] input)
	{
		int result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
}
