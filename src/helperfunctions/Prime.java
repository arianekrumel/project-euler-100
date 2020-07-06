package helperfunctions;

public class Prime {
	public static void main (String[] args)
	{
		System.out.println("Is 5 Prime? " + isPrime(5).toString()); // Yes Prime
		System.out.println("Is 6 Prime? " + isPrime(6).toString()); // No Prime
		System.out.println("Is 6857 Prime? " + isPrime(6857).toString()); // Yes Prime
		System.out.println("");
		
		System.out.println("Is 5 Prime? " + isPrime2(5).toString()); // Yes Prime
		System.out.println("Is 6 Prime? " + isPrime2(6).toString()); // No Prime
		System.out.println("Is 6857 Prime? " + isPrime2(6857).toString()); // Yes Prime
		System.out.println("");
		
		//2, 3, 5, 7, 11, and 13
		System.out.println("Find next prime after 3: " + findNextPrimeAfter(3));
		System.out.println("Find next prime after 11: " + findNextPrimeAfter(11));
	}
	
	public static Boolean isPrime(int candidate)
	{
		// If number is even, not prime
		if(candidate%2==0)
		{
			return false;
		}
		
		// Skip factor 1, skip factor 2 since no even candidates
		// Checking odd divisors starting from 3
		int divisor = 3;
		while(divisor<candidate)
		{
			if(candidate%divisor == 0)
			{
				return false;
			}
			// Skip all even divisors
			divisor = divisor+2;
		}
		return true;
	}
	
	public static Boolean isPrime2(int n)
	{
		if (n < 2)
		    return false;
		if (n % 2 == 0)
		    return n == 2;
		if (n % 3 == 0)
		    return n == 3;

		// every number n can at most hvae one prime factor greater than square root of n
		// we can divide out some prime factor, calculate root of remaining number as upper limit
		// if facter exceeds this square root, we know the remaining number is prime
		// ANOTHER WAY TO SAY
		//One optimization is to loop to sqrt{n} instead of the whole space, 
		//since only multiples of already known primes remain above the limit. 
		int h = (int) Math.floor(1 + Math.sqrt(n));
		int i = 5;

		while (i <= h) 
		{
			if (n % i == 0)
				return false;
			// What we also can do is unrolling checks of multiples of 2 and 3, 
			// which allows us to loop in a stepwidth of 6, 
			// which however requires a check of every i+2 as well.
			if (n % (i + 2) == 0)
				return false;
			i+= 6;
		}
		return true;
	}
	
	public static int findNextPrimeAfter(int i)
	{
		// Go in steps of 2 since all primes after 2 are odd
		int ret = i + 2;
		while(!isPrime(ret))
		{
			ret = ret + 2;
		}
		return ret;
	}

}
