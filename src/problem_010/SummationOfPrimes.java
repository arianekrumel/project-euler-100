package problem_010;

import java.math.BigInteger;

/**
 * Problem #10
 * 06/26/2020 
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
		
		int nextPrime = getNextPrime(1);
		while(nextPrime < limit)
		{
			sum = BigInteger.valueOf(nextPrime).add(sum);
			nextPrime = getNextPrime(nextPrime);
		}
		System.out.println(sum);
	}
	
	public static int getNextPrime(int lastPrime)
	{
		if(lastPrime==1) return 2;
		if(lastPrime==2) return 3;
		
		// after 3, check all odd numbers until find prime
		int nextPrime = lastPrime+2;
		
		// loop through all possible divisors
		int divisor = 3;
		while(divisor<nextPrime)
		{
			if(nextPrime%divisor==0)
			{
				// not a prime, go to next candidate
				nextPrime = nextPrime+2;
				divisor = 3;
			}
			divisor+=2;
		}

		return nextPrime;
	}
}
