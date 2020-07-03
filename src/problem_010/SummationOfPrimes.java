package problem_010;

import java.math.BigInteger;

/**
 * Problem #10
 * 06/28/2020 
 * 40 minutes
 * @author arianekrumel
 */
public class SummationOfPrimes {

	public static void main(String[] args)
	{
		System.out.println("SummationOfPrimes");
		
		// find sum of all primes
		BigInteger sum = BigInteger.valueOf(0);
		// below two million
		int limit = 2000000;
		
		int nextPrime = findNextPrimeAfter(1);
		while(nextPrime < limit)
		{
			sum = BigInteger.valueOf(nextPrime).add(sum);
			nextPrime = findNextPrimeAfter(nextPrime);
		}
		System.out.println(sum);
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
		while(!isPrime2(ret))
		{
			ret = ret + 2;
		}
		return ret;
	}
}
