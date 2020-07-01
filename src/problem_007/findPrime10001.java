package problem_007;

import java.util.ArrayList;

/**
 * Problem #7
 * 06/21/2020 
 * 20 minutes
 * @author arianekrumel
 */

public class findPrime10001 {
	public static void main(String[] args)
	{
		// count from 1 to limit (test at 6, then move to 10 001
		int limit = 10001; //6;
		int next = 0;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(0, 2);
		primes.add(1, 3);
		for(int i = 2; i<=limit; i++)
		{
			next = findNextPrimeAfter(primes.get(i-1));
			System.out.println(next);
			primes.add(i, next);
		}
		System.out.println("answer: "+ primes.get(limit-1));
		//System.out.println(isPrime(15));
	}
	public static int findNextPrimeAfter(int i)
	{
		int ret = i + 2;
		while(!isPrime(ret))
		{
			ret = ret + 2;
		}
		return ret;
	}
	
	public static boolean isPrime(int n)
	{	
        // Corner case 
        if (n <= 1) 
            return false; 
        for (int i = 2; i < n; i++) 
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
